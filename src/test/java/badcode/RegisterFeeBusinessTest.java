package badcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

public class RegisterFeeBusinessTest {

    @ParameterizedTest
    @CsvSource({
            "0,500",
            "1,500",
            "2,250",
            "9,50",
            "10,0",
    })

    @DisplayName("Test calculate fee")
    public void getFee(int expYear, int expectedFee){
        RegisterBusiness business = new RegisterBusiness();
        int actualFee = business.getFee(expYear);
        assertEquals(expectedFee,actualFee);
    }

    @ParameterizedTest
    @CsvSource(useHeadersInDisplayName = true, textBlock = """
            Year,    ExpectedFee
            0,       500
            1,       500
            2,       250
            9,       50
            10,      0
    """)
    @DisplayName("Test calculate fee2")
    public void getFee2(int expYear, int expectedFee){
        RegisterBusiness business = new RegisterBusiness();
        int actualFee = business.getFee(expYear);
        assertEquals(expectedFee,actualFee);
    }

}