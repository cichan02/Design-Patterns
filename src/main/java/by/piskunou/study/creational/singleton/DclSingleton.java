package by.piskunou.study.creational.singleton;

//
// Danger!  This implementation of Singleton not
// guaranteed to work prior to Java 5
//

public class DclSingleton {
	private volatile static DclSingleton uniqueInstance;
 
	private DclSingleton() {}
 
	public static DclSingleton getInstance() {
		if (uniqueInstance == null) {
			synchronized (DclSingleton.class) {
				if (uniqueInstance == null) {
					uniqueInstance = new DclSingleton();
				}
			}
		}
		return uniqueInstance;
	}
}
