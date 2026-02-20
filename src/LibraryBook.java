public class LibraryBook {
    private String bookTitle="Unknown";
    private String author="Unknown";
    private int pages=1;

    public String getBookTitle() {
        return bookTitle;
    }
    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPages() {
        return pages;
    }
    public void setPages(int pages) {
        if (pages > 0) {
            this.pages = pages;
        } else {
            this.pages = 1;
        }
    }

    public boolean isThick() {
        return pages > 500;
    }
}