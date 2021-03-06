
/**
 * The class Stack to create and implement a basic stack data structure using an array.
 * @author  Joseph Larson
 */
public class Stack {
    static final int MAX = 1000;    //Maximum size of stack
    /**
     * The current top of the stack
     */
    private int top; 
    int stack[] = new int[MAX]; //Integer Array to represent the stack

    /**
     * Initiates the stack data structure, starting at -1 to indicate a empty stack.
     */
    public Stack(){
        top = -1;
    }

    /**
     * Checks if the stack is empty.
     * @return False: stack not empty. True: stack is empty
     */
    public boolean isEmpty(){
        if (top < 0){
            return true;
        } 
        else {
            return false;
        }
    }

    /**
     * Adds an item to the stack data structure.
     * @param x integer value to add to stack
     * @return False: integer not added to stack. True: integer added to stack
     */
    public boolean push(int x){
        //Confirm space in array to add stack item
        if(top >= MAX - 1){
            System.out.println("Stack Overflow");
            return false;
        }
        else {
            //Space available add to array
            top++;
            stack[top] = x;
            System.out.println(x + " pushed into stack");
            return true;
        }
    }

    /**
     * Remove an item from the stack.
     * @return value of item removed from stack, otherwise 0 if stack Underflow issue.
     */
    public int pop(){
        //Confirm item exists in stack array to be removed
        if(top < 0){
            System.out.println("Stack Underflow");
            return 0;
        } 
        else {
            int x = stack[top];
            top--;
            System.out.println(x + " popped from stack");
            return x;
        }
    }

    /**
     * Looks at the current item at the top of the stack.
     * @return value of item at the top of the stack.
     */
    public int peek(){
        if (top < 0){ //Confirm item exists
            System.out.println("Stack Underflow");
            return 0;
        } 
        else {
            int x = stack[top];
            System.out.println("Top element is: " + x);
            return x;
        }
    }

    /**
     * Prints out all the values currently in the stack.
     */
    public void print() {
        System.out.print("Elements currently present in Stack:");
        //Print stack from top to bottom
        for(int i = top; i >= 0; i--){
            System.out.print("\n" + stack[i]);
        }
    }
}

