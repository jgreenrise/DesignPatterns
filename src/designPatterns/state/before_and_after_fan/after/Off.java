package designPatterns.state.before_and_after_fan.after;

public class Off implements State {

	@Override
	public void pull(CeilingFanPullChain wrapper) {
		System.out.println("Starting fan");
		wrapper.setState(new Medium());
	}

}
