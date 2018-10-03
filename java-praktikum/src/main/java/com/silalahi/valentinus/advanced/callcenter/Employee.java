package com.silalahi.valentinus.advanced.callcenter;

/*
 * All three ranks of employees have different work to be done, 
 * so those specific functions are profile specific. 
 * We should keep these specific things within their respective class.
 * There are a few things which are common to them, like address, name, job title, age, etc.
 * These things can be kept in one class and can be extended / inherited by others.
 * 
 * Finally, there should be one CallHandler class which would route the calls to the concerned person.
 * 
 * NOTE: On any object oriented design question, there are many ways to design the objects. 
 * Discuss the trade-offs of different solutions with your interviewer.
 * You should usually design for long term code flexibility and maintenance.
*/

public abstract class Employee {
	/*private Call currentCall = null;
	protected Rank rank;

	public Employee() {
	}

	// start the conversation
	public void receiveCall(Call call) {

	}

	// the issue is resolved, finish the call
	public void callCompleted() {

	}

	// the issue has not been resolved. Escalate the call, and assign a new call to
	// the employee
	public void escalateAndReassign() {

	}

	// assign a new call to an employee, if the employee is a free.
	public boolean assignNewCall() {

	}

	// return whether or not the employee is free
	public boolean isFree() {
		return currentCall = null;
	}

	public Rank getRank() {
		return rank;
	}*/
	
	CallHandler callHandler;
	int rank; // 0- Respondent, 1 - Manager, 2 - Director
	boolean free;

	Employee(int rank) {
		this.rank = rank;
	}

	void ReceiveCall(Call call) {
	}

	void CallHandled(Call call) {
	} // call is complete

	void CannotHandle(Call call) { // escalate call

		call.rank = rank + 1;

		callHandler.dispatchCall(call);

		free = true;

		callHandler.getNextCall(this); // look for waiting call
	}
}


