package dadawang.springbootmybaits.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Classname TestController
 * @Description TODO
 * @Date 2020/7/4 6:46 下午
 * @Created by liuhao
 */
@Controller
@RequestMapping("test2")
public class TestController {

    @RequestMapping("/test")
    @ResponseBody
    public void test(){
        System.out.println("running");
    }

}
