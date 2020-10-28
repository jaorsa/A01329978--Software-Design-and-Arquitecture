import java.util.Random;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
public abstract class SortAlgorithm{
    ArrayList<Integer> numbers = new ArrayList<Integer>();

    void sorting(){
        processArray();
        sort();
        compare();
        returnArray();
    }

    abstract void compare();

    void sort(){ 
        System.out.println("Before sorting: ");
        System.out.println("[ ");
        for (Integer integer : numbers) {
            //if(integer%10 == 0){ System.out.println(); }
            System.out.print(integer + " ");
        }
        System.out.println();
        System.out.println(" ]");
        compare();
    }

    void processArray(){ 
        Random random = new Random();
        for(int i = 1; i <= 100; i++){ numbers.add(random.nextInt(100)); }  
    }

    void returnArray(){
        System.out.println("[ ");
        for (Integer integer : numbers) {
            //if(integer%15 == 0){ System.out.println(""); }
            System.out.print(integer + " ");
        }
        System.out.println();
        System.out.println(" ]");
    }
}