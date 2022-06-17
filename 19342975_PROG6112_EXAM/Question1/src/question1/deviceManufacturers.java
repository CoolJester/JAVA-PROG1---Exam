package question1;

/**
 *
 * @author e19342975
 */
public class deviceManufacturers {

    //variables for storing the information about the sales
    private String name;
    int sales2018;
    int sales2019;
    int sales2020;
    int totalSales;
    
    //Constructor
    public deviceManufacturers(String s, int s18, int s19, int s20){
        this.name = s;
        this.sales2018 = s18;
        this.sales2019 = s19;
        this.sales2020 = s20;
        
        //Calculating the totalSales
        totalSales = this.sales2018 + this.sales2019 + this.sales2020;
    }
    

    
    //getter methods for the attributes
    public String getName() {
        return name;
    }

    public int getSales2018() {
        return sales2018;
    }

    public int getSales2019() {
        return sales2019;
    }

    public int getSales2020() {
        return sales2020;
    }

    public int getTotalSales() {
        return totalSales;
    }
    
    
    
}
