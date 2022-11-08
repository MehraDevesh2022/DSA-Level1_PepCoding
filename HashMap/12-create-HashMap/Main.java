/*
 * Write Hashmap
Easy  Prev   Next
1. You are required to complete the code of our Hashmap class. Please watch the question video carefully. The theoretical details of required functionality is explained in detail there. Implement the functions to achieve what is explained in the theoretical discussion in question video.
2. Input and Output is managed for you.
Input Format
Input is managed for you
Output Format
Output is managed for you
Question Video

  COMMENTConstraints
None
Sample Input
put India 135
put Aus 5
put Canada 3
display
get China
remove Aus
get Aus
containsKey US
put US 10
put UK 20
remove US
containsKey US
put Pak 80
put China 200
display
put Utopia 0
display
put Nigeria 3
display
put India 138
display
put Sweden 1
display
put finland 20
display
quit
Sample Output
Display Begins
Bucket0 .
Bucket1 .
Bucket2 Canada@3 .
Bucket3 India@135 Aus@5 .
Display Ends
null
5
null
false
10
false
Display Begins
Bucket0 .
Bucket1 .
Bucket2 Canada@3 UK@20 Pak@80 .
Bucket3 India@135 China@200 .
Display Ends
Display Begins
Bucket0 Utopia@0 .
Bucket1 .
Bucket2 Canada@3 UK@20 Pak@80 .
Bucket3 India@135 China@200 .
Display Ends
Display Begins
Bucket0 Utopia@0 .
Bucket1 .
Bucket2 Canada@3 UK@20 Pak@80 .
Bucket3 India@135 China@200 Nigeria@3 .
Display Ends
Display Begins
Bucket0 Utopia@0 .
Bucket1 .
Bucket2 Canada@3 UK@20 Pak@80 .
Bucket3 India@138 China@200 Nigeria@3 .
Display Ends
Display Begins
Bucket0 Utopia@0 Sweden@1 .
Bucket1 .
Bucket2 Canada@3 UK@20 Pak@80 .
Bucket3 India@138 China@200 Nigeria@3 .
Display Ends
Display Begins
Bucket0 Utopia@0 .
Bucket1 .
Bucket2 Pak@80 finland@20 .
Bucket3 .
Bucket4 Sweden@1 .
Bucket5 .
Bucket6 Canada@3 UK@20 .
Bucket7 India@138 China@200 Nigeria@3 .
Display Ends

 */


import java.io.*;
import java.util.*;

public class Main {

    public static class HashMap<K, V> {
        private class HMNode {
            K key; // generic type data means either it will charcter || integer so java this is
                   // java feature
            V value; // key and value both are hashmap key and value there data type could be any
                     // thing : Inetger , Character like when we made hashmap we saw before at time
                     // of hashmap declaration

            HMNode(K key, V value) {
                this.key = key;
                this.value = value;
            }
        }

        private int size; // n
        // here this is LinkedList type buckets array and inside each buckets(array idx) we have LinkdList type data stored and each LinkedList data value is Hashmap type(stored key and value) in data section of linked list another part stored next nodes address as useal
        private LinkedList<HMNode>[] buckets; // N = buckets.length

        public HashMap() {
            initbuckets(4); // 4 is buckets size N=4 call initbuckets function
            size = 0; // this size refer the value of each bukcet(mean each idx value in 4 size array )
        }

        private void initbuckets(int N) {
            buckets = new LinkedList[N]; // asigning buckets array memory with N =4 as given size
            for (int bi = 0; bi < buckets.length; bi++) {
                buckets[bi] = new LinkedList<>(); // adding LinkedList in each buckets lenght could be anything (node will added further)
            }
        }

        private int findBucketIdx(K key) {
            int hc = key.hashCode(); //hash code java ka function hao jo random number return krta hai -infi to +infi
            int bi = Math.abs(hc) % buckets.length; // Math.abs negative number ko + main change kr dega or Bucket ki range tak ka idx %  se aa jayega
            return bi;
        }

        private int findDataIndexInBucket(K key , int bi){
            LinkedList<HMNode> tmp = buckets[bi];  // tmp is refernce of given bi LinkedList
            for(int i=0; i<tmp.size(); i++){
                HMNode curr = tmp.get(i);
                if(key.equals(curr.key)){
                    return i;
                }
             }
            return -1; // agar idx key match nhi hoti to mtlv node nhi hai buckets  
        }

        private void rehashing() throws Exception{
            LinkedList<HMNode> [] prvBuckets  = buckets; // refernec of prv bucet
            initbuckets(2 * prvBuckets.length); // ab prvBuckets ki  size ka 2 time ka new array bna do(buckets naam se)
            size =0; // new buckets ka data (linkdeList) ka size 0

              for(int bi=0; bi<prvBuckets.length; bi++){
                for(int  p=0; p<prvBuckets[bi].size(); p++){
                      HMNode currNode = prvBuckets[bi].get(p);
                      // now put data in new size bucketes from prvBuckets  
                      put(currNode.key , currNode.value);
                }
            }
        }

