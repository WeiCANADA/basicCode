package week5.tutorail;

/**
 * @version V1.0
 * @program:
 * @description: TODO
 * @author: Wei Liu
 * @date: 2021-10-08 12:58 p.m.
 */
public class Book {
 private String author;
 private String title;
    private String bookName;


    public boolean equals(Book other){
        return this.author.equals(other.author) && this.title.equals(other.title);
    }
}
