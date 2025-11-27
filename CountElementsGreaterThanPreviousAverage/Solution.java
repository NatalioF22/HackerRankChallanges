package CountElementsGreaterThanPreviousAverage;
import java.util.ArrayList;
import java.util.List;

public class Solution {

    public static long getAverage(List<Integer> list){
        long total = 0;
        for (int i=0; i< list.size(); i++){
            total += list.get(i);
        }
        return total/list.size();
    }
    
    public static int countResponseTimeRegressions(List<Integer> responseTimes) {
    if (responseTimes == null || responseTimes.size() == 1){return 0;}
    List<Integer> previousElements = new ArrayList<>();
    int count = 0;
    for(int i=1; i < responseTimes.size(); i++){
        previousElements.add(responseTimes.get(i-1));
        double avg = getAverage(previousElements);

        System.out.println("Elements "+ previousElements.get(i-1));
        System.out.println("Average " + avg);
        System.out.println("AVG " + avg + " Item: " + responseTimes.get(i));

        if(avg < responseTimes.get(i)){count++;}
    }   
    return count;
    }
}