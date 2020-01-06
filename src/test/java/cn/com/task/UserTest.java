package cn.com.task;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.transaction.annotation.Transactional;
import javax.annotation.Resource;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest

//@ContextConfiguration(locations = {"classpath*:application-*.yml"})

//配置事务的回滚,对数据库的增删改都会回滚,便于测试用例的循环利用
@Rollback(value = true)
@Transactional(transactionManager = "transactionManager")

@WebAppConfiguration
public class UserTest {

    //记得配置log4j.properties ,的命令行输出水平是debug
    protected Log logger= LogFactory.getLog(UserTest.class);

    private MockMvc mockMvc;

    @Resource
    protected WebApplicationContext wac;

    /**
     *  这个方法在每个方法执行之前都会执行一遍
     */
    @Before
    public  void  setUp() throws  Exception{
        //初始化MockMvc对象
        mockMvc = MockMvcBuilders.webAppContextSetup(wac).build();
    }

    @org.junit.Test
    public  void  user() throws  Exception{
//        perform：执行一个RequestBuilder请求，会自动执行SpringMVC的流程并映射到相应的控制器执行处理；
//        get:声明发送一个get请求的方法。MockHttpServletRequestBuilder get(String urlTemplate, Object... urlVariables)：根据uri模板和uri变量值得到一个GET请求方式的。另外提供了其他的请求的方法，如：post、put、delete等。
//        param：添加request的参数，如上面发送请求的时候带上了了pcode = root的参数。假如使用需要发送json数据格式的时将不能使用这种方式，可见后面被@ResponseBody注解参数的解决方法
//        andExpect：添加ResultMatcher验证规则，验证控制器执行完成后结果是否正确（对返回的数据进行的判断）；
//        andDo：添加ResultHandler结果处理器，比如调试时打印结果到控制台（对返回的数据进行的判断）；
//        andReturn：最后返回相应的MvcResult；然后进行自定义验证/进行下一步的异步处理（对返回的数据进行的判断）；
        String response =  mockMvc.perform(get("/getuser").contentType(MediaType.APPLICATION_FORM_URLENCODED))
                            .andExpect(status().isOk()).andDo(print()).andReturn().getResponse().getContentAsString();
        System.out.print("返回值"+response);
//        String responseString = mockMvc.perform(get("getuser")    //请求的url,请求的方法是get
//                                .contentType(MediaType.APPLICATION_FORM_URLENCODED)    //数据的格式
//                               .param("pcode","root"))           //添加参数
//                              .andExpect(status().isOk())    //返回的状态是200
//                              .andDo(print())         //打印出请求和相应的内容
//                               .andReturn().getResponse().getContentAsString();   //将相应的数据转换为字符串
    }
}
