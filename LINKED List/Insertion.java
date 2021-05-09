import java.util.Scanner;

public class Insertion {
    public static  Node<String> input(){
       Node<String> head=null;
       System.out.println("enter strings");
       Scanner sc=new Scanner(System.in);
       String data=sc.nextLine();
  
       while(data.length()!=1 && data.charAt(0)!='x'){
        Node<String>newNode=new Node<String>(data);
           if(head==null){
               head=newNode;
           }
           else{
               Node<String> temp=head;
               while(temp.next!=null){
                   temp=temp.next;
               }
               temp.next=newNode;
             
           }
           data=sc.nextLine();
           
           }


           return head;
       }
       public static void print(Node<String> head){
           
           Node<String>temp=head;
           while(temp.next!=null){
            System.out.print(temp.data+"-->");
            temp=temp.next;
           }
           System.out.println(temp.data);
          
       }
    
    
    public static void main(String[] args) {
        Node<String>head=input();
        print(head);
    }
    
}
