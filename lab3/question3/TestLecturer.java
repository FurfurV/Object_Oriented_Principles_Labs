/**
 * 🦄
 *
 * @author Viktoria Cseke
 * R00180598 Nov 2019
 */
public class TestLecturer {


    public static void main(String[] args) {
        Module[] module1 = new Module[2];
        module1[0] = new Module("Maths", 7, "auth1", 4);
        module1[1] = new Module("OOP", 7, "auth2", 4);

        //ModuleList[] modules= new ModuleList[6];

        Lecturer[] lecturer1 = new Lecturer[2];
        lecturer1[0] = new Lecturer("Bob", 8567);

        lecturer1[0].addModule(module1[0]);
        lecturer1[0].addModule(module1[1]);
        lecturer1[0].print();
        ModuleList m = lecturer1[0].getModuleList();
        for (int i=0;i<=m.getTotal()-1;i++){

            System.out.println(m.getModule(i));
        }
        //System.out.println(lecturer1[0].getModuleList());


    }
}


