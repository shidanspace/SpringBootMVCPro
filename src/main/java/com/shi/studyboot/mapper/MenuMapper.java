package com.shi.studyboot.mapper;

import com.shi.studyboot.entity.Menu;
import com.shi.studyboot.example.MenuExample;
import org.springframework.stereotype.Repository;

/**
 * MenuMapper继承基类
 */
@Repository
public interface MenuMapper extends MyBatisBaseDao<Menu, Integer, MenuExample> {
}