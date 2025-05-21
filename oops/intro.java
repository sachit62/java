// classes and objects and access specifier and getter,setter

public class intro {
    public static void main(String[] args) {
        Pen p1 = new Pen(); // created a pen object p1
        p1.setColor("Blue");
        System.out.println(p1.color);
    }
}

class BankAccount{
    public String username;
    private String pass; // visible to only this class
}

class Pen{
    String color;
    int tip;

    String getColor(){  // getter
        return this.color;
    }

    int getTip(){
        return this.tip;
    }

    void setColor(String newColor){  // setter
        color = newColor;
    }

    void setTip(int tip){
        this.tip /*upar vala tip */ = tip;
    }
}
