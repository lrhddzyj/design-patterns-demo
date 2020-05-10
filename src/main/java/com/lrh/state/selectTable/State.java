package com.lrh.state.selectTable;

/**
 * @description:
 * @author: lrh
 * @date: 2020/5/10 14:50
 */
public enum State {
	STATE_1(0),
	STATE_2(1),
	STATE_3(2);

	private int row;

	State(int row) {
		this.row = row;

	}

	public int getRow() {
		return row;
	}
}


