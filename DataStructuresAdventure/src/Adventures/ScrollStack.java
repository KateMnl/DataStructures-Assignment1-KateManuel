package Adventures;

import java.util.Stack;

public class ScrollStack {

    private Stack<String> stack;

    public ScrollStack() {
        stack = new Stack<>();
    }
    
    public void pushScroll(String scroll) {
        stack.push(scroll);
        System.out.println(scroll + " has been added to the stack.");
    }

    public String popScroll() {
        if (stack.isEmpty()) {
            System.out.println("The stack is empty, no scroll to pop.");
            return null;
        } else {
            String removedScroll = stack.pop();
            System.out.println(removedScroll + " has been removed from the stack.");
            return removedScroll;
        }
    }

    public String peekScroll() {
        if (stack.isEmpty()) {
            System.out.println("The stack is empty, no scroll to peek.");
            return null;
        } else {
            String topScroll = stack.peek();
            System.out.println("The top scroll is: " + topScroll);
            return topScroll;
        }
    }

    public boolean containsScroll(String scrollTitle) {
        boolean exists = stack.contains(scrollTitle);
        if (exists) {
            System.out.println(scrollTitle + " is present in the stack.");
        } else {
            System.out.println(scrollTitle + " is not present in the stack.");
        }
        return exists;
    }

    public static void main(String[] args) {
        ScrollStack scrollStack = new ScrollStack();

        scrollStack.pushScroll("Scroll of Wisdom");
        scrollStack.pushScroll("Scroll of Power");
        scrollStack.pushScroll("Scroll of Secrets");

        scrollStack.peekScroll(); 

        scrollStack.containsScroll("Scroll of Power");  
        scrollStack.containsScroll("Scroll of Magic");  

        scrollStack.popScroll();  
        scrollStack.peekScroll(); 
    }
}
