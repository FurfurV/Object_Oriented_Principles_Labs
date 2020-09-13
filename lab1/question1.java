// code by Viktoria Cseke 🦄

import java.util.Scanner;

public class question1 {

    public static void main(String[] args) {
        //int b=99;
        String bottles = " bottles of beer ";

        Scanner myObj= new Scanner(System.in);

        System.out.println("How many bottles:>>");
        int b=myObj.nextInt();

        while(b>=1){
            System.out.println(b+bottles+"on the wall");
            System.out.println(b+bottles);
            System.out.println("Take one down");
            System.out.println("Pass it around");
            System.out.println("");
            b--;
            if(b==1){
                System.out.println(b+" bottle of beer on the wall");
                System.out.println(b+" bottle of beer");
                System.out.println("Take one down");
                System.out.println("Pass it around");
                System.out.println("");
                b--;
            }

            if(b==0){
                System.out.println("No more"+bottles+"on the wall");
                System.out.println("");
            }

        }
    }
}
