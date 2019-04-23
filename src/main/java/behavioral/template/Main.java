package behavioral.template;

public class Main {

    public static void main(String[] args) {
        Launch launch = new KFCMeal();
        launch.prepareLaunch();
        System.out.println();
        launch = new McDonaldMeal();
        launch.prepareLaunch();
    }
}
