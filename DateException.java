import java.util.*;
import java.io.*;
import java.util.Scanner; 


public class DateException extends RuntimeException{ 
	
public DateException(){  

super("Invalid value for Date"); 

}  

public DateException(String message)
{ 
super(message);  
}

 } 
