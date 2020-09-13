// code by Viktoria Cseke 🦄

public class TestPlayer {
    public static void main(String[] args) {
        Player plyr1= new Player("Jerry",true,10);
        Player plyr2= new Player("Bob",false,6);
        Player plyr3= new Player("Maru",false,2);

        plyr2.shoot();
        plyr3.shoot();
        plyr2.shoot(4);
        plyr3.shoot(1);


        System.out.println();
        System.out.println(plyr1);
        System.out.println(plyr2);
        System.out.println(plyr3);
        System.out.println();

        plyr1.print();
        plyr2.print();
        plyr3.print();
    }

}
