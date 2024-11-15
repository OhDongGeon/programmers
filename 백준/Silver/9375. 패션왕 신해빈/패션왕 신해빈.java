import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringBuilder sb = new StringBuilder();
        int testCase = Integer.parseInt(br.readLine());
        
        for (int i = 0; i < testCase; i++) {
            int n = Integer.parseInt(br.readLine());
            
            Map<String, Integer> map = new HashMap<>();
            for (int j = 0; j < n; j++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                st.nextToken();
                String key = st.nextToken();
                map.put(key, map.getOrDefault(key, 0) + 1);
            }
            
            int answer = 1;
            for (int item : map.values()) {
                answer *= (item + 1);
            }
            sb.append(answer - 1).append('\n');
        }
        System.out.print(sb);
    }
}