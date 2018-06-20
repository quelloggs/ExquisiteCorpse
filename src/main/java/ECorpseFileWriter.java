import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ECorpseFileWriter {

    public ECorpseFileWriter() {

    }

    public void writePoem(ExquisiteCorpse eCorpse) throws IOException {

        String fileName = eCorpse.getTitle();

        File file = new File(fileName + ".txt");
        file.createNewFile();
        FileWriter fileWriter = new FileWriter(file);
        fileWriter.write(eCorpse.getTitle());
        fileWriter.write(String.valueOf(eCorpse.getPoem().listIterator()));
        fileWriter.flush();
        fileWriter.close();

    }
}
