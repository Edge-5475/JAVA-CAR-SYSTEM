public class Vehicle
{
    private int Vehicle_Id;
    private String Vehicle_Name;
    private String Vehicle_Weight;
    private String Vehicle_Color;
    private String Vehicle_Speed;
    
    public Vehicle(int Vehicle_Id, String Vehicle_Name, String Vehicle_Color, String Vehicle_Weight)
    {
        this.Vehicle_Id = Vehicle_Id;
        this.Vehicle_Name = Vehicle_Name;
        this.Vehicle_Color = Vehicle_Color;
        this.Vehicle_Weight = Vehicle_Weight;
    }
    
    public int getvehicle_id()
    {
        return this.Vehicle_Id;
    }
    public String getvehicle_name()
    {
        return this.Vehicle_Name;
    }
    public String getvehicle_weight()
    {
        return this.Vehicle_Weight;
    }
    public String getvehicle_color()
    {
        return this.Vehicle_Color;
    }
    public String getvehicle_speed()
    {
        return this.Vehicle_Speed;
    }
    
    public void setvehicle_speed(String Vehicle_Speed)
    {
        this.Vehicle_Speed = Vehicle_Speed;
    }
    public void setvehicle_color(String Vehicle_Color)
    {
        this.Vehicle_Color = Vehicle_Color;
    }
    
    public void display()
    {
       System.out.println("The ID for the vehicle is " + Vehicle_Id); 
       System.out.println("The name of the vehicle is " + Vehicle_Name);
       System.out.println("The color of the vehicle is " + Vehicle_Color);
       System.out.println("The speed of the vehicle is " + Vehicle_Speed);
       
       if(Vehicle_Weight == "")
       {
           System.out.println("The vehicle weight is not registered");
       }
       else
       {
           System.out.println("The weight of vehicle is " + Vehicle_Weight);
       }
    }
}