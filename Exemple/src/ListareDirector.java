import java.io.File;
import java . util .*;
public class ListareDirector {
	
	
	private static void info ( File f ) {
	// Afiseaza informatii despre un fisier sau director
	String nume = f . getName () ;
	if( f.isFile () )
	System.out.println ( " Fisier : " + nume ) ;
	else
	if( f.isDirectory () )
	System.out.println ( " Director : " + nume ) ;
	System.out.println (
	" Cale absoluta : " + f.getAbsolutePath () +
	" \n Poate citi : " + f.canRead () +
	" \n Poate scrie : " + f.canWrite () +
	" \n Parinte : " + f.getParent () +
	" \n Cale : " + f.getPath () +
	" \n Lungime : " + f.length () +
	" \n Data ultimei modificari : " +
	new Date ( f.lastModified () ) ) ;
	System.out.println ( " --------------" ) ;
	}
	public static void main ( String [] args ) {
	String nume ;
	if ( args.length == 0)
	nume = " . " ; // directorul curent
	else
	nume = args [0];
	try {
	File director = new File ( nume ) ;
	File [] continut = director.listFiles () ;
	for (int i = 0; i < continut.length ; i ++)
	info ( continut [ i ]) ;
	} catch ( Exception e ) {
	e . printStackTrace () ;
	}
	}
	

}
