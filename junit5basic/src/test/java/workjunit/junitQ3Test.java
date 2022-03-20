package workjunit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

	class junitQ3Test {
	    @Test
	    void Withdraw() throws InsufficientBalanceException {
	        assertThrows(InsufficientBalanceException.class,
	        		() -> junitQ3.withdraw(800));
	        assertEquals(500, junitQ3.withdraw(100));
	        System.out.println(junitQ3.withdraw(100));
	    }

	}


