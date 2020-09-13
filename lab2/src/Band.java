// code by Viktoria Cseke 🦄


public class Band {

    private String name;
    private String genre;
    private String location;
    private Player[] players;
    private final int maxPlayers=3;

    //------Constructor-------------
    public Band(String myName,String myGenre,String myLocation){
    /*name=myName;
    genre=myGenre;
    location=myLocation;
    */
    setName(myName);
    setGenre(myGenre);
    setLocation(myLocation);
    players = new Player[maxPlayers];
        for (int i = 0; i < maxPlayers; i++)
            players[i] = null;
    }
   //-----------setters------------------------------
    public void setName(String name) {
        this.name = name;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setPlayers(Player[] inPlayers) {
        players = new Player[inPlayers.length];
        for(int i = 0; i < inPlayers.length; i++) {
            players[i] = inPlayers[i];
            //players[maxplayers] = new Player (name, instrument);
            //this.players = players;
        }
    }

    //----------getters------------
    public String getName() {
        return name;
    }

    public String getGenre() {
        return genre;
    }

    public String getLocation() {
        return location;
    }

    public Player[] getPlayers() {
        return players;
    }
    public String toString(){
        return getName() +" who are a "+getGenre() + " band and started in " + getLocation() + ". Its players are: ";
    }

    public void print(){
        System.out.println(toString());
        for(int i = 0; i <players.length; i++) {
            players[i].print();
        }
    }

}
