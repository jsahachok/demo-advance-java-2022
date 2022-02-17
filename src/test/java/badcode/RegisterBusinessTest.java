package badcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RegisterBusinessTest {

    @Test
    @DisplayName("ข้อมูล speaker = null จะโดน runtime exception กลับมา " + "พร้อมกับ message Speaker is null")
    public void register() {
        RegisterBusiness business = new RegisterBusiness();


        Exception exception = assertThrows(RuntimeException.class, () -> {
            business.register(null,null);
        });
        assertEquals("Speaker is null", exception.getMessage());

    }

    @Test
    public void getFee() {
    }

    @Test
    public void getEmailDomain() {
    }
}