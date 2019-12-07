package cn.example.service.impl;

import cn.example.dao.AccountDao;
import cn.example.domain.Account;
import cn.example.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 账户的业务层实现类
 */
@Service("accountService")
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountDao accountDao;
    @Override
    public List<Account> findAll() {
        System.out.println("业务层：查询所有账户。。。。。");
        return accountDao.findAll();
    }

    @Override
    public void addAccount(Account account) {
        System.out.println("业务层：添加账户");
        accountDao.addAccount(account);
    }
}
