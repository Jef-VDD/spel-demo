
package be.jvdd.speldemo.service;

import be.jvdd.speldemo.domain.Account;
import be.jvdd.speldemo.repository.AccountResource;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AccountService {
    
    private final AccountResource accountResource;

    @Transactional
    //@PreAuthorize("#account.id == null")
    public Account createAccount(Account account) {
        return accountResource.save(account);
    }
}
