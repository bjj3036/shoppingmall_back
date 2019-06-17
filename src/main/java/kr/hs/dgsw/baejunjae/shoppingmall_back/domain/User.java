package kr.hs.dgsw.baejunjae.shoppingmall_back.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
public class User {
    private Long id;
    private String account;
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private String password;
    private String username;
    private String phoneNumber;
    private String zipCode;
    private String address;
    private String email;
    private LocalDateTime created;
    private LocalDateTime updated;
}
