package com.lrh.state.selectTable;

/**
 * @description:
 * @author: lrh
 * @date: 2020/5/10 14:51
 */
public enum Event {
	EVENT_A(0),
	EVENT_B(1),
	EVENT_C(2);

	private int col;

	Event(int col) {
		this.col = col;
	}

	public int getCol() {
		return col;
	}
}
