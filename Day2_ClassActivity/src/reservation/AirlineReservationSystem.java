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
public class AirlineReservationSystem extends ReservatnSystem

{
    int choice,i;
    boolean flag ;
    char option_choice;
    
    AirlineReservationSystem()
    {
        ReservatnSystem RS = new ReservatnSystem(10);
        choice = 0;
        flag   = false;
        option_choice = 'N';
    }
    

    
    public void make_reservation()
    {
       
       Scanner user_input = new Scanner(System.in);
       System.out.println("Make a reservation:");
       System.out.println("Please type 1 for smoking\nPlease type 2 for non-smoking   ");
       choice = user_input.nextInt();
       
       
       if (choice == 1)                             // condition 1 : Reservation for Smokers
       {
        do {
                make_reservation_smokers(); 
                System.out.println("Continue booking more ? (Y/N)");
                option_choice = user_input.next().charAt(0);
           } while (option_choice == 'Y');
           
       }
       else
       {       
        do {
                make_reservation_non_smokers();    // condition 2 : Reservation for non-Smokers
                System.out.println("Continue booking more ? (Y/N)");
                option_choice = user_input.next().charAt(0);
           } while (option_choice == 'Y');
       }
       
       
        
    }
    
     // method to process reservation for non-smoking passengers.
    public void make_reservation_non_smokers()
    {   Scanner user_input = new Scanner(System.in);
        flag = false;                                   // initialising the flag for seat overflow.
        for (i = 6; i <= 10; i++) 
                {
                    if(seats[i] == 0)
                     {
                       seats[i] = 1;
                       flag = true;
                       break;
                     }
                    else
                         {
                            continue;
                         }
                }
        
       
           
                if (flag == false)
                    {
                        System.out.println("All the seats are filled for NON-SMOKING Section !");
                       
                        System.out.println("Book a seat at smoking section ? (Y/N)"); 
                        option_choice = user_input.next().charAt(0);
               
                         if(option_choice == 'Y')
                        {    
                            System.out.println("Booking seat at the smoker's section.");
                            //make_reservation_smokers();
                         }
                         else
                        {
                             System.out.println("Next flight leaves in 3 hours."); 
                        }
                    }
                else
                    {
                        System.out.println("Seat booked successfully at seat no:" + i); 
                    }
    }
    
    
    // method to process reservation for smoking passengers.
    public void make_reservation_smokers()
    {   
        Scanner user_input = new Scanner(System.in);
        int j;  
        flag = false;    
       // System.out.println(">>>>>>>>>>>> i =" + j);
    
        for (j = 0; j < 5; j++) 
           {
             // System.out.println(">>>>>>>>>>>>seat[" +j+"] =" + seats[j]);
              if(seats[j] == 0)
              {
                  seats[j] = 1;
                  flag = true;
                  break;
              }
              else
              {
                  continue;
              }
           }
        
    //    System.out.println(">>>>>>>>>>>>after  i =" + j);
        
           if (flag == false)
           {
               System.out.println("All the seats are filled for SMOKING Section !!");
               System.out.println("Book a seat at non-smoking section ? (Y/N)"); 
               option_choice = user_input.next().charAt(0);
               
               if(option_choice == 'Y')
               {    
                   System.out.println("Booking seat at the non-smokers section.");
                   make_reservation_non_smokers();
               }
               else
               {
                   System.out.println("Next flight leaves in 3 hours."); 
               }
           }
           else
           {
              System.out.println("Seat booked successfully at seat no:" + (j+1)); 
           }
    }
}
