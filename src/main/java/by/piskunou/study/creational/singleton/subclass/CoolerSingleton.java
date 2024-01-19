package by.piskunou.study.creational.singleton.subclass;

public class CoolerSingleton extends ParentSingleton {
	// useful instance variables here
	protected static ParentSingleton uniqueInstance;
 
	private CoolerSingleton() {
		super();
	}
 
	// useful methods here
}
