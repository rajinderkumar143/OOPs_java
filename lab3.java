class Student {
    String name;
    String usn;
    int sem;

    
    Student(String name, String usn, int sem) {
        this.name = name;
        this.usn = usn;
        this.sem = sem;
    }

  
    public void displayStudentDetails() {
        System.out.println("Student details:");
        System.out.println("USN: " + usn);
        System.out.println("Name: " + name);
        System.out.println("Semester: " + sem);
    }

class Internals {
    int[] internalMarks = new int[5];

    
    Internals(int[] internalMarks) {
        this.internalMarks = internalMarks;
    }

    
    public void displayInternalMarks() {
        System.out.println("Internal Marks:");
        for (int i = 0; i < internalMarks.length; i++) {
            System.out.println("Course " + (i + 1) + ": " + internalMarks[i]);
        }
    }


class External extends Student {
    int[] externalMarks = new int[5];

   
    External(String usn, String name, int sem, int[] externalMarks) {
        super(name, usn, sem);
        this.externalMarks = externalMarks;
    }

   
    public void displayExternalMarks() {
        System.out.println("External Marks (SEE):");
        for (int i = 0; i < externalMarks.length; i++) {
            System.out.println("Course " + (i + 1) + ": " + externalMarks[i]);
        }
    }
}

public class Main2 {
    public static void main(String[] args) {
        String studentUsn = "1BM23CS260";
        String studentName = "Rohan";
        int studentSem = 3;

        
        int[] internalMarks = {20, 22, 18, 25, 21};
        Internals internals = new Internals(internalMarks);

      
        int[] externalMarks = {50, 55, 60, 48, 45};
        External external = new External(studentUsn, studentName, studentSem, externalMarks);

        
        external.displayStudentDetails();
        internals.displayInternalMarks();
        external.displayExternalMarks();
    }
}

