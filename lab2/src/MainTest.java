// code by Viktoria Cseke 🦄

public class MainTest {
    public static void main(String[] args) {

        Band[] band1 = new Band[2];
        band1[0] = new Band("MyVeryBestIrish","traditional","Cork");
        //	MyVeryBestIrish who are a trad band started in Cork, “John Spillane”, “Mick Flannery”, “ Any Person”;
        band1[1] = new Band("Beatles","rock","Liverpool");
        //	Beatles  who are a rock band and started in Liverpool  "John Lennon”, “Ringo Star”,”Paul Mc Carthy”;

        Player[] player1 = new Player[3];
        player1[0]= new Player("John Spillane","guitar","17");
        player1[1]= new Player ("Mick Flannery","piano","87");
        player1[2]= new Player ("Any Person","bongo","66");
        band1[0].setPlayers(player1);


        player1[0]= new Player("John Lennon","guitar","56");
        player1[1]= new Player ("Ringo Starr","drums","45");
        player1[2]= new Player ("Paul Mc Carthy","bass","33");
        band1[1].setPlayers(player1);

        for(int i = 0; i < band1.length; i++) {
            band1[i].print();
            System.out.println();
        }




    }


}
