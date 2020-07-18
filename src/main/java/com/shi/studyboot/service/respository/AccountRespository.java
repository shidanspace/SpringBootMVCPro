package com.shi.studyboot.service.respository;

import com.shi.studyboot.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRespository extends JpaRepository<Account,Integer> {


}
