package register;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DemoServiceTest {

    @Test
    void compute() {
        DemoService demoService = new DemoService();
        String actualResult = demoService.compute(1);
        assertEquals("Result = 2", actualResult);
    }
}