import java.util.Collections;

public class SortDescending extends SortAlgorithm{ 
    public void compare(){ System.out.println("Descending sort: "); Collections.sort(this.numbers, Collections.reverseOrder());}
}