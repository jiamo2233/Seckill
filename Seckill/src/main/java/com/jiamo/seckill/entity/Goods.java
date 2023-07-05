package com.jiamo.seckill.entity;

import lombok.*;

import java.math.BigDecimal;
import java.util.Date;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
//货物
public class Goods {

    private Long id;

    private String goodsName;

    private String goodsTitle;

    private String goodsImg;

    private BigDecimal goodsPrice;

    private Integer goodsStock;

    private Date createDate;

    private Date updateDate;

    private String goodsDetail;
}
