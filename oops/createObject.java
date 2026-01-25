// create and use that object of a different class without constructor

class ADD{
    public static void add(){
        System.out.println("adding");
    }
}

public class createObject {
    public static void main(String[] args) {
        ADD ans = new ADD(); // object created of ADD

        ans.add(); // ADD method is used add
        
    }
}
