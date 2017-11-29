
public class Logic {
    public double firstNumber;
    public double secondNumber;
    public String operator;
    public static Double multiplication(double firstNumber,double secondNumber){
        return firstNumber*secondNumber;
    }

    public static Double addition(double firstNumber,double secondNumber){
        return firstNumber+secondNumber;
    }

    public static Double subtraction(double firstNumber,double secondNumber){
        return firstNumber-secondNumber;
    }

    public static Double division(double firstNumber,double secondNumber){
        return firstNumber/secondNumber;
    }

    public static void  divisionByZero(double firstNumber, double secondNumber){
        if(secondNumber==0)System.out.println("Can not be divided by 0");
    }
}
