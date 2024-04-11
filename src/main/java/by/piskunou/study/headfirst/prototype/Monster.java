package by.piskunou.study.headfirst.prototype;

import lombok.Setter;

public abstract class Monster implements Cloneable {
	boolean eatsChildren = true;
	boolean hasWings = false;
	int numHeads = 1;
	boolean canBreatheFire = false;
	@Setter
    String name;
	public Monster(String name) {
		this.name = name;
	}
	public void spitPoison() { } // default is do nothing

    public abstract Monster copy() throws CloneNotSupportedException;
	
	public String toString() {
		StringBuffer s = new StringBuffer("I'm a monster named " + this.name + " with " + this.numHeads + " head(s). ");
		if (this.canBreatheFire) { s.append("I can breathe fire. "); }
		if (this.eatsChildren) { s.append("I eat children. "); }
		if (this.hasWings) { s.append("I have wings. "); }
		return s.toString();
	}

    @Override
    public Monster clone() {
        try {
            // TODO: copy mutable state here, so the clone can't change the internals of the original
            return (Monster) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}