/*/*Write a program called TeamPartA that will allow a person to input team details such as team name,
 team location, team jersey colour at the keyboard for at least 10 teams.
  Once all team details have been entered, the program must display the teams details
  and description for each of the teams as follows:
“Cork Celtic’s home is Cork and has a green jersey”.//where name was Cork Celtic, location was Cork and jersey colour was green
And so on for the rest of the teams
-------------------------------------------------------------------------------------------------------
Part a)  Develop a Team object. By using an array of objects, solve the same problem as in Lab 1
 question 2.  Hint use an array of Team Objects.
 Call your main class TestTeamPartb*/

// code by Viktoria Cseke 🦄

import java.util.Scanner;

public class TeamPartB {

    static int allTeams = 10;

    public static void main(String[] args) {

        Team[] myTeams = new Team[allTeams];

        for (int i = 0; i < myTeams.length; i++) {

            String name, location, color;
            name = Team.getName();
            location = Team.getLocation();
            color = Team.getColor();

            myTeams[i] = new Team(name, location, color);
        }
        for (int i = 0; i < myTeams.length; i++) {

            myTeams[i].print();
            System.out.println();
        }
    }
}
