import java.util.*;
import java.io.*;

public class Main_2525 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int nowHour = Integer.parseInt(st.nextToken());
        int nowMin = Integer.parseInt(st.nextToken());
        
        st = new StringTokenizer(br.readLine());
        int cookMin = Integer.parseInt(st.nextToken());
        
        int nowTimeAsMin = nowHour * 60 + nowMin;
        int cookOverTimeAsMin = nowTimeAsMin + cookMin;
        
        int cookOverHour = (cookOverTimeAsMin / 60) % 24;
        int cookOverMin = cookOverTimeAsMin % 60;
        
        StringBuilder sb = new StringBuilder();
        sb.append(cookOverHour);
        sb.append(" ");
        sb.append(cookOverMin);
        
        System.out.println(sb);
    }
}
