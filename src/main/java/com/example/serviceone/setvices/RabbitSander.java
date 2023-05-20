package com.example.serviceone.setvices;

public interface RabbitSander {
    /**
     * Метод отправки статуса о састонии сервиса в шину RabbitMQ
     */
    void sendStatus();

    /**
     * Метод отправки произвольнго текста в шину RabbitMQ
     * @param message Тело сообщения
     */
    void sendMessage(String message);
}
