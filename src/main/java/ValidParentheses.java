public class ValidParentheses {
    public static void main(String[] args) {
        System.out.println(isValid("()[]{}"));

    }


    public static boolean isValid(String s) {
//        Map<Character, Character> brackets = new HashMap<>();
//        brackets.put(')', '(');
//        brackets.put(']', '[');
//        brackets.put('}', '{');
//        Deque<Character> stack = new LinkedList<>();
//        for (Character c : s.toCharArray()) {
//            if (brackets.containsValue(c)) {
//                stack.push(c);
//            } else if (brackets.containsKey(c)) {
//                if (stack.isEmpty() || stack.pop() != brackets.get(c)) {
//                    return false;
//                }
//            }
//        }
//        return stack.isEmpty();
//    }
        if(s.length() % 2 == 1){
            return false;
        }

        if(s.length() == 2){
            char a = s.charAt(0);
            char b = s.charAt(1);

            if(a == '(' && b == ')' || a == '{' && b == '}' || a == '[' && b == ']'){
                return true;
            }
            else
                return false;
        }

        for(int i=0;i<s.length()-1;i++){
            char a = s.charAt(i);
            char b = s.charAt(i+1);

            if(a == '(' && b == ')' || a == '{' && b == '}' || a == '[' && b == ']' ){
                String reducedS = s.substring(0, i) + s.substring(i+2);
                return isValid(reducedS);
            }
        }
        return false;

    }

}





