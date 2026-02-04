package SRP.EX3.solution;



import java.util.List;



public class Invoice {



    String customerEmail;

    private List<Double> items;

    double total;



    public Invoice(String customerEmail, List<Double> items, Double total){

        this.customerEmail = customerEmail;

        this.items = items;

        this.total = total;

    }



    public String getCustomerEmail() {

        return customerEmail;

    }



    public void setCustomerEmail(String customerEmail) {

        this.customerEmail = customerEmail;

    }



    public double getTotal() {

        return total;

    }



    public void setTotal(double total) {

        this.total = total;

    }



    public List<Double> getItems() {

        return items;

    }



    public void setItems(List<Double> items) {

        this.items = items;

    }

}