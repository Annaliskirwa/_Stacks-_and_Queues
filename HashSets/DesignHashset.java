/**
 * Design a HashSet without using any built-in hash table libraries.

Implement MyHashSet class:

void add(key) Inserts the value key into the HashSet.
bool contains(key) Returns whether the value key exists in the HashSet or not.
void remove(key) Removes the value key in the HashSet. If key does not exist in the HashSet, do nothing.
 
 * 
 */


 // First simple implementation, time complexity of O(1)
// Space complexity O(N)
/**
 *  Simple implementaion using arrays
 * 1. Create a boolean array
 * 2. Adding a number n sets arr[n] to true
 * 3. Removing a number sets arr[n] to false
 * 4. Contains a number is returning arr[n]
 *  */ 

class MyHashSet {

    boolean[] arr;
    public MyHashSet() {
        arr = new boolean[1000001];
        
    }
    
    public void add(int key) {
        arr[key] = true;
        
    }
    
    public void remove(int key) {
        arr[key] = false;
        
    }
    
    public boolean contains(int key) {
        return arr[key];
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */



//  Second implementation of hashset
// Better space, time can be looked into using rehashing techs
class MyHashSet {
    private final int MAX_VALUE  = 1000000;
    private final int ARRAY_SIZE = 100;
//     List of the linked lists
    private List<List<Integer>> parentList;

    public MyHashSet() {
        parentList = new ArrayList<>(ARRAY_SIZE);
        for (int i = 0; i < ARRAY_SIZE; i++){
//             initiliaze the array list with a bunch of nulls
            parentList.add(null);
        }
    }
    
    public void add(int key) {
//         modulo to map to one of the buckets
        int index = key % ARRAY_SIZE;
//         get the child list of the bucket where the key will go
        List<Integer> childList = parentList.get(index);
        if (childList == null){
            // if no one is in the list before, create a new linked list
            List<Integer> list =  new LinkedList<>();
            list.add(key);
            parentList.set(index, list);
        }
        else{
//             add only if the is not there 
            if (!childList.contains(key)){
                childList.add(key);
            }
        }
    }
    
    public void remove(int key) {
//         find the bucket
        int index = key % ARRAY_SIZE;
        List<Integer> childList = parentList.get(index);
        if (childList != null){
//             removing the key from the list, removing the object
            childList.remove(Integer.valueOf(key));
        }
    }
    
    public boolean contains(int key) {
//         find the bucket
        int index = key % ARRAY_SIZE;
        List<Integer> childList = parentList.get(index);
        return childList != null && childList.contains(key);
    }
}

/**
Time and space depends on the table size, no of buckets, range of inputs
Load factor and rehashing
time:rehashing


*/

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */


