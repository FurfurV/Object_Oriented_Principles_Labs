/*
//   By Viktoria Cseke
//   R00180598
*/


public class TestDog {

    public static void main(String[] args) {

        Dog[] dog1 = new Dog[3];
        dog1[0] = new Dog("Taco","Cork",5);
        dog1[1] = new Dog("Princess Fluffybutt","Tokyo",4);

        //Flea[] flea1 = new Flea[3];
        Flea flea1= new Flea("Itchy",3);
        Flea flea2= new Flea("Scratchy",4);
        Flea flea3= new Flea("Tickle",1);
        Flea flea4= new Flea("Creepy",2);
        Flea flea5= new Flea("Dracula",466);
        Flea flea6= new Flea("Tiny",2);
        Flea flea7= new Flea("test",2);

        dog1[0].remove(flea7);

        dog1[0].add(flea1);
        dog1[0].add(flea2);
        dog1[0].add(flea3);
        dog1[0].add(flea5);
        dog1[0].print();
        System.out.println("The flea called: "+flea3.getName()+" is owned by : "+flea3.getDog());
        System.out.println("-------------------------- \n");
        dog1[0].remove(flea1);
        dog1[0].print();

        System.out.println("-------------------------- \n");
        System.out.println(" ");
        dog1[1].add(flea1);
        dog1[1].add(flea4);
        dog1[1].add(flea6);
        flea5.hop(dog1[1]);
        dog1[1].print();
        System.out.println("The flea called: "+flea1.getName()+" is owned by : "+flea1.getDog());

    }
}
