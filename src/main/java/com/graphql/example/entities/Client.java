package com.graphql.example.entities;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Arrays;

@Data
@Document(collection = "client")
public class Client {

    @Id
    private String id;

    private String address;
    private String blocked;
    private String cellPhone;
    private String channel;
    private String clientId;
    private String country;
    private Integer customerSchema;
    private String distrChan;
    private String division;
    private String fiscalCode1;
    private String fiscalCode2;
    private Boolean frequency;
    private String frequencyDays;
    private String idPortfolio;
    private Boolean immediateDelivery;
    private String industryCode;
    private String industryCode1;
    private Boolean isEnrollment;
    private String name;
    private String name2;
    private String office;
    private String paymentCondition;
    private Method [] paymentMethods;
}
