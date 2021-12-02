public class CustomerData
{
    private int customer_id;
    private String name;
    private String last_name;
    private String city;
    private int rating;
    private int sales_id;

    //Constructor
    public CustomerData()
    {

    }
    public CustomerData(int customer_id,String name,String last_name,String city,int rating,int sales_id)
    {
        this.customer_id=customer_id;
        this.name=name;
        this.last_name=last_name;
        this.city=city;
        this.rating=rating;
        this.sales_id=sales_id;
    }

    //Getters And Setters
    public int getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public int getSales_id() {
        return sales_id;
    }

    public void setSales_id(int sales_id) {
        this.sales_id = sales_id;
    }

    @Override
    public String toString()
    {
        return customer_id+"::"+name+"::"+last_name+"::"+city+"::"+rating+"::"+sales_id;
    }
}
