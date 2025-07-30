package MealPlanGenerator;

public class MealPlanMain {
    public static void main(String[] args) {
        MealPlanGenerator generator = new MealPlanGenerator();

        Meal<VeganMeal> vegan = new Meal<VeganMeal>(new VeganMeal());
        generator.generatePlan(vegan);

        Meal<VegetarianMeal> veg = new Meal<VegetarianMeal>(new VegetarianMeal());
        generator.generatePlan(veg);

    }
}
