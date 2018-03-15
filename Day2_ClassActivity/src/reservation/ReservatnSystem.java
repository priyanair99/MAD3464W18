/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reservation;

/**
 *
 * @author sree
 */
public class ReservatnSystem 
{
    int limit ;
    
    int[] seats = new int[25];
    
    ReservatnSystem()
    {
         this.limit = 0;
         for (int i = 0; i < 25; i++) 
         {
            seats[i] = 0;
         }
    }
    
    
    ReservatnSystem(int default_seating)
    {
         this.limit = default_seating;
         
         for (int i = 1; i <= default_seating; i++) 
         {
            seats[i] = 0;
         }
    }
    
    public void assign_capacity(int cap)
    {
        this.limit = cap;
    }
    
    public void assign_seat(int seat_no)
    {
        if (seat_no > this.limit)
        {
            System.out.println("Invalid seat number.");
        }
        else
            
        {
            if (seats[seat_no] == 0)
            {
                seats[seat_no] = 1;
            }
            else
            {
                System.out.println("Sorry ! this seat is already booked. Please book another seat.");
            }
        }
 
    }
}
