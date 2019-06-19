package org.davidsciacchettano.services.web.account.repository;

import org.davidsciacchettano.services.web.account.model.Account;
import org.springframework.data.repository.CrudRepository;

public interface AccountRepository extends CrudRepository<Account, Long> {
}
