package NewPackage;

import org.testng.annotations.Test;

public class Test_two {
	@Test
    public void testMethodOne() {
        System.out.println("Test Two - Method One - " + Thread.currentThread().getId());
    }

    @Test
    public void testMethodTwo() {
        System.out.println("Test Two - Method Two - " + Thread.currentThread().getId());
    }
}
