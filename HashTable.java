import java.util.ArrayList;
import java.util.Iterator;

public class HashTable {
	public class Entry{
		public Entry(Object key, Object value){
			this.Key = key;
			this.Value = value;
		}
		public Object Key;
		public Object Value;
	}
	
	protected int capacity;
	private ArrayList<Entry>[]  table; //implement hashtable as array of ArrayList, handle collision with a ArrayList

	public HashTable(){
		this(65536);//default to be 2^8
	}
	
	public HashTable(int cap){
		capacity = cap;
		table = new ArrayList[cap];
	}
	
	public void put(Object key, Object value){
		int hashcode = Math.abs(key.hashCode()) % capacity; //limit the in index maxim to capacity
		ArrayList<Entry> al;
		if(table[hashcode] == null){
			al = new ArrayList<Entry>();
		}else{
			al = table[hashcode];
		}
		al.add(new Entry(key,value));
		table[hashcode]=al;
	};
	
	public Object get(Object key){
		int hashcode = Math.abs(key.hashCode()) % capacity;
		ArrayList<Entry> al;
		if(table[hashcode] == null){
			return null;
		}else{
			al = table[hashcode];
		};
	
		for(Entry e:al) {
			if(e.Key.equals(key))return e.Value;
		};
		return null;
	}

	public void remove(Object key){
		int hashcode = Math.abs(key.hashCode()) % capacity;
		ArrayList<Entry> al;
		if(table[hashcode] == null){
			return;
		}else{
			al = table[hashcode];
		};
		Iterator<Entry> it = al.iterator();
		while(it.hasNext()) {
			if(it.next().Key.equals(key)) 
				it.remove();
		};
		
	};

}
