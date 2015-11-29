package S29_11_15;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;

/**
 * Created by roma on 29.11.15.
 */
public class FileTest {

    private static String MAIN_PATH = "/home/roma/JavaTraining/src/S29_11_15";


    static void p(String s) {
        System.out.println(s);
    }


    static void createNewFile(String path, String fileName) {
        File file = new File(path, fileName);
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        p("The name of your faIlE mazafakaaa is :" + file.getName());

    }

    static void createNewDirectory(String path, String folderName) {
        File file = new File(path, folderName);
        file.mkdir();
    }

    static void createNewFileInNewDirectory(String pathFolder, String folderName, String fileName) {
        createNewDirectory(pathFolder, folderName);
        createNewFile(pathFolder + "/" + folderName, fileName);
    }


    public static void main(String[] args) {
//        createNewFileInNewDirectory("/home/roma/JavaTraining/src/S29_11_15", "KVV", "Vadya");
//        File file = new File("/home/roma/JavaTraining/src/S29_11_15", "OLOLO");
//        file.mkdir();
//        String[] s = file.list();
//        File[] files = file.listFiles();
//

        try {
            FileInputStream f = new FileInputStream("");


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
