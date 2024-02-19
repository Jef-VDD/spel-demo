package be.jvdd.speldemo;

import be.jvdd.speldemo.domain.Account;
import be.jvdd.speldemo.service.AccountService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.access.AccessDeniedException;


import static org.junit.jupiter.api.Assertions.assertThrows;

@SpringBootTest
class SpelDemoApplicationTests {
	
	@Autowired
	protected AccountService accountService;

	@Test
	void contextLoads() {
	}
	
	@Test
	void createAccountX() {
		Account account = Account.builder()
				.accountName("accountX")
				.supplierName("supplierX")
				.customerName("customerX")
				.amount(5d)
				.build();
		accountService.createAccount(account);
	}
	
	@Test
	void createAccountY()  {
		Account account = Account.builder()
				.accountName("accountY")
				.supplierName("supplierY")
				.customerName("customerY")
				.amount(5d)
				.build();
		assertThrows(AccessDeniedException.class, () ->
		accountService.createAccount(account));
	}
	

}
