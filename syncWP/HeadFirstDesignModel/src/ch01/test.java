package ch01;

import example01.Duck;
import example01.FlyRocketPowerd;
import example01.ModelDuck;

public class test {
	public static void main(String args[])
	{
		ModelDuck duck=new ModelDuck();
		duck.performFly();
		duck.setFlyBehavior(new FlyRocketPowerd());
		duck.performFly();
	}
}
