public class Hello
{
 public static void main( String argv[] )
 {
	 //This comment is unwanted but will be reverted later
 String name = "World";
 if ( argv.length != 0 )
 {
 name = argv[0];
 }
 System.out.println( "Hello, " + name + "!" );
 }
}