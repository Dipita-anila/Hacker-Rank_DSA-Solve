import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {


    public static void miniMaxSum(List<Integer> arr) {
    int size = arr.size();
    long maxSum = Long.MIN_VALUE;
    long sum = 0;
    long minSum = Long. MAX_VALUE;
    
    for(int i = 0; i < size; i++){
        for (int j =0; j<size ;j++){
            if(i == j){
                continue;
            }else{
                sum += arr.get(j);
            }
        }
        if (maxSum < sum){
            maxSum = sum;
        }
        if (minSum > sum){
            minSum = sum;
        }
        sum = 0;
    }
    
    System.out.print(minSum+" "+maxSum);

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        Result.miniMaxSum(arr);

        bufferedReader.close();
    }
}
