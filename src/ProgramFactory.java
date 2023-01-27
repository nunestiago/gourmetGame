import javax.swing.*;

public class ProgramFactory {
    private static final String GAMETITLE = "Food Game";

    public static void welcomeMessage() {
        JOptionPane.showMessageDialog(null, "Bem vindos ao Jogo Gourmet! \n" + " Vamos adivinhar do que você gosta",
                GAMETITLE, JOptionPane.PLAIN_MESSAGE);
    }

    public static int makeYesNoQuestion(String question) {
        return JOptionPane.showConfirmDialog(null, question, GAMETITLE, JOptionPane.YES_NO_OPTION);
    }

    public static String makeInputQuestion(String question) {
        return JOptionPane.showInputDialog(question);
    }

    public static void addNewFoodAndRestart(FoodGenre foodGenre, FoodDish foodDish) {
        String newFoodDish = ProgramFactory.makeInputQuestion("Que tipo de comida você gosta?");
        String newFoodGenre = ProgramFactory.makeInputQuestion(String
                .format("%s é ______, mas Bolo de Chocolate não?", newFoodDish));
        foodGenre.addFood(newFoodGenre);
        foodDish.addDish(newFoodGenre, newFoodDish);
        foodGenre.selectFoodGenre();
    }

    public static boolean isUserLikeCake() {
        int isChocolateCake = ProgramFactory
                .makeYesNoQuestion("O prato que você pensou é bolo de chocolate?");
        if (isChocolateCake == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(null, String.format("Você gosta de %s!\n" +
                    "Acertei", "bolo de chocolate"), "title", JOptionPane.PLAIN_MESSAGE);
            return true;
        }
        return false;
    }

}
