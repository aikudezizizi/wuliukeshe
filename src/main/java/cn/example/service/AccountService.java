package cn.example.service;

import cn.example.domain.Account;

import java.util.List;

/**
 * 账户的业务层接口
 */
public interface AccountService {
    /**
     * 查询所有
     * @return
     */
    public List<Account> findAll();

    /**
     * 添加账户
     * @param account
     */
    public void addAccount(Account account);
}
