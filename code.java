CRUD.java:
package com.twk.restservice;

public class CRUD {
	private final String content;
    private final String content2;

    public CRUD(String content) {
        this.content = content;
        this.content2 = content;
    }

    public CRUD(String content1, String content2) {
        this.content = content1;
        this.content2 = content2;
    }

    public String getContent() {
        return content;
    }

    public String getContent2() {
        return content2;
    }

}
CRUDController.java:
package com.twk.restservice;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class CRUDController {


    @RequestMapping("/read")
    public CRUD CRUD(@RequestParam(value="business_name") String name) {
        DocData doc = new DocData();
        
        return new CRUD(doc.toString());
    }

}
customer.java:
package com.twk.restservice;

public class customer {
	private int account_number;
    int account_balance;

    public int showInfo() {
        //code to show customer information 
    	return this.account_number;
    }

    public void deposit(int a) {
            account_balance = account_balance + a;
    }
}
DocData.java:
package com.twk.restservice;

import java.sql.*;

public class DocData {
    private String id;
  


    public DocData()
    {
    }

    public String getId()
    {
    	return id;
    }



    public void read_document(String key, String value)
    {
    	/* implement read method */
    	//Class.forName("com.mysql.jdbc.Driver");  
    	try {
			Connection con=DriverManager.getConnection(  
			"jdbc:mysql://localhost:3306/test","root","root");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
    	//here test is database name, root is username and password  

	
    }   

}
Greeting.java:
package com.twk.restservice;

public class Greeting {
	private final long id;
	private final String content;

	public Greeting(long id, String content) {
		this.id = id;
		this.content = content;
	}

	public long getId() {
		return id;
	}

	public String getContent() {
		return content;
	}
}
GreetingController.java:
package com.twk.restservice;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();

	@GetMapping("/greeting")
	public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
		return new Greeting(counter.incrementAndGet(), String.format(template, name));
	}
	
}
myDateTime.java:
package com.twk.restservice;
 

public class myDateTime {
	int mySecond;
	int myMinute;
	int myHour;
	
	int[] retrieveDateTime() {
		/* implement accessor method */
		return new int[3];
	}
	
	void setMyDateTime(int seconds, int minutes, int hour) {
		/* implement accessor method */
	}
	

}
RestServiceApplication.java:
package com.twk.restservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RestServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestServiceApplication.class, args);
	}

}
