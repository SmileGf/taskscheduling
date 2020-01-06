package cn.com.task.test.service.iml;

import cn.com.task.test.service.ProfileService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile(value = "prod")
@Service
public class ProfileProdServiceImpl  implements ProfileService {

    public  ProfileProdServiceImpl(){
        System.out.println("我是生产环境");
    }

    @Override
    public String getProfileDomain() {
        StringBuilder sb = new StringBuilder();
        sb.append("我在生产环境，").append("我可以吃鸡鸭鱼牛羊肉。。。。");
        return sb.toString();
    }
}
