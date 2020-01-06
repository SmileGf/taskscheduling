package cn.com.task.test.service.iml;

import cn.com.task.test.service.ProfileService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("dfv")
@Service
public class ProfileDfvServiceImpl implements ProfileService {

    public  ProfileDfvServiceImpl(){
        System.out.print("我是测试环境");
    }

    @Override
    public String getProfileDomain() {
        StringBuilder sb = new StringBuilder();
        sb.append("我在测试环境，").append("我可以吃梨，苹果，桃子，水果。。。。");
        return sb.toString();
    }

}
