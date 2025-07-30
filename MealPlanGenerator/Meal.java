public class Meal<T extends MealPlan> {
    private T plan;

    public Meal(T plan) {
        this.plan = plan;
    }

    public void showPlan() {
        System.out.println("Meal plan: " + plan.getType());
    }

    public static <T extends MealPlan> void validatePlan(T plan) {
        System.out.println("Validating: " + plan.getType());
    }
}