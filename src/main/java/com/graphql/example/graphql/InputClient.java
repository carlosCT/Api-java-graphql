package com.graphql.example.graphql;


import com.graphql.example.entities.Method;
import lombok.Data;

import java.util.Arrays;

@Data
public class InputClient {
    private String id;


    private String address;
    private String blocked;
    private String cellphone;
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
