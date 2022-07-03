package com.designOOpattern;

public class MiniDuckSimiluator {
	
	
      public static void main(String [] arg) {
    	  Duck mallard = new MallardDuck();
    	  mallard.performQuack();
    	  mallard.performFly();
    	  
    	  Duck model = new ModelDuck();
    	  model.performFly();
    	  model.setFlyBehavior(new FlyRocketPowered());
    	  model.performFly();
      }
}
