package dadawang.springbootmybaits.service.impl;

import dadawang.springbootmybaits.mapper.BagMapper;
import dadawang.springbootmybaits.model.po.Bag;
import dadawang.springbootmybaits.model.request.InquiryBagReq;
import dadawang.springbootmybaits.service.BagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Classname BagServiceImpl
 * @Description TODO
 * @Date 2020/7/4 6:05 下午
 * @Created by liuhao
 */
@Service
public class BagServiceImpl  implements BagService {

    @Autowired
    BagMapper bagMapper;


    @Override
    public Bag inquiryBagByName(InquiryBagReq req) {

        Bag bag  = bagMapper.inquiryBagByName(req.getName());

        return bag;
    }


    @Override
    public Bag inquiryBagByName2(InquiryBagReq req) {

        Bag bag  = bagMapper.inquiryBagByName2(req.getName());

        return bag;
    }
}
