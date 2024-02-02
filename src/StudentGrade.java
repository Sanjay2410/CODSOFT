import java.util.Scanner;
public class StudentGrade {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number of Subjects: ");
        int num = sc.nextInt();
        int[] marks = new int[10];
        System.out.println("Enter marks in " + num + " subjects: ");
        for(int i = 0; i < num; i++){
            System.out.println("Subject-"+ (i+1) + ":");
            marks[i] = sc.nextInt();
        }
        int sum = 0;
        for(int i = 0; i < num; i++){
            sum += marks[i];
        }
        System.out.println("Your Total marks: " + sum + " / "+ (num * 100));

        float avg = sum / num; // avg = (sum / num * 100) * 100

        System.out.println("Your Average Percentage :" + String.format("%.2f", avg) + "%");
        
        System.out.println("Your Overall Grade: ");
        if(avg >= 91){
            System.out.println("O");
        }
        else if(avg >= 81 && avg <= 90){
            System.out.println("A+");
        }
        else if(avg >= 71 && avg <= 80){
            System.out.println("A");
        }
        else if(avg >= 61 && avg <= 70){
            System.out.println("B+");
        }
        else if(avg >= 51 && avg <= 60){
            System.out.println("B");
        }
        else if(avg >= 41 && avg <= 50){
            System.out.println("C");
        }
        else{
            System.out.println("F");
        }
    }

    @Override
    public String toString() {
        return "StudentGrade []";
    }   
    
}
