package dadawang.springbootmybaits.controller;

import dadawang.springbootmybaits.model.po.Bag;
import dadawang.springbootmybaits.model.request.InquiryBagReq;
import dadawang.springbootmybaits.service.BagService;
import dadawang.springbootmybaits.utils.GsonUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Classname BagTestController
 * @Description TODO
 * @Date 2020/7/4 6:03 下午
 * @Created by liuhao
 */
@Controller
@RequestMapping(value = "/test")
public class BagTestController {

    @Autowired
    BagService bagService;

    @PostMapping(value = "/inquiry")
    @ResponseBody
    public String inquiryBagByName(@RequestBody InquiryBagReq req){

        Bag bag  =bagService.inquiryBagByName(req);

        return GsonUtil.GsonString(bag);
    }


    @PostMapping(value = "/inquiry2")
    @ResponseBody
    public String inquiryBagByName2(@RequestBody InquiryBagReq req){

        Bag bag  =bagService.inquiryBagByName2(req);

        return GsonUtil.GsonString(bag);
    }


}
