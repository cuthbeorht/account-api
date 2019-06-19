package org.davidsciacchettano.services.web.account.mapper.account.impl;

import org.davidsciacchettano.services.web.account.dto.AccountDto;
import org.davidsciacchettano.services.web.account.mapper.account.AccountMapper;
import org.davidsciacchettano.services.web.account.model.Account;
import org.springframework.stereotype.Component;

@Component
public class AccountMapperImpl implements AccountMapper {
    @Override
    public AccountDto mapToDto(Account account) {
        return AccountDto.builder()
                .createdAt(account.getCreatedAt())
                .firstName(account.getFirstName())
                .id(account.getId())
                .lastModified(account.getLastModified())
                .lastName(account.getLastName())
                .password(account.getPassword())
                .username(account.getUsername())
                .build();
    }

    @Override
    public Account mapToEntity(AccountDto accountDto) {
        return Account.builder()
                .createdAt(accountDto.getCreatedAt())
                .firstName(accountDto.getFirstName())
                .id(accountDto.getId())
                .lastModified(accountDto.getLastModified())
                .lastName(accountDto.getLastName())
                .password(accountDto.getPassword())
                .username(accountDto.getUsername())
                .build();
    }
}
