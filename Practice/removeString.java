public class removeString {
    public static void main(String[] args) {
        System.out.println(removeS("bcdappldf"));
        char ch = 'a';
        System.out.println(ch+1);
    }
    public static String removeS(String s){
        if(s.isEmpty()){
            return "";
        }
        if(s.startsWith("app") && !s.startsWith("apple")){
            return removeS(s.substring(3));
        }
        else return s.charAt(0) + removeS(s.substring(1));
    }
}
