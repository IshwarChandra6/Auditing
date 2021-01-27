package tech.eikona.jpa.auditing.serviceImpl;

import tech.eikona.jpa.auditing.model.User;
import tech.eikona.jpa.auditing.repository.UserRepository;
import tech.eikona.jpa.auditing.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User create(User user) {
        return userRepository.save(user);
    }
}