package behavioral.template;

public class McDonaldMeal extends Launch {

    @Override
    protected void cleaning() {
        System.out.println("Cleaning all plates and throwing paper vessel");
    }

    @Override
    protected void cooking() {
        System.out.println("I am cooking McDonald meal");
    }

    @Override
    protected void prepareIngredients() {
        System.out.println("Getting all ingredients to prepare McDonald Meal ");
    }
}
