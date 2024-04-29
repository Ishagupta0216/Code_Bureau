import java.util.ArrayList;
public class Solution {
    public static int countDigits(int n){
        // Write your code here.
        int originalN = n;
       ArrayList<Integer>digits = new ArrayList<>();
       while(n>0){
           int digit =n%10;
           digits.add(digit);
           n=n/10;
    }
        int counter = 0;
        for(int i=0 ; i<digits.size() ; i++){
            if(digits.get(i)!=0 && originalN%digits.get(i)==0){
                counter++;
            }
}return counter;}}
