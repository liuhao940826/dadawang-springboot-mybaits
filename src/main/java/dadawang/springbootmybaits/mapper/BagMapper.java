package dadawang.springbootmybaits.mapper;

import dadawang.springbootmybaits.model.po.Bag;
import org.apache.ibatis.annotations.Param;

/**
 * @Classname BagMapper
 * @Description TODO
 * @Date 2020/7/4 6:14 下午
 * @Created by liuhao
 */
public interface BagMapper {

    Bag inquiryBagByName(@Param("name") String name);


    Bag inquiryBagByName2(@Param("name") String name);
}
