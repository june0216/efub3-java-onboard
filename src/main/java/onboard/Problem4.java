package onboard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * 리턴값 answer의 경우, 변수 초기값은 변경 가능합니다.
 * 다만 answer로 return하는 것은 변경하지 않도록 주의해주세요.
 */
public class Problem4 {
    public static Integer solution(Integer number){
        Integer answer = 0;
        char[] temp = Integer.toString(number).toCharArray();
        Arrays.sort(temp);
        answer = 0;
        for(int i = temp.length-1; i >= 0 ;i--){
            answer =(answer * 10) + temp[i] - '0';
        }

        return answer;
    }
}
