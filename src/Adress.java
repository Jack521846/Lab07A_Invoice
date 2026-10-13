public class Adress
{
    private String street, city, state, zip;

    public Adress(String street, String city, String state, String zip)
    {
        this.street = street;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }

    public String toString()
    {
        return street + "\n" + city + ", " + state + " " + zip;
    }
}
