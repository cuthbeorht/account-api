package org.davidsciacchettano.services.web.account.repository;

import org.davidsciacchettano.services.web.account.model.Account;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface AccountRepository extends CrudRepository<Account, Long> {
    List<Account> findByPage(Pageable page);
}
