// How to handle scoring?
// GUI (array backed grid with python?)


public class Scrabble {
    public static void main(String[] args) {
        char [][] scrabble_Board = new char[14][14];
        scrabble_Board[1][3] = 'X'
        printGrid(scrabble_Board)
    }

    //Asks what word was played, and where it was played.
    //Checks if the word is legal.
    //Asks if you challenge.
    protected static char[][] update_Board(){

    }

    protected static void check_Vertical(){

    }

    public void printGrid(char[][] scrabble_Board)
    {
        for(int i = 0; i < 14; i++)
        {
            for(int j = 0; j < 14; j++)
            {
                System.out.printf("%5d ", scrabble_Board[i][j]);
            }
            System.out.println();
        }
    }


}
