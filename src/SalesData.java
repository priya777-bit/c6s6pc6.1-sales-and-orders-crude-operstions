public class SalesData
{
    private int sales_id;
    private String first_name;
    private String city;
    private int commission_rate;

    //Constructor
    public SalesData()
    {

    }
    public SalesData(int sales_id, String first_name, String city, int commission_rate)
    {
        this.sales_id=sales_id;
        this.first_name=first_name;
        this.city=city;
        this.commission_rate=commission_rate;
    }

    //Getter And Setter
    public int getSales_id() {
        return sales_id;
    }

    public void setSales_id(int sales_id) {
        this.sales_id = sales_id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getCommission_rate() {
        return commission_rate;
    }

    public void setCommission_rate(int commission_rate) {
        this.commission_rate = commission_rate;
    }

    @Override
    public String toString()
    {
        return sales_id+"::"+first_name+"::"+city+"::"+commission_rate;
    }
}
