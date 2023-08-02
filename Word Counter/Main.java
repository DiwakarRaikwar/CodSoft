
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class Main {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print ("Here type the string or quote in which you wanna know the number of words : ");
         String in  = input.nextLine() ;


        // Create a HashMap to store word frequencies ( In this the number of words + occurrence of that individual works is being stored :
        Map<String, Integer> wordFrequencyMap = new HashMap<>();
        // In map in left side , string - will store the value
        // Integer = will store the numbers of occurrence in whole string of that individual values

        String []words = in.split("\\W+");//this function is inbuilt java function with the help of it we can divide it in groups of words

        // counting  the input text into words and count frequencies
        for (String word : words) {
            String normalizedWord = word.toLowerCase(); // Convert to lowercase if needed ( mandatory )
            wordFrequencyMap.put(normalizedWord, wordFrequencyMap.getOrDefault(normalizedWord, 0) + 1);
        }

        // Display word frequencies
        displayWordFrequencies(wordFrequencyMap);
        System.out.println(" the numbers of total words in input string is "+ words.length);


    }
    // this function displaywordfrequencies will display the word as well as its occurrence in the string :)

    public  static void displayWordFrequencies(Map<String, Integer> wordFrequencyMap) {
        for (Map.Entry<String, Integer> entry : wordFrequencyMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    //Map.Entry is an inner interface defined within the java.util.Map interface. It represents a key-value pair within a
    // map and provides methods to access both the key and the value associated with that entry.

}
