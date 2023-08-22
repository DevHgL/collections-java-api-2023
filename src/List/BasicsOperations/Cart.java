package List.BasicsOperations;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    // Attributes
    private final List<Item> itemList;

    public Cart(){

        this.itemList = new ArrayList<>();
    }

    public void addItem(String name, double price, int unit){

        Item item = new Item(name,price,unit);
        this.itemList.add(item);
    }

    public void removeItem(String name){

        List<Item> itemsToRemove = new ArrayList<>();
        if(!itemList.isEmpty()){
            for(Item i : itemList){
                if(i.getName().equalsIgnoreCase(name)){
                    itemsToRemove.add(i);                }
            }
            itemList.removeAll(itemsToRemove);
        }
        else{
            System.out.println("A lista está vazia! ");
        }
    }

    public double calculateTotalAmount(){

        double totalValue = 0d;
        if(!itemList.isEmpty()){
            for(Item item : itemList ){
                double itemValue = item.getPrice() * item.getUnit();
                totalValue += itemValue;
            }
            return totalValue;
        }
        else{

            throw new RuntimeException("A lista está vazia!");
        }
    }

    public void showItems(){

        if(!itemList.isEmpty()){

            System.out.println(this.itemList);
        }
        else{

            System.out.println("A lista está vazia! ");
        }
    }

    @Override
    public String toString(){

        return ("Carrinho de Compras { " + "itens" + itemList + "}");
    }

    public static void main(String [] args){

        Cart cart = new Cart();

        cart.addItem("Lápis", 2d, 3);
        cart.addItem("Caneta", 3d, 2);
        cart.addItem("Caderno", 35d, 1);
        cart.addItem("Borracha", 2d, 1);
        cart.addItem("Lápis", 2d, 3);

        cart.showItems();
        cart.removeItem("Lápis");

        cart.showItems();

        System.out.println("O valor total de sua compra é: " + cart.calculateTotalAmount());
    }

}