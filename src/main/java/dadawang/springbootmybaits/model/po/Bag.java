package dadawang.springbootmybaits.model.po;

import java.math.BigDecimal;

/**
 * @Classname Bag
 * @Description TODO
 * @Date 2020/7/4 6:09 下午
 * @Created by liuhao
 */
public class Bag {

    private Integer id;

    private String name;

    private BigDecimal price;

    private Integer delFlag;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Integer getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(Integer delFlag) {
        this.delFlag = delFlag;
    }
}
