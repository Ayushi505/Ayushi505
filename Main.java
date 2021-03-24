package basics;

public class Main {

    public static void main(String[] args) {
        int count = 1;
        while(count != 6)
        {
            System.out.println("Count vaue is " + count);
            count++;
        }
//        for(int i=1; i<=7; i++)
//        {
//            System.out.println("Count value is " + count);
//        }
//        for(count = 1; count != 6; count++ )
//        {
//            System.out.println("Count value is " + count);
//        }

        count = 1;
        while(true) {
            if(count == 6){
                break;
            }
            System.out.println("Count value is " + count);
            count++;
        }
    }
}