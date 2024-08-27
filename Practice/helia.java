public class helia {
    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println(lengthOfLongestSubstring(s));
    }
    public static int lengthOfLongestSubstring(String s) {
        int count =1;
        int first = 0;
        int max = 0;
        for(int i=1; i<s.length(); i++){
            if(s.charAt(first) == s.charAt(i)){
                count=1;
                first = i;
            }
            else{
                count++;
                max = Math.max(max, count);
            }
        }
        return max;
    }
}
