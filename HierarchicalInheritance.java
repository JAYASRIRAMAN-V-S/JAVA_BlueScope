class AnimalHi{
    String name = "Lion";

    void display(){
        System.out.println(name);
    }
}

class DogHi extends AnimalHi{
    void dogHiDisplay(){
        System.out.println("From the Dog Class");
    }
}

class CheetahHi extends AnimalHi{
    void CheetahHiDisplay(){
        System.out.println("From the Cheetah Class");
    }
}

public class HierarchicalInheritance {
    public static void main(String[] args) {
        DogHi newDog = new DogHi();
        newDog.display();
        newDog.dogHiDisplay();
    }
}
