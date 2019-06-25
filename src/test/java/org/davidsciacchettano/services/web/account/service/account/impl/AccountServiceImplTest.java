package org.davidsciacchettano.services.web.account.service.account.impl;

import org.davidsciacchettano.services.web.account.data.AccountData;
import org.davidsciacchettano.services.web.account.model.Account;
import org.davidsciacchettano.services.web.account.repository.AccountRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.data.domain.PageRequest;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class AccountServiceImplTest {

    @InjectMocks
    private AccountServiceImpl accountService;

    @Mock
    private AccountRepository accountRepository;

    @BeforeEach
    public void initEach() {
        accountService = new AccountServiceImpl(accountRepository);
    }

    @Test
    public void testFindByPage_sendDefault_expectListOfResults() {

        List<Account> testAccounts = Arrays.asList(
                AccountData.getAccount(0L),
                AccountData.getAccount(1L),
                AccountData.getAccount(2L),
                AccountData.getAccount(3L),
                AccountData.getAccount(4L)
        );

        List<Account> expectedAccounts = Arrays.asList(
                AccountData.getAccount(0L),
                AccountData.getAccount(1L),
                AccountData.getAccount(2L),
                AccountData.getAccount(3L),
                AccountData.getAccount(4L)
        );

        when(accountRepository.findByPage(PageRequest.of(0, 10))).thenReturn(testAccounts);

        List<Account> actualAccounts = accountService.findByPage(PageRequest.of(0, 10));

        assertEquals(expectedAccounts, actualAccounts);
    }

}