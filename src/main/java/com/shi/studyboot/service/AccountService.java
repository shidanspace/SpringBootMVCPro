package com.shi.studyboot.service;

import com.shi.studyboot.ResStat;
import com.shi.studyboot.entity.Account;
import com.shi.studyboot.service.respository.AccountRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AccountService {
    @Autowired
    AccountRespository accountRespository;

    public ResStat save(Account account) {
        try {

            Account entity = accountRespository.save(account);
        } catch (Exception e) {
            return new ResStat(500, "error", e.getMessage());
        }

        return ResStat.build(200);


    }

    public List<Account> findAll() {
        return accountRespository.findAll();
    }


    public Optional<Account> findById() {
        Optional<Account> byId = accountRespository.findById(1);
        return byId;

    }
}
