package zhuangshi;

//服饰类（Decorator）
public class Finery extends Person
{
	protected Person	component;

	public void decorate(Person component)
	{
		this.component = component;
	}

	public void show()
	{
		if (null != component)
		{
			component.show();
		}
	}
}

/*
//服饰抽象类
public interface Finery
{
	public void show();
}
*/