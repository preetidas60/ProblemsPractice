public class practice {
    public static void main(String[] args) {
        int[] arr = {3,4,1,2};
        int target = 25;
        System.out.println(chalkReplacer(arr, target));
        String s = "baccdaghaikj";
        String result = s.replace("a", "");
        System.out.println(result);
    }
    // public static boolean search(int[] arr,int target, int start, int end){
    //     if(start>end){
    //         return false;
    //     }
    //     int mid = start + (end - start)/2;
    //     if(arr[mid] == target){
    //         return true;
    //     }
    //     if(arr[mid] < target){
    //         return search(arr, target, mid+1, end);
    //     }-
    //     return search(arr, target, start, mid-1);

    public static int chalkReplacer(int[] chalk, int k) {
        // Calculate the total amount of chalk needed for one full round
        long totalChalk = 0;
        for (int c : chalk) {
            totalChalk += c;
        }

        // Reduce k modulo the total chalk needed for one round
        k %= totalChalk;

        // Determine which student will run out of chalk
        for (int i = 0; i < chalk.length; i++) {
            if (k < chalk[i]) {
                return i;
            }
            k -= chalk[i];
        }

        // This line should never be reached
        return -1;
    }
}
