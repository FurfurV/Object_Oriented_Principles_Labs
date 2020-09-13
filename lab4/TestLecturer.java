/**
 * 🦄
 *
 * @author Viktoria Cseke
 * R00180598 Nov 2019
 */
public class TestLecturer {


    public static void main(String[] args) {
        Module[] module1 = new Module[5];
        module1[0] = new Module("Maths", 7, "auth1", 4.0, 2345);
        module1[1] = new Module("OOP", 7, "auth2", 6.0,2567);
        module1[2] = new Module("Operating Systems", 7, "auth3", 5.0,2121);
        module1[3] = new Module("Server-side web dev", 7, "auth4", 6.0,2789);

        //ModuleList[] modules= new ModuleList[6];
        Lecturer[] lecturer1 = new Lecturer[2];
        lecturer1[0] = new Lecturer("Bob", 8567);


        lecturer1[0].addModule(module1[0]); //maths
        lecturer1[0].addModule(module1[1]); //oop
        lecturer1[0].addModule(module1[2]); //operating systems
        lecturer1[0].addModule(module1[3]); // server-side web dev

        System.out.println("----------- all modules for Bob and his details-------------\n");
        lecturer1[0].print();
        ModuleList m = lecturer1[0].getModuleList();

        System.out.println(m.calculateHoursInClass()); // prints the hours for Bob

        for (int i=0;i<=m.getTotal()-1;i++){
            System.out.println(m.getModule(i));
        }
        System.out.println("--------- find info about a module by title---------------\n");
        System.out.println(m.search("Operating Systems"));
        //System.out.println(lecturer1[0].getModuleList());

        m.removeModule("auth4");
        m.removeModule(2567); //removes oop by code
        System.out.println("----------- removed server-side and oop-------------\n");
        for (int i=0;i<=m.getTotal()-1;i++){
            System.out.println(m.getModule(i));
        }
        System.out.println(m.calculateHoursInClass()); // prints the hours for Bob

    }
}


