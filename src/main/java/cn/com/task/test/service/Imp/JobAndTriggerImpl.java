package cn.com.ocj.test.service.Imp;

import cn.com.ocj.test.dao.JobAndTriggerMapper;
import cn.com.ocj.test.service.JobAndTriggerService;
import cn.com.ocj.test.vo.JobAndTrigger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class JobAndTriggerImpl  implements JobAndTriggerService {

    @Autowired
    private JobAndTriggerMapper jobAndTriggerMapper;

    @Override
    public JobAndTrigger getJobAndTriggerDetails() {
        JobAndTrigger list = jobAndTriggerMapper.ggg();
        return list;
    }
}
