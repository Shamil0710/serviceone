package com.example.serviceone.setvices.impl;

import com.example.serviceone.models.MessageModel;
import com.example.serviceone.setvices.RabbitSander;
import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
@EnableRabbit
public class RabbitSanderImpl implements RabbitSander {
    private final RabbitTemplate rabbitTemplate;

    /**
     * Уникальный номер сервиса, при необходимости возможна замена на UUID
     */
    @Value("${service.id}")
    private int serviceId;
    /**
     * Текущий статус сервиса
     */
    @Value("${service.status}")
    private String status;

    @Autowired
    public RabbitSanderImpl(RabbitTemplate rabbitTemplate) {
        this.rabbitTemplate = rabbitTemplate;
    }

    @Scheduled(fixedDelay = 1000)
    public void sendStatus() {
        rabbitTemplate.convertAndSend(new MessageModel(serviceId, status));
    }

    public void sendMessage(String message) {
        rabbitTemplate.convertAndSend(message);
    }

}
