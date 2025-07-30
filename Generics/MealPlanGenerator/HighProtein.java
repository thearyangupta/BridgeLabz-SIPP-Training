package MealPlanGenerator;

import java.util.List;

public class HighProtein implements MealPlan {
    @Override
    public String getPlanName() {
        return "High Protein Meal";
    }

    @Override
    public List<String> getDishes() {
        return List.of("Beans", "Whey Protein", "Nuts", "Tofu");
    }
}
