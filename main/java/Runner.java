import java.util.Scanner;

/**
 * Created by Vika on 29.11.2017.
 */
public class Runner {
    private static Scanner read;
    public static void main (String[] args){
        read = new Scanner(System.in);
        double first;
        double second;
        double result;
        String operator;
        System.out.println("Input something like this: 5 /(+,-,*) 9 ");
        first = read.nextDouble();
        operator = read.next();
        second = read.nextDouble();

        if (operator.equals("*")){
            result=Logic.multiplication(first,second);
            System.out.println("= "+result);
        }
        if (operator.equals("/") && second==0){Logic.divisionByZero(first,second);}
        else{
            result=Logic.division(first,second);
            System.out.println("= "+result);
        }
        if (operator.equals("+")){
            result=Logic.addition(first,second);
            System.out.println("= "+result);
        }
        if (operator.equals("-")){
            result=Logic.subtraction(first,second);
            System.out.println("= "+result);
        }
    }
}
