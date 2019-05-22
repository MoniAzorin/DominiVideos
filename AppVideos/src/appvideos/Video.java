/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appvideos;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author azorin
 */
public class Video {
    
    private String URL;
    private String title;
    private List<String> tags;
    
    
    public Video(String URL, String title){
        this.setTitle(title);
        this.setURL(URL);
        this.setTags(new ArrayList<String>());
    }

    public String getURL() {
        return URL;
    }

    public void setURL(String URL) {
        this.URL = URL;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }
       
}
