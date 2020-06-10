package guanchazhe;


public class NBAObserver extends Observer
{
	public NBAObserver(String name, Subject sub)
	{
		super(name, sub);
	}

	public void update()
	{
		System.out.println(sub.getAction() + "	" + name + "关闭NBA直播，继续工作！");
	}
}

/*
public class NBAObserver extends Observer
{
	public NBAObserver(String name, Secretary sub)
	{
		super(name, sub);
	}

	public void update()
	{
		System.out.println(sub.getAction() + "	" + name + "关闭NBA直播，继续工作！");
	}
}
*/