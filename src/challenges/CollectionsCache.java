package challenges;

import java.util.*;

// This is a homework problem in a Java Collections Udemy Course

public class CollectionsCache {
	
	public static void main(String[] args) {
		useCache();
	}

    public static Cache useCache() {
        Cache cache = new Cache();
		
		cache.search("www.facebook.com");
		cache.search("www.google.com");
		cache.search("www.amazon.com");
		cache.search("www.google.com");
		cache.search("www.facebook.com");
		cache.search("www.twitter.com");
		cache.search("www.globalsoftwaresuppot.com");
		cache.search("www.bbc.com");
		cache.search("www.cnn.com");
		cache.search("www.google.com");
		cache.search("www.amazon.com");
		cache.search("www.google.com");
		cache.search("www.facebook.com");
		
		// the cache remembers the recently visited URLs (in this case: facebook, google, amazon, cnn, bbc - 5 because the capacity of the cache is 5)
		
		
		cache.showCache();
		
		// I need it to be able to test wether your implmenetation works fine
		return cache;
    }
}

class Pair {

    // let's store the URL and a data associated with the URL (for example the content of the website)
    // we store these Pair objects in the cache
    // YOUR IMPLEMENTATION HERE !!!
    String url;
    String data;
    
    public Pair(String url, String websiteData) {
        this.url = url;
        this.data = websiteData;
    }
    
    @Override
    public String toString() {
        return url;
    }
}

class Cache {
	
	// we can store up to 5 items in the cache
	private static final int CAPACITY = 5;
    // let's use a list to store the items (URLs)
	private List<Pair> cache;
	
	// YOUR IMPLEMENTATION HERE !!!
	public Cache() {
	    cache = new LinkedList<>();
	}
	
	public void search(String url) {
		for (Pair pair : cache) {
			if (pair.url.equals(url)) return;
		}

		Pair newData = new Pair(url, "Some data");	   
	    if (cache.size() == CAPACITY) {
	    	cache.remove(0);
	    	cache.add(newData);	    	
	    } else {
	    	cache.add(newData);
	    }
	}
	
	// I need it to test your implementation
	public List<Pair> getCache() {
	    return this.cache;
	}
	
	public void showCache() {
		for(Pair pair : cache) {
			System.out.println(pair);			
		}
	}
}
