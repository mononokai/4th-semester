public class Staff {
    public void lendBook(Library library, User user, String book) {
        library.lentBooks.put(user, book);
    }

    public void lendPaper(Library library, User user, String paper) {
        library.lentPapers.put(user, paper);
    }
}
