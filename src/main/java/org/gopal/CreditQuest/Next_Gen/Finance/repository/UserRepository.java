package org.gopal.CreditQuest.Next_Gen.Finance.repository;

import org.gopal.CreditQuest.Next_Gen.Finance.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByEmail(String email);
}



