class MinStack {
    private Stack<Integer> mainStack;
    private Stack<Integer> otherStack;


    public MinStack() {
        mainStack = new Stack<>();
        otherStack = new Stack<>();

    }
    
    public void push(int val) {
        
        mainStack.push(val);
        if (!otherStack.isEmpty() && otherStack.peek()<val)
        otherStack.push(otherStack.peek());

        else
        otherStack.push(val);

    }
    
    public void pop() {
        if(!mainStack.isEmpty()){
        mainStack.pop();
        otherStack.pop();}
    }
    
    public int top() {
        return mainStack.peek();
    }
    
    public int getMin() {
       return otherStack.peek();
    }
}
