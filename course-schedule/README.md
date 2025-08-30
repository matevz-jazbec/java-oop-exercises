# Java Study Exercise: Subject and Schedule Classes

This is a study exercise from university coursework.  
Original assignment provided by the faculty; solution implemented by me as part of coursework.

## Assignment Instructions

In Java, write two classes: the Subject class, which represents a study subject, and the Schedule class. The Subject class should include:
- Fields for storing the subject name, lecturer name, number of credit points, and whether the subject is mandatory.
- A constructor that allows arbitrary initialization of all fields.
- Methods for retrieving the values of all fields (i.e., getter methods).
- A setter method for setting the lecturer name field.
- A method that prints all details about the subject.

The Schedule class should include:
- A list of subjects (as a field of Subject objects).
- A constructor that allows setting the list of subjects.
- A method that sums the credit points of all subjects.
- A method that prints all subjects taught by a specific lecturer.

In the Schedule class, add a main method and create a schedule with at least three subjects that you attend.

## Implementation

This project implements the above requirements using Java classes with encapsulation, constructors, getters, setters, and iteration over collections. The code is self-contained and demonstrates basic object-oriented principles.
To experiment with different examples, modify the subject data in the main method of the Schedule class by adding, removing, or changing Subject objects in the subjects ArrayList.

## How to Run

1. Ensure you have Java installed (JDK 8 or higher recommended).
2. Save the code in a file named `Subject.java`.
3. Compile the code: `javac Subject.java`.
4. Run the program: `java Schedule`.
5. The output will display the total credit points, details of all subjects, and subjects taught by a specific lecturer.
