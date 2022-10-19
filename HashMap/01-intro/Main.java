import java.util.HashMap;

public class Main{
    public static void main(String[] args) {
        // Hashmap<key , value> Hashmap_name = new Hashmap<>;
        // Intger : Hashmap work with wrapper class
        //declare and initialize
        HashMap <String , Integer> hm = new HashMap<>();
        
      // put =>

      hm.put("India" , 300);
      hm.put("USA" , 200);
      hm.put("China" , 500);

      System.out.println(hm);
// {USA=200, China=500, India=300} now order of output it will change may be for next time

// update :
hm.put("India", 400);

System.out.println(hm);
// {USA=200, China=500, India=400} now india value has been updated


// get : 
int intData = hm.get("India");
System.out.println(intData);
 // 400 ( india latest value is 4)


 // is containkey : if key availabe then return true else false 

 boolean isChina = hm.containsKey("China");
 boolean isIndia = hm.containsKey("India");
 boolean isBhutan = hm.containsKey("Bhutan");


 System.out.println(isChina); // true
 System.out.println(isIndia); // true
 System.out.println(isBhutan); // false

 // keyset() : returns all key from HashMap
//  HashSet<String> keys = hm.keySet();
 for(String key : hm.keySet()){
    System.out.println(key);
 }
/* outout =>
 * USA
 * China
 * India
 */


 // size =>

 System.out.println(hm.size()); // 3
    }
}