package cn.com.task.test.service.iml;

import cn.com.task.test.dao.JobAndTriggerMapper;
import cn.com.task.test.service.JobAndTriggerService;
import cn.com.task.test.vo.JobAndTrigger;
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
