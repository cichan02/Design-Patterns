package by.piskunou.study.creational.singleton;

//Real singleton, even for Java Reflection
public enum EnumSingleton {
	UNIQUE_INSTANCE;
 
	// other useful fields here

	// other useful methods here
	public String getDescription() {
		return "I'm a thread safe Singleton!";
	}
}
