package session1.exercise3;

public class GenderIdentifier {
    public static void main(String[] args) {

        String genderInput = "M"; 

        genderInput = genderInput.toUpperCase();

        switch (genderInput) {

            case "M":

                System.out.println("شما آقا هستید.");

            case "F":

                System.out.println("شما خانم هستید.");

            default:
                System.out.println("ورودی نامعتبر است.");
        }
    }
}
