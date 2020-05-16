public class N392isSubsequence {

    public static void main(String[] args) {
        String s = "bcd";
        String t = "abdfcsgd";
        System.out.println(isSubsequence(s, t));
    }

    public static boolean isSubsequence(String s, String t) {
        char[] chars=s.toCharArray();
        int index=-1;
        for(char temp:chars){
            index=t.indexOf(temp,index+1);
            if(index==-1){
                return false;
            }
        }
        return true;
    }

//    public static boolean isSubsequence(String s, String t) {
//        if (t == null) return false;
//        if (s == null) return true;
//        for (int i = 0; i<t.length(); i++){
//            if (t.charAt(i) == s.charAt(0)) {
//                for (int j = 0; j<s.length(); j++){
//                    if (t.charAt(i+j) == s.charAt(j)){
//                        if (j==s.length()-1){
//                            return true;
//                        }
//                    }else{
//                        continue;
//                    }
//                }
//            }
//        }
//        return false;
//    }
}
