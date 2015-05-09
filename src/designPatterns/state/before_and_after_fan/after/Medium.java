package designPatterns.state.before_and_after_fan.after;

public class Medium implements State {

	@Override
	public void pull(CeilingFanPullChain wrapper) {
		System.out.println("Switcing from medium speed - high speed");
		wrapper.setState(new HighSpeed());
	}

}
