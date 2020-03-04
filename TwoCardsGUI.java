/*GUI based version of the PickTwoCards application
Filename: TwoCardsGUI.java
Alexa 3/3/2020 */
//MODIFY OUTPUT PHASE TO MAKE IT GUI

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TwoCardsGUI extends JFrame implements ActionListener
{
    //instance objects /variables for this class
    JLabel title = new JLabel("Pick Two Cards");
    JLabel playerLabel = new JLabel("Player's Card: ");
    JLabel compLabel = new JLabel("Computer's Card: ");
    JLabel playerResult = new JLabel("");
    JLabel compResult = new JLabel("");
    Font bigFont = new Font("Century", Font.BOLD, 18);

    JButton button = new JButton("Click to Play");

    //constructor for the TwoCardsGUI class
    public TwoCardsGUI()
    {
        //use the JFrame constructor to construct THIS object
        super("Pick Two Cards GUI");
        setBounds(550, 250, 180, 180);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        title.setFont(bigFont);
        title.setForeground(Color.WHITE);
        playerLabel.setForeground(Color.white);
        compLabel.setForeground(Color.white);
        playerResult.setForeground(Color.magenta);
        compResult.setForeground(Color.cyan);
        getContentPane().setBackground(Color.BLACK);

        //layout manager for the GUI
        setLayout(new FlowLayout());

        //add instance objects to the frame
        add(title);
        add(playerLabel);
        add(playerResult);
        add(compLabel);
        add(compResult);
        add(button);

        //add the listener method to the button
        button.addActionListener(this);
    }

    //actionPerformed method details what should happen when the ActionListener button is clicked on
    @Override
    public void actionPerformed(ActionEvent e)
    {
        playGame(); //run a method that will generate the results of the game
    }

    //method that handles the actual game PickTwoCards (copy and past from PickTwoCards file)
    public void playGame()
    {
        //variables and constants
        int myValue;
        int comValue;
        final int CARDS_IN_SUIT = 13;

        //object
        Card myCard = new Card();
        Card comCard = new Card();

        //calculation phase to generate random number from 1-13 and assign it to the variables myValue and comValue
        myValue = ((int)(Math.random()*CARDS_IN_SUIT +1));
        comValue = ((int)(Math.random() *CARDS_IN_SUIT +1));

        //use the mutator methods to set the cards value to the random number generated for each player
        myCard.setValue(myValue);
        comCard.setValue(comValue);

        //use random number to choose the suit from an array of suit names
        String[] cardSuits = {"Diamonds", "Hearts", "Clubs", "Spades"};
        myCard.setSuit(cardSuits[(int)(Math.random() * 4)]); //if you want a range your highest number is what you multiple it by, if you want 0 then you dont need plus 1
        comCard.setSuit(cardSuits[(int)(Math.random() * 4)]);

        //output phase
        String playerMsg = myCard.getRank() + " of " + myCard.getSuit();
        String compMsg = comCard.getRank() + " of " + comCard.getSuit();
        playerResult.setText(playerMsg);
        compResult.setText(compMsg);
    }

    //main method to start the application which in turn creates an object from the TwoCardsGUI class
    public static void main(String[] args)
    {
        TwoCardsGUI game1 = new TwoCardsGUI();
        game1.setVisible(true);
    }
}