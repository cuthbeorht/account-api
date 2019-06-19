package org.davidsciacchettano.services.web.account.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.time.Instant;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
@Builder
public class AccountDto {

    private Long id;
    private String firstName;
    private String lastName;
    private String username;
    private String password;
    private Instant createdAt;
    private Instant lastModified;
}
