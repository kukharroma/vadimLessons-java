import java.io.*;

/**
 * Created by roma on 27.10.15.
 */
public class FileService implements IFileService {


    @Override
    public boolean createFile() {
        File file = new File("/home/roma/Рабочий стол/Животік-не боли.txt");
        boolean newFile = false;
        try {
            newFile = file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return newFile;

    }

    @Override
    public void saveTextInFile(String text) {
        createFile();
        File file = new File("/home/roma/Рабочий стол/Животік-не боли.txt");
        FileWriter fw = null;
        try {
            fw = new FileWriter(file.getAbsoluteFile());
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(text);
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Override
    public String returnTextFromFile() {
        BufferedReader br = null;
        String everything=null;
        try {


            br = new BufferedReader(new FileReader("/home/roma/Рабочий стол/Животік-не боли.txt"));
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();
            while (line != null) {
                sb.append(line);
                sb.append(System.lineSeparator());
                line = br.readLine();
            }
            everything = sb.toString();


        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return everything;
    }

    @Override
    public void deleteTextFromFile() {
        saveTextInFile("");
    }
}

