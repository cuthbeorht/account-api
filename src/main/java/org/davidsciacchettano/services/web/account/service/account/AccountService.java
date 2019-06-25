package org.davidsciacchettano.services.web.account.service.account;

import org.davidsciacchettano.services.web.account.model.Account;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface AccountService {

    List<Account> findByPage(Pageable page);

    Account findById(Long id);

    Account update(Account account);

    void delete(Long id);

    Account patch(Account source, Account dest);
}
