package com.simpleform.simpleform.service;

import com.simpleform.model. UsersModel;
import com.simpleform.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype. Service;
@Service
public class Users Service {
    private final Users Repository usersRepository;
    I
    public Users Service (Users Repository usersRepository) {
        this.usersRepository = usersRepository;
    }
    public UsersModel registerUser (String login, String password, String email) {
        if (login == null || password == null) {
            return null;
        } else {
            UsersModel users Model = new UsersModel();
            usersModel.setLogin (login);
            usersModel.setPassword (password);
            usersModel.setEmail (email);
            return usersRepository.save (usersModel);
        }
    }
    public UsersModel authenticate(String login, String password) {
        return usersRepository.findByLogin And Password (login, password).or Else ( other: null);
    }