class Solution {
    public boolean isValid(String s) {
        Stack<Character> stacki = new Stack<>();
       List<Character> open = new ArrayList<>();
       open.add('{');
       open.add('[');
       open.add('(');
        List<Character> close = new ArrayList<>();
       close.add('}');
       close.add(']');
       close.add(')');
        Character popi;

        for(char curr : s.toCharArray()){
            if (open.contains(curr)){
                stacki.push(curr);
            }
            else if (stacki.isEmpty())
            return false;
            else{
                popi = stacki.pop();
            
            if (open.indexOf(popi)!=close.indexOf(curr))
            return false;
            }
        }
        if(! stacki.isEmpty())
        return false;

        return true;
    }
}
