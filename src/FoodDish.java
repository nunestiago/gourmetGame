import javax.swing.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FoodDish extends FoodGenre {
    HashMap<String, List<String>> foodDish;

    public FoodDish(HashMap<String, List<String>> foodDish) {
        foodDish.put("Massa", new ArrayList<>(){
            {
                add("Spaghetti");
                add("Lasagna");
            }
        });
        foodDish.put("Oriental", new ArrayList<>(){
            {
                add("Sushi");
                add("Temaki");
            }
        });
        this.foodDish = foodDish;
    }

    public void addDish(String foodGenre, String dish) {
        this.foodDish.putIfAbsent(foodGenre, new ArrayList<>());
        this.foodDish.get(foodGenre).add(dish);
    }

    public String selectFoodDish(String isFoodGenre) {
        String selectedFoodDish = "";
        for (String dish : this.foodDish.get(isFoodGenre)) {
            int selectedFoodGenre = ProgramFactory.makeYesNoQuestion(String.format("Você gosta de %s ?", dish));
            if (selectedFoodGenre == JOptionPane.YES_OPTION) {
                return dish;
            }
        }
        return selectedFoodDish;
    }
}
