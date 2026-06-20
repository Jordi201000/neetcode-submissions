class Solution {
    public int evalRPN(String[] tokens) {

        Stack<Integer> st = new Stack<>();
        for(String a: tokens){
            if(a.equals("+"))
                st.push(st.pop()+st.pop());
            else if(a.equals("-")){
                int c = st.pop();
                int b=st.pop();
                st.push(b-c);
            }
            else if(a.equals("*"))
                st.push(st.pop()*st.pop());
            else if(a.equals("/")){
                int c=st.pop();
                int b=st.pop();
                st.push(b/c);
            }
            else
                st.push(Integer.parseInt(a));
        }
        return st.pop();
    }
}
