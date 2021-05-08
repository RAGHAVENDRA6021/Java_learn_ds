import java.util.*;

public class LinkedList {
    public static void print(Node<Integer> head){
        Node<Integer> temp=head;
        System.out.println("vaues in linked list");
        while(temp!=null){
            System.out.println(temp.data+" "+temp.next);
            temp=temp.next;
        }
    }
    public static Node<Integer> takeInput(){
        Node<Integer> head=null;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter values");
        int data=sc.nextInt();
        while(data!=-1)
        {
            Node<Integer> newNode=new Node<>(data);
            if(head==null){
                head=newNode;
                System.out.println(head);
            }
            else{
                Node<Integer> temp=head;

                while(temp.next!=null){
                    temp=temp.next;
                }
                temp.next=newNode;
            }
            data=sc.nextInt();

        }
        return head;


    }
    public static void main(String[] args){
       Node<Integer> head=takeInput();
        print(head);
       
        
    }

    
}
