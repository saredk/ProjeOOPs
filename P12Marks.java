package ProjectOOPs;
/*
We have to calculate the average of marks obtained in three subjects by
student A and by student B. Create class 'Marks' with an abstract method
'getPercentage' that will return the average percentage of marks. Provide
implementation of abstract methods in classes 'A' and 'B'. The constructor of
student A takes the marks in three subjects as its parameters and the marks
in four subjects as its parameters for student B. Test your code
 */
public abstract class P12Marks {
   abstract double getPercentage();
}class StudentA extends P12Marks{
    private double subject1;
    private double subject2;
    private double subject3;

    public StudentA(double subject1, double subject2, double subject3) {
        this.subject1 = subject1;
        this.subject2 = subject2;
        this.subject3 = subject3;
    }
    @Override
    double getPercentage() {
        double totalMarksA= subject1 + subject2 + subject3;
        return totalMarksA / 3;
    }
}class StudentB extends P12Marks{
    private double subject1;
    private double subject2;
    private double subject3;
    private double subject4;

    public StudentB(double subject1, double subject2, double subject3, double subject4) {
        this.subject1 = subject1;
        this.subject2 = subject2;
        this.subject3 = subject3;
        this.subject4 = subject4;
    }

    @Override
    double getPercentage() {
        double totalMarksB = subject1 + subject2 + subject3+subject4;
        return totalMarksB / 4;
    }
}
class MarksTester{
    public static void main(String[] args) {
        StudentA studentA = new StudentA(80, 85, 90);
        StudentB studentB = new StudentB(75, 80, 85, 88);

        System.out.println("Average percentage for Student A: " + studentA.getPercentage());
        System.out.println("Average percentage for Student B: " + studentB.getPercentage());
    }
}