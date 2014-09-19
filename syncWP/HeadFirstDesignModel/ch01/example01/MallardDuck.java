package example01;

public class MallardDuck extends Duck{
	
	public MallardDuck()
	{
		quackBehavior=new Quack();
		flyBehavior=new FlyWithWings();
	}
	
	public void display(){
		System.out.println("I'm a real Mallard duck!");
	}
	
	public static void main(String args[])
	{
		Duck mallard=new MallardDuck();
		mallard.performQuack();
		mallard.performFly();
		mallard.display();
		mallard.swim();
	}
}
