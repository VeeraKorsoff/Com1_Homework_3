public class Main {
    public static void main(String[] args) {


        //HW 1
        boolean weekday = false;
        boolean vacation = false;
        System.out.println("Does James sleep in?");
        {
        if(weekday == true)
            System.out.println("no");
        else if ((vacation == true) || (weekday == false))
            System.out.println("yes");
        else
            System.out.println("no");
        }

        // HW 2

        int time = 10;
        boolean shining = false;
        System.out.println("Is sunscreen needed at " + time + " o'clock?");

        if ((time >= 10) && (time <= 16) && (shining == true))
            System.out.println("please use the sunscreen");
        else
            System.out.println("sunscreen is not needed");

        // HW 3
        int A = 355;
        int B = 205;
        System.out.println( A + " and " + B + " have the same last digit");

        if ((A - B) % 10 == 0)
            System.out.println(true);
        else
            System.out.println(false);

        // HW 4

        int i = 1;
        boolean found=false;
        System.out.println("What is the smallest positive integer that is divisible by both 387 and 6381?");

        while (found==false){
            if (i%387==0 && i%6381==0){
                found=true;
                System.out.println(i);
            }
            else
                i=i+1;}

        // HW 5
        // is a truth table

        //HW 6

        int w = 41;
        double y = Math.sqrt(w);
        boolean is_prime = true;
        int t = 2;
        System.out.println(w + " is a prime number ");

        while (t <= y) {
            if (w % t == 0) {
                is_prime = false;
            }
            t++;
        }
        System.out.println(is_prime);
        
}
}