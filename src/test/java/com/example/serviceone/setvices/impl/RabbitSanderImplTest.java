package com.example.serviceone.setvices.impl;

import com.example.serviceone.models.MessageModel;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.amqp.rabbit.core.RabbitTemplate;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;

class RabbitSanderImplTest {

    @Test
    public void sendMessage_sendsMessage() {
        RabbitTemplate rabbitTemplate = Mockito.mock(RabbitTemplate.class);
        RabbitSanderImpl rabbitSander = new RabbitSanderImpl(rabbitTemplate);

        assertDoesNotThrow(() -> rabbitSander.sendMessage("test message"));
        Mockito.verify(rabbitTemplate, Mockito.times(1)).convertAndSend(eq("test message"));
    }

    @Test
    public void sendStatus_sendsMessage() {
        RabbitTemplate rabbitTemplate = Mockito.mock(RabbitTemplate.class);
        RabbitSanderImpl rabbitSander = new RabbitSanderImpl(rabbitTemplate);

        assertDoesNotThrow(() -> rabbitSander.sendStatus());
        Mockito.verify(rabbitTemplate, Mockito.times(1)).convertAndSend(any(MessageModel.class));
    }

}