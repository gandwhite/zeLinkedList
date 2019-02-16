import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.lang.reflect.Array;
import java.util.ArrayList;
import utils.LinkedList;

public class Main {
    public static void main(String[] args){
        LinkedList<Integer> linkedList = new LinkedList<>();
        for(int i = 0; i < 6; i++){
            linkedList.add(i);
        }
        System.out.println(linkedList.getLength());
        System.out.println(linkedList.get(0));
    }
}
