import javax.swing.*;
import java.sql.Array;

public class Main {
    public static void main(String[] args) {
        String[] foodGenre = new String[]{"massa", "oriental"};
//        JOptionPane.showMessageDialog(null, "nada", "title", JOptionPane.INFORMATION_MESSAGE);
//        JOptionPane.showMessageDialog(null, "nada", "title", JOptionPane.ERROR_MESSAGE);
//
//        JOptionPane.showConfirmDialog(null, "question", "title", JOptionPane.YES_NO_OPTION);
//
//        JOptionPane.showInputDialog("question");
        boolean runProgram = true;
        String gameTitle = "Food Game";
        while (runProgram) {
            // Initial Panel
            JOptionPane.showMessageDialog(null, "Bem vindos ao Jogo Gourmet! \n" +
                    " Vamos adivinhar do que você gosta", gameTitle, JOptionPane.PLAIN_MESSAGE);

            // Food Genre Panels
            selectFoodGenre(foodGenre, gameTitle);
            int plãyAgain = JOptionPane.showConfirmDialog(null, "Não descobrimos do que você gosta. \n" +
                    "Quer jogar de novo?", gameTitle, JOptionPane.YES_NO_OPTION);

            if (plãyAgain == JOptionPane.YES_OPTION) selectFoodGenre(foodGenre, gameTitle);
            runProgram = false;
        }
    }

    private static void selectFoodGenre(String[] foodGenre, String gameTitle) {
        int selectedFoodGenre = 1; // 1 is the NO on showConfirmDialog
        for (int i = 0; i < foodGenre.length; i++) {
            selectedFoodGenre = JOptionPane.showConfirmDialog(null, String.format("Você gosta de %s ?", foodGenre[i]), gameTitle, JOptionPane.YES_NO_OPTION);
            if (selectedFoodGenre == JOptionPane.YES_OPTION) {
                // TODO go to foodDish option
                break;
            }
        }
    }
}