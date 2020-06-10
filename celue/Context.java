package celue;

//Context用一个ConcreteStrategy来配置，维护一个对Strategy对象的引用
public class Context
{
	private Strategy	strategy;

	public Context(Strategy strategy)
	{
		this.strategy = strategy;
	}

	public void contextInterface()
	{
		strategy.algorithmInterface();
	}
}

