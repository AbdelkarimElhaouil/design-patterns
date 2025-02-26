package CreationalPattern.Singleton;

public class SingletonRepo {
    private static SingletonRepo repo;

    private SingletonRepo(){}

    public static SingletonRepo getInstance(){
        if(repo == null){
            repo = new SingletonRepo();
        }
        return repo;
    }
    // Methods...
}
