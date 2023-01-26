import javax.swing.*;
import java.util.HashMap;
import java.util.List;

public class FoodDish extends FoodGenre {
    HashMap<String, List<String>> foodDish;

    public FoodDish(HashMap<String, List<String>> foodDish) {
        foodDish.put("Massa", List.of("Macarrão", "Lasanha"));
        foodDish.put("Oriental", List.of("Sushi", "Temaki"));
        this.foodDish = foodDish;
    }

    public void addDish(String foodGenre, String dish) {
        this.foodDish.get(foodGenre).add(dish);
    }

    public String selectFoodDish(String isFoodGenre) {
        String foodDish = "";
        for (String dish : this.foodDish.get(isFoodGenre)) {
            int selectedFoodGenre = ProgramFactory.makeYesNoQuestion(String.format("Você gosta de %s ?", dish
            ));
            if (selectedFoodGenre == JOptionPane.YES_OPTION) {
                return dish;

            }
        }
        return foodDish;
    }
}

