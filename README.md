# Java Movie-Database Project

A Java project demonstrating interface implementation, abstract class extension,
array-based data structures, and unit testing. It models a simplified streaming
service database that stores movies in a dynamically resizing array.

## Overview

| Type | Kind | Description |
|------|------|-------------|
| `MovieCollection` | Interface | Defines database operations: add, remove, contains, isEmpty, size, capacity |
| `MovieADT` | Abstract class | Holds a movie's title, genre, rating, year, and an `equals()` based on title |
| `Movie` | Class | Concrete movie, extends `MovieADT` |
| `NetvidsDatabase` | Class | Implements `MovieCollection` using an array of `Movie` objects |

## Concepts Demonstrated

- **Abstract classes**: `Movie` inherits all getters, setters, and `equals()` from `MovieADT`
- **Interfaces**: `NetvidsDatabase` implements every method of `MovieCollection`
- **Array-based data structure**: movies are stored in an array whose capacity doubles
  when full
- **Constant-time removal**: `remove()` copies the last element into the vacated slot
  instead of shifting elements, so the array never has gaps
- **Exception handling**: `remove()` throws `IllegalArgumentException` for a null
  movie and `NoSuchElementException` if the movie is not found
- **Unit testing**: JUnit tests using `student.TestCase`, including equals() edge cases
  (self, null, different type, same title, different title)

## Project Structure
collections/
├── Movie.java

├── MovieADT.java

├── MovieCollection.java

├── MovieTest.java

├── NetvidsDatabase.java

└── NetvidsDatabaseTest.java


## Running the Tests

The tests extend `student.TestCase`, so `student.jar` must be on your classpath.

1. Create a Java project and a package named `collections`
2. Place all six `.java` files in that package
3. Add `student.jar` to the project's build path
4. Run `MovieTest` and `NetvidsDatabaseTest` as JUnit tests

## Example Usage

```java
NetvidsDatabase db = new NetvidsDatabase();

Movie m = new Movie("Ironman");
m.setGenre("Action");
m.setYear(2008);
m.setRating(5);

db.addMovie(m);          // true
db.addMovie(m);          // false (duplicate title)
db.contains(m);          // true
db.size();               // 1
db.capacity();           // 10
db.remove(m);            // returns the removed movie
db.isEmpty();            // true
```

