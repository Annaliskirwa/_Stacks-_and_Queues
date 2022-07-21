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


