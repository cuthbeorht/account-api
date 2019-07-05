package org.davidsciacchettano.services.web.account.adapter;

import org.davidsciacchettano.services.web.account.dto.AccountDto;

public interface AccountAdapter {
    public AccountDto findById(Long id);

//    public List<Account> search(AccountDto accountDto);

    public AccountDto create(AccountDto accountDto) throws Exception;

    public AccountDto update(AccountDto accountDto);
}
