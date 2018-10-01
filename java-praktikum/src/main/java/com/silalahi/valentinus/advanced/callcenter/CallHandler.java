package com.silalahi.valentinus.advanced.callcenter;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class CallHandler {
	/*private static CallHandler instance;

	// 3 levels of employees: respondents, managers, directors
	private final int LEVELS = 3;

	// initialize 10 respondents, 4 managers and 2 directors
	private final int NUM_RESPONDENTS = 10;
	private final int NUM_MANAGERS = 4;
	private final int NUM_DIRECTORS = 2;

	
	 * lists of employees, by level employeeLevels[0] = respondents;
	 * employeeLevels[1] = managers; employeeLevels[2] = directors;
	 

	List<List<Employee>> employeeLevels;

	// queues for each call's rank
	List<List<Call>> callQueues;

	protected CallHandler() {

	}

	// get instance of singleton class
	public static CallHandler getInstance() {
		if (instance == null)
			instance = new CallHandler();
		return instance;
	}

	// get the first available employee who can handle this call
	public Employee getHandlerForCall(Call call) {
		for(int level = call.getRank(); level<LEVELS -1; level++){
			ArrayList<Employee> employeeLevel= employeeLevels[level];
			for(Employee emp : employeeLevel) {
				if(emp.isFree()) {
					return emp;
				}
			}
		}
		return null;
	}

	public Employee getCallHandler(Call call) {
		for (int level = call.rank; level < LEVELS - 1; level++) {
			ArrayList<Employee> employeeLevel = employeeLevels[level];
			for (Employee emp : employeeLevel) {
				if (emp.free) {
					return emp;
				}
			}
		}
		return null;
	}

	// routes the Call to an available employee, or saves in a queue if not employee
	// available
	public void dispatchCall(Caller caller) {
		Call call = new Call(caller);
		dispatchCall(call);
	}

	// routes the call to an available employee, or saves in a queue if no employee
	// available
	public void dispatchCall(Call call) {
		// try route the call to an employee with minimal rank
		Employee emp = getHandleForCall(call);
		if (emp != null) {
			emp.receiveCall(call);
			call.setHandler(emp);
		} else {
			// place the call into corresponding call queue according to its rank
			call.reply("Please wait for free employeeto reply");
			callQueues.get(call.getRank().getValue().add(call));
		}
	}

	// an employee got free. Look for a waiting call that emp. can serve. Return
	// true if we assigned a call, false otherwise
	public boolean assignCall(Employee emp) {

	}*/
	
	static final int LEVELS = 3; // we have 3 levels of employees
	static final int NUM_FRESHERS = 5; // we have 5 freshers
	ArrayList<Employee>[] employeeLevels = new ArrayList[LEVELS];
	// queues for each call’s rank
	Queue<Call>[] callQueues = new LinkedList[LEVELS];

	public CallHandler() {
	}

	Employee getCallHandler(Call call) {
		for (int level = call.rank; level < LEVELS - 1; level++) {
			ArrayList<Employee> employeeLevel = employeeLevels[level];
			for (Employee emp : employeeLevel) {
				if (emp.free) {
					return emp;
				}
			}
		}
		return null;
	}

	// routes the call to an available employee, or adds to a queue
	void dispatchCall(Call call) {
		// try to route the call to an employee with minimal rank
		Employee emp = getCallHandler(call);
		if (emp != null) {
			emp.ReceiveCall(call);
		} else {
			// place the call into queue according to its rank
			callQueues[call.rank].add(call);
		}
	}

	void getNextCall(Employee e) {
	} // look for call for e’s rank
}
