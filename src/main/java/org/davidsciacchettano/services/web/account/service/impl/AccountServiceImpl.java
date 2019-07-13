package org.davidsciacchettano.services.web.account.service.impl;

import org.davidsciacchettano.services.web.account.config.BCryptPasswordEncoderComponent;
import org.davidsciacchettano.services.web.account.exception.NotFoundException;
import org.davidsciacchettano.services.web.account.model.Account;
import org.davidsciacchettano.services.web.account.repository.AccountRepository;
import org.davidsciacchettano.services.web.account.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.PageRequest;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class AccountServiceImpl implements AccountService {

    private AccountRepository accountRepository;
    private PasswordEncoder passwordEncoder;

    @Autowired
    public AccountServiceImpl(AccountRepository accountRepository, PasswordEncoder passwordEncoder) {
        this.accountRepository = accountRepository;
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public List<Account> search(Account account) {
        return accountRepository.findAll(Example.of(account));
    }

    @Override
    public Account findById(Long id) {
        return accountRepository.findById(id)
                .orElseThrow(NotFoundException::new);
    }

    @Override
    public Account update(Account account) {
        return null;
    }

    @Override
    public void delete(Long id) {
        accountRepository.deleteById(id);
    }

    @Override
    public Account patch(Account source) {
        return null;
    }

    @Override
    public Account create(Account account) {

        account.setPassword(passwordEncoder.encode(account.getPassword()));

        return accountRepository.save(account);
    }

    @Override
    public List<Account> findAll(Integer page, Integer size) {

        return accountRepository.findAll(PageRequest.of(page, size))
                .stream()
                .collect(Collectors.toList());
    }
}
