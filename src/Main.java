import javax.swing.*;

public class Main {
    public static void main(String[] args) {
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
            int test = JOptionPane.showConfirmDialog(null, "Você gosta de massa?", gameTitle, JOptionPane.YES_NO_OPTION);

            if (test == JOptionPane.YES_OPTION) {
                // TODO go to foodDish option
            }
            System.out.println(test);
            runProgram = false;
        }
    }

}