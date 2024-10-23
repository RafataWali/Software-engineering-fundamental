import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class PrescriptionTest {
    Prescription prescription = new Prescription();

    // Testing for valid comments and categories
    @Test
    public void testAddRemarkValid() {
        assertTrue(prescription.addRemark("ValidRemark", "Client"));
    }

    // Testing for invalid categories
    @Test
    public void testAddRemarkInvalidCategory() {
        assertFalse(prescription.addRemark("valid remark", "InvalidCategory"));
    }

    // Testing for short remarkText
    @Test
    public void testAddRemarkShortText() {
        assertFalse(prescription.addRemark("Hi", "Client"));
    }

    // Testing for long remarkText
    @Test
    public void testAddRemarkLongText() {
        assertFalse(prescription.addRemark("This remark is made about to let the test fail, because it is too long", "Client"));
    }

    // Testing for the remark start with lowercase letters
    @Test
    public void testAddRemarkLowercaseStart() {
        assertFalse(prescription.addRemark("lowercaseStart", "Client"));
    }

    // Testing fot the remark meets the minimum length requirement
    @Test
    public void testAddRemarkMinimumLength() {
        assertTrue(prescription.addRemark("Valid!", "Optometrist"));
    }
}
