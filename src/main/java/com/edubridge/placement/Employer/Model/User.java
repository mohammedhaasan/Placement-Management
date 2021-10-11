package com.edubridge.placement.Employer.Model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class User {
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	     
	    @Column(nullable = false, unique = true, length = 45)
	    private String email;
	   
	    
	    
	    @Column(nullable = false, length = 50)
	    private String password;

	    
	    public User() {
	    	
	    }
          

		public User(Long id, String email, String password) {
			
			this.id = id;
			this.email = email;
			this.password = password;
		}


		public Long getId() {
			return id;
		}



		public void setId(Long id) {
			this.id = id;
		}



		public String getEmail() {
			return email;
		}



		public void setEmail(String email) {
			this.email = email;
		}



		public String getPassword() {
			return password;
		}



		public void setPassword(String password) {
			this.password = password;
		}
	     
	  
		
	    
	    
	     
	     
	}

