package org.davidsciacchettano.services.web.account.repository;

import org.davidsciacchettano.services.web.account.model.Account;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends CrudRepository<Account, Long> {
//    List<Account> findByExample(Example<Account> accountExample);
}
