//Logger class creation with instance and constructor.
public class Logger {
    private static Logger assignment;
    private Logger(){

    }

    //Singleton Method Implementation

    public static Logger getAssignment(){

//        The if condition checks that only one object is created and, it does not get created multiple time.

        if(assignment==null){
            assignment=new Logger();
        }
        return assignment;
    }
}