        public void put(K key, V value) throws Exception {
            // write your code here
            // in hash map put has two operation occures 1 if elm available then update else insert
            // here firts we found bi(bucket idx(array idx)) and di(data index(linked list
            // node in bucket idx))
            // if di is -1 thats min no node available with given key in bucket now insert
            // elm to bucket
            // if di idx not -1 then update buckcet
            int bi = findBucketIdx(key);
            int di = findDataIndexInBucket(key, bi);
            if (di == -1) {
                // insert
            LinkedList<HMNode> tmp = buckets[bi]; // tmp is refrence for buckets[bi] data idx(linked list ) like
                                                      // head
                // make new HMNode with given key and value
             HMNode node = new HMNode(key, value);
                // now add linked list node into buckets
                tmp.add(node);
                size++;
            } else {
                // update
                LinkedList<HMNode> tmp = buckets[bi];
                // now get node using data idx (idx of that bucekts linkedlist)
                HMNode node = tmp.get(di);
                // update new value on that node
                node.value = value;
            }

            // all operation complete with in lmbda time
            double lmbda = (size * 1.0) / buckets.length; // size is all nodes in array (buckets)
            if (lmbda > 2) { // 2 thresh hold hai or lambda se bda hona chaiye q ki put ki compelexity O(lambda) honi chahiye
                rehashing(); // agr lamda ka size 2 se bda aata hai to mange krne ke liye bucket ka size bda do

            }

        }

        public V get(K key) throws Exception {
            // write your code here
            int bi = findBucketIdx(key);
            int di = findDataIndexInBucket(key, bi);
            if(di ==-1){
                // agar node hi nhi hai to
                return null;
            }
            else{
                LinkedList<HMNode> tmp = buckets[bi];
                HMNode curr = tmp.get(di);
                return curr.value;
            }
        }

        public boolean containsKey(K key) {
            // write your code here
            int bi = findBucketIdx(key);
            int di = findDataIndexInBucket(key, bi);
            if(di ==-1){

                // agar given key se data idx na mile to key contains false
                return false;

            }
            else{
                // agar given key se data idx milta hai to keyContains true
                return true;
            }
        }

        public V remove(K key) throws Exception {
            // write your code here

            int bi = findBucketIdx(key);
            int di = findDataIndexInBucket(key, bi);
            if(di ==-1){
                // jab key persent na ho
                return null;
            }else{
                LinkedList<HMNode> tmp = buckets[bi];
                HMNode curr = tmp.get(di);
                V val = curr.value;
                // remove kr do di idx ka node
                tmp.remove(di);
                size--; // bcz given Key HMN node removed from linked list from bucket idx
            // hashmap ka rmv method value bhi return krta hai given key ka remove krke
            return val;
            }
        }

        public ArrayList<K> keyset() throws Exception {
            // write your code here
            // bucekts main se sbhi data idx ki key return kr do
            ArrayList<K> keyList = new ArrayList<K>();
            for(int bi = 0; bi<buckets.length; bi++){
                for(int p=0; p<buckets[bi].size(); p++){
                    HMNode currNode = buckets[bi].get(p);
                    // sari key sbhi node ki add kr do array list mai
                    keyList.add(currNode.key);
                }

            }
            // puri key list retrun kr do
            return keyList;
        }

        public int size() {
            // write your code here
            return this.size; // ye size buckets main sbhi linkedlist node ka hai
        }

        public void display() {
            System.out.println("Display Begins");
            for (int bi = 0; bi < buckets.length; bi++) {
                System.out.print("Bucket" + bi + " ");
                for (HMNode node : buckets[bi]) {
                    System.out.print(node.key + "@" + node.value + " ");
                }
                System.out.println(".");
            }
            System.out.println("Display Ends");
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, Integer> map = new HashMap();

        String str = br.readLine();
        while (str.equals("quit") == false) {
            if (str.startsWith("put")) {
                String[] parts = str.split(" ");
                String key = parts[1];
                Integer val = Integer.parseInt(parts[2]);
                map.put(key, val);
            } else if (str.startsWith("get")) {
                String[] parts = str.split(" ");
                String key = parts[1];
                System.out.println(map.get(key));
            } else if (str.startsWith("containsKey")) {
                String[] parts = str.split(" ");
                String key = parts[1];
                System.out.println(map.containsKey(key));
            } else if (str.startsWith("remove")) {
                String[] parts = str.split(" ");
                String key = parts[1];
                System.out.println(map.remove(key));
            } else if (str.startsWith("size")) {
                System.out.println(map.size());
            } else if (str.startsWith("keyset")) {
                System.out.println(map.keyset());
            } else if (str.startsWith("display")) {
                map.display();
            }
            str = br.readLine();
        }
    }
}