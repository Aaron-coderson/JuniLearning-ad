
/**
 * Write a description of class Book here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Book

{
    private String title;
    private String author;
    private int pageNum;
    /**
     * Create a Book class with the following instance variables: title, author, and pageNum 
     * (to indicate the number of pages that have been read).

     * Create two constructor methods: one that takes in all 3 parameters,
     * and one that only takes in the title and author (for books we haven't started reading yet).

     * Create getter methods for the title and the author,
     * and a setter method for changing the pageNum by a specified amount.

     * Create a toString method that prints out all of the information about the Book.

     * Create two Book objects, representing your favorite books.
     * One of them should be a Book we haven't started reading yet. Print out the Book, update the pageNum, and then print it out again.
     */
    /**
     * Constructor for objects of class Book
     */
    public Book(String title, String author, int pageNum)
    {
      this.title = title;
      this.author = author;
      this.pageNum = pageNum;
    }
    public Book(String title, String author)
    {
      this.title = title;
      this.author = author;
    }
    public String toString(){return("Title: " + title + "; Author: " + author + "; Page on: " + pageNum);}
    public String getTitle(){return(title);}
    public String getAuthor(){return(author);}
    public int getPageNum(){return(pageNum);}
    
    public void readSome(int num){pageNum += num;}
    public boolean hasSameAuthor(Book b){return(author.equals(b.getAuthor()));} 
    public boolean sameBook(Book b){return((author.equals(b.getAuthor()))&&(title.equals(b.getTitle())));}
}

