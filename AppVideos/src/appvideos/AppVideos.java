/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appvideos;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 *
 * @author azorin
 */
public class AppVideos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Calendar c = Calendar.getInstance();
        Date today = c.getTime();
        System.out.println("The Current Date is:" + c.getTime());
       
        String name = new String();
        String surname = new String();
        String password = new String();
        Date now = new Date();
     
        try {
            // Crear un nuevo Usuario:
            //User newUser = new User(name, surname, password, now);
            
            User newUser = new User("Monica", "Azorin", "asd", now);

            // Añadir un Video 
            String url = new String();
            String title = new String();
            String tag = new String();

            newUser.NewVideo(url, title, tag);
            
            newUser.NewVideo("dsgagh", "ahfdagj", "fsfsf");
            
            newUser.NewVideo("asadha", "afhH", "ASDF ASHFSH");

            // Veure els llistat del videos:
            List<Video> userVideos = new ArrayList<>();       
            userVideos = newUser.getVideos();
            
            
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
           
        }
        


    }

}
