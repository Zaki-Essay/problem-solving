package problemSolving;

enum plo {
    re, rz
}

abstract class Animal{
        String name;

    public String getName() {
        return name;
    }

    public Animal(String name) {
        this.name = name;
    }
}

class dog extends Animal{


    public dog(String name) {
        super(name);
    }


}

public class Problem50 {


    public static void main(String[] args){


        dog d = new dog("hgf");
        System.out.println(plo.re);

    }
}