package com.factorymanagement.vo;

import java.util.Date;

import lombok.Data;

@Data
public class InventoryVO {
    private Integer seq;
    private String category;
    private Integer cate_seq;
    private String goods;
    private Integer amount;
    private Date warehousing_date;
    private Integer price;
}
