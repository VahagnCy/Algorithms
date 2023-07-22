package serviseTitan;

/*
The task is to unit test IMultiValueHashMap<K, V>

This interface allows to associate multiple unique value with a single key, for interface;
IMultiValueHashMap<Integer, String> dictionary = new IMultiValueHashMap<Integer, String>();
dictionary.Add(1, "value1");
dictionary.Add(1, "value2");
// At this point the dictionary contains one key <1> associated with two values <value1> & <value2>

At the bottom you"ll find 2 sample unit test methods, Write your test case?methods in the same manner.
Expect that you"ll be getting an EMPTY instance IMultiValueHashMap<int, string> as a parametre.

P.S.
Don"t hesitate to ask any question.
Feel free to use google to get basic programming help.
This is a dummy interface.
You will NOT be able to comile and run this code.
 */

import java.util.*;

/// <summary>
/// Defines interface to storing multiple unique values under a single keu
/// </summary>
/// <typeparam name="K">type of key</typeparam>
/// <typeparam name="V">type of value</typeparam>
public interface ImultiValueHashMap<K, V> {
    /// <summary>
    /// Adds a value to either existing key or creates a new key and adds the value to it
    /// </summary>
    /// <param name="Key">Key to add value to</typeparam>
    /// <param name="Value">Value to add</typeparam>
    /// <returns>true if the collection has changed: false otherwise</returns>
    boolean Add(K key, V value);

    /// <summary>
    /// return a sequence of value for the given key, throws KeyNotFoundException if the key is not found
    /// </summary>
    /// <param name="Key">Key to retrive the sequence of value for</typeparam>
    /// <returns>sequence of values for the given key</returns>
    ArrayList<V> Get(K key);

    /// <summary>
    /// return a sequence of value for the given key, return empty sequence if the key is not present
    /// </summary>
    /// <param name="Key">Key to retrive the sequence of value for</typeparam>
    /// <returns>sequence of values for the given key</returns>
    ArrayList<V> GetOrDefault(K key);

    /// <summary>
    /// Removes the value from the values associated with the given key. throws KeyNotFoundException if the key not present
    /// </summary>
    /// <param name="Key">key which values need to be adjusted</param>
    /// <param name="Value">value to remove from the values for the given key</param>
    void remove(K key, V value);

    /// <summary>
    /// Removes the given key from the dictionary with all the values associated with it
    /// </summary>
    /// <param name="Key"></param>
    void Clear(K key);

}

public class ServiceTitanProgram {
    static void Main(string[] args) {

    }
    public void Assert(boolean result) {
        if (!result)
            throw new exception();
    }

    //this is a sample test case for Add method
    public void Add_NewKeyNewValue_True(ImultiValueHashMap<Integer, String>, dictionary){

        boolean result = dictionary.Add(1, "some value");
        Assert(result == true);
    }

    //this is a another sample sample test case for Add method
    public void Add_SameKeySameValue_False(ImultiValueHashMap<Integer, String>, dictionary) {
        dictionary.Add(1, "some value");
        boolean result = dictionary.Add(1, "some value");
        Assert(result == false);
    }

    //Write your unit test methods in space below
}
