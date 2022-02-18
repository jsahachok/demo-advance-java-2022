package register;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DemoServiceTest {

//    @Test
//    @DisplayName("Should get 2")
//    void case01() {
//        //anonymous
//        DB db = new DB(){
//            @Override
//            int increaseOne(int id) {
//                return 2;
//            }
//        };
//        DemoService demoService = new DemoService(db); // Constructor inject
//        String actualResult = demoService.compute(1);
//        assertEquals("Result = 2", actualResult);
//    }

    @Test
    @DisplayName("Should get 2")
    //polymorphism
    void case02() {
        DB db = new DBX();
        DemoService demoService = new DemoService(db);
        String actualResult = demoService.compute(1);
        assertEquals("Result = 2", actualResult);
    }
}

//Override by method
//polymorphism
//class DBX extends DB {
//    int increaseOne(int id) {
//        return 2;
//    }
//}

//interface method without implementation
class DBX implements DB {
    @Override
    public int increaseOne(int id) {
        return 2;
    }
}
