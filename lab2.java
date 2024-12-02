import java.util.Scanner;
class Student{
Scanner sc = new Scanner(System.in);
String name;
String usn;
int[] marks = new int[8];
int[] credits = new int[8];
double  sgpa;
void accept(){
System.out.println("Enter name:");
name = sc.nextLine();
System.out.println("Enter usn:");
usn = sc.nextLine();
System.out.println("Enter the marks of 8 subjects in order:");
for(int i=0; i<marks.length; i++){
marks[i] = sc.nextInt();
}
System.out.println("Enter the credits of 8 subjects:");
for(int i=0; i<credits.length; i++){
credits[i] = sc.nextInt();
}
}
void calculate(){
double sum = 0;
for(int i=0; i<marks.length; i++){
if(marks[i] >= 90 && marks[i] <= 100)
sum = sum +(10*credits[i]);
else if(marks[i] >= 80 && marks[i] <= 89)
sum = sum +(9*credits[i]);
else if(marks[i] >= 70 && marks[i] <= 79)
sum = sum +(8*credits[i]);
else if(marks[i] >= 60 && marks[i] <= 69)
sum = sum +(7*credits[i]);
else if(marks[i] >= 50 && marks[i] <= 59)
sum = sum +(6*credits[i]);
else if(marks[i] >= 40 && marks[i] <= 49)
sum = sum +(5*credits[i]);
}
double sum_c = 0;
for(int i=0; i<credits.length; i++){
sum_c = sum_c + credits[i];
}
double sgpa = sum/sum_c;
System.out.println("SGPA = " + sgpa);
}
}
public class Main{
public static void main(String[] args){
Student obj = new Student();
obj.accept();
obj.calculate();
}
}

