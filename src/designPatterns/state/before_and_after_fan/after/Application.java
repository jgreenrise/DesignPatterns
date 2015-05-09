package designPatterns.state.before_and_after_fan.after;

/*-
 * Starting fan
 Switcing from medium speed - high speed
 Switcing from high speed - off
 Starting fan
 Switcing from medium speed - high speed
 *
 */
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CeilingFanPullChain chain = new CeilingFanPullChain();
		chain.pull();
		chain.pull();
		chain.pull();
		chain.pull();
		chain.pull();
	}

}
