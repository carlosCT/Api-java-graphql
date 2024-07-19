package com.graphql.example.entities;

import lombok.Data;

@Data
public class Method {

    private String typeCredit;
    private String creditLimit;
    private Integer creditUsed;
    private Integer amountAvailable;
}
