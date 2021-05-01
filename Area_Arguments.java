
public class Area_Arguments_20190093 {

	public static void main(String[] args) {
		double area = 0.0 ; 
	    if (args.length == 0 )
	    {
	        System .out.println ( " the default length of the square is  : 5 " ) ; 
	        area = 5*5 ; 
	        System .out. println (" Area of the default square is = " + area) ; 
	    }
	    else if (args.length == 2 || args.length == 3)
	    {
	        String Shape = args[0] ; 
	        if (Shape.compareToIgnoreCase("square") == 0 ) 
	        {
	            System.out.println (" THE LENGTH OF THE SQUARE SIDE  :" + args[1]);
	            double sl = Double.parseDouble(args[1]);
	            area = sl * sl ; 
	            System .out.println (" THE AREA OF THE SQUARE IS  = " + area); 
	        }
	        else if (Shape.compareToIgnoreCase("Rectangle") == 0 )
	        {
	            System.out.println ("THE LENGTH OF THE RECTANGLE IS  = " + args[1]);
	            double l = Double.parseDouble(args[1]) ; 
	            System.out.println ("THE WIDTH OF THE RECTANGLE IS  = " + args[2]) ;
	            double w = Double.parseDouble(args[2]); 
	            area = l * w ;
	            System.out.println (" THE AREA OF THE RECTANGLE IS = " + area); 
	        }
	        else if (Shape.compareToIgnoreCase("circle")== 0 )
	        {
	            double pi = 3.14 ; 
	            System .out.println ( " THE RADIUS OF THE CIRCLE IS  = " + args[1]) ; 
	            double radius = Double.parseDouble(args[1] ) ; 
	            area = 2* pi * radius ; 
	            System .out.println (" THE AREA OF THE CIRCLE IS  = " + area ) ; 
	        }
	        else 
	        {
	        	System.out.println ("SHAPE IS UNAVAILABLE");
	        }
	    }
	    else 
	    {
	    	System.out.println("WRONG ARGUMENTS") ; 
	    }

	}

}
