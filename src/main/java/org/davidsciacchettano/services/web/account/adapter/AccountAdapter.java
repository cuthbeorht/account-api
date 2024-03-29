package org.davidsciacchettano.services.web.account.adapter;

import org.davidsciacchettano.services.web.account.dto.AccountDto;

import java.util.List;

public interface AccountAdapter {

    public List<AccountDto> findAll(Integer page, Integer size);

    public AccountDto findById(Long id);

    public List<AccountDto> search(AccountDto accountDto);

    public AccountDto create(AccountDto accountDto) throws Exception;

    public AccountDto update(AccountDto accountDto);

    public void delete(Long id);

    public AccountDto authenticate(AccountDto accountDto);
}
