package com.shi.studyboot.mapper;

import com.shi.studyboot.entity.Account;
import com.shi.studyboot.example.AccountExample;
import org.springframework.stereotype.Repository;

/**
 * AccountMapper继承基类
 */
@Repository
public interface AccountMapper extends MyBatisBaseDao<Account, Integer, AccountExample> {
}