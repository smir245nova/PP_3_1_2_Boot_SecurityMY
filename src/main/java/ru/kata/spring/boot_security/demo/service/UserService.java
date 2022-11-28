package ru.kata.spring.boot_security.demo.service;

import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestParam;
import ru.kata.spring.boot_security.demo.entity.User;

import java.util.List;

public interface UserService {

    List<User> getAllUser();

    void deleteUserById(int id);

    void updateUser(User user, String[] roles);

    /*@Transactional
    void updateUser(User user, @RequestParam String[] roles1);*/

    void addUser(User user, String[] roles);

    User getUserById(int id);

    User getUserByName(String username);

}
