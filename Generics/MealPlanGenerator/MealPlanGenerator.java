package MealPlanGenerator;

public class MealPlanGenerator {

    public <T extends MealPlan> void generatePlan(Meal<T> meal) {

        T plan = meal.getPlan();

        if (plan.getDishes() == null || plan.getDishes().isEmpty()) {
            System.err.println("Validation Failed: Meal plan has no dishes.");
            return;
        }

        System.out.println("\n----------- Your Plan ------------");
        for (String dish : plan.getDishes()) {
            System.out.println(" - " + dish);
        }
        System.out.println("----------------------------------\n");
    }
}
