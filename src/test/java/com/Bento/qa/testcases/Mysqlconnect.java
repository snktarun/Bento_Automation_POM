package com.Bento.qa.testcases;

   	import  java.sql.Connection;		
	import  java.sql.Statement;		
	import  java.sql.ResultSet;		
	import  java.sql.DriverManager;		
	import  java.sql.SQLException;		
	public class Mysqlconnect {				
	    	public static void  main(String[] args) throws  ClassNotFoundException, SQLException {		
	    		
					//Connection URL Syntax: "jdbc:mysql://ipaddress:portnumber/db_name"		
	                String dbUrl = "jdbc:mysql://localhost:3306/cambalt";					

					//Database Username		
					String username = "root";	
	                
					//Database Password		
					String password = "mysql";				

					//Query to Execute		
					String query1 = "select * from corp_alto_enrollment";	
					
	         	    //Load mysql jdbc driver		
	           	    Class.forName("com.mysql.jdbc.Driver");	
	           	    
	           	    System.out.println("Driver loaded");
	           
	           		//Create Connection to DB		
	            	Connection con = DriverManager.getConnection(dbUrl,username,password);
	            	 System.out.println("connection established");
	            	 
	          		//Create Statement Object		
	        	   Statement stmt = con.createStatement();					
	       
	       			// Execute the SQL Query. Store results in ResultSet		
	         		ResultSet rs1= stmt.executeQuery(query1);	
	         	
	         		// While Loop to iterate through all data and print results		
					while (rs1.next()){
						
				        		String enrstdate = rs1.getString(4);								        
	                            String enrenddate = rs1.getString(5);					                               
	                            System. out.println(enrstdate+"/t"+enrenddate);		
	                    }	
					
				
	      			 // closing DB Connection		
	      			con.close();			
			}
	}


