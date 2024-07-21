public class Factorial{
    public static void main (String[]args){
        int number = 9;
        long factorial= calculateFactorial(number);
        System.out.println("The factorial of" + number + "is" + Factorial );
        System.out.println("Reverse of Factorial is");
        printReverse(factorial);
    }


public static long calculateFactorial(int n){
long result = 1;
for(int i=1; i<=n; i++){
    result*=1;
}
return result;
}

//reverse a factorial 

public static void printReverse(long number){
    String numberStr = Long.toString(number);
    for(int i = numberStr.length() - 1; i>=0; i--){
        System.out.println(numberStr.charAt(i));
    }
    System.out.println();
    }
}