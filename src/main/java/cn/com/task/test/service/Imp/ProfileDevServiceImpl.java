package cn.com.ocj.test.service.Imp;

import cn.com.ocj.test.service.ProfileService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile(value = "dev")
@Service
public class ProfileDevServiceImpl implements ProfileService {

    public ProfileDevServiceImpl() {

        System.out.println("我是开发环境。。。。。");
    }

    @Override
    public String getProfileDomain() {
        StringBuilder sb = new StringBuilder();
        sb.append("我在开发环境，").append("我只能吃加班餐：大米饭。。。。");
        return sb.toString();
    }
}
