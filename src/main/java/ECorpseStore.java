import java.util.ArrayList;
import java.util.List;


public class ECorpseStore {

    private List<ExquisiteCorpse> eCorpsi;
    private List<String> titles;

    public ECorpseStore() {

        this.eCorpsi = new ArrayList<ExquisiteCorpse>();
        this.titles = new ArrayList<String>();

    }

    public ECorpseStore(List<ExquisiteCorpse> eCorpsi) {

        this.eCorpsi = eCorpsi;

    }

    public ExquisiteCorpse getCorpse(int index){

        return this.eCorpsi.get(index);

    }

    public void addCorpse(ExquisiteCorpse newCorpse){

        this.eCorpsi.add(newCorpse);
        this.titles.add(newCorpse.getTitle());

    }

    public void deleteCorpse(int index){

        this.eCorpsi.remove(index);
        this.titles.remove(index);

    }

    public int getCorpseStoreTotal(){

        return this.eCorpsi.size();

    }

    public void printCorpseStoreTitles(){

        this.titles.forEach(System.out::println);

    }

    public void printCorpseTitle(int index){

        this.eCorpsi.get(index).printTitle();

    }

    public void printCorpse(int index){

        this.eCorpsi.get(index).printPoem();
        System.out.println("Corpse displayed.");

    }



}
