import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameFrame extends JFrame implements ActionListener {
    Game game;
    JButton resetButton;
    JPanel resetPanel = new JPanel();
    GameFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(800,1000);
        this.getContentPane().setBackground(new Color(0,0,255));
        this.setLayout(new BorderLayout());
        resetPanel.setLayout(new BorderLayout());
        resetPanel.setBounds(0,0,800,100);
        resetButton = new JButton();
        resetButton.setText("Reset");
        resetButton.setFocusable(false);
        resetButton.setFont(new Font("MV Boli",Font.BOLD,80));
        resetButton.setForeground(new Color(0,255,0));
        resetButton.setBackground(new Color(0,0,0));
        resetButton.setSize(120,100);
        resetButton.setLocation(0,0);
        resetButton.addActionListener(this);
        game = new Game();
        resetPanel.add(resetButton);
        this.add(resetPanel,BorderLayout.SOUTH);
        this.add(game);
        this.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==resetButton){
            this.remove(game);
            game = new Game();
            this.add(game);
            SwingUtilities.updateComponentTreeUI(this);
        }
    }
}
