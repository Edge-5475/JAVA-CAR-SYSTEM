public class AutoRickshaw extends Vehicle
{
    private int Engine_displacement;
    private String Torque;
    private int Number_of_seats;
    private int Fuel_tank_capacity;
    private String Ground_clearance;
    private int Charge_amount;
    private String Booked_date;
    private Boolean isBooked;
    
    public AutoRickshaw(int Vehicle_Id, String Vehicle_Name, String Vehicle_Color, String Vehicle_Weight,String Vehicle_Speed,int Engine_displacement, String Torque, int Fuel_tank_capacity, String Ground_clearance)
    {
        super(Vehicle_Id, Vehicle_Name, Vehicle_Color, Vehicle_Weight);
        this.Engine_displacement = Engine_displacement;
        this.Torque = Torque;   
        this.Fuel_tank_capacity = Fuel_tank_capacity;
        this.Ground_clearance = Ground_clearance;    
        super.setvehicle_speed(Vehicle_Speed);
        super.setvehicle_color(Vehicle_Color);
        this.isBooked = false;
    }
    
    public int getengine_displacement()
    {
        return this.Engine_displacement;
    }
    public String gettorque()
    {
        return this.Torque;
    }
    public int getnumber_of_seats()
    {
        return this.Number_of_seats;
    }
    public int getfuel_tank_capacity()
    {
        return this.Fuel_tank_capacity;
    }
    public String getground_clearnace()
    {
        return this.Ground_clearance;
    }
    public int getcharge_amount()
    {
        return this.Charge_amount;
    }
    public String getbooked_date()
    {
        return this.Booked_date;
    }
    public Boolean getisbooked()
    {
        return this.isBooked;
    }
    
    public void setcharge_amount(int Charge_amount)
    {
        this.Charge_amount = Charge_amount;
    }
    public void setnumber_of_seats(int Number_of_seats)
    {
        this.Number_of_seats = Number_of_seats;
    }
    
    public void book(String Booked_date, int Charge_amount, int Number_of_seats)
    {
        if(isBooked == false)
        {
            this.Booked_date = Booked_date;
            this.setcharge_amount(Charge_amount);
            this.setnumber_of_seats(Number_of_seats);
            this.isBooked = true;
            System.out.println("The vehicle having ID " + getvehicle_id() + " is booked");
        }
        else
        {
           System.out.println("The isBooked attribute of the vehicle is " + isBooked);
           System.out.println("The Auto Ricksaw is already booked");
        }
    }
    
    public void display()
    {
        super.display();
        if(isBooked == true)
        {
            System.out.println("The Engine displacement of the vehicle is " + Engine_displacement);
            System.out.println("The Torque of the vehicle is " + Torque);
            System.out.println("The Capacity of fuel tank in the vehicle is " + Fuel_tank_capacity);
            System.out.println("The Ground clerance of the vehicle is " + Ground_clearance);
            System.out.println("The date in which the vechile was book is " + Booked_date);
            if(Charge_amount == 0)
            {
                System.out.println("The charge amount of the vehicle is not set");
            }
            else{
                System.out.println("The charge amount of the vehicle is " + Charge_amount);
            }
            if(Number_of_seats == 0)
            {
                System.out.println("The number of seat for the vehicle is not set");
            }
            else
            {
                System.out.println("The number of seats in the vehicle is " + Number_of_seats);
            }
        }
        else
        {
            System.out.println("The vehicle is not booked");
        }
    }
}
