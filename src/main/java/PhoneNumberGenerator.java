import java.util.Random;

public class PhoneNumberGenerator {
    public static void main(String[] args) {
        // TODO: Create Random object for phone number generation
        
        // TODO: Generate first three digits (XXX)
        // Constraint: Cannot contain 8 or 9 (digits 0-7 only)
        
        // TODO: Generate second three digits (XXX) 
        // Constraint: Must be <= 742 (000-742)
        
        // TODO: Generate third three digits (XXX)
        // No constraints (000-999)
        
        // TODO: Format and display phone number as XXX-XXX-XXX
        // Include the dashes in the output

        Random rand = new Random();

        int dig1 = rand.nextInt(8);
        int dig2 = rand.nextInt(8);
        int dig3 = rand.nextInt(8);
        String firstGroup = "" + dig1 + dig2 + dig3;

        int secondGroupNum = rand.nextInt(743);
        String secondGroup = String.format("%03d", secondGroupNum);

        int thirdGroupNum = rand.nextInt(1000);
        String thirdGroup = String.format("%03d", thirdGroupNum);

        System.out.println(firstGroup + "-" + secondGroup + "-" + thirdGroup);
    }
}
