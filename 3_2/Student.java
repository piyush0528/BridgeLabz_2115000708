public class Student {
static String universityName = "State University";
static int totalStudents = 0;
final int rollNumber;
String name;
String grade;
public Student(String name, String grade, int rollNumber) {
this.name = name;
this.grade = grade;
this.rollNumber = rollNumber;
totalStudents++;
}
public static void displayTotalStudents() {
System.out.println("Total Students Enrolled: " + totalStudents);
}
public void updateGrade(String newGrade) {
if (this instanceof Student) {
this.grade = newGrade;
} else {
System.out.println("This is not a valid Student object.");
}
}
public void displayStudentDetails() {
if (this instanceof Student) {
System.out.println("University Name: " + universityName);
System.out.println("Student Name: " + name);
System.out.println("Roll Number: " + rollNumber);
System.out.println("Grade: " + grade);
} else {
System.out.println("This is not a valid Student object.");
}
}
public static void main(String[] args) {
Student student1 = new Student("vedant", "A", 101);
Student student2 = new Student("saurav", "B", 102);
student1.displayStudentDetails();
student2.displayStudentDetails();
Student.displayTotalStudents();
student1.updateGrade("A+");
System.out.println("Updated Grade for vedant:");
student1.displayStudentDetails();
}
}
