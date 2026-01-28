import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        // Lab 4 – COMP1008 Programming Fundamentals
        // Topic: Arrays & ArrayLists
        // ================================================
        // STEP 1: Create an array of grocery items (String)
        // Add at least 6 items to the array
        // Example: {"Milk", "Eggs", "Bread", ... }
        // ================================================

        // used both capitalize/uncapitalized words so it will
        // be more interesting at step 5
        String[] groceries = {
                // TODO: Fill in your grocery items
                "grapes",
                "Banana",
                "bread",
                "cereals",
                "Chocolate",
                "Watermelon",
        };


        // ================================================
        // STEP 2: Print the array using Arrays.toString()
        // ================================================
        System.out.println(Arrays.toString(groceries) + "\n");



        // ================================================
        // STEP 3: Transfer all array items into an ArrayList
        // Use a loop to add each item
        // ================================================
        ArrayList<String> groceryList = new ArrayList<>();
        for (String item : groceries) {
            groceryList.add(item);
        }
        // TODO: Loop through the array and add items to groceryList



        // ================================================
        // STEP 4: Modify the ArrayList
        // Add two new items
        // Remove one item by name or index
        // Print the updated ArrayList
        // ================================================
        groceryList.add("Pizza");
        groceryList.add("apple");
        groceryList.remove(2);
        System.out.println("Your updated array list:");
        for (String item : groceryList) {
            System.out.println(item + "\n");
        }



        // ================================================
        // STEP 5: Count how many items start with a vowel
        // Hint: vowels = a, e, i, o, u
        // Use .toLowerCase(). startsWith()
        // ================================================
        int count = 0;
        for (String item : groceryList) {
            if(item.toLowerCase().startsWith("a")) {
                count++;
            }
            else if(item.toLowerCase().startsWith("e")) {
                count++;
            }
            else if(item.toLowerCase().startsWith("i")) {
                count++;
            }
            else if(item.toLowerCase().startsWith("o")) {
                count++;
            }
            else if(item.toLowerCase().startsWith("u")) {
                count++;
            }
        }


        // ================================================
        // STEP 6: Print the final results
        // ================================================


    }
}