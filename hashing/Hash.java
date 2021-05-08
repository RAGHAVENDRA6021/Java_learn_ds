import java.lang.*;
import java.util.*;
class Hash{
    public static void main(String[] args){
        HashMap<String,Integer>map=new HashMap<>();
        //insertion : map.put(key,value);
        map.put("abc",1);
        map.put("def",2);
        map.put("abc",1);
        map.put("def",10);
        //check presence of key : map.containsKey(key)-o(1)
        if(map.containsKey("abc")){
            System.out.println("abc is present");
        }
        //get value :int x=map.get(key)
        int x=map.get("abc");
        System.out.println(x);
        //remove key ,value pair : int x=map.remove(key); return value
        x=map.remove("def");
        System.out.println(x);
        map.put("def",19);
        //iterate 
        Set<String> keys=map.keySet();
        for(String str:keys){
            System.out.println(str);
        }

        
    }
}