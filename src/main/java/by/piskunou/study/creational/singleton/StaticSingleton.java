package by.piskunou.study.creational.singleton;

public class StaticSingleton {
	private static final StaticSingleton uniqueInstance = new StaticSingleton();
 
	private StaticSingleton() {}
 
	public static StaticSingleton getInstance() {
		return uniqueInstance;
	}
	
	// other useful methods here
	public String getDescription() {
		return "I'm a statically initialized Singleton!";
	}
}
