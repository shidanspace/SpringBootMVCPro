package com.shi.studyboot.service;

import com.shi.studyboot.entity.Account;
import com.shi.studyboot.example.AccountExample;
import com.shi.studyboot.mapper.AccountMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountService {

    @Autowired
    AccountMapper accountMapper;
    public Account findAccountByLoginNameAndPassWord(String loginName, String passWord) {
        AccountExample example=new AccountExample();
        example.createCriteria()
                .andLoginNameEqualTo(loginName)
                .andPassWordEqualTo(passWord);
        List<Account> accounts = accountMapper.selectByExample(example);



        return accounts.size()==0?null:accounts.get(0);
    }
}
