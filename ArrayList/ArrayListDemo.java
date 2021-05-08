package ArrayList;

import java.util.*;
import java.lang.*;


public class ArrayListDemo{
    public static void main(String[] args) {
        ArrayList<Integer> list1=new ArrayList<>();
        //find size
        System.out.println(list1.size());
        //insertion- list1.add(value)
        list1.add(1);
        list1.add(2); 
        list1.add(1);
        list1.add(2); 
        list1.add(3);
        list1.add(3);
        System.out.println(list1.size());
        //get value from list- list1.get(index)
        System.out.println(  list1.get(1));
        //iterate
        System.out.println();
        for(int i=0;i<list1.size();i++){
            System.out.print(list1.get(i)+" ");
        }
        System.out.println();
    //remove from list-list.remove(index)
    list1.remove(1);
    for(int i=0;i<list1.size();i++){
        System.out.print(list1.get(i)+" ");
    }
    System.out.println("size :"+list1.size());
    //insert at particular index -list1.set(index,value);
    list1.set(1,100);
    System.out.println("size :"+list1.size());

    //for loop variation-for(datatype var:datastructure)
    for(int element:list1){
        System.out.println(element);

    }
    for(int i=0;i<list1.size();i++){
        System.out.print(list1.get(i));
    }


      

    }
}