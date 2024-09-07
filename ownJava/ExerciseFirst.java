import java.util.*;

class ExerciseFirst {
    // Write a program to calculate percentage of a given student in CBSE exam. His
    // marks from 5 subject must be taken as input from the keyword. (marks are out
    // of 100)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float totalMarks = 500;
        System.out.print("Enter subject 1 marks : ");
        float sub1Marks = sc.nextFloat();
        System.out.print("Enter subject 2 marks : ");
        float sub2Marks = sc.nextFloat();
        System.out.print("Enter subject 3 marks : ");
        float sub3Marks = sc.nextFloat();
        System.out.print("Enter subject 4 marks : ");
        float sub4Marks = sc.nextFloat();
        System.out.print("Enter subject 5 marks : ");
        float sub5Marks = sc.nextFloat();

        // addition of all 5 subject marks
        float totalObtainedMarks = sub1Marks + sub2Marks + sub3Marks + sub4Marks + sub5Marks;
        System.out.println("Total obtain marks are : " + totalObtainedMarks);
        // obtain marks / total marks
        float marksInPercentage = (totalObtainedMarks / totalMarks);
        System.out.println("Marks in percentage : " + marksInPercentage);
        // percentage get by the student
        float percentageOf5SubMarks = marksInPercentage * 100;
        System.out.println("Percentage  : " + percentageOf5SubMarks);

        // Write a program to check whether the input value is integer or not
        System.out.print("Enter your number : ");
        System.out.println(sc.hasNextInt());

    }

}
