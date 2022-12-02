public class CreateGood {
    Good temp;
    public CreateGood() {
        temp = new Good();
        temp.count = CONST.NIL_VALUE;
        temp.name = CONST.EMPTY;
        temp.price = CONST.NIL_VALUE;
    }
    public CreateGood setCount(int count) {
        temp.count = count;
        return this;
    }

    public CreateGood setName(String name) {
        temp.name = name;
        return this;
    }

    public CreateGood setPrice(double price) {
        temp.price = price;
        return this;
    }

    public CreateGood setDescription(String description) {
        temp.description = description;
        return this;
    }
    public Good Create(){
        return temp;
    }

}
