/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appvideos;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;
import static java.util.UUID.randomUUID;

/**
 *
 * @author azorin
 */
public class User {
    
    private UUID userId;
    private String name;
    private String surname;
    private String password;
    private Date registerDate;   
    private List<Video> Videos;

    public User(String name, String surname, String password, Date registerDate) throws Exception{
       if(name.trim().isEmpty() || surname.trim().isEmpty() || password.trim().isEmpty() || registerDate==null){
            throw new Exception("Hay que rellenar todos los campos");
        }
        this.setName(name);
        this.setSurname(surname);
        this.setPassword(password);
        this.setRegisterDate(registerDate);
        this.setUserId(randomUUID());
        this.setVideos(new ArrayList<Video>());
    }

    public UUID getUserId() {
        return userId;
    }

    public void setUserId(UUID userId) {
        this.userId = userId;
    }
          
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(Date registerDate) {
        this.registerDate = registerDate;
    }

    public List<Video> getVideos() {
        return Videos;
    }

    public void setVideos(List<Video> Videos) {
        this.Videos = Videos;
    }
           
    //Mètode per crear un nou video:    
    public void NewVideo(String Url, String title, String tag) throws Exception{
        if(Url.trim().isEmpty() || title.trim().isEmpty() || tag.trim().isEmpty()){
            throw new Exception("Hay que rellenar todos los campos");            
        }
        
        if(tag.contains(" ")){           
            throw new Exception("un tag solo puede contener una palabra");
        }
             
        Video newVideo = new Video(Url, title );
        List<String> tags = new ArrayList<>();
        tags.add(tag);
        newVideo.setTags(tags);
        Videos.add(newVideo);
        
    }
        
}
