package register;

    public class DemoService {


    private DB db;

    public DemoService(DB db) {
        this.db = db;
    }

    /**
     * 1 => Result = 2
     * 2 => Result = 3
     * @param id
     * @return
     */
    public String compute(int id, ModelA a) {
        return "Result = " + db.increaseOne(id);
//      return "Result = " + db.increaseOne(id) + db.increaseOne(id);
//      return ""
    }

}

//class DB {
//    int increaseOne(int id) {
//        //return id + 1;
//        throw new RuntimeException("Under construction");
//    }
//}

class ModelA{

}

interface DB {
    int increaseOne(int id);
}
