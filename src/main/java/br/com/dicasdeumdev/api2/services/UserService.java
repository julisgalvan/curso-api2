package br.com.dicasdeumdev.api2.services;

import br.com.dicasdeumdev.api2.domain.User;

import java.util.List;

public interface UserService {

    User findById (Integer id);
    List<User> findAll();
}
