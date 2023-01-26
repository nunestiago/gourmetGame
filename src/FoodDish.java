import java.util.HashMap;
import java.util.List;

public class FoodDish extends FoodGenre {
    HashMap<String, List<String>> foodDish;

    public FoodDish(HashMap<String, List<String>> foodDish) {
        this.foodDish = foodDish;
    }
}
