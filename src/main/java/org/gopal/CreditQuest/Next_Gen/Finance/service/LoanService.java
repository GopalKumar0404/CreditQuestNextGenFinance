package org.gopal.CreditQuest.Next_Gen.Finance.service;

import org.gopal.CreditQuest.Next_Gen.Finance.entity.LoanApplication;
import org.gopal.CreditQuest.Next_Gen.Finance.repository.LoanApplicationRepository;
import org.gopal.CreditQuest.Next_Gen.Finance.utility.LoanEligibilityChecker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoanService {
    @Autowired
    private LoanApplicationRepository loanApplicationRepository;
    @Autowired
    private LoanEligibilityChecker loanEligibilityChecker;

    public LoanApplication applyForLoan(LoanApplication loanApplication) {
        if (loanEligibilityChecker.isEligible(loanApplication.getUserId())) {
            loanApplication.setStatus("APPROVED");
        } else {
            loanApplication.setStatus("DECLINED");
        }
        return loanApplicationRepository.save(loanApplication);
    }

    public List<LoanApplication> getLoanApplicationsByUser(Long userId) {
        return null;
    }
}
