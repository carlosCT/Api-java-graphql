package com.graphql.example.controller;

import com.graphql.example.entities.Client;
import com.graphql.example.service.IClientService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;
import java.util.Optional;


@AllArgsConstructor
@Controller
public class GraphQLClientController {


    private IClientService clientService;

    @QueryMapping(name = "findClientById")
    public Client findById(@Argument(name = "clientId") String id){


        System.out.println("clientID " +id);
        Optional<Client> client= Optional.ofNullable(clientService.findById(id));
        return client.orElse(null);
    }


    @QueryMapping(name = "findAllClient")
    public List<Client> findAll(){
        return clientService.findAll();
    }


    @QueryMapping(name = "findByName")
    public Client findByName(@Argument(name = "name") String name){
        return clientService.findByName(name);
    }


    @QueryMapping(name = "findByClientId")
    public Client findByClientId(@Argument(name = "clientId") String clientId){
        return clientService.findByClientId(clientId);
    }

}
