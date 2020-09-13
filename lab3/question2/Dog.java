/*
//   By Viktoria Cseke
//   R00180598
*/


public class Dog {
    private String name,address;
    private int age;
    private Flea[] myFlea;
    private int total=20;
    //ObjectList ol=new ObjectList(20);

    public Dog(String myName,String myAddress,int myAge){
        //myFlea= new Flea[total];
        setName(myName);
        setAddress(myAddress);
        setAge(myAge);
        myFlea = new Flea[total];
        for (int i = 0; i < total; i++)
            myFlea[i] = null;
    }
    //▚▚▚▚▚▚▚▚▚▚▚▚▚▚▚▚▚▚▚▚ Setters▚▚▚▚▚▚▚▚▚▚▚▚▚▚▚▚▚▚▚▚

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setAge(int age) {
        this.age = age;
    }
    //▚▚▚▚▚▚▚▚▚▚▚▚▚▚▚▚▚▚▚▚ Getters▚▚▚▚▚▚▚▚▚▚▚▚▚▚▚▚▚▚▚▚
    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public int getAge() {
        return age;
    }

    //▚▚▚▚▚▚▚▚▚▚▚▚▚▚▚▚▚▚▚▚ Add Flea▚▚▚▚▚▚▚▚▚▚▚▚▚▚▚▚▚▚▚▚


   public String add(Flea element) {
        //ObjectList ol=new ObjectList(total);
        String adds = "";

        //String dog=element.getDog();

        if (getTotal() == total) { //checks if its already full
            adds = "myStack is already full";
        } else {
           // element.add(Flea element);
            if (myFlea[getTotal()] == null) { //adds it to the position if its null
                myFlea[getTotal()] = element;
                element.setDog(this);
                int num = getTotal();
                adds = "added to object list at position " + (num - 1);
            }
        }
        return adds;
    }
    //▚▚▚▚▚▚▚▚▚▚▚▚▚▚▚▚▚▚▚▚ remove flea▚▚▚▚▚▚▚▚▚▚▚▚▚▚▚▚▚▚▚▚
    public void remove(Flea f){

        if(f.getDog()!=null) {
            for (int i = 0; i <= total - 2; i++) {
                myFlea[i] = myFlea[i + 1];
            }
            myFlea[myFlea.length - 1] = null;
        }else{
            System.out.println("Im a dogless flea :( , you cant remove me ");
        }
    }
    //▚▚▚▚▚▚▚▚▚▚▚▚▚▚▚▚▚▚▚▚ Total▚▚▚▚▚▚▚▚▚▚▚▚▚▚▚▚▚▚▚▚
    public int getTotal() {
        int numItems = 0;
        for (int i = 0; i < myFlea.length; i++) {
            if (myFlea[i] != null) {
                numItems += 1;

            }
        }
        return numItems;
    }
    //▚▚▚▚▚▚▚▚▚▚▚▚▚▚▚▚▚▚▚▚ print▚▚▚▚▚▚▚▚▚▚▚▚▚▚▚▚▚▚▚▚
    public String toString(){
        return getName() +" who is "+getAge() + " years old and lives in " + getAddress() + " with the fleas: ";
    }

    public void print(){
        System.out.println(toString());
        for(int i = 0; i <myFlea.length; i++) {
            if(myFlea[i]!=null){
                myFlea[i].print();
            }
            else{
                break;
            }

        }
    }
}
