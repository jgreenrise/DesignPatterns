package designPatterns.state.before_and_after_fan.after;

public class HighSpeed implements State {

	@Override
	public void pull(CeilingFanPullChain wrapper) {
		System.out.println("Switcing from high speed - off");
		wrapper.setState(new Off());
	}

}
