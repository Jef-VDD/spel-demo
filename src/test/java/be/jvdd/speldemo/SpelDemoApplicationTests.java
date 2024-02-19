package be.jvdd.speldemo;

import be.jvdd.speldemo.domain.Account;
import be.jvdd.speldemo.service.AccountService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpelDemoApplicationTests {
	
	@Autowired
	protected AccountService accountService;

	@Test
	void contextLoads() {
	}
	
	@Test
	void createAccount() {
		Account account = Account.builder()
				.accountName("accountX")
				.supplierName("supplierY")
				.customerName("customerZ")
				.amount(5d)
				.build();
		accountService.createAccount(account);
	}
	

}
