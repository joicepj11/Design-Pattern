package behavioral.template;

public abstract class Launch {

    public void prepareLaunch(){
        prepareIngredients();
        cooking();
        eating();
        cleaning();
    }

    protected abstract void cleaning();

    private void eating() {
        System.out.println( "Eating food, please do not disturb");
    }

    protected abstract void cooking();

    protected abstract void prepareIngredients();
}