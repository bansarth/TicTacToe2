import javax.swing.JOptionPane;

public class TicTacToe2{
    static char[] board = {'1', '2', '3', '4', '5', '6', '7', '8', '9'};

    public static void main(String[] args){
        JOptionPane.showMessageDialog(null, "Let's Play TicTacToe!");
        displayBoard(1);
    }

    TicTacToe2(){
        
    }

    private static void displayBoard(int state){
        if(state == 1){
            JOptionPane.showInputDialog(null, "Enter the position you wish to play at:\n" + board[0] + " " + board[1] + " " + board[2] + "\n"
            + board[3] + " " + board[4] + " " + board[5] + "\n" + board[6] + " " + board[7] + " " + board[8] + "\n", "Player Move", JOptionPane.QUESTION_MESSAGE);
        }
    }

}