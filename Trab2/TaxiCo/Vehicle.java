public class Vehicle{

    // A unique ID for this vehicle.
    private String id;

    // The destination of this vehicle.
    private String destination;
   
    // The location of this vehicle.
    private String location;
   
    public Vehicle(String id){
        this.id = id;
    }

    /**
     * Return the ID of the vehicle.
     * @return The ID of the vehicle.
     */
    public String getID()
    {
        return id;
    }
    
    /**
     * Return the status of this taxi.
     * @return The status.
     */
    public String getStatus()
    {
        if(destination == null){
            return id + " at " + location + " without destination ";
        } else {
            return id + " at " + location + "headed for " + destination;
        }
     }
  
    /**
     * Return the location of the taxi.
     * @return The location of the taxi.
     */
    public String getLocation()
    {
        return location;
    }

    /**
     * Set the location of the vehicle.
     * @param location The atual location.
     */
    public void setLocation(String location)
    {
        this.location = location;
    }
    
    /**
     * Return the destination of the vehicle.
     * @return The destination of the vehicle.
     */
    public String getDestination()
    {
        return destination;
    }
    
    /**
     * Set the intented destination of the vehicle.
     * @param destination The intended destination.
     */
    public void setDestination(String destination)
    {
        this.destination = destination;
    }
}
