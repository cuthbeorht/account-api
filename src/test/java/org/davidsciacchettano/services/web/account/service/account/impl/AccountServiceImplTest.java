package org.davidsciacchettano.services.web.account.service.account.impl;

import org.davidsciacchettano.services.web.account.exception.NotFoundException;
import org.davidsciacchettano.services.web.account.repository.AccountRepository;
import org.davidsciacchettano.services.web.account.service.impl.AccountServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.assertThrows;

@ExtendWith(SpringExtension.class)
public class AccountServiceImplTest {

    private AccountServiceImpl accountService;

    @Mock
    private AccountRepository accountRepository;

    @Mock
    private PasswordEncoder passwordEncoder;

    @BeforeEach
    public void initEach() {
        accountService = new AccountServiceImpl(accountRepository, passwordEncoder);
    }

    @Test
    public void findById_sendNullId_expectNotFoundException() {
        assertThrows(NotFoundException.class, () -> accountService.findById(null));
    }

}