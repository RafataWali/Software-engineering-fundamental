import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class PrescriptionTest {

    Prescription prescription = new Prescription();

    // ================== Testing addPrescription ==================

    // Testing for a valid prescription
    @Test
    public void testAddPrescriptionValid() {
        assertTrue(prescription.addPrescription("Arafat", "Abduwali", "138 Spencer Street, Melbourne, VIC 3000, Australia",
                -2.5f, 1.0f, 90, "12/12/2023", "Dr. Sarah Lee"));
    }

    // Testing for short first name
    @Test
    public void testAddPrescriptionShortFirstName() {
        assertFalse(prescription.addPrescription("Ara", "Abduwali", "138 Spencer Street, Melbourne, VIC 3000, Australia",
                -2.5f, 1.0f, 90, "12/12/2023", "Dr. Sarah Lee"));
    }

    // Testing for long last name
    @Test
    public void testAddPrescriptionLongLastName() {
        assertFalse(prescription.addPrescription("Arafat", "Abduwalilongnametoolong", "138 Spencer Street, Melbourne, VIC 3000, Australia",
                -2.5f, 1.0f, 90, "12/12/2023", "Dr. Sarah Lee"));
    }

    // Testing for address too short
    @Test
    public void testAddPrescriptionShortAddress() {
        assertFalse(prescription.addPrescription("Arafat", "Abduwali", "Short Address",
                -2.5f, 1.0f, 90, "12/12/2023", "Dr. Sarah Lee"));
    }

    // Testing for out-of-range sphere
    @Test
    public void testAddPrescriptionInvalidSphere() {
        assertFalse(prescription.addPrescription("Arafat", "Abduwali", "138 Spencer Street, Melbourne, VIC 3000, Australia",
                -25.0f, 1.0f, 90, "12/12/2023", "Dr. Sarah Lee"));
    }

    // Testing for out-of-range cylinder
    @Test
    public void testAddPrescriptionInvalidCylinder() {
        assertFalse(prescription.addPrescription("Arafat", "Abduwali", "138 Spencer Street, Melbourne, VIC 3000, Australia",
                -2.5f, 5.0f, 90, "12/12/2023", "Dr. Sarah Lee"));
    }

    // Testing for out-of-range axis
    @Test
    public void testAddPrescriptionInvalidAxis() {
        assertFalse(prescription.addPrescription("Arafat", "Abduwali", "138 Spencer Street, Melbourne, VIC 3000, Australia",
                -2.5f, 1.0f, 190, "12/12/2023", "Dr. Sarah Lee"));
    }

    // Testing for optometrist name too short
    @Test
    public void testAddPrescriptionShortOptometristName() {
        assertFalse(prescription.addPrescription("Arafat", "Abduwali", "138 Spencer Street, Melbourne, VIC 3000, Australia",
                -2.5f, 1.0f, 90, "12/12/2023", "Dr. S"));
    }
}
