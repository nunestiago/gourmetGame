import java.util.ArrayList;

public class FoodGenre {
    ArrayList<String> foodGenres = new ArrayList<>() {{
        add("Massa");
        add("Oriental");
    }};

    public FoodGenre() {
    }

    public ArrayList<String> getFoodGenres() {
        return foodGenres;
    }

    public void addFoodGenre(String foodGenre) {
        this.foodGenres.add(foodGenre);
    }
}
