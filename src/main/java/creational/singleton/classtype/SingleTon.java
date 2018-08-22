package creational.singleton.classtype;

//lazy instance method
public class SingleTon {

    private static SingleTon instance = null;

    private SingleTon(){ }

    public static SingleTon getInstance(){
        // making method level synchronization costs more so block level is better
        // this synchronization is required only if there is multi threaded environment
        synchronized (SingleTon.class){
          if(instance == null ){
              instance = new SingleTon();
          }
        }
        return instance;
    }

    public void sayHello(){
        System.out.println("Hello world from class type ");
    }
}