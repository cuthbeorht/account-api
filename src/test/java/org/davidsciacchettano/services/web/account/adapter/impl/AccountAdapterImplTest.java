package org.davidsciacchettano.services.web.account.adapter.impl;

import org.davidsciacchettano.services.web.account.data.AccountData;
import org.davidsciacchettano.services.web.account.dto.AccountDto;
import org.davidsciacchettano.services.web.account.mapper.account.impl.AccountMapperImpl;
import org.davidsciacchettano.services.web.account.model.Account;
import org.davidsciacchettano.services.web.account.service.impl.AccountServiceImpl;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
//@RunWith(JUnitPlatform.class)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class AccountAdapterImplTest {

    private AccountAdapterImpl accountAdapter;

    @Mock
    private AccountServiceImpl accountService;

    @Mock
    private AccountMapperImpl accountMapper;

    @BeforeAll
    public void init() {
        accountAdapter = new AccountAdapterImpl(accountService, accountMapper);
    }

    @Test
    public void search_sendNull_expectIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class, () -> accountAdapter.search(null));
    }

//    @Test
//    public void search_sendValidSearch_expectValidAccountDto() {
//        Long id = 1L;
//        Account searchAccount = AccountData.getAccount().setId(id);
//        List<AccountDto> expectedAccountDtoList = new ArrayList<>();
//        expectedAccountDtoList.add(AccountData.getAccountDto().setId(id));
//
//        when(accountService.search(searchAccount)).thenReturn(Arrays.asList(searchAccount));
//
//        List<AccountDto> acxtualAccountList = accountAdapter.search(AccountData.getAccountDto().setId(id));
//
//        assertEquals(expectedAccountDtoList, acxtualAccountList);
//        assertNotEquals(expectedAccountDtoList.size(), acxtualAccountList.size());
//
//    }

}