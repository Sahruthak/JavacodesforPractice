import java.util.*;
public class StackOperations{
    public static void main(String[] args) {
       Stack<Integer> stack=new Stack<>();
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter push to add an element onto stack\nEnter pop to delete an element from stack\nEnter view to see elements of stack\nEnter q to quit");
       while(true){
       System.out.println("Enter Choice: ");
       String operation=sc.nextLine();
       if(operation.equals("q")){
        break;
       } else if(operation.equals("push")){
        System.out.println("Enter the Element to be pushed");
        int ele=sc.nextInt();
        sc.nextLine();
        stack.push(ele);
        System.out.println("Element "+ele+" has pushed onto the stack");
       }
       else if(operation.equals("pop")) 
       { 
       if(stack.isEmpty()){
        System.out.println("Stack is Empty");
       }
       else {
        int ele=stack.pop();
        System.out.println("element "+ele+" is popped from the stack");
       }
       } else if(operation.equals("view")){
        System.out.println(stack);
       } else {
                System.out.println("Invalid input. Please try again.");
       }
    }
       sc.close();
    }
}