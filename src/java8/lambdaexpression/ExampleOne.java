package java8.lambdaexpression;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

class StudentDetails{
    int sId;
    String sName;
    int fee;

    public StudentDetails(int sId, String sName, int fee) {
        this.sId = sId;
        this.sName = sName;
        this.fee = fee;
    }

    @Override
    public String toString() {
        return "StudentDetails{" +
                "sId=" + sId +
                ", sName='" + sName + '\'' +
                ", fee=" + fee +
                '}';
    }
}
public class ExampleOne {
    public static void main(String[] args) {
        List<Object> li = new ArrayList<>();
        li.add(new StudentDetails(1,"Dwight",10000));
        li.add(new StudentDetails(2,"Jim",7000));
        li.add(new StudentDetails(3,"Andy",65000));

        li.forEach(o -> System.out.println(o));
    }
}
