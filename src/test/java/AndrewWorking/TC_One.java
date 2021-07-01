package AndrewWorking;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TC_One {
    public static void main(String[] args) {

        Set<Integer> pew = new HashSet<>(Arrays.asList(9,5,4,3,2,1,5,6,7,8,9));
        Iterator<Integer> iterator = pew.iterator();

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }



    }
}
