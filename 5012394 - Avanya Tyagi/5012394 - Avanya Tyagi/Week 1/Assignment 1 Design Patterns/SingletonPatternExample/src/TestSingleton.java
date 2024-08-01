//The class will be used to check that only one instance is created.
public class TestSingleton {
    public static void main(String[] args) {
        Logger test1=Logger.getAssignment();
        System.out.println(test1.hashCode());
        Logger test2=Logger.getAssignment();
        System.out.println(test2.hashCode());

        if(test1==test2) {
            System.out.println("Both the variables are same, therefore, only one instance is created.");
        }
        else {
            System.out.println("Both the varibles are different");
        }
    }
}
