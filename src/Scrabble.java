// How to handle scoring?
// GUI (array backed grid with python?)
// No diagonal or backwards words. Left to right, top to bottom.


import java.util.Scanner;

public class Scrabble {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args)
    {
        char[][] scrabble_Board = new char[14][14];
        insertWord(scrabble_Board);
        printBoard(scrabble_Board);
    }

    //Asks what word was played, and where it was played.
    //Checks if the word is legal.
    //Asks if you challenge.
    protected static char[][] update_Board(){
    return null;
    }

    protected static void check_Vertical(){

    }

    public static void printBoard(char[][] board){
        // Displays a two dimensional array.
        for (char[] letter: board) {
            for (char element: letter) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }

    public static void insertWord(char[][] board)
    {
        int x_Cordinate = 4;
        int y_Coordinate = 7;
        String word = input.next();
        int word_Length = word.length();
        if (word.length() < (14 - y_Coordinate))
        {
            for (int y = 0; y<word_Length; y++)
            {
                board[y+y_Coordinate][x_Cordinate] = word.charAt(y);
            }
        }
    }

    public static boolean checkVertical(char[][] board, String word)
    {
        int x_Coordinate = 3;
        int y_Coordinate = 4;
        int w_Length = word.length();
        if (y_Coordinate+w_Length>13)
        {
            return false;
        }

        for (int y = 0; y < w_Length; y++)
        {
            if(board[y+y_Coordinate][x_Coordinate]!=(word.charAt(y))&&(board[y+y_Coordinate][x_Coordinate])!='\u0000')
            {
                return false;
            }
        }
        return true;
    }

    public static boolean checkHorizontal(char[][] board, String word)
    {
        int x_Coordinate = 3;
        int y_Coordinate = 4;
        int w_Length = word.length();
        if (x_Coordinate+w_Length>13)
        {
            return false;
        }

        for (int x = 0; x < w_Length; x++)
        {
            if(board[y_Coordinate][x_Coordinate+x]!=(word.charAt(x))&&(board[y_Coordinate][x_Coordinate+x])!='\u0000')
            {
                return false;
            }
        }
        return true;
    }


}
