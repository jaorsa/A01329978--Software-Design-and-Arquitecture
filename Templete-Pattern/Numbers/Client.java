import java.io.*;
public class Client{
    public static void main(String[] args) {
        SortAscending ascending = new SortAscending();
        ascending.sorting();

        SortDescending descending = new SortDescending();
        descending.sorting();
    } 
}