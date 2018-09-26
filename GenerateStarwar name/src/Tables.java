import java.util.*;

/*Generates a starwars name and home planet name, based on user input
 * Submission Confirmation: 7e7b8012-c605-4fa4-bb70-03f5bfc03c72
 */
public class Tables {

  /*! \brief A scanner class object
   *         Used for accepting user input
   */
  public static final Scanner in = new Scanner(System.in);
  
  /*! \brief the main runtime method.
   *         Generates the user's starwars name
   */
  public static void main(String[] args) {
    String sFirstName, sLastName, sMaiden, sCity, sCar, sSWFirst, sSWLast, sSWPlanet;
    System.out.println("Lab 4 written by GREGORY V ROBERTS");
    System.out.println("\nStar Wars Name Generator\n");
    sFirstName = promptString("Enter your first name: ");
    System.out.println("You entered: " +sFirstName);
    sLastName = promptString("Enter your last name: ");
    System.out.println("You entered: " +sLastName);
    sMaiden = promptString("Enter your mother's maiden name: ");
    System.out.println("You entered: " +sMaiden);
    sCity = promptString("Enter the city where you were born: ");
    System.out.println("You entered: " +sCity);
    sCar = promptString("Enter the first car you drove: ");
    System.out.println("You entered: " +sCar);
    
    //Star Wars first name
    sSWFirst = sFirstName.substring(0, 3) + sLastName.substring(0, 2);
    //Star Wars last name
    sSWLast = sMaiden.substring(0, 2) + sCity.substring(0, 3);
    //Star Wars Planet
    sSWPlanet = sLastName.substring(sLastName.length() - 2, sLastName.length()) +sCar;
    
    System.out.println("You are " +sSWFirst +" " +sSWLast +" of " +sSWPlanet);
  }
  
  /*! \brief promtps the user, and then waits for user input
   *  @param sPrompt The message to be prompted
   *  @return returns the user input after it has been cleaned up
   */
  public static String promptString(String sPrompt) {
    String sInput;
    System.out.println(sPrompt); //prompt the user
    sInput = in.nextLine(); //accept user input
    sInput = sInput.trim(); //remove leading and trailing whitespace
    return sInput.toUpperCase(); //CONVERT TO UPPERCASE & RETURN
  }
  

  
}