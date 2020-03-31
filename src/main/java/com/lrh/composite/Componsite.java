package com.lrh.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * 组合节点
 *
 */
public class Componsite extends Component {


	public Componsite() {
	}

	public Componsite(String name, Component parent) {
		super(name, parent);
	}

	private List<Component> componentList = new ArrayList();

	@Override
	public void doSomeThing() {
		System.out.printf("Type %s and name is %s \n", this.getClass().getName(), super.getName());
	}

	public Componsite add(Component component){
		this.componentList.add(component);
		return this;
	}

	public Componsite remove(Component component) {
		this.componentList.remove(component);
		return this;
	}

	public List<Component> getChild(){
		return this.componentList;
	}

}
