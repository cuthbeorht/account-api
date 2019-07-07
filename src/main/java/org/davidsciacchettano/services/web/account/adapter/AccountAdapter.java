package org.davidsciacchettano.services.web.account.adapter;

import org.davidsciacchettano.services.web.account.dto.AccountDto;

import java.util.List;

public interface AccountAdapter {
    public AccountDto findById(Long id);

    public List<AccountDto> search(AccountDto accountDto);

    public AccountDto create(AccountDto accountDto) throws Exception;

    public AccountDto update(AccountDto accountDto);

    public void delete(Long id);
}
