import java.util.Scanner;
public class studentgrade   {

    //input student data
    
        String name;
        int[] marks=new int[3];
        double average;
        String grade;
    


    //calculate average
    void student_average(){
        int sum=0;
        for(int i=0;i<marks.length;i++)
        {
            sum+=marks[i];

        }
        average=sum/3.0;
    }

    //calculate grade
    void calculate_grade(){
        if(average>=75){
            grade = "A";
        }
        else if(average>=65){
            grade="B";
        }
        else if(average>=55){
            grade="C";
        }
        else {
            grade="Fail";
        }

    }


    //display report
    void display_data(){
        System.out.println("Name of the student: "+name);
        System.out.println("marks of the student:");
        for(int i=0;i<3;i++){
            System.out.println(marks[i]);
        }
        System.out.println("Average of the marks:"+average);
        System.out.println("obtained grade:"+grade);
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        studentgrade student=new studentgrade();

        //input student name
        System.out.println("enter name of the student:");
        student.name=sc.nextLine();

        //input subject marks
       
        for(int i=0;i<3;i++)
        {
             System.out.println("enter marks of subject"+ (i+1) + ":");
             student.marks[i]=sc.nextInt();
        }
        student.student_average();
        student.calculate_grade();
        student.display_data();

    }
    
}
