package collections;
import java.util.ArrayList;
import student.TestCase;

/**
 * This class tests the Movie class for correct output.
 * It verifies that the methods in the class do what they are expected to do.
 *
 * @author G.J. Hu
 * @version 2025.07.18
 */

public class MovieTest extends TestCase {
    // ----------------------------------------------------------
    /**
     * Defines a new Movie object that will be used to test the methods
     */
    private Movie movie1;
    
    // ----------------------------------------------------------
    /**
     * Creates and initializes values for that new Movie object
     */  
    
    public void setUp() {
        movie1 = new Movie("Ironman");
        movie1.setGenre("Action");
        movie1.setYear(2008);
        movie1.setRating(5);
    }
    
    // ----------------------------------------------------------
    /**
     * Tests that the getTitle() method returns the expected output
     */
    public void testGetTitle() {
        assertEquals("Ironman", movie1.getTitle());
    }
    
    // ----------------------------------------------------------
    /**
     * Tests that the getGenre() method returns the expected output
     */
    public void testGetGenre() {
        assertEquals("Action", movie1.getGenre());
    }
    
    // ----------------------------------------------------------
    /**
     * Tests that the getRating() method returns the expected output
     */
    public void testGetRating() {
        assertEquals(5, movie1.getRating());
    }
    
    // ----------------------------------------------------------
    /**
     * Tests that the getYear() method returns the expected output
     */
    public void testGetYear() {
        assertEquals(2008, movie1.getYear());
    }
    
    // ----------------------------------------------------------
    /**
     * Tests that the setRating() method returns the expected output
     */
    public void testSetRating() {
        movie1.setRating(4);
        assertEquals(4, movie1.getRating());
    }
    
    // ----------------------------------------------------------
    /**
     * Tests that the setGenre() method returns the expected output
     */
    public void testSetGenre() {
        movie1.setGenre("Drama");
        assertEquals("Drama", movie1.getGenre());
    }
    
    // ----------------------------------------------------------
    /**
     * Tests that the setYear() method returns the expected output
     */
    public void testSetYear() {
        movie1.setYear(2013);
        assertEquals(2013, movie1.getYear());
    }
    
    // ----------------------------------------------------------
    /**
     * Tests that the equals() method returns the expected output
     */
    public void testEquals() {
        assertEquals(true, movie1.equals(movie1));
        Object o = new ArrayList<Integer>();
        assertEquals(false, movie1.equals(o));
        Movie movie2;
        movie2 = new Movie("The Lord of the Rings");
        movie2.setGenre("Adventure");
        movie2.setYear(2001);
        movie2.setRating(4);
        assertEquals(false, movie1.equals(movie2));              
    }
    
    // ----------------------------------------------------------
    /**
     * The second part of testing that the equals() method returns the 
     * expected output
     */
    public void testEquals2() {
        Object a = null;
        assertEquals(false, movie1.equals(a));
    }
    
    // ----------------------------------------------------------
    /**
     * The third part of testing that the equals() method returns the 
     * expected output
     */
    public void testEquals3() {
        Movie movie3;
        movie3 = new Movie("Ironman");
        movie3.setGenre("Science fiction");
        movie3.setYear(2010);
        movie3.setRating(3);
        assertEquals(false, movie1.equals(movie3));  
    }
}
