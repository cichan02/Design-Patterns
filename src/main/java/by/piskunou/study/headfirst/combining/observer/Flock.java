package by.piskunou.study.headfirst.combining.observer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Flock implements Quackable {
	List<Quackable> ducks = new ArrayList<Quackable>();
  
	public void add(Quackable duck) {
		ducks.add(duck);
	}
  
	public void quack() {
		Iterator<Quackable> iterator = ducks.iterator();
		while (iterator.hasNext()) {
			Quackable duck = (Quackable)iterator.next();
			duck.quack();
		}
	}

	@Override
	public void registerObserver(Observer observer) {
		Iterator<Quackable> iterator = ducks.iterator();
		while (iterator.hasNext()) {
			Quackable duck = (Quackable)iterator.next();
			duck.registerObserver(observer);
		}
	}

	public void notifyObservers() { }
  
	public String toString() {
		return "Flock of Ducks";
	}
}
