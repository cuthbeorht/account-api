package org.davidsciacchettano.services.web.account.service.impl;

import org.davidsciacchettano.services.web.account.exception.NotFoundException;
import org.davidsciacchettano.services.web.account.model.Account;
import org.davidsciacchettano.services.web.account.repository.AccountRepository;
import org.davidsciacchettano.services.web.account.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountServiceImpl implements AccountService {

    private AccountRepository accountRepository;

    @Autowired
    public AccountServiceImpl(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
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
        return accountRepository.save(account);
    }

    @Override
    public List<Account> findAll() {
        return accountRepository.findAll();
    }
}
