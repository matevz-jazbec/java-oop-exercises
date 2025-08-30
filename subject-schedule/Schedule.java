import java.util.ArrayList;

// Class representing a study subject with its properties.
class Subject {
    private String subjectName;
    private String lecturerName;
    private int creditPoints;
    private boolean isMandatory;

    // Constructor to initialize all fields of the subject.
    public Subject(String subjectName, String lecturerName, int creditPoints, boolean isMandatory) {
        this.subjectName = subjectName;
        this.lecturerName = lecturerName;
        this.creditPoints = creditPoints;
        this.isMandatory = isMandatory;
    }

    // Getter for subject name.
    public String getSubjectName() {
        return subjectName;
    }

    // Getter for lecturer name.
    public String getLecturerName() {
        return lecturerName;
    }

    // Getter for credit points.
    public int getCreditPoints() {
        return creditPoints;
    }

    // Getter for mandatory status.
    public boolean getIsMandatory() {
        return isMandatory;
    }

    // Setter to update the lecturer name.
    public void setLecturerName(String lecturerName) {
        this.lecturerName = lecturerName;
    }

    // Method to print all details of the subject.
    public void printDetails() {
        System.out.println("Subject name: " + subjectName);
        System.out.println("Lecturer name: " + lecturerName);
        System.out.println("Credit points: " + creditPoints);
        System.out.println("Mandatory subject: " + (isMandatory ? "Yes" : "No"));
    }
}

// Class representing a schedule with a list of subjects.
class Schedule {
    private ArrayList<Subject> subjectList;

    // Constructor to initialize the list of subjects.
    public Schedule(ArrayList<Subject> subjectList) {
        this.subjectList = subjectList;
    }

    // Method to calculate the total credit points from all subjects.
    public int totalCreditPoints() {
        int sum = 0;
        for (Subject subject : subjectList) {
            sum += subject.getCreditPoints();
        }
        return sum;
    }

    // Method to print subjects taught by a specific lecturer.
    public void printSubjectsByLecturer(String lecturerName) {
        System.out.println("Subjects taught by " + lecturerName + ":");
        for (Subject subject : subjectList) {
            if (subject.getLecturerName().equals(lecturerName)) {
                System.out.println("- " + subject.getSubjectName());
            }
        }
    }

    // Main method to demonstrate the classes: creates subjects, a schedule, and
    // prints results.
    public static void main(String[] args) {
        ArrayList<Subject> subjects = new ArrayList<>();
        subjects.add(new Subject("Mathematics", "Dr. Novak", 6, true));
        subjects.add(new Subject("Programming", "MSc. Kovac", 8, true));
        subjects.add(new Subject("English", "Prof. Smith", 4, false));

        Schedule mySchedule = new Schedule(subjects);

        System.out.println("Total credit points: " + mySchedule.totalCreditPoints());

        System.out.println("\nDetails of all subjects:");
        for (Subject subject : subjects) {
            subject.printDetails();
            System.out.println();
        }
        mySchedule.printSubjectsByLecturer("MSc. Kovac");
    }
}