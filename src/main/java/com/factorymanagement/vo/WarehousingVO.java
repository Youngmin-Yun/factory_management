package com.factorymanagement.vo;

import java.util.Date;

import lombok.Data;

@Data
public class WarehousingVO {
    private Integer seq;
    private Integer cate_seq;
    private String goods;
    private Integer amount;
    private Date warehousing_date;
    private Integer price;
}
