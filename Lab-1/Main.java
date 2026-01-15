import java.util.Scanner;
 
 
/*
    Week 2 Lab: Weather Report Program
    Topics: Conditional statements, loops, typecasting, input validation
    Objective: Ask the user for weather info, validate input, and display a full report
*/

 // Aleksei Pustovoit
 
public class Main {
    public static void main(String[] args) {
 
 
        Scanner input = new Scanner(System.in);
 
 
        /*
        STEP 1: Declare variables for weather information
        a) Today's weather conditions (String)
        b) Possibility of precipitation (String)
        c) Wind speed (String)
        d) Daily high temperature (int or double)
        e) Daily low temperature (int or double)
        f) UV index (int)
        */
 
 
        // TODO: Declare your variables here
        String weatherConditions;
        String precipitationPossibility;
        String windSpeed;
        double dayHighTemp;
        double dayLowTemp;
        int UVIndex;

        /*
        STEP 2: Get input from the user using Scanner
        - Ask for each variable above
        - Validate numeric input using loops
        - Example: Ensure highTemp >= lowTemp
        */
        
 
        // TODO: Prompt user and read input
        // TODO: Use loops to validate high/low temperatures and UV index

        // two boolean vars to validate input using while loop
        boolean isWeatherValid = false;
        boolean isUVIndexValid = false;

        
        System.out.println("Enter today's weather conditions: ");
        weatherConditions = input.nextLine();
        System.out.println("Enter today's precipation chance : ");
        precipitationPossibility = input.nextLine();
        System.out.println("Enter today's wind speed: ");
        windSpeed = input.nextLine();

        while(!isWeatherValid) {
            System.out.println("Enter today's day high temperature: ");
            dayHighTemp = input.nextDouble();
            System.out.println("Enter today's day low temperature: ");
            dayLowTemp = input.nextDouble();
            if(dayHighTemp > dayLowTemp) {
                isWeatherValid = true;
            } else {
                System.out.println("You've entered wrong data.Try again!");
            }
        }
        while(!isUVIndexValid) {
            System.out.println("Enter today's UV index: ");
            UVIndex = input.nextInt();
            if (UVIndex > 0 && UVIndex < 11) {
                isUVIndexValid = true;
            } else {
                System.out.println("You've entered wrong data.Try again!");
            }
        }
        
        /*
        STEP 3: Typecasting (if needed)
        - Example: if you read a double but want to display as int
        */
 
 
        // TODO: Apply typecasting where necessary
 
 
        /*
        STEP 4: Conditional statements
        - Example: 
          - If UV index >= 6, suggest "Use sunscreen"
          - If precipitation >= 50%, suggest "Carry an umbrella"
          - If wind speed > 40 km/h, suggest "Windy conditions"
        */
 
 
        // TODO: Write if, if-else, or nested if statements to display tips
 
 
        /*
        STEP 5: Create a fullReport String
        - Combine all user inputs and tips into one formatted sentence or paragraph
        - Use String concatenation (+) or String.format()
        */
 
 
        // TODO: Construct your full weather report here
 
 
        /*
        STEP 6: Print the full weather report
        */
 
 
        // TODO: Output your report using System.out.println()
 
 
        /*
        STEP 7: Optional extra challenge
        - Use loops to ask if the user wants to enter another day's report
        - Continue until the user types "no"
        */
 
 
        // TODO: Implement loop for multiple reports
 
 
        input.close();
    }
}
 