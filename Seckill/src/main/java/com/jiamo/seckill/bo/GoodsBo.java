package com.jiamo.seckill.bo;

import lombok.*;

import java.math.BigDecimal;
import java.util.Date;

/***
 * 秒杀货物定义类别
 *使用@注解定义变量的setter、getter方法、构造方法、toString方法
 */
@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class GoodsBo {

    //秒杀价格
    private BigDecimal seckillPrice;
    //秒杀数量
    private Integer stockCount;
    //开始日期
    private Date startDate;
    //结束日期
    private Date endDate;
    //货物id
    private Long id;
    //货物名称
    private String goodsName;
    //货物标题
    private String goodsTitle;
    //货物图片
    private String goodsImg;
    //货物原价
    private BigDecimal goodsPrice;
    //货物数量
    private Integer goodsStock;
    //货物上架日期
    private Date createDate;
    //货物更新日期
    private Date updateDate;
    //货物描述细节
    private String goodsDetail;
}
