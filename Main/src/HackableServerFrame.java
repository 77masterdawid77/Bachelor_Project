import javax.swing.*;

public class HackableServerFrame extends JFrame {
    private JTextField textField1;
    private JTextArea textArea1;
    private JTextArea textArea2;
    private JPanel HackMainFrame;


    public HackableServerFrame(){
        setContentPane(HackMainFrame);
        setTitle("CTF Platform page 2");
        //setSize(1000,600);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        //setUndecorated(true); //true fullscreen
        //setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);

}}
