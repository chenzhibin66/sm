package com.nuc.sm.service;

import com.nuc.sm.dao.LogDao;
import com.nuc.sm.entity.Log;

import java.util.Date;
import java.util.List;

/**
 * @author Calvin
 * @Description:
 * @Date:Created on 19:51 2019/5/20
 */
public class LogServiceImpl implements LogService {


    private LogDao logDao;

    public void addSystemLog(Log log) {
        log.setOprTime(new Date());
        log.setType("system");
        logDao.insert(log);
    }

    public void addLoginLog(Log log) {
        log.setOprTime(new Date());
        log.setType("login");
        logDao.insert(log);
    }

    public void addOperation(Log log) {
        log.setOprTime(new Date());
        log.setType("operation");
        logDao.insert(log);
    }

    public List<Log> getSystemLog() {
        return logDao.selectByType("system");
    }

    public List<Log> getLoginLog() {
        return logDao.selectByType("login");
    }

    public List<Log> getOperationLog() {
        return logDao.selectByType("operation");
    }
}
