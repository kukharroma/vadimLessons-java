package W20_10_15;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    static JFrame frame = new JFrame("Обойти планету Земля...");

    static JTextField mnojnyk1 = new JTextField("0", 10);
    static JLabel symbolMojennya = new JLabel("*");
    static JTextField mnojnyk2 = new JTextField("0", 10);
    static JLabel symbolResultMnoj = new JLabel("=");
    static JTextField resultMnoj = new JTextField("0", 10);
    static JTextField dodanok1 = new JTextField("0", 10);
    static JLabel symbolDodavannya = new JLabel("+");
    static JTextField dodanok2 = new JTextField("0", 10);
    static JLabel symbolResultDodavannya = new JLabel("=");
    static JTextField resultDod = new JTextField("0", 10);
    static JTextField dilene = new JTextField("0", 10);
    static JLabel symbolDilennya = new JLabel("/");
    static JTextField dilnyk = new JTextField("0", 10);
    static JLabel symbolResultDilennya = new JLabel("=");
    static JTextField chastka = new JTextField("0", 10);
    static JTextField zmenshyvane = new JTextField("0", 10);
    static JLabel symbolVidnimannya = new JLabel("-");
    static JTextField vidjemnyk = new JTextField("0", 10);
    static JLabel symbolResultVidnimannya = new JLabel("=");
    static JTextField riznycia = new JTextField("0", 10);

    static boolean isDialogVisible = false;

    public static void main(String[] args) {

        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setLayout(new GridBagLayout());


        frame.add(dodanok1, new GridBagConstraints(0, 0, 1, 1, 1, 1, GridBagConstraints.NORTH,
                GridBagConstraints.HORIZONTAL, new Insets(2, 2, 2, 2), 0, 0));
        frame.add(symbolDodavannya, new GridBagConstraints(1, 0, 1, 1, 1, 1, GridBagConstraints.NORTH,
                GridBagConstraints.HORIZONTAL, new Insets(2, 2, 2, 2), 0, 0));
        frame.add(dodanok2, new GridBagConstraints(2, 0, 1, 1, 1, 1, GridBagConstraints.NORTH,
                GridBagConstraints.HORIZONTAL, new Insets(2, 2, 2, 2), 0, 0));
        frame.add(symbolResultDodavannya, new GridBagConstraints(3, 0, 1, 1, 1, 1, GridBagConstraints.NORTH,
                GridBagConstraints.HORIZONTAL, new Insets(2, 2, 2, 2), 0, 0));
        frame.add(resultDod, new GridBagConstraints(4, 0, 1, 1, 1, 1, GridBagConstraints.NORTH,
                GridBagConstraints.HORIZONTAL, new Insets(2, 2, 2, 2), 0, 0));

        frame.add(zmenshyvane, new GridBagConstraints(0, 1, 1, 1, 1, 1, GridBagConstraints.NORTH,
                GridBagConstraints.HORIZONTAL, new Insets(2, 2, 2, 2), 0, 0));
        frame.add(symbolVidnimannya, new GridBagConstraints(1, 1, 1, 1, 1, 1, GridBagConstraints.NORTH,
                GridBagConstraints.HORIZONTAL, new Insets(2, 2, 2, 2), 0, 0));
        frame.add(vidjemnyk, new GridBagConstraints(2, 1, 1, 1, 1, 1, GridBagConstraints.NORTH,
                GridBagConstraints.HORIZONTAL, new Insets(2, 2, 2, 2), 0, 0));
        frame.add(symbolResultVidnimannya, new GridBagConstraints(3, 1, 1, 1, 1, 1, GridBagConstraints.NORTH,
                GridBagConstraints.HORIZONTAL, new Insets(2, 2, 2, 2), 0, 0));
        frame.add(riznycia, new GridBagConstraints(4, 1, 1, 1, 1, 1, GridBagConstraints.NORTH,
                GridBagConstraints.HORIZONTAL, new Insets(2, 2, 2, 2), 0, 0));

        frame.add(mnojnyk1, new GridBagConstraints(0, 2, 1, 1, 1, 1, GridBagConstraints.NORTH,
                GridBagConstraints.HORIZONTAL, new Insets(2, 2, 2, 2), 0, 0));
        frame.add(symbolMojennya, new GridBagConstraints(1, 2, 1, 1, 1, 1, GridBagConstraints.NORTH,
                GridBagConstraints.HORIZONTAL, new Insets(2, 2, 2, 2), 0, 0));
        frame.add(mnojnyk2, new GridBagConstraints(2, 2, 1, 1, 1, 1, GridBagConstraints.NORTH,
                GridBagConstraints.HORIZONTAL, new Insets(2, 2, 2, 2), 0, 0));
        frame.add(symbolResultMnoj, new GridBagConstraints(3, 2, 1, 1, 1, 1, GridBagConstraints.NORTH,
                GridBagConstraints.HORIZONTAL, new Insets(2, 2, 2, 2), 0, 0));
        frame.add(resultMnoj, new GridBagConstraints(4, 2, 1, 1, 1, 1, GridBagConstraints.NORTH,
                GridBagConstraints.HORIZONTAL, new Insets(2, 2, 2, 2), 0, 0));

        frame.add(dilene, new GridBagConstraints(0, 3, 1, 1, 1, 1, GridBagConstraints.NORTH,
                GridBagConstraints.HORIZONTAL, new Insets(2, 2, 2, 2), 0, 0));
        frame.add(symbolDilennya, new GridBagConstraints(1, 3, 1, 1, 1, 1, GridBagConstraints.NORTH,
                GridBagConstraints.HORIZONTAL, new Insets(2, 2, 2, 2), 0, 0));
        frame.add(dilnyk, new GridBagConstraints(2, 3, 1, 1, 1, 1, GridBagConstraints.NORTH,
                GridBagConstraints.HORIZONTAL, new Insets(2, 2, 2, 2), 0, 0));
        frame.add(symbolResultDilennya, new GridBagConstraints(3, 3, 1, 1, 1, 1, GridBagConstraints.NORTH,
                GridBagConstraints.HORIZONTAL, new Insets(2, 2, 2, 2), 0, 0));
        frame.add(chastka, new GridBagConstraints(4, 3, 1, 1, 1, 1, GridBagConstraints.NORTH,
                GridBagConstraints.HORIZONTAL, new Insets(2, 2, 2, 2), 0, 0));


        JButton resultButton = new JButton("Вичислити");
        frame.add(resultButton, new GridBagConstraints(2, 4, 3, 1, 1, 1, GridBagConstraints.CENTER,
                GridBagConstraints.HORIZONTAL, new Insets(2, 2, 2, 2), 0, 0));
        resultButton.addActionListener(new resultDodavannyaButtonActionListener());
        resultButton.addActionListener(new resultVidnimannyaButtonActionListener());
        resultButton.addActionListener(new resultMnojennyaButtonActionListener());
        resultButton.addActionListener(new resultDilennyaButtonActionListener());


        frame.pack();
        frame.setVisible(true);
    }

    public static class resultDodavannyaButtonActionListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent event) {
            float dodanok1 = 0, dodanok2 = 0, resultDod;


            try {
                dodanok1 = Float.parseFloat(Main.dodanok1.getText());
                dodanok2 = Float.parseFloat(Main.dodanok2.getText());
            } catch (Exception e) {
                if (!isDialogVisible) {
                    isDialogVisible = true;
                    JOptionPane.showMessageDialog(frame, "Lol");

                }
            }


            resultDod = dodanok1 + dodanok2;
            Main.resultDod.setText(String.valueOf(resultDod));

        }
    }

    public static class resultVidnimannyaButtonActionListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent event) {
            float zmenshyvane = 0, vidjemnyk = 0, riznycia = 0;

            try {
                zmenshyvane = Float.parseFloat(Main.zmenshyvane.getText());
                vidjemnyk = Float.parseFloat(Main.vidjemnyk.getText());
            } catch (Exception e) {
                if (!isDialogVisible) {
                    isDialogVisible = true;
                    JOptionPane.showMessageDialog(frame, "Lol");
                }
            }

            riznycia = zmenshyvane - vidjemnyk;
            Main.riznycia.setText(String.valueOf(riznycia));

        }
    }

    public static class resultMnojennyaButtonActionListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent event) {
            float mnojnyk1 = 0, mnojnyk2 = 0, resultMnoj = 0;

            try {
                mnojnyk1 = Float.parseFloat(Main.mnojnyk1.getText());
                mnojnyk2 = Float.parseFloat(Main.mnojnyk2.getText());
            } catch (Exception e) {
                if (!isDialogVisible) {
                    isDialogVisible = true;
                    JOptionPane.showMessageDialog(frame, "Lol");
                }
            }

            resultMnoj = mnojnyk1 * mnojnyk2;
            Main.resultMnoj.setText(String.valueOf(resultMnoj));

        }
    }

    public static class resultDilennyaButtonActionListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent event) {
            float dilene = 0, dilnyk = 0, chastka = 0;

            try {
                dilene = Float.parseFloat(Main.dilene.getText());
                dilnyk = Float.parseFloat(Main.dilnyk.getText());
            } catch (Exception e) {
                if (!isDialogVisible) {
                    isDialogVisible = true;
                    JOptionPane.showMessageDialog(frame, "Lol");
                }
            }

            chastka = dilene * dilnyk;
            Main.chastka.setText(String.valueOf(chastka));

        }
    }


}
