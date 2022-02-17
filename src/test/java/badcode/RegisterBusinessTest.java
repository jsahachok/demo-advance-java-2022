package badcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RegisterBusinessTest {

    @Test
    @DisplayName("ข้อมูล speaker = null จะโดน runtime exception กลับมา " + "พร้อมกับ message Speaker is null")
    public void case01() {
        RegisterBusiness business = new RegisterBusiness();
        Exception exception = assertThrows(RuntimeException.class, () -> {
            business.register(null,null);
        });
        assertEquals("Speaker is null", exception.getMessage());

    }

    @Test
    @DisplayName("ข้อมูล Firstname = null จะโดน ArgumentNullException กลับมา " + "พร้อมกับ message First name is required.")
    public void case02() {
        RegisterBusiness business = new RegisterBusiness();
        Exception exception = assertThrows(RuntimeException.class, () -> {
            business.register(null,new Speaker());
        });
        assertEquals("First name is required.", exception.getMessage());
    }

    @Test
    @DisplayName("ระบุ FirstName = Sahachok แต่ Lastname = null จะโดน ArgumentNullException กลับมา " +
            "พร้อมกับ message Last name is required.")
    public void case03() {
        RegisterBusiness business = new RegisterBusiness();
        Speaker speaker = new Speaker();
        speaker.setFirstName("Sahachok");

        Exception exception = assertThrows(RuntimeException.class, () -> {
            business.register(null,speaker);
        });
        assertEquals("Last name is required.", exception.getMessage());
    }

    @Test
    @DisplayName("ระบุ FirstName = Sahachok Lastname = Jaratsaengsophon แต่ไม่ระบุ Email จะโดน ArgumentNullException กลับมา " +
            "พร้อมกับ message Email is required.")
    public void case04() {
        RegisterBusiness business = new RegisterBusiness();
        Speaker speaker = new Speaker();
        speaker.setFirstName("Sahachok");
        speaker.setLastName("Jaratsaengsophon");
        Exception exception = assertThrows(RuntimeException.class, () -> {
            business.register(null,speaker);
        });
        assertEquals("Email is required.", exception.getMessage());
    }

    @Test
    @DisplayName("ระบุ FirstName = Sahachok Lastname = Jaratsaengsophon Email = sahachok.j  จะโดน ArgumentNullException กลับมา " +
            "พร้อมกับ message Email domain invalid.")
    public void case05() {
        RegisterBusiness business = new RegisterBusiness();
        Speaker speaker = new Speaker();
        speaker.setFirstName("Sahachok");
        speaker.setLastName("Jaratsaengsophon");
        speaker.setEmail("sahachok.j");
        Exception exception = assertThrows(RuntimeException.class, () -> {
            business.register(null,speaker);
        });
        assertEquals("Email domain invalid.", exception.getMessage());
    }

}