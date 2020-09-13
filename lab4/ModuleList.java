/**
 * 🦄
 *
 * @author Viktoria Cseke
 * R00180598 Nov 2019
 */
public class ModuleList extends ObjectList{

    public ModuleList(int newSize){
        super(newSize);
    }

    public Module getModule(int o) {
        return (Module)getObject(o);
    }

    public Module search(String s){
        for (int i=0;i<=getTotal()-1;i++){
            if(getModule(i).getTitle().equals(s)){ //searches by title
                return getModule(i);

            }else if(getModule(i).getAuthor().equals(s)){ //searches by author
                return getModule(i);
            }
        }
        return null;
    }

    public boolean removeModule(String s){ //remove module by title or author
        boolean rm=false;
        String myString="";
        for(int i=0;i<getTotal();i++){
            if(search(s)==getModule(i)){
                rm=true;
                remove(i);
                myString="Removed";
                break;
            }
            else{
                myString="Module not found";
            }
        }
        System.out.println(myString);
        return rm;
    }

    public boolean removeModule(int e){
        boolean rm=false;
        String myString="";
        if(e>5){ //if its bigger than 5 which is the max number of modules that can be stored then its probably the module code
            for(int i=0;i<getTotal();i++){
                if(getModule(i).getCode()==e){
                    rm=true;
                    remove(i);
                    myString="Removed by code";
                    break;
                }
                else{
                    myString="Module not found";
                }
            }
        }/*else {
            for(int i=0;i<getTotal();i++){ //this removes by position
                if(getObject(i)==getModule(e)){
                    rm=true;
                    remove(i);
                    myString="Removed removed by position";
                    break;
                }
                else{
                    myString="Module not found";
                }
            }
        }*/
        System.out.println(myString);
        return rm;
    }

 /*   public double calculateHoursInClass(){ //function for double because hours where in double, but int was used
        double hours=0.0;
        for(int i=0;i<getTotal();i++){
            hours+=getModule(i).getHours();
        }
        return hours;
    }*/

    public int calculateHoursInClass(){  // returns int because int was on the class diagram
        int hours=0;
        for(int i=0;i<getTotal();i++){
            hours+=getModule(i).getHours();
        }
        return hours;
    }

}

