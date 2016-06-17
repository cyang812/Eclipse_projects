package database;

public class Mp3 extends Data{
    
    private int filesize;
    
    public Mp3(String name,String author,int playtime,int filesize) {
        this.name = name;
        this.author = author;
        this.playtime = playtime;
        this.filesize = filesize;
    } 
    
    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

}
