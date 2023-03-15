package onboard;

public class Problem5 {
    public static Integer solution(Integer N, Integer K, Integer[] values){
        Integer answer = 0;
        for(int i = N - 1; i >= 0; i--) {
            if(values[i] <= K) {
                // 현재 가치의 동전으로 구성할 수 있는 개수를 더해준다.
                answer += (K / values[i]);
                K = K % values[i];
            }
        }
        return answer;
    }
}
