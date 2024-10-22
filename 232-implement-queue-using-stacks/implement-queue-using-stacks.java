class MyQueue {
    Stack<Integer> queue, stack;
    public MyQueue() {
        queue = new Stack<>();
        stack = new Stack<>();
    }
    
    public void push(int x) {
        stack.push(x);
    }  
    
    public int pop() {
        int x = peek();
        
        queue.pop();
        return x;
    }
    
    public int peek() {
        if (queue.isEmpty())
            while (!stack.isEmpty())
                queue.push(stack.pop());
        
        return queue.peek();
    }   
    
    public boolean empty() {
        return queue.isEmpty() && stack.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */