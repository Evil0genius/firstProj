package lesson9;

import java.util.Objects;

public class PrintedMaterial {
    String titleOfBook;
    int publicationDate;
    String publishingOffice;

    public PrintedMaterial() {
    }


    public String getTitleOfBook() {
        return titleOfBook;
    }

    public void setTitleOfBook(String titleOfBook) {
        this.titleOfBook = titleOfBook;
    }

    public int getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(int publicationDate) {
        this.publicationDate = publicationDate;
    }

    public String getPublishingOffice() {
        return publishingOffice;
    }

    public void setPublishingOffice(String publishingOffice) {
        this.publishingOffice = publishingOffice;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PrintedMaterial that = (PrintedMaterial) o;

        if (publicationDate != that.publicationDate) return false;
        if (!Objects.equals(titleOfBook, that.titleOfBook)) return false;
        return Objects.equals(publishingOffice, that.publishingOffice);
    }

    @Override
    public int hashCode() {
        int result = titleOfBook != null ? titleOfBook.hashCode() : 0;
        result = 31 * result + publicationDate;
        result = 31 * result + (publishingOffice != null ? publishingOffice.hashCode() : 0);
        return result;
    }

}
