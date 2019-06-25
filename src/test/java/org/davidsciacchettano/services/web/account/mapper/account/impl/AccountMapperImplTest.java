package org.davidsciacchettano.services.web.account.mapper.account.impl;

import org.davidsciacchettano.services.web.account.dto.AccountDto;
import org.davidsciacchettano.services.web.account.data.AccountData;
import org.davidsciacchettano.services.web.account.model.Account;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class AccountMapperImplTest {

    private AccountMapperImpl accountMapper;

    @BeforeEach
    public void init() {
        accountMapper = new AccountMapperImpl();
    }

    @Test
    public void mapToDto_sendNull_expectNPE() {
        assertThrows(NullPointerException.class, () -> accountMapper.mapToDto(null));
    }

    @Test
    public void mapToDto_sendEmptyEntity_expectEmptyDto() {
        var emptyAccount = Account.builder().build();
        var accountDto = AccountDto.builder().build();

        var actualDto = accountMapper.mapToDto(emptyAccount);

        assertEquals(actualDto, accountDto);
    }

    @Test
    public void mapToDto_sendValidEntity_expectValidDto() {
        var testAccount = AccountData.getAccount();
        var expectedDto = AccountData.getAccountDto();

        var actualDto = accountMapper.mapToDto(testAccount);

        assertEquals(expectedDto, actualDto);
    }

    @Test
    public void mapToEntity_sendNullDto_expectNPE() {
        assertThrows(NullPointerException.class, () -> accountMapper.mapToEntity(null));
    }

    @Test
    public void mapToEntity_sendEmptyDto_expectEmptyEntity() {
        var emptyAccountDto = AccountDto.builder().build();
        var expectedAccount = Account.builder().build();

        var actualEntity = accountMapper.mapToEntity(emptyAccountDto);

        assertEquals(expectedAccount, actualEntity);
    }

    @Test
    public void mapToEntity_sendValidDto_expectValidEntity() {
        var testAccountDto = AccountData.getAccountDto();
        var expectedEntity = AccountData.getAccount();

        var actualEmtity = accountMapper.mapToEntity(testAccountDto);

        assertEquals(expectedEntity, actualEmtity);
    }
}