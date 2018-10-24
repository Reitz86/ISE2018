package uebung7;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AccountTest {

	@Test
	void test() {
		//arrange
		Account a = new Account("Andi", 7);
		//act
		a.withdrawal(1);
		//assert
		assertEquals(6, a.getBalance());
	}
	
	@Test
	void test2() {
		//arrange
		Account a = new Account("Andi", 0);
		//act
		a.withdrawal(1);
		//assert
		assertEquals(0, a.getBalance());
	}

}
