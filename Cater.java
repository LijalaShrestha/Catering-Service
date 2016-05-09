/**
 * This class is created to provide booking service of a catering company.
 * Several attributes of the company, service and clients are declared, initialized and executed.
 * @author Lijala Shrestha 
 * @version [6th January, 2016]
 */
import java.util.*;
public class Cater
{
    //Question number 1
    private ArrayList<Catering> aryListObj;
    /**
     * Constructor is created to initialize the attribute.
     * Only one attribute of ArrayList type is initialized.
     */
    public Cater()
    {
        aryListObj= new ArrayList<Catering>();
    }
    
    //Question number 2
    /** 
     * This is a method for adding objects of the previous class of Coursework 1.
     * Three parameters are passed according to the previous class.
     * The details are stored in the object of the Arraylist.
     * This method does not return any value.
     */
    public void addObjMethod(String name, String cellNo, String location)
    {
        Catering catObj = new Catering(name, cellNo, location);
        aryListObj.add(catObj);
       
    }
    
    //Question number 3
    /**
     * This method removes the value stored in the object of the ArrayList according to the given condition.
     * This method does not return any value.
     * The input of the index number given by the user is checked in this method.
     */
    public void removingMethod(int ind)
    {
        if( ind>=0 && ind<aryListObj.size())
        {
            aryListObj.remove(ind);
        }
        else{
            System.out.println("Invalid Index.");
    
        }
    }
 
    //Question number 4
    /**
     * This method is created to book the available catering service.
     * This is a return type method.
     */
    public void bookingMethod(int index,String food, int nocustomer, double price, String clientname, String bookdate, String time )
    {
      
       if( index>=0 && index<aryListObj.size())
       {
           Catering catObj= aryListObj.get(index);
           catObj.bookMethod(food, nocustomer, price, clientname, bookdate, time);
           aryListObj.set(index, catObj);
        }
       else{
           System.out.println("Invalid Index.");
       }
    }
    
    //Question number 5
    /**
     * This method clears a booked catering service from the list.
     */
    public void clearingMethod(int index)
    {
        if( index>=0 && index<aryListObj.size())
        {
            Catering catObj= aryListObj.get(index);
            catObj.clearingMethod();
        }
        else
        {
           System.out.println("Invalid Index.");
        }
    }
    
    //Question number 6
    /**
     * This method is created to list all the objects of the previous class in the ArrayList which are recently available for booking catering service.
     * This is a return type method.
     */
    public void listingMethod()
    {
        int counter = 0;
        for (int ind=0; ind<aryListObj.size(); ind++)
        {
            Catering catObj= aryListObj.get(ind);
                if (catObj.getStatus()==true){
                           System.out.println("The object of "+ counter+ "index is available for booking." );
                           catObj.descriptionMethod();
                }
                
            counter++;    
        }
        
        if (counter==0){
                System.out.println("No object free for booking.");
        }
        
    }
    
    //Question number 7
    /**
     * This method is created to search for the objects which are available and matches the search requirement.
     * Parameters are passed.
     * This is a return type method.
     */
    public void searchMethod(double cost, String location)
    {
        int counter=0;
        boolean checkA = false;
        for(int ind=0; ind<aryListObj.size(); ind++)
        {
           Catering catObj= aryListObj.get(ind);
           
           boolean storeValue= catObj.getStatus();
           double rate= catObj.getCost();
           String add= catObj.getAddress();
        
           if(storeValue==true && rate==cost && location==add)
           {
               System.out.println("The object of "+ counter+ " matches the search.");
               catObj.descriptionMethod();
               checkA = true;
               break;
           }
           counter++;
        }
        
        if(!checkA)
        {
            System.out.println("Search criteria not matched.");
        } 
    }    
}        
