// code by Viktoria Cseke 🦄

import java.util.Scanner;

public class Team {
    private String name;
    private String location;
    private String color;

    public Team(String myName,String myLocation,String mycColor){
        /*this.name=myName;
        this.location=myLocation;
        this.color=mycColor;*/
        setName(myName);
        setLocation(myLocation);
        setColor(mycColor);
    }

    public static String getName() {
        Scanner sc = new Scanner(System.in);
        String name;
        System.out.println("Please enter your team name");
        name = sc.next();

        return name;
    }
    public static String getLocation() {
        Scanner sc = new Scanner(System.in);
        String location;
        System.out.println("Please enter your team location");
        location = sc.next();

        return location;
    }
    public static String getColor() {
        Scanner sc = new Scanner(System.in);
        String color;
        System.out.println("Please enter your team color");
        color = sc.next();

        return color;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString()
    {
        return name + "’s home is " + location + " and has a " + color +" jersey" ;
    }

    public void print()
    {
        System.out.println(toString());
    }
}
