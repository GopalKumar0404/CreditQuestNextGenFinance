package org.gopal.CreditQuest.Next_Gen.Finance.controller;

import org.gopal.CreditQuest.Next_Gen.Finance.entity.LoanApplication;
import org.gopal.CreditQuest.Next_Gen.Finance.service.LoanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/loans")
public class LoanController {
    @Autowired
    private LoanService loanService;

    @PostMapping("/apply")
    public ResponseEntity<LoanApplication> applyForLoan(@RequestBody LoanApplication loanApplication) {
        LoanApplication result = loanService.applyForLoan(loanApplication);
        return new ResponseEntity<>(result, HttpStatus.CREATED);
    }

    @GetMapping("/status/{userId}")
    public ResponseEntity<List<LoanApplication>> getLoanStatus(@PathVariable Long userId) {
        List<LoanApplication> loanApplications = loanService.getLoanApplicationsByUser(userId);
        return new ResponseEntity<>(loanApplications, HttpStatus.OK);
    }
}
