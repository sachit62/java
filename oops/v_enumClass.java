enum Laptop
{
    Macbook(2000),
    XPS(1800),
    Surface(1500),
    ThinkPad(1700);

    private int price;

    Laptop(int price)
    {
        this.price = price;
    }

    public int getPrice()
    {
        return price;
    }
}

public class v_enumClass
{
    public static void main(String[] args)
    {
        Laptop l = Laptop.Macbook;

        System.out.println(l.getPrice());
    }
}