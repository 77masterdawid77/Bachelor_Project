import javax.swing.*;
import java.awt.event.*;

public class MainFrame extends JFrame {
    private JButton buttonBackToHomePage;
    private JTextField inputBox1;
    private JPanel mainPanel;
    private JTextField inputBox2;
    private JTextField inputBox3;
    private JTextField inputBox4;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton resetButton1;
    private JMenuBar MenuBar;
    private JMenu File;
    private JMenuItem fileSave;
    private JMenu Help;
    private JMenuItem About;
    private JMenuItem ResetEverything;
    private JTabbedPane tabbedPane1;
    private JScrollBar scrollBar1;
    private JPanel EasyJPannel;
    private JButton moveToHackableServersButton;
    private JButton button5;
    private JTextField inputBox5;
    private JButton button6;
    private JTextField inputBox6;
    private JButton downloadFileButton;
    private JButton downloadFileButton1;
    private JButton moveToPVPButton;

    public MainFrame(){
        setContentPane(mainPanel);
        setTitle("CTF Platform");
        //setSize(1000,600);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        //setUndecorated(true); //true fullscreen
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);

        buttonBackToHomePage.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String input = inputBox1.getText();
                if (input.equals("CTF{101}")) { buttonBackToHomePage.setText("Correct"); inputBox1.setEnabled(false); };
            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String input2 = inputBox2.getText().toUpperCase();
                if (input2.equals("CTF{ROUTER}")) { button2.setText("Correct"); inputBox2.setEnabled(false); };
            }
        });
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String input3 = inputBox3.getText().toUpperCase();
                if (input3.equals("CTF{A}")) { button3.setText("Correct"); inputBox3.setEnabled(false); };
            }
        });
        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String input4 = inputBox4.getText().toUpperCase();
                if (input4.equals("CTF{HTTP}") || input4.equals("CTF{80}")) { button4.setText("Correct"); inputBox4.setEnabled(false); };
            }
        });
        resetButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                buttonBackToHomePage.setText("Check Answer!");
                button2.setText("Check Answer!");
                button3.setText("Check Answer!");
                button4.setText("Check Answer!");
                inputBox1.setText("");
                inputBox2.setText("");
                inputBox3.setText("");
                inputBox4.setText("");
                inputBox1.setEnabled(true);
                inputBox2.setEnabled(true);
                inputBox3.setEnabled(true);
                inputBox4.setEnabled(true);
            }
        });
        About.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                javax.swing.JOptionPane.showMessageDialog(MainFrame.this, "This is the about page");
            }
        });

        ResetEverything.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                buttonBackToHomePage.setText("Check Answer!");
                button2.setText("Check Answer!");
                button3.setText("Check Answer!");
                button4.setText("Check Answer!");
                inputBox1.setText("");
                inputBox2.setText("");
                inputBox3.setText("");
                inputBox4.setText("");
                inputBox1.setEnabled(true);
                inputBox2.setEnabled(true);
                inputBox3.setEnabled(true);
                inputBox4.setEnabled(true);
            }
        });

        scrollBar1.addMouseWheelListener(new MouseWheelListener() {
            @Override
            public void mouseWheelMoved(MouseWheelEvent mouseWheelEvent) {
               // mouseWheelMoved();
                }

        });
        moveToHackableServersButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                setVisible(false);
                HackableServerFrame page2 = new HackableServerFrame();



              //  setContentPane(EasyJPannel);
            }
        });
        button5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String input5 = inputBox5.getText().toUpperCase();
                if (input5.equals("CTF{PASSWORD}") ){ button5.setText("Correct"); inputBox5.setEnabled(false); };
            }
        });
        button6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String input6 = inputBox6.getText().toUpperCase();
                if (input6.equals("CTF{RAY TRACING}") || (input6.equals("CTF{RAY-TRACING}") )) { button6.setText("Correct"); inputBox6.setEnabled(false); };
            }
        });
        moveToPVPButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                setVisible(false);
                PVPForm page3 = new PVPForm();
            }
        });
    }



    public static void main(String[] args) {
        MainFrame myFrame = new MainFrame();
    }
}
