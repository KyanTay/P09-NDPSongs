package sg.edu.rp.c346.id20037834.p09_ndpsongs;

import java.io.Serializable;

public class Song implements Serializable {

    private 	int id;
    private 	String title;
    private     String singer;
    private     int year;
    private     int star;

    public Song( int id, String title, String singer, int year, int star) {
        this.id = id;
        this.title = title;
        this.singer = singer;
        this.year = year;
        this.star = star;
    }

    public int getId() {  return id;  }

    public String getTitle() { return title; }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSingers() { return singer; }

    public void setSinger(String singer){
        this.singer = singer;
    }

    public int getYear() { return year; }

    public int getStar() { return star; }


    @Override
    public String toString() { return id + title + singer + " - " + year + star; }

}