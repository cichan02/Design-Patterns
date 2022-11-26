package structural.adapter;

import java.util.Iterator;
import java.util.List;

import structural.adapter.models.Duck;
import structural.adapter.models.MallardDuck;
import structural.adapter.models.Turkey;
import structural.adapter.models.WildTurkey;
import structural.adapter.util.IteratorAdapter;
import structural.adapter.util.TurkeyAdapter;

public class AdapterMain {
	public static void main(String[] args) {
		Duck mallarDuck = new MallardDuck();
		
		Turkey wildTurkey = new WildTurkey();
		Duck turkeyAdapter = new TurkeyAdapter(wildTurkey);
		
		System.out.println("The Turkey says...");
		testTurkey(wildTurkey);
		
		System.out.println("\nThe Duck says...");
		testDuck(mallarDuck);
		
		System.out.println("\nThe TurkeyAdapter says...");
		testDuck(turkeyAdapter);
		
		List<String> list = List.of("Tom", "Mary", "Bob");
		
		Iterator<String> iterator = list.iterator();
		IteratorAdapter<String> iteratorAdapter = new IteratorAdapter<>(iterator);
		while(iteratorAdapter.hasMoreElements()) {
			System.out.println(iteratorAdapter.nextElement());
		}
	}
	
	private static void testTurkey(Turkey turkey) {
		turkey.gobble();
		turkey.fly();
	}
	
	private static void testDuck(Duck duck) {
		duck.quack();
		duck.fly();
	}
}
