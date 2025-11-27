package CountElementsGreaterThanPreviousAverage;

import java.util.LinkedList;
import java.util.List;

public class Main{
    public static void main(String[] args){
        List<Integer> nums = new LinkedList<>();
        nums.add(100);
        nums.add(200);
        nums.add(150);
        nums.add(300);
        int result =  Solution.countResponseTimeRegressions(nums);
        System.out.println(result);
    }
}