package com.silalahi.valentinus.advanced.callcenter;

public class Call {
	/*// min rank of employee who can handle this call
	private Rank rank;

	// person who is calling
	private Caller caller;

	// Employee whi is handler calling
	private Employee handler;

	public Call(Caller c) {
		rank = Rank.Responder;
		caller = c;
	}

	// set employee who is handling call.
	public void setHandler(Employee e) {
		handler = e;
	}

	public void replay(String message) {

	}

	public Rank getRank() {
		return rank;
	}

	public void setRank(Rank r) {
		rank = r;
	}

	public void incrementRank() {

	}

	public void disconnect() {

	}*/
	
	int rank = 0; // minimal rank of employee who can handle this call

	public void reply(String message) {
	}

	public void disconnect() {
	}
}
