package example;

import static org.junit.Assert.*;

public class HelloWorldTest {
    @org.junit.Test
    public void test_happy_path() {
        HelloWorld.main(new String[0]);
    }

}
