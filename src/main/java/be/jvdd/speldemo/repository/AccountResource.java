
package be.jvdd.speldemo.repository;

import be.jvdd.speldemo.domain.Account;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountResource extends PagingAndSortingRepository<Account, Long>, CrudRepository<Account, Long> {
    
    @Override
    @PreAuthorize("#account.id == null")
    Account save(Account account);
}
