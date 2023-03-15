package onboard;

import java.util.ArrayList;
import java.util.List;

public class Problem2 {
    public static Integer[] solution(Integer[][] flipCards){
        Integer[] answer = {};
        Integer[] arr = new Integer[20];
        for(int m = 0; m < arr.length; m++)
        {
            arr[m] = m+1;
        }
        for (int i = 0; i < flipCards.length; i++) {
            int start = flipCards[i][0] - 1;
            int end = flipCards[i][1] - 1;

            int mid = (Math.abs(start - end) / 2);
            int count = 0;
            for (int j = 0; j <= mid; j++) {
                int tmp = arr[start + count];
                arr[start + count] = arr[end - count];
                arr[end - count] = tmp;
                count++;
            }
        }
        answer = new Integer[20];

        for(int r=0; r<answer.length; r++){
            answer[r] = arr[r];

        }
        return answer;
    }
}
