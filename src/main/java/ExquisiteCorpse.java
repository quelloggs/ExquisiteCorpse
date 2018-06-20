import java.util.List;
import java.util.*;

public class ExquisiteCorpse {

    private int length;
    private String title;
    private List<String> poem;

    //Constructors

    public ExquisiteCorpse() {
    }

    public ExquisiteCorpse(List<String> poem, String title) {
        this.poem = poem;
        this.title = title;
    }

    //Getters n' Setters

    public int getLength(){

        return this.length;

    }

    public void setLength(int size){

        this.length = size;

    }

    public String getTitle(){

        return this.title;

    }

    public void setTitle(String title){

        this.title = title;

    }

    public String getLine(int index){

        return this.poem.get(index);

    }

    public void setLine(String line, int index){

        this.poem.set(index, line);

    }

    public void addLine(String line){

        this.poem.add(line);

    }

    public void addLine(String line, int index){

        this.poem.add(index, line);

    }

    public List<String> getPoem() {

        return poem;

    }

    public void setPoem(List<String> poem) {

        this.poem = poem;

    }

    //Shuffler

    public void shufflePoem(){

        Collections.shuffle(this.poem);

    }

    //Printers

    public void printTitle(){

        System.out.println("Title: " + this.title);

    }

    public void printLines(){

        this.poem.forEach(System.out::println);

    }

    public void printPoem(){

        this.printTitle();
        this.printLines();

    }

}