class FullStack
 {
     int maxlength;
     int[] stkarr;
     int top;

    FullStack(int size) {
        maxlength = size;
        stkarr = new int[maxlength];
        top = -1;
    }
    void push(int value) {
        if (isFull()) {
            System.out.println("Stack is full. Cannot push element.");
        } else {
            stkarr[++top] = value;
            System.out.println(value + " pushed to stack.");
        }
    }
    int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot pop element.");
            return -1;
        } else {
            int poppedValue = stkarr[top--];
            System.out.println(poppedValue + " popped from stack.");
            return poppedValue;
        }
    }
    boolean isEmpty() 
    {
        if (top == -1){
            return true;
        }
        else {
            return false;
        }
        
    }
    boolean isFull()
     {
        if(top == maxlength - 1){
        return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) 
    {
        FullStack stack = new FullStack(5);

        stack.push(191);
        stack.push(202);
        stack.push(120);
        stack.push(430);
        stack.push(350);

        while (!stack.isEmpty()) {
            stack.pop();
        }
}
}
