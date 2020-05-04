package SetiPR;

import java.net.Socket;
import java.util.ArrayList;


public class PackageData{
    private String operationType;
    private ArrayList<Book> books;

    public PackageData(String operationType, ArrayList<Book> books) {
        this.operationType = operationType;
        this.books = books;
    }

    public PackageData() {
    }

    public void addbooks(Book book){
        books.add(book);
    }
    @Override
    public String toString() {
        return "PackageData{" +
                "operationType='" + operationType + '\'' +
                ", books=" + books +
                '}';
    }
    public ArrayList<Book> getBooks(){
        return books;
    }
    public String getOperationType() {
        return operationType;
    }

    public void setOperationType(String operationType) {
        this.operationType = operationType;
    }
}
