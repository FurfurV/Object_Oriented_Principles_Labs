/**
 * Write a description of class TestObjectList here.
 *
 * @author Viktoria Cseke
 * @version 23/10/2019
 */
public class TestObjectList
{

    public static void main(String[] args)
    {
        ObjectList ol = new ObjectList(3); //ObjectList can only hold 3 pieces of information

        String s = "Im Happy";
        Player p = new Player("Paul McCarthney",true,4);
        Book b = new Book("author","publisher","title",300);
        Integer i = 1234;

        System.out.println(ol.add(s)); //adds it to position 0
        System.out.println(ol.add(b));//adds it to position 1
        System.out.println(ol.add(p));//adds it to position 2
        System.out.println(ol.add(i)); //cant add 4th element because it is full already,
        // can only hold 3, will throw error

        ol.remove(0); //removes the string "Im happy" then Player takes its position
        System.out.println(ol.add(i)); // now we can add the new element because there is a space for it.


        System.out.println("Is the list full? "+ ol.isFull()); //function that checks if its full or not
        System.out.println("Is the list empty? "+ ol.isEmpty()); //function to check if its empty

        System.out.println("Total number of objects in the list: " + ol.getTotal());

        Object g = ol.getObject(1); //
        ((Player)g).shoot();

    }
}
