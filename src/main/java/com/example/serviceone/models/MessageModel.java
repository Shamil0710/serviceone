package com.example.serviceone.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class MessageModel implements Serializable {
    @JsonProperty("serviceId")
    private Long serviceId;
    @JsonProperty("status")
    private String status;
    @JsonProperty("massage")
    private String massage;

    public MessageModel(Long serviceId, String status, String massage) {
        this.serviceId = serviceId;
        this.status = status;
        this.massage = massage;
    }

    public MessageModel() {
    }

    public Long getServiceId() {
        return serviceId;
    }

    public void setServiceId(Long serviceId) {
        this.serviceId = serviceId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMassage() {
        return massage;
    }

    public void setMassage(String massage) {
        this.massage = massage;
    }
}
