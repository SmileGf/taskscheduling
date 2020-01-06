package cn.com.task.test.dao;

import cn.com.task.test.vo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserMapper {

    User queryUser(@Param(value = "name")String  name) throws  Exception;

    int addUser(User user)throws Exception;

}
