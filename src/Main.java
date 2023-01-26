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

            // Food Genre Panels
            String whichFoodGenre = foodGenre.selectFoodGenre();

            // User doesn't like genre add new genre
            if (whichFoodGenre.isEmpty()) {
                String foodUserLike = ProgramFactory.makeInputQuestion("Que tipo de comida você gosta?");
                foodGenre.addFood(foodUserLike);
                foodGenre.selectFoodGenre();
            }

            if (!whichFoodGenre.isEmpty()) {
                String whichFoodDish = foodDish.selectFoodDish(whichFoodGenre);
                if(whichFoodDish.isEmpty()) {
                String newFoodDish = ProgramFactory.makeInputQuestion("Que tipo de comida você gosta?");
                    foodDish.addDish(whichFoodGenre, newFoodDish);
                    foodGenre.selectFoodGenre();
                }
                JOptionPane.showMessageDialog(null, String.format("Você gosta de %s!\n" +
                        "Acertei", whichFoodDish), "title", JOptionPane.PLAIN_MESSAGE);
            }

            int playAgain = JOptionPane.showConfirmDialog(null,
                    "Quer jogar de novo?", gameTitle, JOptionPane.YES_NO_OPTION);

            if (playAgain == JOptionPane.NO_OPTION) runProgram = false;

        } while (runProgram);

    }


}