/**
 * 🦄
 *
 * @author Viktoria Cseke
 * R00180598 Nov 2019
 */
public class ModuleList extends ObjectList{
    //int size;
    //private Module[] myModule;

    public ModuleList(int newSize){
        super(newSize);
        //size=newSize;
    }

    public Module getModule(int o) {
        return (Module)getObject(o);
    }
    
}
