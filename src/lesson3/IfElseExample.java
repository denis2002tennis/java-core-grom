package lesson3;

public class IfElseExample {
    public static void main(String[] args) {
        int test = 1000;
        if (test > 100) {


            System.out.println("good");
        }else

    {
        System.out.println("bad");

    }



        int test1 = 1001;
        boolean result = false;
        if (test1 > 1000) {
            result=true;
        }
        if(result)
            System.out.println("nice");
        else
            System.out.println("not nice");

        if(result&&test1>100||test1>500)
        {
            System.out.println("!");

        }
        else
            System.out.println("?");
    }
}
