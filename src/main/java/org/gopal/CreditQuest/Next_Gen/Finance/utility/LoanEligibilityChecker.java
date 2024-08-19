package org.gopal.CreditQuest.Next_Gen.Finance.utility;

import org.gopal.CreditQuest.Next_Gen.Finance.entity.User;
import org.gopal.CreditQuest.Next_Gen.Finance.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

// LoanEligibilityChecker.java
@Component
public class LoanEligibilityChecker {
    @Autowired
    private UserRepository userRepository;

    public boolean isEligible(Long userId) {
        User user = userRepository.findById(userId).orElse(null);
        if (user != null && user.getCreditScore() >= 700) {
            return true;
        }
        return false;
    }
}

