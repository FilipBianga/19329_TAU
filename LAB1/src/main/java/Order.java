import java.util.ArrayList;
import java.util.List;

public class Order {

    private List<Meal> meals = new ArrayList<>();

    public void addMealToOrder(Meal meal) {
        this.meals.add(meal);
    }


    public List<Meal> getMeals() {
        return meals;
    }


    @Override
    public String toString() {
        return "Order{" +
                "meals=" + meals +
                '}';
    }

}
