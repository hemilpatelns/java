package abstraction;

import org.w3c.dom.ls.LSOutput;
class Block{
    public void blocker(){
        System.out.println("Block");
    }
}
interface Holi{
    default void message(){
        System.out.println("It's Holi!!");
    }
    void blocker();
}

interface Diwali{
    default void message(){
        System.out.println("It's Diwali");
    }
}

public class Holiday extends Block implements Holi, Diwali{
    public static void main(String[] args) {
        Holiday holiday = new Holiday();
        holiday.message();
        holiday.blocker();
    }

    @Override
    public void message() {
        Holi.super.message();
        Diwali.super.message();
    }
}
