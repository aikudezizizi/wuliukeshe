package cn.example.test;

import cn.example.dao.AccountDao;
import cn.example.service.AccountService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 测试spring的开发环境
 */
public class SpringTest {
    /**
     * 测试IOC容器管理
     */
    @Test
    public void testSpring(){

        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        AccountService accountService = ac.getBean("accountService", AccountService.class);
        System.out.println(accountService);
        //测试findAll()方法
        accountService.findAll();
        AccountDao accountDao = ac.getBean("accountDao", AccountDao.class);
        System.out.println(accountDao);

    }
}
