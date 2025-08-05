package com.example.service;

import com.example.model.Client;
import com.example.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService {

    @Autowired
    private ClientRepository repo;

    public List<Client> listAll() {
        return repo.findAll();
    }

    public void save(Client client) {
        repo.save(client);
    }

    public Client get(Long id) {
        return repo.findById(id).get();
    }

    public void delete(Long id) {
        repo.deleteById(id);
    }
}
