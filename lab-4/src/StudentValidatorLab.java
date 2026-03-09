import java.util.Scanner;

public class StudentValidatorLab {


        public static void main(String[] args) {


            Scanner scanner = new Scanner(System.in);


            // =====================================================
            // PART 1 — NAME VALIDATION (String + Regex)
            // =====================================================



            boolean isNameValid = false;
            String fullNameValidation = "^[A-Za-z ]+$";
            while(!isNameValid) {
                System.out.print("Enter your full name: ");
                // STEP 1:
                // Ask user to enter full name
                String fullName = scanner.nextLine();
                // STEP 2:
                // Validate name
                // Only letters and spaces allowed
                // Use regex with matches()
                if(fullName.matches(fullNameValidation)) {
                    isNameValid = true;
                } else {
                    System.out.println("Your full name format is wrong, try again!");
                }
            }











            // =====================================================
            // PART 2 — STUDENT ID VALIDATION
            // Format: S-1234
            // =====================================================
            boolean isStudentIdValid = false;
            String studentIdValidation = "^S-\\d{4}$";
            while(!isStudentIdValid) {
                // STEP 3:
                // Ask user to enter student ID
                System.out.print("Enter your student ID: ");
                String studentID = scanner.nextLine();
                // STEP 4:
                // Validate format using regex
                if(studentID.matches(studentIdValidation)) {
                    isStudentIdValid = true;
                } else {
                    System.out.println("Your student ID format is wrong, try again!");
                }
            }











            // =====================================================
            // PART 3 — EMAIL VALIDATION
            // =====================================================



            boolean isEmailValid = false;
            String emailValidation = "^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$";
            while(!isEmailValid) {
                // STEP 5:
                // Ask user to enter email
                System.out.print("Enter your email: ");
                String email = scanner.nextLine();
                // STEP 6:
                // Validate email format
                if(email.matches(emailValidation)) {
                    isEmailValid = true;
                } else {
                    System.out.println("Your student email format is wrong, try again!");
                }
            }






            // =====================================================
            // PART 4 — SENTENCE PROCESSING
            // =====================================================


            // STEP 7:
            // Ask user to enter a sentence




            // STEP 8:
            // Count vowels using Character class




            // STEP 9:
            // Reverse sentence using StringBuilder




            // STEP 10:
            // Replace all digits in sentence with '*'




            // =====================================================
            // PART 5 — TOKENIZING
            // =====================================================


            // STEP 11:
            // Create string: "Math,Science,Java,English"
            // Split using comma
            // Print each course




            // =====================================================
            // PART 6 — PATTERN & MATCHER
            // =====================================================


            // STEP 12:
            // Create string: "Invoice number is 4567 and total is 890"
            // Use Pattern and Matcher to extract all numbers




            scanner.close();
        }
    }


