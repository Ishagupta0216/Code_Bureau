public class Solution {
    public static int sumOfAllDivisors(int n){
        // Write your code here.
        int totalsum=0;
        for(int i=1 ; i<=n ; i++){
            totalsum+=sumofdivisors(i);
    }
        return totalsum;
}
    public static int sumofdivisors(int n){
        int sum=0;
        for(int i=1 ; i<=n ; i++){
            if(n%i==0){
                sum+=i;}}
        return sum;
}}
