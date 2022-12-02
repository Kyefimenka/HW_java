public class Main {
    public static void main(String[] args) {
        Good product = new CreateGood()
                .setCount(100)
                .setName("phone")
                .setPrice(200)
                .setDescription("10 different designs")
                .Create();

        product.print();
    }
}
