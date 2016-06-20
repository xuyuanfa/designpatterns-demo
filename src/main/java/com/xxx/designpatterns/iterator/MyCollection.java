package com.xxx.designpatterns.iterator;

/**
 * 迭代器模式
 * 
 * @author Douglas.Hsu
 *
 */
public class MyCollection implements Collection {
	public String string[] = { "A", "B", "C", "D", "E" };

	public Iterator iterator() {
		return new MyIterator(this);
	}

	public Object get(int i) {
		return string[i];
	}

	public int size() {
		return string.length;
	}
	
    public static void main(String[] args) {
        Collection collection = new MyCollection();
        Iterator it = collection.iterator();
        
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}