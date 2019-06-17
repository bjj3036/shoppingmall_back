package kr.hs.dgsw.baejunjae.shoppingmall_back.domain;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Company {
    private Long id;
    private String companyName;
    private LocalDateTime created;
    private LocalDateTime updated;
}
