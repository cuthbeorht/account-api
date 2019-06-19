package org.davidsciacchettano.services.web.account.mapper.account.impl;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class AccountMapperImplTest {

    private AccountMapperImpl accountMapper;

    @BeforeAll
    public void init() {
        accountMapper = new AccountMapperImpl();
    }

    @Test
    void mapToDto_sendNull_expectNPE() {
        assertThrows(NullPointerException.class, () -> accountMapper.mapToDto(null));
    }

    @org.junit.jupiter.api.Test
    void mapToEntity() {
    }
}