import java.io.IOException;

public class ECorpseMenu {

    private ECorpseStore storage;
    private ECorpseUserInput input;
    private ECorpseFileWriter writer;


    public ECorpseMenu() {

        this.storage = new ECorpseStore();
        this.input = new ECorpseUserInput();
        this.writer = new ECorpseFileWriter();

    }

    public void menuLoop(){

        menuDisplayMainMenu();
        int selection = this.input.inputNum();

        while (selection != 0){

            menuSelectionProcessing(selection);
            menuDisplayMainMenu();
            selection = this.input.inputNum();

        }

        System.out.println("Exiting program.");

    }

    public void menuDisplayMainMenu(){

        System.out.println("EXQUISITE CORPSE GENERATOR");
        System.out.println("Please choose an option: (Type number then hit ENTER)");
        System.out.println("1. Create New Exquisite Corpse");
        System.out.println("2. View an Existing Exquisite Corpse");
        System.out.println("3. Edit an Existing Exquisite Corpse");
        System.out.println("4. Change an Existing Exquisite Corpse's Title");
        System.out.println("5. Randomize Existing Exquisite Corpse");
        System.out.println("6. Delete an Existing Exquisite Corpse");
        System.out.println("7. Save an Existing Exquisite Corpse as a File.");
        System.out.println("0. Exit Program");

    }

    public int menuIndexSelection(){

        System.out.println("SELECT A CORPSE:");
        System.out.println("Input corresponding #.");
        this.storage.printCorpseStoreTitles();
        return this.input.inputNum();

    }

    public void menuViewCorpse(){

        this.storage.printCorpseStoreTitles();
        System.out.println(" ");
        int index = menuIndexSelection();
        System.out.println(" ");
        this.storage.printCorpse(index);
        System.out.println(" ");

    }

    public void menuEditCorpse(){

        int index = menuIndexSelection();

        this.storage.printCorpse(index);

        System.out.println("Select a line to edit. First line is 0.");

        int line = this.input.inputNum();

        System.out.println(this.storage.getCorpse(index).getLine(line));

        System.out.println("Input new line:");

        this.storage.getCorpse(index).setLine(this.input.inputString(), line);

        System.out.println("Line " + line + " in " + this.storage.getCorpse(index).getTitle()
                + " updated.");

    }

    public void menuEditTitle(){

        int index = menuIndexSelection();
        this.storage.getCorpse(index).printTitle();
        this.storage.getCorpse(index).setTitle(this.input.inputString());

    }

    public void menuRandomizeCorpse(){

        int index = menuIndexSelection();
        this.storage.getCorpse(index).shufflePoem();

    }

    public void menuDeleteCorpse(){

        int index = menuIndexSelection();

        this.storage.deleteCorpse(index);
        System.out.println("Exquisite Corpse deleted.");

    }

    public void menuWriteCorpse() {

        int index = menuIndexSelection();

        try {
            this.writer.writePoem(storage.getCorpse(index));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void menuSelectionProcessing(int selection){

        switch (selection){

            case 1:

                this.input.createPoem(storage);
                break;

            case 2:

                menuViewCorpse();
                break;

            case 3:

                menuEditCorpse();
                break;

            case 4:

                menuEditTitle();
                break;

            case 5:

                menuRandomizeCorpse();
                break;

            case 6:

                menuDeleteCorpse();
                break;

            case 7:

                menuWriteCorpse();
                break;
        }

    }

}
