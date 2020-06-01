class MinStack {
    Stack<Integer> stack = new Stack<Integer>();
    Stack<Integer> min = new Stack<Integer>();
    public void push(int x) {
        stack.push(x);
        if (min.isEmpty() || x < min.peek()){
            min.push(x);
        } else {
            min.push(min.peek());
        }
    }

    public void pop() {
        stack.pop();
        min.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return min.peek();
    }
}

