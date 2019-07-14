package org.davidsciacchettano.services.web.account.controller;

import org.davidsciacchettano.services.web.account.adapter.AccountAdapter;
import org.davidsciacchettano.services.web.account.dto.AccountDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/v1/account/__private__")
public class PrivateController {

    private AccountAdapter accountAdapter;

    @Autowired
    public PrivateController(AccountAdapter accountAdapter) {
        this.accountAdapter = accountAdapter;
    }

    @PostMapping("/authenticate")
    public AccountDto authenticate(@RequestBody AccountDto accountDto) {
        return accountAdapter.authenticate(accountDto);
    }
}
