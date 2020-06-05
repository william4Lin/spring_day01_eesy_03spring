package com.william.service.impl;

import com.william.dao.IAccountDao;
import com.william.dao.impl.AccountDaoImpl;
import com.william.service.IAccountService;

/**
 * 模拟业务层的实现
 */
public class AccountServiceImpl implements IAccountService {

    private IAccountDao accountDao = new AccountDaoImpl();

    public void saveAccount() {
        accountDao.saveAccount();
    }
}
