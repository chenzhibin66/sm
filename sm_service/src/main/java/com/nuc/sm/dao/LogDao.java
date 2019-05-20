package com.nuc.sm.dao;

import com.nuc.sm.entity.Log;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Calvin
 * @Description:
 * @Date:Created on 19:40 2019/5/20
 */
@Repository("logDao")
public interface LogDao {

    void insert(Log log);

    List<Log> selectByType(String type);
}
