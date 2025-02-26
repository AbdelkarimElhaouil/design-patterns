package CreationalPattern.Singleton;

public class SingletonLogger {
    // Eager initialisation: the Object is preloaded in program
    // private static SingletonLogger singletonLogger = new SingletonLogger();
    private static SingletonLogger singletonLogger;

    private SingletonLogger(){}

    public static SingletonLogger getInstance(){
        if(singletonLogger == null){
            singletonLogger = new SingletonLogger();
        }
        return singletonLogger;
    }

    public void Error(){
        System.out.println("Error log");
    }

    public void info(){
        System.out.println("Info log");
    }

    public void debug(){
        System.out.println("Debug log");
    }


}
