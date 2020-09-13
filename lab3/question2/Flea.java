/*
//   By Viktoria Cseke
//   R00180598
*/

public class Flea {
    private String name;
    private int age;
    private Dog myDog;

    public Flea(String myName, int myAge) {
        setName(myName);
        setAge(myAge);
    }
    //▚▚▚▚▚▚▚▚▚▚▚▚▚▚▚▚▚▚▚▚ Setters▚▚▚▚▚▚▚▚▚▚▚▚▚▚▚▚▚▚▚▚
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setDog(Dog dog) {
        if (getDog() == null) {
            this.myDog = dog;
        } else if (getDog() != null) {
            //System.out.println("cant add");
        }
    }
    //▚▚▚▚▚▚▚▚▚▚▚▚▚▚▚▚▚▚▚▚ Getters▚▚▚▚▚▚▚▚▚▚▚▚▚▚▚▚▚▚▚▚
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getDog() {
        if (myDog != null) {
            return myDog.getName();
        } else {
            return null;
        }
    }
    //▚▚▚▚▚▚▚▚▚▚▚▚▚▚▚▚▚▚▚▚ hop function▚▚▚▚▚▚▚▚▚▚▚▚▚▚▚▚▚▚▚▚
    public void hop(Dog dog) {
        myDog.remove(this); //removed the current dog that the fleas at
        dog.add(this); //adds itself to a new dog
        //System.out.println( dog.add(this));
    }
    //▚▚▚▚▚▚▚▚▚▚▚▚▚▚▚▚▚▚▚▚ print▚▚▚▚▚▚▚▚▚▚▚▚▚▚▚▚▚▚▚▚
    public String toString() {
        return "A flea called: " + getName() + " that has an age of: " + getAge();
    }

    public void print() {
        System.out.println(toString());
    }

}
