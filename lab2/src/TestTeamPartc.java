/*Develop a menu driven application called TestTeamPartc that allows the user to add, remove and list Team objects.
  For this use an ArrayList of Team.  What are the advantages of using an ArrayList over an array?
   Place the answer in a comment at the end of your code.*/
// code by Viktoria Cseke 🦄

import java.util.ArrayList;
import java.util.Scanner;


public class TestTeamPartc {
    private static ArrayList<Team> myTeam = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        while (true) {

            System.out.println("\n1.Add team");
            System.out.println("2.Remove team");
            System.out.println("3.Display list of teams");
            System.out.println("4.Exit");
            System.out.println("----------------------------\n");

            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    String name, location, color;
                    name = Team.getName();
                    location = Team.getLocation();
                    color = Team.getColor();
                    myTeam.add(new Team(name, location, color));
                    break;

                case 2:
                    System.out.println("please enter your choice");
                    int userChoice = sc.nextInt();
                    for (int i = 0; i < myTeam.size(); i++) {
                        if (userChoice == i) {
                            myTeam.remove(i);
                            break;
                        }
                    }

                case 3:
                    for (int i = 0; i < myTeam.size(); i++) {
                        System.out.println(i + " " + myTeam.get(i));
                    }
                    break;

                case 4:
                    System.out.println("Thank you for using my program!");
                    System.exit(0);
            }
        }
    }
}
/*
Arraylists can shrink and grow dynamically, while arrays are fixed.
 We can add elements at a given position into the Arraylist.
Its faster and cleaner to code as it has access to methods, such as add(),remove(),set() ect.
 */





