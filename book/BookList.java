package package_bookmanager.book;

public class BookList {
    private Book[]books=new Book[100];
    private int size;

    public BookList() {
            books[0]=new Book("《水浒传》","2222224","罗贯中",
                    100,"小说",false);
            books[1]=new Book("《三国演义》","249876","施耐庵",100,
                    "小说",true);
            books[2]=new Book("《西游记》","003","吴承恩",90,"小说"
                    ,false);
            size=3;
    }
    public int getSize(){
        return size;
    }
    public void  setSize(int size){
        this.size=size;
    }
    public Book getBook(int index){
        return books[index];
    }
    public void setBook(int index,Book book){
        books[index]=book;
    }
}
