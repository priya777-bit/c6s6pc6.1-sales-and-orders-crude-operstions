import java.util.Date;

public class OrderData
{
    private int order_id;
    private int amount;
    private Date order_date;
    private int customer_id;

    //Constructor
    public OrderData()
    {

    }
    public OrderData(int order_id, int amount, Date order_date, int customer_id) {
        this.order_id = order_id;
        this.amount = amount;
        this.order_date = order_date;
        this.customer_id = customer_id;
    }

    //Getter And Setter
    public int getOrder_id() {
        return order_id;
    }

    public void setOrder_id(int order_id) {
        this.order_id = order_id;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Date getOrder_date() {
        return order_date;
    }

    public void setOrder_date(Date order_date) {
        this.order_date = order_date;
    }

    public int getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
    }

    @Override
    public String toString() {
        return "OrderData{" +
                "order_id=" + order_id +
                ", amount=" + amount +
                ", order_date=" + order_date +
                ", customer_id=" + customer_id +
                '}';
    }
}
