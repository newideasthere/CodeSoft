import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        
        float []marks = new float[7];
        float sum=0;
        float avg_percentage;

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter total number of subjects: ");
        int total = sc.nextInt();
        System.out.println("Enter marks obtained in "+total+ " subjects: ");
        for(int i=0;i<total;i++){
            marks[i] = sc.nextFloat();
            sum = sum+marks[i];
        }

        avg_percentage= ((sum/(total*100.0f)*100));
        String grade = "";
      
      if(avg_percentage>=90 && avg_percentage<=100)
         grade = "AA";
      else if(avg_percentage>=80 && avg_percentage<89)
         grade = "A+";
      else if(avg_percentage>=60 && avg_percentage<79)
         grade = "A";
      else if(avg_percentage>=45 && avg_percentage<59)
         grade = "B+";
      else if(avg_percentage>=35 && avg_percentage<44)
         grade = "B";
      else if(avg_percentage>=25 && avg_percentage<34)
         grade = "C";
      else
         grade = "F";

    System.out.println("Total Marks: "+sum);
    System.out.println("Average percentage : "+avg_percentage);
    System.out.println("Grade: "+grade);
    }
}
