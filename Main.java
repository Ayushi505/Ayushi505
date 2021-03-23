package basics;

import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        String number;

        System.out.println("Enter number");
        number = myObj.nextLine();
//        System.out.println("number is: " + number);
        int a;
        a=Integer.parseInt(number);
        if (a == 0) {
            System.out.println("neither even nor odd");
            if (a % 2 == 0 && a > 0)
                System.out.println("even");
        }
        else{
            if(a>0)
            System.out.println("odd");}


    }
}
