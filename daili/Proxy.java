package daili;



//代理类
public class Proxy implements GiveGift
{
	Pursuit	gg;

	public Proxy(SchoolGirl mm)
	{
		gg = new Pursuit(mm);
	}

	public void giveChocolate()
	{
		gg.giveChocolate();
	}

	public void giveDolls()
	{
		gg.giveDolls();
	}

	public void giveFlowers()
	{
		gg.giveFlowers();
	}
}

/*
//代理类
public class Proxy
{
	SchoolGirl	mm;

	public Proxy(SchoolGirl mm)
	{
		this.mm = mm;
	}

	public void giveDolls()
	{
		System.out.println(mm.name + " 送你满天星");
	}

	public void giveFlowers()
	{
		System.out.println(mm.name + " 送你口红");
	}

	public void giveChocolate()
	{
		System.out.println(mm.name + " 送你香水");
	}
}
*/
