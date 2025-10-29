package dikki_dev.learn_basic_spring.core;

public class Database {
    private  static  Database database;

    public static Database getInstance(){
        if(database == null){
            database = new Database();
        }
        return database;
    }

    // Private constructor, so others can't initiate the "Database" object
    private Database(){

    }
}
