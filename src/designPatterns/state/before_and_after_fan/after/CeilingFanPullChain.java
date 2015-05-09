package designPatterns.state.before_and_after_fan.after;

public class CeilingFanPullChain {

	private State state;
	
	public CeilingFanPullChain(){
		state = new Off();
	}

	public void setState(State state) {
		this.state = state;
	}
	
	public void pull(){
		state.pull(this);
	}
	
	
}
	
