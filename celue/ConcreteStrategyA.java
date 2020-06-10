package celue;

//ConcreteStrategy封装了具体的算法或行为，继承于Strategy
public class ConcreteStrategyA implements Strategy
{
	public void algorithmInterface()
	{
		System.out.println("算法A实现");
	}
}
