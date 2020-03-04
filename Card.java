/*Chapter 14- Game Zone pg. 365  ----CREATE GUI VERSION----
Filename: Card.java    object file
Alexa 3/3/2020 */
public class Card
{
    //instance variables/data fields for private variables
    private String suit;
    private int value;
    private String rank;

    //accessor/get method for the cards suit
    public String getSuit()
    {
        return suit;
    }

    //accessor/get method for the cards value
    public int getValue()
    {
        return value;
    }

    //accessor/get method for getting the cards rank
    public String getRank()
    {
        return rank;
    }

    //mutator/setter method for changing a cards suit
    public void setSuit(String s)
    {
        suit = s;
    }

    //mutator/setter method for changing a cards value
    public void setValue(int v)
    {
        value = v;

        //set the rank based off of the numeric value
        switch(value)
        {
            case 1:
            {
                rank = "Ace";
                break;
            }
            case 11:
            {
                rank = "Jack";
                break;
            }
            case 12:
            {
                rank = "Queen";
                break;
            }
            case 13:
            {
                rank = "King";
                break;
            }
            default:
            {
                rank = Integer.toString(value);
                break;
            }
        }
    }
}