package by.piskunou.study.creational.singleton.subclass;

public class ParentSingleton {
	protected static ParentSingleton uniqueInstance;
 
	// other useful instance variables here
 
	protected ParentSingleton() {}
 
	public static synchronized ParentSingleton getInstance() {
		if (uniqueInstance == null) {
			uniqueInstance = new ParentSingleton();
		}
		return uniqueInstance;
	}
 
	// other useful methods here
}
