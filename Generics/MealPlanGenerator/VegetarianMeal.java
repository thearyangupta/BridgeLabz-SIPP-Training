package MealPlanGenerator;

import java.util.List;

public class VegetarianMeal implements MealPlan {

    @Override
    public String getPlanName() {
        return "Vegetarian Meal";
    }

    @Override
    public List<String> getDishes() {
        return List.of("Naan", "Dal Makhani", "Shahi Paneer", "raita", "Salad");
    }
}
