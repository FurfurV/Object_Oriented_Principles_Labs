// code by Viktoria Cseke 🦄

import java.text.NumberFormat;

public class Player {
    private String name;
    private Boolean goalie;
    private int numGoals;

    public Player(String playerName, Boolean goalieOrNot, int goals){
        name=playerName;
        goalie=goalieOrNot;
        numGoals=goals;
    }

    public void shoot(){
        System.out.println("Im going to shoot now");
    }

    public void shoot(int tries){
        System.out.println("I am going to shoot after "+tries+" fake attempts!");
    }

    //prints out if player is goalie or not
    public void print(){
        if (goalie==true){
            System.out.println(name+" is a goalie.");
        }
        else{
            System.out.println(name+ " is not a goalie.");
        }

        //return description of player
    }
    public String toString(){
        NumberFormat frmt = NumberFormat.getNumberInstance();

        return (name + "\t" + goalie + "\t" + frmt.format(numGoals));
    }

}
