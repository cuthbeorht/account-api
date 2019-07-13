package org.davidsciacchettano.services.web.account.repository;

import org.davidsciacchettano.services.web.account.model.Account;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AccountRepository extends CrudRepository<Account, Long> {
    List<Account> findAll(Example<Account> example);

    Page<Account> findAll(Pageable pageable);
}
