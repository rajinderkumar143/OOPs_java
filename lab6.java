class WrongAgeException extends Exception {
    public WrongAgeException(String message) {
        super(message); 
    }
}

class Father {
    int fatherAge;

    public Father(int age) throws WrongAgeException {
        if (age < 0) {
            throw new WrongAgeException("Father's age cannot be negative");
        }
        this.fatherAge = age; 
        System.out.println("Father's age is: " + fatherAge);
    }
}

class Son extends Father { 
    int sonAge;

    public Son(int fatherAge, int sonAge) throws WrongAgeException {
        super(fatherAge);
        if (sonAge < 0) {
            throw new WrongAgeException("Son's age cannot be negative");
        }

        if (sonAge >= fatherAge) {
            throw new WrongAgeException("Son's age cannot be greater than or equal to Father's age");
        }
        this.sonAge = sonAge;
        System.out.println("Son's age is: " + sonAge);
    }
}

public class Main5 {
    public static void main(String[] args) {
        try {
            Son son = new Son(34, 36); 
        } catch (Exception e) {
            System.out.println("Exception caught: " + e.getMessage()); 
        }

        try {
            Father f1 = new Father(-35); 
        } catch (Exception e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
