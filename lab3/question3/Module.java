/** 🦄
 * @author Viktoria Cseke
 *  R00180598 Oct 2019
 */

public class Module {
    private String title;
    private int level;
    private String author;
    private double hours;
    //private ModuleList myModules;

    public Module(String myTitle,int myLevel,String myAuth,double myHours){
        setTitle(myTitle);
        setAuthor(myAuth);
        setHours(myHours);
        setLevel(myLevel);
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }


    public String getTitle() {
        return title;
    }

    public int getLevel() {
        return level;
    }

    public String getAuthor() {
        return author;
    }

    public double getHours() {
        return hours;
    }

    public String toString() {
        return "The module title: "+ getTitle()+". Author: "+ getAuthor()+". hours: "+getHours()+". level: "+getLevel();
    }

    public void print() {
        System.out.println(toString());
    }



}
