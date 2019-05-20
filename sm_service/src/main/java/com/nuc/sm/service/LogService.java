package com.nuc.sm.service;

import com.nuc.sm.entity.Log;

import java.util.List;

/**
 * @author Calvin
 * @Description:
 * @Date:Created on 19:49 2019/5/20
 */
public interface LogService {
    void addSystemLog(Log log);

    void addLoginLog(Log log);

    void addOperation(Log log);

    List<Log> getSystemLog();

    List<Log> getLoginLog();

    List<Log> getOperationLog();

}
