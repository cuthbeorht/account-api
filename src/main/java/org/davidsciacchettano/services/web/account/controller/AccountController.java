package org.davidsciacchettano.services.web.account.controller;

import org.davidsciacchettano.services.web.account.adapter.AccountAdapter;
import org.davidsciacchettano.services.web.account.dto.AccountDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/v1/account")
public class AccountController {

    private AccountAdapter accountAdapter;

    @Autowired
    public AccountController(AccountAdapter accountAdapter) {
        this.accountAdapter = accountAdapter;
    }

    @PostMapping("/search")
    public List<AccountDto> search(AccountDto accountDto) {
//        return accountAdapter.findByPage(page);
        return null;
    }

    @GetMapping("/{id}")
    public AccountDto getById(@PathVariable("id") String id) {

        return accountAdapter.findById(Long.parseLong(id));
    }

    @PostMapping
    public AccountDto create(AccountDto accountDto) throws Exception {
        return accountAdapter.create(accountDto);
    }
}
