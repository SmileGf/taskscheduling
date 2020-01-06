package cn.com.task.test.controller;

import cn.com.task.test.dao.UserMapper;
import cn.com.task.test.vo.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class UserContorller {

    protected static Logger logger=LoggerFactory.getLogger(UserContorller.class);

    @Resource
    private UserMapper userDao;

    @RequestMapping("/getuser")
    public  String selUser(){
        User user = new User();
        try {
            user = userDao.queryUser("张三");
            logger.info("日志打印----------------:" + user.getName());
        }catch (Exception e){
            logger.error("查询数据异常",e);
            e.printStackTrace();
        }
        return "名字："+user.getName()+"  年龄： "+user.getAge()+"  主键:"+user.getId();
    }
}
