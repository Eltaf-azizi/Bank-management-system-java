package Library Management System;
import java.util.Scanner;


public class main {



    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);
        

        int choice = 0;

        while(choice !=3) {
            choice = obj.nextInt();

            if(choice == 1) {
                module1 obj1=new module1();
                    System.out.println("Enter your student name");
                obj1.name=obj.nextLine();
                    System.out.println("Enter your father name");
                obj1.fname=obj.nextLine();
                    System.out.println("Enter your university id");
                obj1.uni_id=obj.nextLine();
                    System.out.println("Enter the User id");
                obj1.uid= obj.nextLine();
                    System.out.println("In which semester do you study:");
                obj1.sem.obj.nextInt();

                obj1.getdata(obj1.name, obj1.fname, obj1.uni_id, obj1.uid, obj1.sem);
                obj1.setdata();

            }

            else if(choice == 2) {
                module2 obj2= new module2();

                obj2.chemistry();
                obj2.physics();
                obj2.biology();
            }
        }
    }
}
