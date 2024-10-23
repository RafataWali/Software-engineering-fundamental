//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
   public static void main(String[] args){
   Prescription prescription = new Prescription();
   boolean result = prescription.addPrescription("Arafat", "Wali",
           "138 Spencer St, Melbourne, VIC 3000, Australia",
           -2.00f, 0.00f, 90, "19/10/2024", "Dr.ArafatWali");
   System.out.println("Add Prescription: " + result);
   System.out.println("First Name Length: " + "Arafat".length());
   System.out.println("Last Name Length: " + "Wali".length());
   System.out.println("Address Length: " + "138 Spencer St, Melbourne, VIC 3000, Australia".length());
   System.out.println("Sphere: " + -0.200f);
   System.out.println("Cylinder: " + 0.0f);
   System.out.println("Optometrist Length: " + "Dr.ArafatWali".length());
   }
}