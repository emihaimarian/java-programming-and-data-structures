package bookExercises;

public class ChainedException {

    public static void main(String[] args) {

        try {

            method1();
            System.out.println("sunt in main dupa method1");
        } catch (Exception e) {
            System.out.println("sunt in main in catch block");
           e.printStackTrace();
            System.out.println("sunt in main dupa ce am printat stack ul");
        }
    }

    public static void method1() throws Exception{
        try{
            System.out.println("sunt in method1 inainte de apel method2");
            method2();
        }catch (Exception ex){
            System.out.println("sunt in method1 in catch block");
            throw new Exception("Now info from method1", ex);
        }

    }

    public static void method2() throws Exception{
        System.out.println("sunt in method2 si incep sa arunc exceptia");
        throw new Exception("New info from method2");
    }
}
