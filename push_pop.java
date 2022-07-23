import java.util.EmptyStackException;

public class push_pop {
    private listnode top;
    private int length;

    public class listnode{
        private int data;
        private listnode next;

        public listnode(int data){
            this.data = data;
        }
    }

    public push_pop(){
        top = null;
        length = 0;
    }

    public int length(){
        return length;
    }

    public boolean isEmpty(){
        return length == 0;
    }

    public void push(int data){
        listnode n = new listnode(data);
        n.next = top;
        top = n;
        length++;
    }

    public int pop(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        int result = top.data;
        top = top.next;
        length--;
        return result;
    }

    public int peek(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        return top.data;
    }

    public void print(){
        if(isEmpty()){
            return;
        }
        listnode current = top;
        while(current != null){
            System.out.print(current.data + " --> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args){
        push_pop stack = new push_pop();
        stack.push(2);
        stack.push(28);
        stack.push(27);
        stack.print();
        System.out.println(stack.peek());
        stack.pop();
        stack.print();
        System.out.println(stack.peek());
    }
}
