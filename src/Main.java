import javax.swing.*;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        FoodGenre foodGenre = new FoodGenre();
        FoodDish foodDish = new FoodDish(new HashMap<>());
        String gameTitle = "Food Game";
        boolean runProgram = true;

        do {
            // Initial Panel
            ProgramFactory.welcomeMessage();

            // Food Genre Panels - 1
            String chosenFood;
            chosenFood = foodGenre.selectFoodGenre();

            // User doesn't like genre add new genre
            if (chosenFood.isEmpty()) {
                // The cake is a lie
                if (ProgramFactory.isUserLikeCake()) break;
                ProgramFactory.addNewFoodAndRestart(foodGenre, foodDish);
            }

            // User choose a genre and now a dish
            if (!chosenFood.isEmpty()) {
                chosenFood = foodDish.selectFoodDish(chosenFood);
                // User didn't chose any dish
                if (chosenFood.isEmpty()) {
                    // Offer cake
                    if (ProgramFactory.isUserLikeCake()) break;
                    // The cake was a lie
                    ProgramFactory.addNewFoodAndRestart(foodGenre, foodDish);
                }
                // User chose a dish
                JOptionPane.showMessageDialog(null, String.format("Você gosta de %s!\n" +
                        "Acertei de novo!", chosenFood), "title", JOptionPane.PLAIN_MESSAGE);
            }

            int playAgain = JOptionPane.showConfirmDialog(null,
                    "Quer jogar de novo?", gameTitle, JOptionPane.YES_NO_OPTION);

            if (playAgain == JOptionPane.NO_OPTION)
                runProgram = false;

        } while (runProgram);
    }
}