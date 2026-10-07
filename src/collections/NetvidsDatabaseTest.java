package collections;
import java.util.NoSuchElementException;
import student.TestCase;

/**
 * This class tests the NetvidsDatabase class for correct output.
 * It verifies that the methods in the class do what they are expected to do.
 *
 * @author G.J. Hu
 * @version 2025.07.18
 */

public class NetvidsDatabaseTest extends TestCase {
    // ----------------------------------------------------------
    /**
     * Defines a new NetvidsDatabase object and a new Movie object that will be 
     * used to test the methods
     */
    private NetvidsDatabase nd1;
    private Movie movie18;

    // ----------------------------------------------------------
    /**
     * Creates and initializes values for those two objects
     */  
    
    public void setUp() {
        movie18 = new Movie("Godfather");
        movie18.setGenre("Romance");
        movie18.setYear(1972);
        movie18.setRating(5);
        nd1 = new NetvidsDatabase();
        nd1.addMovie(movie18);
    }

    // ----------------------------------------------------------
    /**
     * Tests that the addMovie() method returns the expected output
     */
    public void testAddMovie() {
        assertEquals(false, nd1.addMovie(movie18));
        Movie movie19;
        movie19 = new Movie("Spiderman");
        assertEquals(true, nd1.addMovie(movie19));
    }

    // ----------------------------------------------------------
    /**
     * Tests that the contains() method returns the expected output
     */
    public void testContains() {
        assertEquals(true, nd1.contains(movie18));
        Movie movie20;
        movie20 = new Movie("Frozen");
        assertEquals(false, nd1.contains(movie20));
    }
    
    // ----------------------------------------------------------
    /**
     * Tests that the isEmpty() method returns the expected output
     */
    public void testIsEmpty() {
        assertEquals(false, nd1.isEmpty());
        NetvidsDatabase nd2;
        nd2 = new NetvidsDatabase();
        assertEquals(true, nd2.isEmpty());
    }
    
    // ----------------------------------------------------------
    /**
     * Tests that the size() method returns the expected output
     */
    public void testSize() {
        NetvidsDatabase nd3;
        nd3 = new NetvidsDatabase();
        assertEquals(0, nd3.size());
    }
    
    // ----------------------------------------------------------
    /**
     * Tests that the capacity() method returns the expected output
     */
    public void testCapacity() {
        assertEquals(10, nd1.capacity());
    }
    
    // ----------------------------------------------------------
    /**
     * Tests that the remove() method returns the expected output
     */
    public void testRemove() {
        Movie movie21;
        movie21 = new Movie("Jurassic World");
        Exception thrown = null;
        try {
            nd1.remove(movie21);
        }
        catch (Exception exception) {
            thrown = exception;
        }
        assertNotNull(thrown);
        assertTrue(thrown instanceof NoSuchElementException);
    }
    
    // ----------------------------------------------------------
    /**
     * The second part of testing that the remove() method returns the 
     * expected output
     */
    public void testRemove2() {
        Movie movie22;
        movie22 = null;
        Exception thrown2 = null;
        try {
            nd1.remove(movie22);
        }
        catch (Exception exception) {
            thrown2 = exception;
        }
        assertNotNull(thrown2);
        assertTrue(thrown2 instanceof IllegalArgumentException);
        assertEquals(movie18, nd1.remove(movie18));
        assertEquals(false, nd1.contains(movie18));

    }
    // ----------------------------------------------------------
    /**
     * Tests that the expandCapacity() method returns the expected output
     */
    public void testExpandCapacity() {
        int original = nd1.capacity();
        for (int i = nd1.size(); i <= original; i++) {
            Movie temp = new Movie("Title" + i);
            nd1.addMovie(temp);
        }
        assertEquals(nd1.capacity(), 2 * original);
    }
}
