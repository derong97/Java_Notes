package TemplateMethod.CaffeineBeverage;

class GourmetCoffee extends CaffeineBeverage {
    @Override void brew () {
        System.out.println( "Put in Coffee Maker" );
    }
    @Override void addCondiments () {
        System.out.println( "Adding nothing, because GourmetCoffee" );
    }

    public static void main(String[] args) {
        CaffeineBeverage caffeineBeverage = new GourmetCoffee();
        caffeineBeverage.prepareRecipe();
    }
}

