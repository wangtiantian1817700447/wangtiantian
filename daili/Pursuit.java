package daili;

//追求者类
public class Pursuit implements GiveGift
{
	SchoolGirl	mm;

	public Pursuit(SchoolGirl mm)
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

/*
//追求者类
public class Pursuit
{
	SchoolGirl	mm;

	public Pursuit(SchoolGirl mm)
	{
		this.mm = mm;
	}

	public void giveDolls()
	{
		System.out.println(mm.name + " 送你项链");
	}

	public void giveFlowers()
	{
		System.out.println(mm.name + " 送你鲜花");
	}

	public void giveChocolate()
	{
		System.out.println(mm.name + " 送你水果");
	}
}
*/
