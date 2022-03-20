package com.beans;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class NetworkManager {
	 private HttpURLConnection connection;
	    private String urlStr;
	     
	    public void setUrlStr(String urlStr){
	        this.urlStr = urlStr;
	    }
	     
	    @PostConstruct
	    public void init(){
	         
	        System.out.println("Inside init() method...");
	        URL obj;
	        try {
	            obj = new URL(this.urlStr);
	         
	            this.connection = (HttpURLConnection) obj.openConnection();
	        } catch (MalformedURLException e) {
	          
	            e.printStackTrace();
	        } catch (IOException e) {
	           
	            e.printStackTrace();
	        }
	    }
	     
	    @PreDestroy
	    public void destroy(){
	        try{
	            System.out.println("Inside destroy() method...");
	            if(this.connection != null) {
	                connection.disconnect();
	            }
	        } catch(Exception ex){
	             
	        }
	    }
	     
	    public void readData(){
	        try {
	            int responseCode = this.connection.getResponseCode();
	            System.out.println("Response code: "+responseCode);
	          
	    
	          
	        } catch (IOException e) {
	        
	            e.printStackTrace();
	        }
	    }
	}

