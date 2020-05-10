package com.lrh.state.selectTable;

import static com.lrh.state.selectTable.State.*;

/**
 * @description:
 * @author: lrh
 * @date: 2020/5/10 14:54
 */
public class TransitionTable {

/**
	-------------------------------------------------------------------------------
	| 		  |        EVENT_A      |          EVENT_B      |       EVENT_C       |
	-------------------------------------------------------------------------------
	| STATE_1 |   STATE_2 & ACTION  |   STATE_1 & ACTION    |   STATE_1 & ACTION  |
 	-------------------------------------------------------------------------------
	| STATE_2 |   STATE_2 & ACTION  |   STATE_3 & ACTION    |   STATE_2 & ACTION  |
 	-------------------------------------------------------------------------------
 	| STATE_3 |   STATE_3 & ACTION  |   STATE_3 & ACTION    |   STATE_2 & ACTION  |
 	-------------------------------------------------------------------------------
 */

	/**
	 *去掉表头后的状态结果数据
	 */
	private static final State[][] eventState = {
			{STATE_2,STATE_1,STATE_1},
			{STATE_2,STATE_3,STATE_3},
			{STATE_3,STATE_3,STATE_2}
	};

	private static final String[][] eventAction = {
			{"处理事件A","不处理","不处理"},
			{"不处理","处理事件B","不处理"},
			{"不处理","不处理","处理事件C"}
	};

	public static final State getStateWithAfterEvent(State curState, Event event) {
		int row = curState.getRow();
		int col = event.getCol();
		State state = eventState[row][col];
		return state;
	}

	public static final String getActionWithAfterEvent(State curState, Event event) {
		int row = curState.getRow();
		int col = event.getCol();
		String action = eventAction[row][col];
		return action;
	}


}
