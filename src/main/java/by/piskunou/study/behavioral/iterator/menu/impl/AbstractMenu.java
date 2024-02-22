package by.piskunou.study.behavioral.iterator.menu.impl;

import by.piskunou.study.behavioral.iterator.menu.Menu;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public abstract class AbstractMenu implements Menu {
    protected String name;
}
