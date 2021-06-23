import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HackerrankMap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Integer numOfEntries = input.nextInt();
        Map<String,Integer> contactMap = new HashMap<>();
        input.nextLine();

        while (numOfEntries > 0){
            String name = input.nextLine();
            Integer phoneNumber = input.nextInt();
            contactMap.put(name,phoneNumber);
            input.nextLine();
            numOfEntries--;

        }
        while (input.hasNext()){
            String query = input.nextLine();

            if(contactMap.containsKey(query))
                System.out.println(query+"="+contactMap.get(query));
            else
                System.out.println("Not found");

        }
        input.close();
    }
}
