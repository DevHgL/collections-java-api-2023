package List.BasicsOperations;

public class Item {

    private final String name;
    private final double price;
    private final int unit;

    public Item(String name, double price, int unit){
        this.name = name;
        this.price = price;
        this.unit = unit;
    }

    public String getName(){

        return name;
    }

    public double getPrice(){

        return price;
    }

    public int getUnit() {
        return unit;
    }



    @Override
    public String toString(){
        return("Item{ " + "nome: " + name + " preco: " + price + " unidade: " + unit);
    }
}
