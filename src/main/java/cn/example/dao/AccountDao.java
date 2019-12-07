package cn.example.dao;

import cn.example.domain.Account;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 账户的持久层接口
 */
@Repository
public interface AccountDao {
    /**
     * 查询所有
     * @return
     */
    @Select("select * from account")
    public List<Account> findAll();

    /**
     * 添加账户
     * @param account
     */
    @Insert("insert into account(name,money) values(#{name},#{money})")
    public void addAccount(Account account);
}
