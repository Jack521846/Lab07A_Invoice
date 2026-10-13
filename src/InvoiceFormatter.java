public class InvoiceFormatter
{

    public static String format(Invoice invoice)
    {
        StringBuilder sb = new StringBuilder();

        sb.append("====================================\n");
        sb.append(invoice.getTitle()).append("\n");
        sb.append("====================================\n\n");

        sb.append("Customer:\n");
        sb.append(invoice.getCustomer().getName()).append("\n");
        sb.append(invoice.getCustomer().getAddress()).append("\n\n");

        sb.append("Line Items:\n");
        sb.append("------------------------------------\n");

        for (LineItem item : invoice.getItems())
        {
            sb.append(item.getProduct().getName())
                    .append("  Qty: ").append(item.getQuantity())
                    .append("  Unit: $").append(item.getProduct().getUnitPrice())
                    .append("  Total: $").append(item.getLineTotal())
                    .append("\n");
        }

        sb.append("------------------------------------\n");
        sb.append("Amount Due: $").append(invoice.getTotal()).append("\n");

        return sb.toString();
    }
}
