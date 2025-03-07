class BigHouse{

    public String house(){
        return "This is a Big House";
    }
}

class SmallHouse extends BigHouse{
    @Override
    public String house() {
        return "This is the small House";
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        BigHouse sm = new SmallHouse();
        System.out.println(sm.house());
    }
}
