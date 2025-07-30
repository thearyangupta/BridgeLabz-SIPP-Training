package MealPlanGenerator;

import java.util.List;

public class VeganMeal implements MealPlan {

    @Override
    public String getPlanName() {
        return "Vegan Meal";
    }

    @Override
    public List<String> getDishes() {
        return List.of("Avocado", "Vegetable Salad", "Almond Milk", "Dry-Fruit Kheer");
    }
}
