package workjunit;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class junitQ4Test {
	int a = 5;
    int b = 5;
    @BeforeAll
    static void printd(){
        System.out.println("started test case");
    }
    @AfterEach
    void printc(){
        System.out.println("completed test case");
    }
    @AfterAll
    static void printall(){
        System.out.println("Finished printing");
    }
    @BeforeEach
    void setUp() {
        System.out.println("Executing all");
    }
    @Test
  public  void multi() {
        assertEquals(25,junitQ4.multi(a,b));
    }

    @Test
  public  void div() {
        assertEquals(1,junitQ4.div(a,b));

	}

}
