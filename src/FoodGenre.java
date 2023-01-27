import javax.swing.*;
import java.util.ArrayList;

public class FoodGenre {
    ArrayList<String> foodGenres = new ArrayList<>() {
        {
            add("Massa");
            add("Oriental");
        }
    };

    public FoodGenre() {
    }

    public ArrayList<String> getFoodGenres() {
        return foodGenres;
    }

    public void addFood(String foodGenre) {
        if (!this.foodGenres.contains(foodGenre)) {
            this.foodGenres.add(foodGenre);
        }
    }

    public String selectFoodGenre() {
        String loopFoodGenre;
        for (int i = 0; i < this.getFoodGenres().size(); i++) {
            loopFoodGenre = this.getFoodGenres().get(i);

            int selectedFoodGenre = ProgramFactory
                    .makeYesNoQuestion(String.format("O prato que você pensou é %s ?", loopFoodGenre));

            if (selectedFoodGenre == JOptionPane.YES_OPTION) {
                return loopFoodGenre;
            }
        }
        return "";
    }
}
