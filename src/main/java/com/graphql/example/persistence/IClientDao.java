package com.graphql.example.persistence;

import com.graphql.example.entities.Client;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;


public interface IClientDao  extends MongoRepository<Client, String> {

    @Query("{ 'name' : ?0 }")
    Client findByName(String name);

    @Query("{ 'clientId' : ?0 }")
    Client findByClientId(String clientId);

}
