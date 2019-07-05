package org.davidsciacchettano.services.web.account.service;

import org.davidsciacchettano.services.web.account.model.Account;

public interface AccountService {

//    public List<Account> search(Account account);

    public Account findById(Long id);

    public Account update(Account account);

    public void delete(Long id);

    public Account patch(Account source);

    public Account create(Account account);
}
