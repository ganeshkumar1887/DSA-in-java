import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OnlineQuizApplication {

    // Question class representing a multiple choice question  
    static class Question {
        private String questionText;
        private List<String> options;
        private int correctAnswerIndex;

        public Question(String questionText, List<String> options, int correctAnswerIndex) {
            this.questionText = questionText;
            this.options = options;
            this.correctAnswerIndex = correctAnswerIndex;
        }

        public void displayQuestion() {
            System.out.println(questionText);
            for (int i = 0; i < options.size(); i++) {
                System.out.println((i + 1) + ". " + options.get(i));
            }
        }

        public boolean isCorrectAnswer(int userAnswer) {
            return userAnswer - 1 == correctAnswerIndex;
        }
    }

    // Quiz class to hold and administer multiple questions
    static class Quiz {
        private String topic;
        private List<Question> questions;
        private int correctCount;
        private int answeredCount;
        
        public Quiz(String topic) {
            this.topic = topic;
            this.questions = new ArrayList<>();
            this.correctCount = 0;
            this.answeredCount = 0;
        }

        public void addQuestion(Question question) {
            questions.add(question);
        }

        public void start(Scanner scanner) {
            System.out.println("\nStarting quiz on topic: " + topic);
            System.out.println("----------------------------");
            for (Question q : questions) {
                q.displayQuestion();
                int userAnswer = 0;
                while (true) {
                    System.out.print("Your answer (enter option number): ");
                    String input = scanner.nextLine();
                    try {
                        userAnswer = Integer.parseInt(input);
                        if (userAnswer < 1 || userAnswer > q.options.size()) {
                            System.out.println("Invalid choice. Please enter a number between 1 and " + q.options.size());
                            continue;
                        }
                        break;
                    } catch (NumberFormatException e) {
                        System.out.println("Please enter a valid number.");
                    }
                }
                answeredCount++;
                if (q.isCorrectAnswer(userAnswer)) {
                    System.out.println("Correct!\n");
                    correctCount++;
                } else {
                    System.out.println("Incorrect. The correct answer was: " 
                        + (q.correctAnswerIndex + 1) + ". " + q.options.get(q.correctAnswerIndex) + "\n");
                }
            }
            displayResults();
        }

        private void displayResults() {
            System.out.println("Quiz Completed!");
            System.out.println("You answered " + correctCount + " out of " + answeredCount + " questions correctly.");
            double percentage = (correctCount * 100.0) / answeredCount;
            System.out.printf("Your score: %.2f%%\n\n", percentage);
        }
    }

    // Build quizzes for several topics
    private static List<Quiz> prepareQuizzes() {
        List<Quiz> quizzes = new ArrayList<>();

        // Sample Quiz 1: Java Basics
        Quiz javaQuiz = new Quiz("Java Basics");
        javaQuiz.addQuestion(new Question(
            "What is the size of int variable in Java?",
            List.of("8 bit", "16 bit", "32 bit", "64 bit"),
            2 // index 2 = 3rd option (32 bit)
        ));
        javaQuiz.addQuestion(new Question(
            "Which keyword is used to inherit a class in Java?",
            List.of("this", "super", "extends", "implements"),
            2
        ));
        javaQuiz.addQuestion(new Question(
            "Which of these is NOT a Java primitive type?",
            List.of("int", "boolean", "String", "double"),
            2
        ));
        quizzes.add(javaQuiz);

        // Sample Quiz 2: General Science
        Quiz scienceQuiz = new Quiz("General Science");
        scienceQuiz.addQuestion(new Question(
            "What planet is known as the Red Planet?",
            List.of("Earth", "Mars", "Jupiter", "Saturn"),
            1
        ));
        scienceQuiz.addQuestion(new Question(
            "What is the chemical symbol for water?",
            List.of("WO", "H2O", "HO2", "O2H"),
            1
        ));
        scienceQuiz.addQuestion(new Question(
            "What gas do plants absorb from the atmosphere?",
            List.of("Oxygen", "Nitrogen", "Carbon dioxide", "Hydrogen"),
            2
        ));
        quizzes.add(scienceQuiz);

        // Sample Quiz 3: Mathematics
        Quiz mathQuiz = new Quiz("Mathematics");
        mathQuiz.addQuestion(new Question(
            "What is the value of pi (approx)?",
            List.of("2.14", "4.13", "3.14", "1.34"),
            2
        ));
        mathQuiz.addQuestion(new Question(
            "What is 7 x 8?",
            List.of("54", "56", "63", "58"),
            1
        ));
        mathQuiz.addQuestion(new Question(
            "What is the square root of 81?",
            List.of("7", "8", "9", "6"),
            2
        ));
        quizzes.add(mathQuiz);

        return quizzes;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Quiz> quizzes = prepareQuizzes();

        System.out.println("Welcome to the Online Quiz Application!");
        System.out.println("Please select a quiz topic:");

        while (true) {
            for (int i = 0; i < quizzes.size(); i++) {
                System.out.println((i + 1) + ". " + quizzes.get(i).topic);
            }
            System.out.println((quizzes.size() + 1) + ". Exit");

            System.out.print("Enter your choice: ");
            String input = scanner.nextLine();

            int choice = -1;
            try {
                choice = Integer.parseInt(input);
                if (choice < 1 || choice > quizzes.size() + 1) {
                    System.out.println("Invalid choice, please try again.\n");
                    continue;
                }
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid number.\n");
                continue;
            }

            if (choice == quizzes.size() + 1) {
                System.out.println("Thank you for using the Online Quiz Application. Goodbye!");
                break;
            }

            Quiz selectedQuiz = quizzes.get(choice - 1);
            selectedQuiz.start(scanner);
        }

        scanner.close();
    }
}
