Stack using array

    
class Main{
    static int[] stack = new int[10];
    static int top = -1;
    
    static void push(int val){
        if(top == 9){
            System.out.println("Stack overflow");
            return;
        }
        top++;
        stack[top] = val;
    }
    
    static void pop(){
        if(top == -1){
            System.out.println("Stack already empty");
            return;
        }
        top--;
    }
    
    static int peek(){
        if(top == -1){
            System.out.println("Stack already empty");
            return 0;
        }
        return stack[top];   
    }
    
    static void print(){
        int[] stackCopy = stack;
        int topCopy = top;
        while(topCopy > -1){ // while stack is not empty
            System.out.println(stack[topCopy--]);
        }
    }
    
    public static void main(String args[]){
        push(10);
        push(20);
        push(30);
        pop();
        System.out.println(peek());
        print();
    }


Stack using linked list

class Node{
    int val;
    Node next;
    Node(int val){
        this.val = val;
        this.next = null;
    }
}

class Main{
    static Node head = null; // start of LL
    static Node top = null; // top of the stack
    
    static void push(int val){
        if(head == null){ // if stack was empty
            head = new Node(val);
            top = head;
            return;
        }
        
        top.next = new Node(val); // insert at top.next;
        top = top.next; // move the top pointer
    }
    
    static void pop(){
        if(head == null){
            System.out.println("Stack already emtpy");
            return;
        }
        if(head == top){ // or head.next == null 
            head = null;
            top = null;
            return;
        }
        Node temp = head; // create a copy of head
        while(temp.next != top){ // move temp till temp.next == top
            temp = temp.next;
        }
        temp.next = null; // delete top element
        top = temp; // update top
    }
    
    static void print(){
        while(head != null){
            System.out.println(top.val + " ");
            pop();
        }
    }
    
    public static void main(String args[]){
        push(10);
        push(20);
        push(30);
        pop();
        print();
    }
}

Queue using linked list
class Node{
    int val;
    Node next;
    Node(int val){
        this.val = val;
        this.next = null;
    }
}

class Main{
    static Node front = null; // front of Queue
    static Node rear = null; // rear of Queue
    
    static void enqueue(int val){
        if(front == null){ // if queue was empty
            front = new Node(val);
            rear = front;
            return;
        }
        
        rear.next = new Node(val); // insert at rear.next;
        rear = rear.next; // move the rear pointer
    }
    
    static void deqeue(){
        if(front == null){
            System.out.println("Queue already emtpy");
            return;
        }
        if(front == rear){ // or front.next == null 
            front = null;
            rear = null;
            return;
        }
        front = front.next; // delete element at front
    }
    
    static int peek(){
        if(front == null){
            System.out.println("Queue empty");
            return -1;
        }
        return front.val;
    }
    
    static void print(){
        Node temp = front;
        while(temp != null){
            System.out.println(temp.val+" ");
            temp = temp.next;
        }
    }
public static void main(String args[]){
        enqueue(10);
        enqueue(20);
        enqueue(30);
        deqeue();
        print();
    }
}
