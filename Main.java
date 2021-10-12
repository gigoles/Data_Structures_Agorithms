class StackList{
    class Node{
        int item;
        Node next;

        public Node(int item) {
            this.item = item;
        }
    }
    public Node top;
    public void push(int Val) {
        Node node = new Node(Val);
       if(isEmpty()){
           top = node;
       }else{
           node.next = top;
           top = node;
       }

    }
    public void pop(){
        if (isEmpty()){
            System.out.println("Sorry, you cant delete an empty string!");
        }else{
                top = top.next;
        }
    }
    public Node peek(){
        return top;
    }

    private boolean isEmpty() {
        return (top == null);
    }
    public void print() {
        if (top == null)
            System.out.println("List is empty");
        while (top != null) {
            System.out.println(top.item);
            top = top.next;
        }
    }
}
public class Main {

    public static void main(String[] args) {
        StackList list = new StackList();
        list.push(10);
        list.push(20);
        list.push(30);
        list.pop();
        list.print();
    }
}
