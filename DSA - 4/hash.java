
import java.util.Hashtable;

public class hash {
    public static void main(String[] args) {

        int size = 10; // size of the hashtable
        Hashtable<Integer,String> table = new Hashtable<>(size);

        table.put(100,"Spongebob");
        table.put(123,"Patrick");
        table.put(321,"Sandy");
        table.put(555,"Squidward");
        table.put(777,"Gary");

        //table.remove(555); // to remove the key
        for (Integer Key :
                table.keySet()) {
            System.out.println(Key.hashCode()%10+ "  "+Key +"  "+  table.get(Key));
        }
    }
}
/*
Hashtable = A data structure that stores unique keys to values ex. <Integer, String>
            Each Key/value pair is known as an Entry
            Fast insertion, look up , deletion of key/value pairs
            Not ideal for small data sets , great with large data sets

Hashing = takes a key and computes an integer (formula will vary base on key & data type)
          In a Hashtable , we use the hash % capacity to calculate an index number.

          key.hashcode() % capacity = index

Bucket = Each index also known as bucket. an indexed storage location for one or more Entries
        can store multiple Entries in case of collision (linked similarly a Linkedlist)

Collision = Hash function generates the same index for more than one key
            less collisions = more efficiency

Runtime complexity = Best Case O(1)
                     Worst Case O(n)
 */