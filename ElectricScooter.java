public class ElectricScooter extends Vehicle
{
    private int Range;
    private int Battery_capacity;
    private int Price;
    private String Charging_time;
    private String Brand;
    private String Mileage;
    private Boolean hasPurchased;
    private Boolean hasSold;
    
    public ElectricScooter(int Vehicle_Id,String Vehicle_Name, String Vehicle_Weight, String Vehicle_Speed, String Vehicle_Color, int Battery_capacity)
    {
        super(Vehicle_Id, Vehicle_Name, Vehicle_Color, Vehicle_Weight);
        super.setvehicle_speed(Vehicle_Speed);
        super.setvehicle_color(Vehicle_Color);
        this.Battery_capacity = Battery_capacity;
        this.Range = 0;
        this.Price = 0;
        this.Brand = "";
        this.Mileage = "";
        this.Charging_time = "";
        this.hasPurchased = false;
    }
    
    public int getrange()
    {
        return this.Range;
    }
    public int getbattery_capacity()
    {
        return this.Battery_capacity;
    }
    public int getprice()
    {
        return this.Price;
    }
    public String getcharging_time()
    {
        return this.Charging_time;
    }
    public String getbrand()
    {
        return this.Brand;
    }
    public String getmileage()
    {
        return this.Mileage;
    }
    public Boolean gethaspurchased()
    {
        return this.hasPurchased;
    }
    public Boolean gethassold()
    {
        return this.hasSold;
    }
    
    public void setbrand(String Brand)
    {
        if(hasPurchased == false)
        {
            this.Brand = Brand;
        }
        else
        {
            System.out.println("The scooter is already purchased so the brand can not be changed");
        }
    }
    
    public void purchase(String Brand, int Price, String Charging_time, String Mileage, int range)
    {
        if(hasPurchased == false)
        {
            this.setbrand(Brand);
            this.Price = Price;
            this.Charging_time = Charging_time;
            this.Mileage = Mileage;
            this.Range = Range;
            this.hasPurchased = true;
        }
    }
    
    public void sell(int Price)
    {
        if(hasSold == false)
        {
            this.Price = Price;
            this.Charging_time = "";
            this.Mileage = "";
            this.Battery_capacity = 0;
            this.Range = 0;
            this.hasSold = true;
            this.hasPurchased = false;
        }
        else
        {
            System.out.println("The scooter is already sold");            
        }
    }
    
    public void display()
    {
        super.display();
        if(hasPurchased == true)
        {
            System.out.println("The brand of the scooter is " + Brand);
            System.out.println("The battery capacity of the scooter is " + Battery_capacity );
            System.out.println("The mileage for the scooter is " + Mileage);
            System.out.println("The range of the scooter is " + Range);
            System.out.println("The recharge time for the scooter is " + Charging_time);
        }
    }
}