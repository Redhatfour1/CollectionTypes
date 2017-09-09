import java.util.*;

public class CollectionTypes {
  public static void main(String[] args) {
    planetArrayList();
    String planetToFind = "Earth";
    findPlanetInTheList(planetToFind, planetArrayList());
  }
public static boolean searchHashMap(String s, HashMap<String, String> h){
    return h.containsValue(s);
  }
    // Write a function that takes in an ArrayList of 5 planet names as Strings
public static ArrayList<String> planetArrayList() {
  ArrayList<String> planets = new ArrayList<String>();
  planets.add("Neptune");
  planets.add("Mars");
  planets.add("Venus");
  planets.add("Saturn");
  planets.add("Jupiter");
  planets.add("Neptune");
  planets.add("Mars");
  System.out.println(planets);
  return planets;
}
  // checks if the ArrayList contains “Earth"
  public static void findPlanetInTheList(String planetToFind, ArrayList<String> planets) {
    if (planets.contains(planetToFind)) {
      System.out.println(planetToFind + " was found in the list");
    } else {
      planets.add("Earth");
      System.out.println(planetToFind + " was not found and so we added to the list");
      // return the new ArrayList
      System.out.println(planets);
      // using a TreeSet, sorts the List alphabetically and removes any duplicates
      TreeSet<String> alphabet = new TreeSet<String>(planets);
      System.out.println("Set: "+alphabet);
      }
      HashMap<String, String> rulerPlanetNames = new HashMap<String, String>();
      rulerPlanetNames.put("Gold", "Sun");
      rulerPlanetNames.put("Silver","Moon");
      rulerPlanetNames.put("Copper", "Venus");
      rulerPlanetNames.put("Iron", "Mars");
      rulerPlanetNames.put("Tin", "Jupiter");
      rulerPlanetNames.put("Lead", "Saturn");
      System.out.println("\nSearch HashMap for the value that doesn't exist: " + searchHashMap("Silver, Moon", rulerPlanetNames));

  }
}
