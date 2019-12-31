package cn.com.ocj.test.dao;

import cn.com.ocj.test.vo.User;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {

    User queryUser(@Param(value = "name")String  name) throws  Exception;

    int addUser(User user)throws Exception;

}
