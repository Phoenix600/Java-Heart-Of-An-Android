class Product 
{
    private String itemNumber;
    private String name;
    private int price;
    private int qty;


    // Getter Methods 
    public String getItemNumber()
    {
        return itemNumber;
    }

    public String getName()
    {
        return name;
    }

    public int getPrice()
    {
        return price;
    }

    public int getQty()
    {
        return qty;
    }

    // Setter Methods 
    // There should not be method which sets the ietmNumber of product and name of the product 

    // Prices changes 
    public void setPrice(int price)
    {
        this.price = price;
    }

    // QTY may chnages 
    public void setQty(int qty)
    {
        this.qty = qty;
    }

    // Constructor for the class 
    public Product(String itemNumber)
    {
        this.itemNumber = itemNumber;
    }
    public Product(String itemNumber, String name)
    {
        this.itemNumber = itemNumber;
        this.name = name;
    }

    public Product(String itemNumber, String name, int price, int qty)
    {
        this.itemNumber = itemNumber;
        this.name = name;
        this.price = price;
        this.qty = qty;
    }


}

class Customer
{
    private String name;        // Exclude from the setter() methods 
    private String custId;      // Exclude from the setter() methods
    private String address;
    private String phoneNo;


    // getter() Methods
    
    public String getId()
    {
        return this.custId;
    }

    public String getName()
    {
        return this.name;
    }

    public String getAddress()
    {
        return this.address;
    }

    public String getPhoneNumber()
    {
        return this.phoneNo;
    }


    // Setter() Methods

    void setAddress(String address)
    {
        this.address = address;
    }

    void setPhone(String phoneNo)
    {
        this.phoneNo = phoneNo;
    }

}



public class ProductAndCustomer {
    public static void main(String...args)
    {
        
    }
}
