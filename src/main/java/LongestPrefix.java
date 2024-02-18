public class LongestPrefix {
    public static void main(String[] args) {
        System.out.println(longestCommonPrefix(new String[]{"flower", "flow", "flight"}));
    }
    public static String longestCommonPrefix(String[] strs) {
        for( String word : strs){
            if(word.isEmpty() || word.charAt(0)!=strs[0].charAt(0)){
                return "";
            }
        }
        String prefix = strs[0].substring(0,1);
        for( int i = 1; i < strs[0].length(); i++ ){
            for( String word : strs){
                if(word.length() < i+1 || !word.substring(i,i+1).equals(strs[0].substring(i,i+1))){
                    return prefix;
                }
            }
            prefix += strs[0].substring(i,i+1);
        }
        return prefix;
    }
}

