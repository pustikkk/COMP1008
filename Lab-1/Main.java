import java.util.Scanner;
 
 
/*
    Week 2 Lab: Weather Report Program
    Topics: Conditional statements, loops, typecasting, input validation
    Objective: Ask the user for weather info, validate input, and display a full report
*/

 // Aleksei Pustovoit
 
public class Main {
    public static void main(String[] args) {
 
        boolean startNewReport = true;
        Scanner input = new Scanner(System.in);
        while (startNewReport) {
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
        String weatherConditions = "";
        String precipitationPossibility = "";
        String windSpeed = "";
        double dayHighTemp = 0;
        double dayLowTemp = 0;
        int UVIndex = 0;

        /*
        STEP 2: Get input from the user using Scanner
        - Ask for each variable above
        - Validate numeric input using loops
        - Example: Ensure highTemp >= lowTemp
        */
        
 
        // TODO: Prompt user and read input
        // TODO: Use loops to validate high/low temperatures and UV index

        // two boolean vars to validate input using while loop
        boolean isDayTempValid = false;
        boolean isUVIndexValid = false;

        
        System.out.println("Enter today's weather conditions: ");
        weatherConditions = input.nextLine();
        System.out.println("Enter today's precipitation chance (use a number in percents, ex. 50) : ");
        precipitationPossibility = input.nextLine();
        System.out.println("Enter today's wind speed (use a number in km/h, ex. 40): ");
        windSpeed = input.nextLine();

        while(!isDayTempValid) {

            // this part of code tries to get a valid integer value for a day high temp from user

            while(true) {
                try {
                    System.out.println("Enter today's day high temperature: ");
                    dayHighTemp = Double.parseDouble(input.nextLine());
                    break;
                } catch(NumberFormatException e) {
                    System.out.println("You've entered wrong credentials for today's day high temp. try again");
                }
            }
            // this part of code tries to get a valid integer value for a day low temp from user
            while(true) {
                try {
                    System.out.println("Enter today's day low temperature: ");
                    dayLowTemp = Double.parseDouble(input.nextLine());
                    break;
                } catch(NumberFormatException e) {
                    System.out.println("You've entered wrong credentials for today's day low temp. try again");
                }
            }

            // checks if conditions met and if not goes through the loop again
            if(dayHighTemp > dayLowTemp) {
                isDayTempValid = true;
            } else {
                System.out.println("Day low temp cannot be higher than day high temp.Try again!");
            }
        }


        while(!isUVIndexValid) {
            /* kinda the same pattern here, first the program checks
            *   if the user entered required value type(could be a 100 for instance, wil be valid as in integer)
            *   and then after it successfully passed the value checks how realistic that number(ex. 100 cannot be the value for UV index)
            */
            while(true) {
                try {
                    System.out.println("Enter today's UV index (ex. 6): ");
                    UVIndex = Integer.parseInt(input.nextLine());
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("You entered invalid number, try again!");
                }
            }
            if (UVIndex >= 0 && UVIndex <= 11) {
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
 
        System.out.println("Today day high temp is " + (int)dayHighTemp + " and day low temp is " + (int)dayLowTemp);


        /*
        STEP 4: Conditional statements
        - Example: 
          - If UV index >= 6, suggest "Use sunscreen"
          - If precipitation >= 50%, suggest "Carry an umbrella"
          - If wind speed > 40 km/h, suggest "Windy conditions"
        */


        // TODO: Write if, if-else, or nested if statements to display tips
        if(UVIndex >= 6) {
            System.out.println("Use sunscreen");
        }

        /* Since I'm supposed to use string type for wind speed and
         *   precipitation chance, I assume that I should parse them into an integer value and then
         *   use these values for if-else statements above
         * */

        // bool var for validating the value of Precipitation chance
        boolean isPrecipitationValid = false;

        // var which will try to parse a string value from precipitationPossibility to int
        int chanceOfPrecipitationInt;

        // simple while loop which will make a person to enter a valid value for precipitationPossibility
        while(!isPrecipitationValid) {
            try {
                chanceOfPrecipitationInt = Integer.parseInt(precipitationPossibility);
                // if the value is valid then the loop stops
                isPrecipitationValid = true;
                // finally if-else statement for precipitation chance
                if(chanceOfPrecipitationInt >= 50) {
                    System.out.println("Carry an umbrella");
                }
            } catch(NumberFormatException e) {
                // otherwise you'd have to try to enter a valid value again
                System.out.printf("You've entered wrong chance of precipitation (%s), try again!\n", precipitationPossibility);
                System.out.println("Enter today's precipitation chance (enter just a number in percents, ex. 50) : ");
                precipitationPossibility = input.nextLine();
            }
        }




        // bool var for validating the value of wind speed
        boolean isWindSpeedValid = false;

        // var which will try to parse a string value from precipitationPossibility to int
        int wSpeed;

        // simple while loop which will make a person to enter a valid value for windSpeed
        while(!isWindSpeedValid) {
            // basically the same logic as I use above, just for a different variable(windSpeed)
            try {
                wSpeed = Integer.parseInt(windSpeed);
                isWindSpeedValid = true;
                if(wSpeed >= 40) {
                    System.out.println("Windy conditions");
                }
            } catch (NumberFormatException e) {
                System.out.printf("You've entered wrong wind speed (%s), try again!\n", windSpeed);
                System.out.println("Enter today's wind speed (enter just a number in km/h, ex. 40): ");
                windSpeed = input.nextLine();
            }
        }
 
        /*
        STEP 5: Create a fullReport String
        - Combine all user inputs and tips into one formatted sentence or paragraph
        - Use String concatenation (+) or String.format()
        */
        String fullReport = "Weather conditions: " + weatherConditions +
                            "\nPrecipitation chance: " + precipitationPossibility + "%"+
                            "\nWind speed: " + windSpeed + " km/h" +
                            "\nDay time high: " + dayHighTemp +" and day time low: " + dayLowTemp +
                            "\nUV index: " + UVIndex;
 
        // TODO: Construct your full weather report here
 
 
        /*
        STEP 6: Print the full weather report
        */
        System.out.println(fullReport);
 
        // TODO: Output your report using System.out.println()
 
 
        /*
        STEP 7: Optional extra challenge
        - Use loops to ask if the user wants to enter another day's report
        - Continue until the user types "no"
        */

        // TODO: Implement loop for multiple reports
        // This block of code will ask whether user wants to do a weather report for another day
        // if user says no, it will end the program
        // if user says yes, he will go at the beginning of the program to do a new weather report
        // if user enters invalid response, it will ask him to enter either yes or no

        // variable to validate user's response
        boolean isOneMoreReportValid = false;

        // variable which will store user response
        String oneMoreReport;

        // simple while loop which will parse user's response
        System.out.println("Would you like to create one more report? (Enter yes or no): ");
        oneMoreReport = input.nextLine();
        while(!isOneMoreReportValid) {

            if (oneMoreReport.equalsIgnoreCase("yes")) {
                isOneMoreReportValid = true;
                System.out.println("Now you can create one more weather report!");
            } else if (oneMoreReport.equalsIgnoreCase("no")) {
                isOneMoreReportValid = true;
                System.out.println("See you next time for a new weather report!");
                startNewReport = false;
            } else {
                System.out.println("You've entered wrong credentials, try again!");
                System.out.println("Would you like to create one more report? (Enter yes or no): ");
                oneMoreReport = input.nextLine();
            }
        }




        }
        input.close();
    }
}
 