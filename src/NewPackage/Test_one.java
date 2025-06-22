package NewPackage;

import org.testng.annotations.Test;

public class Test_one {
	@Test
    public void testMethodOne() {
        System.out.println("Test One - Method One - " + Thread.currentThread().getId());
    }

    @Test
    public void testMethodTwo() {
        System.out.println("Test One - Method Two - " + Thread.currentThread().getId());
    }
}
