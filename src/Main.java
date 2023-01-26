import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        FoodGenre foodGenre = new FoodGenre();
        String gameTitle = "Food Game";
        boolean runProgram = true;

        while (runProgram) {
            // Initial Panel
            ProgramFactory.welcomeMessage();

            // Food Genre Panels
            int selectedFoodGenre;
            for (int i = 0; i < foodGenre.getFoodGenres().size(); i++) {
                selectedFoodGenre = ProgramFactory.makeQuestion(String.format("Você gosta de %s ?", foodGenre));

                if (selectedFoodGenre == JOptionPane.NO_OPTION) continue;

                if (selectedFoodGenre == JOptionPane.YES_OPTION) {
                    JOptionPane.showMessageDialog(null, String.format("Você gosta de %s!\n" +
                            "Acertei", foodGenre.getFoodGenres().get(i)), "title", JOptionPane.PLAIN_MESSAGE);
                    break;
                }
            }
            int playAgain = JOptionPane.showConfirmDialog(null, "Não descobrimos do que você gosta. \n" +
                    "Quer jogar de novo?", gameTitle, JOptionPane.YES_NO_OPTION);

            if (playAgain == JOptionPane.NO_OPTION) runProgram = false;

        }

    }



}