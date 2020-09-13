// code by Viktoria Cseke 🦄

import java.util.Arrays;
import java.util.Scanner;

public class question2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int allTeams=10;
        String[]MyTeamName= new String[allTeams];
        String[]TeamLocation= new String[allTeams];
        String[]TeamColour= new String[allTeams];

        for(int i=0; i<allTeams; i++){
            System.out.println("Enter name of the team");
            MyTeamName[i]=sc.nextLine();
            System.out.println("Enter location of the team");
            TeamLocation[i]=sc.nextLine();
            System.out.println("Enter colour of the team");
            TeamColour[i]=sc.nextLine();

        }
        for(int i=0; i<allTeams;i++){
            System.out.println(MyTeamName[i]+"'s home is "+TeamLocation[i]+" and has a "+TeamColour[i]+" jersey.");
        }
    }
}
