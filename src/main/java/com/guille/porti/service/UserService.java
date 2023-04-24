package com.guille.porti.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.guille.porti.models.User;
import com.guille.porti.repository.UserRepository;

@Service
public class UserService {

    private UserRepository repository;

public UserService(UserRepository repository){
    this.repository = repository;
}
public List<User>getAll(){
    return repository.findAll();
}
public User save(User user){
    return repository.save(user);
}

public List<User> findAll() {
    return null;
}
public User findById(Long id) {
    return null;
}
public User updatePicture(long id, User userDetails) {
    return null;
}
public void deleteById(long id) {

}
}
