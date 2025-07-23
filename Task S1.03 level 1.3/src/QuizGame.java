import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class QuizGame {
    private final HashMap<String, String> countryMap; // Stores country–capital pairs
    private final Scanner scanner; // For user input
    private int score; // Tracks user's score

    // Constructor receives the HashMap loaded from file
    public QuizGame(HashMap<String, String> countryMap) {
        this.countryMap = countryMap;
        this.scanner = new Scanner(System.in);
        this.score = 0;
    }

    // This method runs the quiz
    public int startQuiz() {
        // Create a list of countries (keys from the map) and shuffle it for randomness
        List<String> countries = new ArrayList<>(countryMap.keySet());
        Collections.shuffle(countries);

        int questionCount = Math.min(10, countries.size()); // Max 10 questions

        // Ask 10 questions
        for (int i = 0; i < questionCount; i++) {
            String country = countries.get(i);

            // Ask user the capital of a randomly selected country
            System.out.println("What is the capital of " + country + "?");
            String userAnswer = scanner.nextLine().trim();

            String correctCapital = countryMap.get(country);

            // Check if the answer is correct (case-insensitive)
            if (userAnswer.equalsIgnoreCase(correctCapital)) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Wrong. The correct answer is: " + correctCapital);
            }
        }

        return score; // Return the final score
    }

    // This method saves the user's name and score to classificacio.txt
    public void saveScore(String username) {
        try (FileWriter writer = new FileWriter("classificacio.txt", true)) {
            writer.write(username + ": " + score + "\n");
        } catch (IOException e) {
            System.out.println("Error writing to classificacio.txt: " + e.getMessage());
        }
    }
}
