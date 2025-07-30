package MealPlanGenerator;

import java.util.List;

public class Keto implements MealPlan {
    @Override
    public String getPlanName() {
        return "Keto Meal";
    }

    @Override
    public List<String> getDishes() {
        return List.of("Broccoli", "Cucumbers", "Spinach", "Lettuce");
    }
}
