package onboard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Problem3 {
    public static List<Integer> solution(List<Integer> numbers){
        List<Integer> answer = new ArrayList<>();
        Integer sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        Collections.sort(numbers);
        answer.add((Integer)sum/numbers.size());
        answer.add(numbers.get(2));
        return answer;
    }
}
