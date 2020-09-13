// code by Viktoria Cseke 🦄

public class Book {
    private String auth;
    private String publishr;
    private String title;
    private int pages;

    public Book(String myAuth,String myPublishr,String myTitle,int myPages){
        auth=myAuth;
        publishr=myPublishr;
        title=myTitle;
        pages=myPages;
    }

    //------------Setters--------------------------

    public void setAuthor(String auth) {
        this.auth = auth;
    }

    public void setNumPages(int pages) {
        this.pages = pages;
    }

    public void setPublisher(String publishr) {
        this.publishr = publishr;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void print(){
        System.out.println(auth+", "+publishr+", "+title+", "+pages);
    }
}
