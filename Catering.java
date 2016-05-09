/** 
 * This class is created to provide booking service of a catering company.
 * Several attributes of the company, service and clients are declared, initialized and executed.
 * @author Lijala Shrestha
 * version [22nd December, 2015]
 */
public class Catering
{
    //Question number 1
    private String company_name;
    private String address;
    private String phone_number;
    private String menu;
    private int numberPeop; 
    private double cost; //cost per person
    private String customer_name;
    private String booking_date;
    private String duration;
    private boolean status;
   
    //Question number 2
    /**
     * Constructor is created to initialized the attributes.
     * Few parameters are passed.
     */
    public Catering(String name, String cellNo, String location)
    {
        //Assigning values to the corresponding attributes by passing few parameters.
        company_name = name; 
        phone_number = cellNo;
        address = location;
        menu = "";
        numberPeop = 0;
        cost = 0.0;
        customer_name = "";
        booking_date = "";
        duration = "";
        status = true;
    }
    
    
    //Question number 3
    /**
     * This is a return type method that returns the value of company_name.  
     */
    public String getCompany_name()
    {
        return company_name;
    }
    
    /**
     * This is a return type method that returns value of address.
     */
    public String getAddress()
    {
        return address;
    }
    
    /**
     * This is a return type method that returns the value of phone_number.
     */
    public String getPhone_number()
    {
        return phone_number;
    }
    
    /**
     * This is a return type method that returns the value of menu.
     */
    public String getMenu()
    {
        return menu;
    }
    
    /**
     * This is a return type method that returns the value of numberPeop.
     */
    public int getNumberPeop()
    {
        return numberPeop;
    }
    
    /**
     * This is a return type method that returns the value of cost.
     */
    public double getCost()
    {
        return cost;
    }
    
    /**
     * This is a return type method that returns the value of customer_name.
     */
    public String getCustomer_name()
    {
        return customer_name;
    }
    
    /**
     * This is a return type method that returns the value of booking_date.
     */
    public String getBooking_date()
    {
        return booking_date;
    }
    
    /**
     * This is a return type method that returns the value of duration.
     */
    public String getDuration()
    {
        return duration;
    }
    
    /**
     * This is a return type method that returns the value of status.
     */
    public boolean getStatus()
    {
        return status;
    }
    
    
    //Question number 4
    /** 
     * This is a non-return type method that sets a new value of cost.
     */
    public void setCost(double newCost)
    {
        cost = newCost;
    }
    
    /**
     * This is a non-return type method that sets a new value of address.
     */
    public void setAddress(String newAddress)
    {
        address = newAddress;
    }
    
    
    //Question number 5
    /**
     * This is the method that allows the clients to book for the catering service.
     */
    public void bookMethod(String food, int nocustomer, double price, String clientname, String bookdate, String time) //passing a few parameters.
    {
        if (status == true) //If there is available space for booking.
        {
            menu = food; //Initializing a new variable for menu.
            numberPeop = nocustomer; //Initializing a new variable for numberPeop.
            cost = price; //Initializing a new variable for cost.
            customer_name = clientname; //Initializing a new variable for customer_name.
            booking_date = bookdate; //Initializing a new variable for booking_date.
            duration = time; //Initializing a new variable for duration.           
            System.out.println("Payment at the time of booking is "+ cost*numberPeop*0.7); //To display the amount to be paid in advance by the client,
            System.out.println("Payment, total of booking is "+ cost*numberPeop); //To display the total amount to be paid including the advance by the client.
            status= false;
        } 
        else //If the booking space is unavailable.
        {
            System.out.println("Sorry, booking is unavailable at the moment"); 
        }
    }
    
    
    //Question number 6
    /** 
     * This is the method that makes the catering service available.
     */
    public void clearingMethod()
        {
            if (status == false) //If the booking space is unavailable.
            {
                //Clearing all the values of the attributes of the catering service.
                numberPeop = 0;
                customer_name = "";
                booking_date = "";
                duration = "";
                status = true;
                menu = "";
            }
            else //If booking space is available.
            {
                System.out.println("Booking service is available. Please book your event and make your advance payment.");
            }
        }
        
    
    //Question number 7
    /**
     * This is the method that displays the desription of the catering service.
     */
    public void descriptionMethod()
    {
        System.out.println("Welcome to ABC Event Venue. \nWe provide catering and other facilities for various occasions like, wedding parties, meetings, seminars and so on. \nApart from the catering services. we also provide various facilities according to the package cost. \nClients will have to pay 70% of the total amount of the expense of their event in advance.");
    }
}

    