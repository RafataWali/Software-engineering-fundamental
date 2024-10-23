import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class addRemarkTest {

    Prescription prescription = new Prescription();

    // ================== Testing addRemark ==================

    // Testing for a valid remark
    @Test
    public void testAddRemarkValid() {
        assertTrue(prescription.addRemark("This is a completely valid remark text", "Client"));
    }

    // Testing for remark with too few words
    @Test
    public void testAddRemarkTooShort() {
        assertFalse(prescription.addRemark("Too short", "Client"));
    }

    // Testing for remark with too many words
    @Test
    public void testAddRemarkTooLong() {
        assertFalse(prescription.addRemark("This remark is way too long for the test case because it exceeds the twenty words limit, which means it should fail the test due to the length", "Client"));
    }

    // Testing for invalid category
    @Test
    public void testAddRemarkInvalidCategory() {
        assertFalse(prescription.addRemark("This is a valid remark", "InvalidCategory"));
    }

    // Testing for remark that starts with lowercase letter
    @Test
    public void testAddRemarkLowercaseStart() {
        assertFalse(prescription.addRemark("this remark starts with a lowercase letter", "Client"));
    }

    // Testing for null remarkText
    @Test
    public void testAddRemarkNullRemarkText() {
        assertFalse(prescription.addRemark(null, "Client"));
    }

    // Testing for null category
    @Test
    public void testAddRemarkNullCategory() {
        assertFalse(prescription.addRemark("Valid remark text", null));
    }

    // Testing for empty category
    @Test
    public void testAddRemarkEmptyCategory() {
        assertFalse(prescription.addRemark("Valid remark text", ""));
    }
}
