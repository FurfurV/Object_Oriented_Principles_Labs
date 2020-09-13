// code by Viktoria Cseke 🦄

public class Player {
    private String name;
    private String instrument;
    private String code;

    //-------------constructor-----------------
    public Player(String myName, String myInstrument, String myCode) {
        setName(myName);
        instrument = myInstrument;
        code = myCode;
    }

    //----------------setters-------------------------
    public void setName(String name) {
        this.name = name;
    }

    //-------------------getters---------------------
    public String getName() {
        return name;
    }

    public String getInstrument() {
        return instrument;
    }

    public String getCode() {
        return codeCreator(name);
    }
    //---------creates code from initials--------------
    public String codeCreator(String name) {

        String words[] = name.split(" "); //splits the strings where space is found
        String c = "";
        for (String word : words) {
            c += word.charAt(0);//store first character in the word
        }
        c = c + code; //combine the initials with the number
        return c;
    }
    //-------------create string from variables
    public String toString() {
        return getName() + " with the instrument: " + getInstrument() + " has a code: " + getCode();
    }

    public void print() {
        System.out.println(toString());
    }
}
