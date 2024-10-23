import java.util.ArrayList;
import java.util.Date;
import java.io.FileWriter;
import java.io.IOException;

public class Prescription {
    private int prescID;
    private String firstName;
    private String lastName;
    private String address;
    private float sphere;
    private float cylinder;
    private int axis;
    private Date examinationDate;
    private String optometrist;
    private String[] remarkTypes = {"Client", "Optometrist"};
    private ArrayList<String> postRemarks = new ArrayList<>();

    public boolean addPrescription(String firstName, String lastName, String address, float sphere, float cylinder, int axis, String date, String optometrist) {
        if (firstName.length() < 4 || firstName.length() > 15 ||
                lastName.length() < 4 || lastName.length() > 15) {
            return false;
        }
        if (address.length() < 20) {
            return false;
        }
        if (sphere < -20.00 || sphere > 20.00 ||
                cylinder < -4.00 || cylinder > 4.00 ||
                axis < 0 || axis > 180) {
            return false;
        }
        if (optometrist.length() < 8 || optometrist.length() > 25) {
            return false;
        }

        try (FileWriter writer = new FileWriter("presc.txt", true)) {
            writer.write(firstName + "," + lastName + "," + address + "," + sphere + "," + cylinder + "," + axis + "," + date + "," + optometrist + "\n");
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean addRemark(String remarkText, String category) {
        // Check if remarkText or category is null
        if (remarkText == null || category == null) {
            System.out.println("Invalid input: remarkText or category is null");
            return false;
        }

        // Split the remark text into words
        String[] words = remarkText.split(" ");
        // Check if the remarkText has between 6 and 20 words
        if (words.length < 6 || words.length > 20 || !Character.isUpperCase(remarkText.charAt(0))) {
            System.out.println("Invalid remarkText: " + remarkText);
            return false;
        }

        // Check if category is valid
        if (!category.equals("Client") && !category.equals("Optometrist")) {
            System.out.println("Invalid category: " + category);
            return false;
        }

        // Write the remark to the file
        try (FileWriter writer = new FileWriter("remark.text", true)) {
            writer.write(remarkText + "," + category + "\n");
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }
}
