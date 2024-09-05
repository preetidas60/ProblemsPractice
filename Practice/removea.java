public class removea {
    public static void main(String[] args) {
        String str = "bachfhruhahfolkap";
        String ans = "";
        System.out.println(remove(str, 0, ans));
        System.out.println(replace("averageman"));
    }
    public static String remove(String s,int index, String ans){
        if(index == s.length()){
            return ans;
        }
        if(s.charAt(index) != 'a'){
            ans = (String)ans + s.charAt(index);
        } 
        return remove(s, index+1, ans);
    }
    public static void skip(String main, String s){
        if(s.isEmpty()){
            System.out.println(main);
            return;
        }
        char ch = s.charAt(0);
        if(ch == 'a'){
            skip(main, s.substring(1));
        }
        else skip(main + ch, s.substring(1));
    }

    public static String replace(String s){
        if(s.isEmpty()){
            return "";
        }
        char ch = s.charAt(0);
        if(ch == 'a'){
            return replace(s.substring(1));
        }
        else return ch + replace(s.substring(1));
    }
}
