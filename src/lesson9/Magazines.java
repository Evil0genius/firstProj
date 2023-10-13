package lesson9;

public class Magazines extends PrintedMaterial {
    private int numberINYear;

    public Magazines() {
    }

    public Magazines(String titleOfBook, int publicationDate, String publishingOffice, int numberINYear) {
        this.publicationDate = publicationDate;
        this.publishingOffice = publishingOffice;
        this.titleOfBook = titleOfBook;
        this.numberINYear = numberINYear;
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

    public int getNumberINYear() {
        return numberINYear;
    }

    public void setNumberINYear(int numberINYear) {
        if(numberINYear >= 1 && numberINYear <= 12){
            this.numberINYear = numberINYear;
        }else throw new RuntimeException("Месяц от 1 до 12!");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Magazines magazines = (Magazines) o;

        return numberINYear == magazines.numberINYear;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + numberINYear;
        return result;
    }

    @Override
    public String toString() {
        return "Magazines{" +
                "numberINYear=" + numberINYear +
                ", titleOfBook='" + titleOfBook + '\'' +
                ", publicationDate=" + publicationDate +
                ", publishingOffice='" + publishingOffice + '\'' +
                '}';
    }
}
