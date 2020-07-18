package com.shi.studyboot.service;

import com.shi.studyboot.ResStat;
import com.shi.studyboot.entity.Account;
import com.shi.studyboot.service.respository.AccountRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
}
