import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class ECorpseUserInput {

    private Scanner userstring;
    private Scanner userint;

    public ECorpseUserInput(){

        this.userstring = new Scanner(System.in);
        this.userint = new Scanner(System.in);

    }

    public int inputNum(){

        return this.userint.nextInt();

    }

    public String inputString(){

        return this.userstring.nextLine();

    }

    public String inputTitle(){

        System.out.println("Input Title: ");
        String input = this.inputString();
        return input;

    }

    public List<String> inputLines(){

        List<String> tempPoem = new ArrayList<>();
        int selection = 1;

        while(selection != 0){

            System.out.println("Input a line: ");
            tempPoem.add(this.inputString());
            System.out.println("Quit/Store = 0, Continue = Literally any other number.");
            selection = this.inputNum();

        }

        return tempPoem;

    }

    public void createPoem(ECorpseStore storage){

        ExquisiteCorpse newECorpse = new ExquisiteCorpse();
        newECorpse.setTitle(this.inputTitle());
        newECorpse.setPoem(this.inputLines());
        storage.addCorpse(newECorpse);

        System.out.println("New Exquisite Corpse added to storage.");

    }

}
