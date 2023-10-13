package lesson9;

import java.util.ArrayList;


public class LibraryUtils {
    private static ArrayList<PrintedMaterial> database = new ArrayList<>();

    public void allPrintedPublications(){
        database.add(new Books("Harry potter", 2000, "dont know", "Rowling", 300));
        database.add(new Books("Game of thrones", 1990, "dont know", "Martin", 400));
        database.add(new Books("Martian", 2020, "dont know", "Weir", 200));
        database.add(new Magazines("Maxim", 2000, "dont know", 5));
        database.add(new Magazines("Cosmopolitan", 2000, "dont know", 7));
        database.add(new Magazines("Time", 2000, "dont know", 3));

    }

    public static ArrayList<PrintedMaterial> getDatabase() {
        return database;
    }

    public static void setDatabase(ArrayList<PrintedMaterial> database) {
        LibraryUtils.database = database;
    }

    public static void printLibrary(){
        for(PrintedMaterial b : database) System.out.println(b.toString());
    }

    public static void searchFattestBook(){
        int numberOfPages = 0;
        for(PrintedMaterial b : database){
            if(b instanceof Books){
                if(((Books) b).getNumberOfPages() > numberOfPages){
                    numberOfPages = ((Books) b).getNumberOfPages();
                }
            }

        }
        for(PrintedMaterial b : database){
            if(b instanceof Books){
                if(((Books) b).getNumberOfPages() == numberOfPages){
                    System.out.println("Самая толстая книга: " + b.toString());
                }
            }

        }
    }
}
