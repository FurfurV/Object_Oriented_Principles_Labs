/** 🦄
 * @author Viktoria Cseke
 *  R00180598 Oct 2019
 */


public class Lecturer{

    private String name;
    private int ID;
    private ModuleList modules;

    private int MAXNOOFMODULES=4;

    public Lecturer(String myName, int myID){
        setName(myName);
        setID(myID);
        modules = new ModuleList(MAXNOOFMODULES);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public int getID() {
        return ID;
    }

    public String addModule(Module m){
        //System.out.println(m);
        return modules.add(m);

    }

    public ModuleList getModuleList(){


        ModuleList mList = new ModuleList(MAXNOOFMODULES);
        for (int i = 0; i < MAXNOOFMODULES; i++)
        {
            mList.add(modules.getModule(i));
        }
        return mList;
    }


    public String toString(){
        return getName() +" who has an ID of "+getID();
    }

    public void print(){
        System.out.println(toString());
    }
}
