package exceptionhandling.compiltime;

public class BasicCompileTime {

    public static void main(String[] args) {
        try{
            Class.forName("exceptionhandling.compiltime.Demo");
        }catch (ClassNotFoundException c){
            c.printStackTrace();
        }
        System.out.println("Line after exception");
    }

}
