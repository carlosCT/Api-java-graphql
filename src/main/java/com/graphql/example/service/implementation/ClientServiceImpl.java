package com.graphql.example.service.implementation;

import com.graphql.example.entities.Client;
import com.graphql.example.persistence.IClientDao;
import com.graphql.example.service.IClientService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
@AllArgsConstructor()
public class ClientServiceImpl implements IClientService {

    IClientDao clientDao;

    @Override
    @Transactional(readOnly = true)
    public List<Client> findAll() {
        return clientDao.findAll();
    }

    @Override
    @Transactional
    public Client findById(String id) {
        return clientDao.findById(id).orElseThrow();
    }

    @Override
    @Transactional
    public Client findByName(String name) {

        System.out.println("name: "+ name);
        return clientDao.findByName(name);
    }

    @Override
    @Transactional
    public Client findByClientId(String clientId) {

        System.out.println("name: "+ clientId);
        return clientDao.findByClientId(clientId);
    }

}
