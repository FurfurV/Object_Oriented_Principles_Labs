// code by Viktoria Cseke 🦄

public class TestBook
{
    public static void main(String[] args)
    {
        Book  book1 = new Book("","","",0); //create new object
        book1.setAuthor("Charles Dickens"); //calls the class method to set the book1 author,
        book1.setPublisher("Penguin Press");//here it sets the book publisher
        book1.setTitle("Great Expectations");//here the title
        book1.setNumPages(321);//and here the number of pages
        book1.print();

        Book book2 = new Book("Charles Dickens","Hard Times", "Penguin Press", 420);
        book2.print();//this prints out the content for the object book2
    }

}
