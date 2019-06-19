package org.davidsciacchettano.services.web.account.mapper;

import org.davidsciacchettano.services.web.account.dto.AccountDto;
import org.davidsciacchettano.services.web.account.model.Account;

import java.time.Instant;

public class AccountData {

    public static Account getAccount() {
        return Account.builder()
                .id(9999L)
                .username("fake username")
                .password("fake password")
                .lastName("My Last Name")
                .lastModified(Instant.parse("2019-01-01T08:00:00.0000"))
                .firstName("First Name")
                .createdAt(Instant.parse("2018-01-01T08:00:00.0000"))
                .build();
    }

    public static AccountDto getAccountDto() {
        return AccountDto.builder()
                .id(9999L)
                .username("fake username")
                .password("fake password")
                .lastName("My Last Name")
                .lastModified(Instant.parse("2019-01-01T08:00:00.0000"))
                .firstName("First Name")
                .createdAt(Instant.parse("2018-01-01T08:00:00.0000"))
                .build();
    }
}
