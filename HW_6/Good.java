import static java.lang.Math.round;

public class Good {
    public int count;
    public String name;
    public double price;
    public String description;
    public Good set;

    public void print() {
        System.out.println(
                String.format(
                        "%d %s %.2f %s",
                        this.count,
                        this.name,
                        this.price,
                        this.description));
    }


}
