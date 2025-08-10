import java.util.Scanner;
public class Student{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the name:");
        String name=sc.nextLine();
        System.out.println("enter the age:");
        int age=sc.nextInt();
        System.out.println("enter the gender:");
        String gender=sc.nextLine();
        System.out.println("enter the marks in subject1:");
        int subject1=sc.nextInt();
        System.out.println("enter the marks in subject2:");
        int subject2=sc.nextInt();
        System.out.println("enter the marks in subject3:");
        int subject3=sc.nextInt();
        int totalmarks=subject1+subject2+subject3;
        System.out.println("totalmarks:"+ totalmarks);
        double average=(totalmarks/3);
        System.out.println("average"+average);
        double percentage=(totalmarks*100)/100;
        System.out.println("percentage"+percentage);
        String result=(subject1>=40&&subject2>=40&&subject3>=40)?"pass":"fail";
        System.out.println("result"+result);
    }}






