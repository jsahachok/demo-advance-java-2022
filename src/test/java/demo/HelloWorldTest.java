package demo;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class HelloWorldTest {

//    @org.junit.jupiter.api.Test
    @Test
    @DisplayName("Test case 1")
    public void case01() {
        //Arrange , Given
        HelloWorld helloWorld = new HelloWorld();
        //Act , When
        String actualResult = helloWorld.hi("Sahachok");
        //Assert / verify,then
        assertEquals("Hello Sahachok",actualResult);
    }

    @Test
    @DisplayName("Test case 2")
    public void case02() {
    }
}