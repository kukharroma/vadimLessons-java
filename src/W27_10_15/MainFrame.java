import javax.swing.*;
import java.awt.event.ActionEvent;

/**
 * Created by roma on 27.10.15.
 */
public class MainFrame {
    static JFrame frame = new JFrame("Животік-не боли");
    static JTextField insertWindow = new JTextField("Введіть текст", 10);
    static JButton saveButton = new JButton("Зберегти");
    static JButton readButton = new JButton("Зчитати");
    static JButton deleteButton = new JButton("Видалити");
    static FileService fileService=new FileService();

    MainFrame() {
        frame.setSize(400, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setLayout(new java.awt.GridLayout(0, 1));
        frame.add(insertWindow);
        frame.add(saveButton);
        frame.add(readButton);
        frame.add(deleteButton);
        frame.setVisible(true);
        addAllListeners();
    }
    private void addAllListeners(){
        saveButton.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                fileService.saveTextInFile(insertWindow.getText());
            }
        });
        readButton.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String s=fileService.returnTextFromFile();
                insertWindow.setText(s);
            }
        });
        deleteButton.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                fileService.deleteTextFromFile();
                String s="";
                insertWindow.setText(s);
            }
        });
    }

}
