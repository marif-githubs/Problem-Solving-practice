public class Queue {
    int []queue = new int[10];
    int size = 10;
    int front =0,rare = 0;
    public static void main(String[] args) {

    Queue q = new Queue();
        q.enqueue(45);
        q.enqueue(45);
        q.enqueue(45);
        q.enqueue(45);
        q.enqueue(45);
        q.enqueue(45);
        q.enqueue(45);
        q.enqueue(45);
        q.enqueue(45);
        q.enqueue(45);
        q.enqueue(45);
        q.enqueue(45);
        q.enqueue(45);
        q.dequeue();
        q.dequeue();
        q.dequeue();
        q.dequeue();
    }

    public int enqueue(int val){
        if( rare == -1){
            rare = front = 0;
            queue[rare] = val;
            return 1;
        }
        if(front == ( rare + 1) % size){
            System.out.println("queue is full");
            return 0;
        }

        if(++rare == size){rare %= size;}

        queue[rare] = val;
        System.out.println("val added");
        return 1;
    }

    public int dequeue(){
        if(front == -1){

            System.out.println("queue is empty");
            return 0;
        }else if (rare == front){
            System.out.println(queue[front]);
            front = rare = -1;
            return 1;
        }else{
            System.out.println(queue[front++]);
            if(front == size){front %= size;}
        }
        return 1;
    }
}
