package com.decoratorPattern;

public abstract class Beverage {
      String description = "Unkbown beverage";
      
      public String getDescription() {
    	  return description;
      }
      
      public abstract double cost();
}
