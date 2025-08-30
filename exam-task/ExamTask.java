import java.util.ArrayList;

// Class Task represents a single exam task
class Task {
    private String text;
    private int pointsEarned;
    private int pointsPossible;
    private String author;
    private int difficulty;

    // Constructor for creating a new task
    public Task(String text, int pointsEarned, int pointsPossible, String author, int difficulty) {
        this.text = text;
        this.pointsEarned = pointsEarned;
        this.pointsPossible = pointsPossible;
        this.author = author;
        this.difficulty = difficulty;

        // Validate that difficulty is between 1 and 3
        if (difficulty < 1 || difficulty > 3) {
            System.out.println("Error: Difficulty must be between 1 and 3.");
            // Optional: this.difficulty = 1; // Set a default value
        }
    }

    // Getters
    public String getText() {
        return text;
    }

    public int getPointsEarned() {
        return pointsEarned;
    }

    public int getPointsPossible() {
        return pointsPossible;
    }

    public String getAuthor() {
        return author;
    }

    public int getDifficulty() {
        return difficulty;
    }

    // Setters (only for text and difficulty)
    public void setText(String text) {
        this.text = text;
    }

    public void setDifficulty(int difficulty) {
        this.difficulty = difficulty;
    }

    // Print all task details
    public void printDetails() {
        System.out.println("Text: " + text);
        System.out.println("Points earned: " + pointsEarned);
        System.out.println("Points possible: " + pointsPossible);
        System.out.println("Author: " + author);
        System.out.println("Difficulty: " + difficulty);
    }
}

// Class Exam represents the overall programming exam
class Exam {
    private ArrayList<Task> tasks;
    private int durationMinutes; // required by assignment (writing time in minutes)

    // Constructor allowing to set the list of tasks
    public Exam(ArrayList<Task> tasks) {
        this.tasks = tasks;
    }

    // Getter/setter for duration (not required to be used elsewhere)
    public int getDurationMinutes() { return durationMinutes; }
    public void setDurationMinutes(int durationMinutes) {
        if (durationMinutes >= 0) this.durationMinutes = durationMinutes;
    }

    // Print tasks with difficulty at least 2
    public void printHarderTasks() {
        System.out.println("Tasks with difficulty at least 2:");
        for (Task task : tasks) {
            if (task.getDifficulty() >= 2)
                task.printDetails();
            System.out.println(); // blank line for readability
        }
    }

    // Main method for a simple demo
    public static void main(String[] args) {
        ArrayList<Task> tasks = new ArrayList<>();
        tasks.add(new Task("Write a program that prints 'Hello, world!'", 5, 10, "Professor Novak", 1));
        tasks.add(new Task("Implement bubble sort", 8, 15, "Assistant Kovac", 2));
        tasks.add(new Task("Solve a small instance of the Traveling Salesman Problem (TSP)", 10, 20, "Professor Horvat", 3));

        // Create the exam
        Exam exam = new Exam(tasks);
        // (optional) set the writing time in minutes
        exam.setDurationMinutes(90);

        // Print the first task
        System.out.println("First task:");
        tasks.get(0).printDetails();
        System.out.println();

        // Print all tasks
        System.out.println("All tasks:");
        for (Task task : tasks) {
            task.printDetails();
            System.out.println();
        }

        // Print tasks with difficulty >= 2
        exam.printHarderTasks();
    }
}
