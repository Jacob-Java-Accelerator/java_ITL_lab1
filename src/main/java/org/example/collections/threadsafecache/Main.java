package org.example.collections.threadsafecache;

public class Main {

	public static void main(String[] args) {
		Cache cache = new Cache();
		cache.add("Hello");
		cache.add("World");
		cache.print();
	}
}
