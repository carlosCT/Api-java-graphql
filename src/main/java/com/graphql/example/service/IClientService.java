package com.graphql.example.service;

import com.graphql.example.entities.Client;

import java.util.List;

public interface IClientService {

    List<Client> findAll();

    Client findById(String id);

    Client findByName(String name);

    Client findByClientId(String clientId);
}
