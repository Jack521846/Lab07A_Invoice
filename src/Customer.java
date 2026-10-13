public class Customer
{
    private String name;
    private Adress address;

    public Customer(String name, Adress address)
    {
        this.name = name;
        this.address = address;
    }

    public String getName() { return name; }
    public Adress getAddress() { return address; }
}
