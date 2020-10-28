public abstract class CaffeineBeverageHook{
    void prepareRecipe(){
        boilWater();
        brew();
        pourInCup();
        if( customerWantsCondiments() ){ addCondiments(); }
    }
    abstract void brew();
    abstract void addCondiments();

    void boilWater(){ System.out.println("Boling Water"); }
    void pourInCup(){ System.out.println("Pouring into cup"); }
    boolean customerWantsCondiments(){ return true; }
}