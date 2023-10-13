package lesson9;


public class MainHomework {
    public static void main(String[] args) {

        LibraryUtils libraryUtils = new LibraryUtils();
        libraryUtils.allPrintedPublications();
        LibraryUtils.printLibrary();
        LibraryUtils.searchFattestBook();
    }
    //полиморфизм используется при объединении в коллекцию и выводе на консоль разных типов данных одним методом
}
