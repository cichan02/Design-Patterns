package by.piskunou.study.structural.adapter;

import java.util.Iterator;
import java.util.List;

import by.piskunou.study.Main;
import by.piskunou.study.structural.adapter.models.MallardDuck;
import by.piskunou.study.structural.adapter.models.Turkey;
import by.piskunou.study.structural.adapter.models.WildTurkey;
import by.piskunou.study.structural.adapter.util.TurkeyAdapter;
import by.piskunou.study.structural.adapter.models.Duck;
import by.piskunou.study.structural.adapter.util.IteratorAdapter;
import org.jetbrains.annotations.NotNull;

public class AdapterMain implements Main {
	private static void testTurkey(@NotNull Turkey turkey) {
		turkey.gobble();
		turkey.fly();
	}
	
	private static void testDuck(@NotNull Duck duck) {
		duck.quack();
		duck.fly();
	}

	@Override
	public void start() {
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
}