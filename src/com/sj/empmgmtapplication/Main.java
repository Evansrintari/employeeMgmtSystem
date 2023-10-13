package com.sj.empmgmtapplication;
import java.util.Scanner;

public class Main {
    EmployeeService service =new EmployeeService();
    static boolean ordering =true;
    public static void menu(){
        System.out.println("*********Welcome to the employee service managment service***** "
                + "\n1. Add Employee "
                +"\n2. Veiw Employee "
                +"\n3. Update employee "
                +"\n4. Delete Employee "
                +"\n5. Veiw All Employee "
                +"\n6. Exits");

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do{
            menu();
            System.out.println("Enter your choice ");
            int choice = sc.nextInt();
            switch(choice){
                case 1 :
                    System.out.println("Add Employee");
                    break;
                case 2 :
                    System.out.println("View Employee");
                    break;
                case 3 :
                    System.out.println("Update Employee");
                    break;
                case 4:
                    System.out.println("Delete Employee");
                    break;
                case 5 :
                    System.out.println("Veiw All Employee");
                    break;
                case 6 :
                    System.out.println("Thank you for using the application");
                    System.exit(0);
                default:
                System.out.println("Please enter valid choice");
                break;


            }

        }while(ordering);

        }
    }
