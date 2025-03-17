public class Stack {
    int stack[] = new int[10];
    int size = stack.length-1;
    int top = -1;
    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(19);
        st.push(19);
        st.push(19);
        st.push(19);
        st.push(19);
        st.push(19);
        st.push(19);
        st.push(19);
        st.push(19);
        st.push(19);
        st.push(19);
        st.push(19);
        st.pop();
        st.pop();
        st.pop();
        st.pop();
        st.pop();
        st.pop();
        st.pop();
        st.pop();
        st.pop();
        st.pop();
        st.pop();
        st.pop();
        st.pop();
        st.pop();
        st.pop();
        st.pop();
        st.pop();
        st.pop();
        st.push(64);
        st.push(43);
        st.push(9);
        st.pop();


    }
    public boolean push( int val){
        if(top == size){
            System.out.println("stack is full");

            return false;
        }
        stack[++top] = val;
        System.out.println("val added");
        return true;
    }

    public boolean pop(){
        if(top == -1){
            System.out.println("stack is empty");

            return false;
        }
        System.out.println(stack[top--]);
        return true;
    }
}
