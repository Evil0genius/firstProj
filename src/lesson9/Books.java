package lesson9;

import java.util.Objects;

public class Books extends PrintedMaterial {
    private String author;
    private int numberOfPages;

    public Books() {
    }

    public Books(String titleOfBook, int publicationDate, String publishingOffice, String author, int numberOfPages) {
        this.titleOfBook=titleOfBook;
        this.publicationDate=publicationDate;
        this.publishingOffice=publishingOffice;
        this.author = author;
        this.numberOfPages = numberOfPages;
    }

    public String getTitleOfBook() {
        return super.getTitleOfBook();
    }

    public int getPublicationDate() {
        return super.getPublicationDate();
    }

    public void setPublicationDate(int publicationDate) {
        super.setPublicationDate(publicationDate);
    }

    public String getPublishingOffice() {
        return super.getPublishingOffice();
    }

    public void setPublishingOffice(String publishingOffice) {
        super.setPublishingOffice(publishingOffice);
    }

    public void setTitleOfBook(String titleOfBook) {
        super.setTitleOfBook(titleOfBook);
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        if(numberOfPages > 0){
            this.numberOfPages = numberOfPages;
        }else throw new RuntimeException("Число страниц больше нуля!");

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Books books = (Books) o;

        if (numberOfPages != books.numberOfPages) return false;
        return Objects.equals(author, books.author);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (author != null ? author.hashCode() : 0);
        result = 31 * result + numberOfPages;
        return result;
    }

    @Override
    public String toString() {
        return "Books{" +
                "author='" + author + '\'' +
                ", numberOfPages=" + numberOfPages +
                ", titleOfBook='" + titleOfBook + '\'' +
                ", publicationDate=" + publicationDate +
                ", publishingOffice='" + publishingOffice + '\'' +
                '}';
    }
}


