package kr.hs.dgsw.baejunjae.shoppingmall_back.domain;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Product {
    private Long id;
    private String productName;
    private String productContent;
    private String category;
    private int price;
    private Long company;
    private LocalDateTime created;
    private LocalDateTime updated;
}
