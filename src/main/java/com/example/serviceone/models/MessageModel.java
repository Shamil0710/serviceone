package com.example.serviceone.models;

import java.io.Serializable;

public class MessageModel implements Serializable {
    private int serviceId;
    private String status;

    public MessageModel(int serviceId, String status) {
        this.serviceId = serviceId;
        this.status = status;
    }
}
