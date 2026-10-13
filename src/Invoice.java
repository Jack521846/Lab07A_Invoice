import java.util.ArrayList;

public class Invoice
{
    private String title;
    private Customer customer;
    private ArrayList<LineItem> items = new ArrayList<>();

    public Invoice(String title, Customer customer)
    {
        this.title = title;
        this.customer = customer;
    }

    public void addItem(LineItem item)
    {
        items.add(item);
    }

    public double getTotal()
    {
        return items.stream().mapToDouble(LineItem::getLineTotal).sum();
    }

    public ArrayList<LineItem> getItems() { return items; }
    public Customer getCustomer() { return customer; }
    public String getTitle() { return title; }
}
