package org.davidsciacchettano.services.web.account.adapter.impl;

import org.davidsciacchettano.services.web.account.adapter.AccountAdapter;
import org.davidsciacchettano.services.web.account.dto.AccountDto;
import org.davidsciacchettano.services.web.account.exception.NotFoundException;
import org.davidsciacchettano.services.web.account.mapper.account.AccountMapper;
import org.davidsciacchettano.services.web.account.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Component
public class AccountAdapterImpl implements AccountAdapter {

    private AccountService accountService;
    private AccountMapper accountMapper;

    @Autowired
    public AccountAdapterImpl(AccountService accountService,
                              AccountMapper accountMapper) {
        this.accountService = accountService;
        this.accountMapper = accountMapper;
    }

    @Override
    public AccountDto findById(Long id) {
        Assert.notNull(id, "The parameter id is mandatory.");


        return Optional.of(accountService.findById(id))
                .map(accountMapper::mapToDto)
                .orElseThrow(NotFoundException::new);
    }

    @Override
    public AccountDto create(@RequestParam AccountDto accountDto) throws Exception {
        Assert.notNull(accountDto, "The AccountDto parameter is mandatory.");

        return accountMapper.tryMapToEntity(accountDto)
                .map(accountService::create)
                .map(accountMapper::mapToDto)
                .orElseThrow(Exception::new);
    }

    @Override
    public AccountDto update(AccountDto accountDto) {
        return null;
    }

    @Override
    public void delete(Long id) {

        Assert.notNull(id, "The parameter id is mandatory.");

        accountService.delete(id);
    }

    @Override
    public List<AccountDto> search(AccountDto accountDto) {

        Assert.notNull(accountDto, "The AccountDTO parameter cannot be null.");

        return accountMapper.tryMapToEntity(accountDto)
                .map(accountService::search)
                .stream()
                .flatMap(List::stream)
                .map(account -> accountMapper.mapToDto(account))
                .collect(Collectors.toList());

    }

    @Override
    public List<AccountDto> findAll(Integer page, Integer size) {
        return accountService.findAll(page, size)
                .stream()
                .map(accountMapper::mapToDto)
                .collect(Collectors.toList());
    }
}
