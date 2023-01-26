import javax.swing.*;

public class ProgramFactory {
    private static final String gameTitle = "Food Game";

    public static void welcomeMessage() {
        JOptionPane.showMessageDialog(null, "Bem vindos ao Jogo Gourmet! \n" +
                " Vamos adivinhar do que você gosta", gameTitle, JOptionPane.PLAIN_MESSAGE);
    }

    public static int makeQuestion(String question) {
        return JOptionPane.showConfirmDialog(null,
                question, gameTitle,
                JOptionPane.YES_NO_OPTION);
    }


}
