package dadawang.springbootmybaits.service;

import dadawang.springbootmybaits.model.po.Bag;
import dadawang.springbootmybaits.model.request.InquiryBagReq;

/**
 * @Classname BagService
 * @Description TODO
 * @Date 2020/7/4 6:04 下午
 * @Created by liuhao
 */
public interface BagService {

    Bag inquiryBagByName(InquiryBagReq req);

    Bag inquiryBagByName2(InquiryBagReq req);
}
