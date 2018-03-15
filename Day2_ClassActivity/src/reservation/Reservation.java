/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reservation;

import java.util.Scanner;

/**
 *
 * @author sree
 */
public class Reservation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    
    {   int capacity,seat_no;
        char choice = 'Y';
        // TODO code application logic here
        

     
     AirlineReservationSystem ARS = new AirlineReservationSystem();
     ARS.make_reservation();
      
    }
    
}
