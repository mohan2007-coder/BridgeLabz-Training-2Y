package Hashmap.Grocery;



public class  Product{

    private int  p_id;
    private String name;
    private int price;

    Product(int p_id, String name, int price){
        this.p_id=p_id;
        this.name=name;
        this.price=price;

    }

    public void setP_id(int p_id){
        this.p_id=p_id;
    }

    public int getP_id(){
        return p_id;
    }

    public  void setName(String name){
        this.name=name;
    }

    public String getName(){
        return name;
    }

    public void setPrice(int price){
        this.price=price;
    }

    public int getPrice(){
        return price;

    }


    public void details(){
        System.out.println("------------------");
        System.out.println("Product Id: "+p_id);
        System.out.println("Name: "+name);
        System.out.println("Price: ₹"+price);
    }

}