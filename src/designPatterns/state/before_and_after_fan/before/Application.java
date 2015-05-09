package designPatterns.state.before_and_after_fan.before;

/*- 
 low speed
 medium speed
 high speed
 turning off
 low speed
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
