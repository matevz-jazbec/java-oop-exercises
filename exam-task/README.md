# Java Study Exercise: Exam - Task

Single-file Java exercise demonstrating basic OOP concepts.  

## Assignment
Write two classes in Java: **Task** (represents an exam task) and **Exam** (represents a programming exam).

**Class Task must include:**
- fields for the task text, points earned, points possible, the author, and the difficulty (1 to 3);
- a constructor that initializes all fields and checks that the difficulty is between 1 and 3;
- getter methods for all fields;
- setter methods for the text and difficulty;
- a method that prints all task details.

**Class Exam must include:**
- fields for storing a list of tasks and the exam duration (in minutes);
- a constructor that sets the list of tasks;
- a method that prints all tasks with difficulty at least 2.

Finally, add a `main` method in **Exam** that creates one exam with at least three tasks.

## Files
- `Exam.java` — contains both classes (`Task`, `Exam`) in one file for easier showcasing.

## Run
Requires **JDK 11+**.

```bash
javac Exam.java
java Exam
```

## Customize the data
You can change the sample data without modifying the class design:

1. **Tasks** — edit the three `new Task(...)` calls in `main` to change the text, points, author, or difficulty.  
2. **Exam duration** — change `exam.setDurationMinutes(90);` to any non-negative number (or remove the call).  
3. **Filter rule** — in `printHarderTasks()`, adjust the condition `task.getDifficulty() >= 2` if you want a different threshold.  
4. **Validation policy** — in the `Task` constructor, tweak how invalid difficulty is handled (it currently logs a message; you could set a default or throw an exception).

## What it demonstrates
- Encapsulation (private fields + getters/setters)  
- Constructor validation  
- Aggregation (an exam holding a list of tasks)  
- Iteration and conditional filtering (difficulty ≥ 2)  
- A compact single-file setup suitable for a GitHub showcase

## Notes
- The assignment explicitly requires the *exam duration* field; it is implemented as `durationMinutes` with a simple getter/setter and is not used elsewhere (by design).
- For production code, each class would typically be placed in its own file and organized into packages.
