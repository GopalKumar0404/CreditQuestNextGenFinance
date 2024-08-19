package org.gopal.CreditQuest.Next_Gen.Finance.service;

import org.gopal.CreditQuest.Next_Gen.Finance.entity.User;
import org.gopal.CreditQuest.Next_Gen.Finance.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User registerUser(User user) {
        return userRepository.save(user);
    }
}



