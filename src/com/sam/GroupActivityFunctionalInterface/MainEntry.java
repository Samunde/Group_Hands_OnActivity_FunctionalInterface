package com.sam.GroupActivityFunctionalInterface;

import java.util.Scanner;

public class MainEntry {
    int num1,num2;
    String userChoice;

    public void userInputs(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your first number: ");
         num1 = sc.nextInt();
        System.out.println("Enter your second number: ");
         num2 = sc.nextInt();
        System.out.println("Enter your choice(add,sub,mul,div): ");
        userChoice = sc.next();
        int result=0;
        switch(userChoice){
            case "add":
                System.out.println("The Addition of Two Integer: "+ sum.compute(num1,num2));
                break;
            case "sub":
                System.out.println("The Subtraction of Two Integer: "+ sub.compute(num1,num2));
                    break;
             case "mul":
                 System.out.println("The Multiplication of Two Integer: "+ mul.compute(num1,num2));
                        break;
                        case "div":
                            System.out.println("The Division of Two Integer: "+ div.compute(num1,num2));
                            break;
            default:
                System.out.println("Invalid choice");

        }

    }

    public Calc sum=new Calc(){
        @Override
    public int compute(int num1,int num2){
        return num1+num2;
    }
    };
    public Calc sub=new Calc(){
        public int compute(int num1,int num2){
            return num1-num2;
        }
    };
    public Calc mul=new Calc(){
        public int compute(int num1,int num2){
            return num1*num2;
        }
    };
    public Calc div=new Calc(){
        public int compute(int num1,int num2){
            return num1/num2;
        }
    };
}
