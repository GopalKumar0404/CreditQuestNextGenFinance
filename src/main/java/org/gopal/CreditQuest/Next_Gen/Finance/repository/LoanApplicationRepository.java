package org.gopal.CreditQuest.Next_Gen.Finance.repository;

import org.gopal.CreditQuest.Next_Gen.Finance.entity.LoanApplication;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LoanApplicationRepository extends JpaRepository<LoanApplication, Long> {
    List<LoanApplication> findByUserId(Long userId);
}
