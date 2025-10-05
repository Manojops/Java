public class Lion extends Animal {

    String color;

    Lion(String name,String sound,String color){
        super(name,sound);
        this.color=color;
    }

    void display(){
        System.out.println("The Animal "+this.name+" is Sounds like a "+this.sound+" with "+this.color+" color");
    }
}
