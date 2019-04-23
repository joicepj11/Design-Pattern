package behavioral.template;

public class KFCMeal extends Launch {
    @Override
    protected void cleaning() {
        System.out.println("Cleaning vessels");
    }

    @Override
    protected void cooking() {
        System.out.println("Cooking KFC Meal");
    }

    @Override
    protected void prepareIngredients() {
        System.out.println("Getting all the necessary ingredients for KFC Meal");
    }
}
