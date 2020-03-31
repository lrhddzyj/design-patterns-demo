package com.lrh.composite;

/**
 * 叶子节点
 */
public class Leaf extends Component {

	public Leaf() {
	}

	public Leaf(String name, Component parent) {
		super(name, parent);
	}

	@Override
	public void doSomeThing() {
		System.out.printf("Type %s and name is %s \n", this.getClass().getName(), super.getName());
	}
}
