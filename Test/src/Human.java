public class Human implements Character{

    String name;
    public Human(String name){
        this.name = name;
    }
    @Override
    public void walk() {
        System.out.println(this.name+" walking");
        
    }
    //Overload
    public void walk(Human n){
        System.out.println(this.name+" walking with "+n.name);
    }
    @Override
    public void sit() {
        System.out.println(this.name+" sitting");
    }
    
}
