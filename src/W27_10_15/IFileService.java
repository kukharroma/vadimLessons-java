/**
 * Created by roma on 27.10.15.
 */
public interface IFileService {
    boolean createFile();
    void saveTextInFile(String text);
    String returnTextFromFile();
    void deleteTextFromFile();

}
