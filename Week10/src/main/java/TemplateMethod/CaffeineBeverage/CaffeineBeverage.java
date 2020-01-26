package TemplateMethod.CaffeineBeverage;

public abstract class CaffeineBeverage {
    /* brew a caffeine beverage
    * 1) boil water <-- same
    * 2) brew the coffee <-- different
    * 3) add the condiments <-- different
    * 4) pour in cup <-- same
    *
    * You want to have a set of subclasses with the same algorithm but with varying implementation
    * */
    abstract void brew();
    abstract void addCondiments();
    void boilWater(){
        System.out.println("Boiling water");
    }
    void pourInCup(){
        System.out.println("Pouring in cup");
    }

    /** This is the algorithm (to ensure a certain order)
    * declared final to prevent overriding by subclasses
    * Hollywood Principle: don't call us, we will call you
    * the execution of methods is left to one component*/

    final void prepareRecipe(){
        boilWater();
        brew();
        addCondiments();
        pourInCup();
    }
}
