public class Library {
    LibraryItem libraryItems[];
    public static int counter = 0;

    public Library() {
        this.libraryItems = new LibraryItem[500];
    }

    void addItem(LibraryItem item){
        libraryItems[counter] = item;
        counter++;
    }

    void borrowItem(LibraryItem item){
        for(int i = 0;i < libraryItems.length;i ++){
            if(libraryItems[i] != null) {
                if (libraryItems[i].getTitle().equals(item.getTitle())) {
                    libraryItems[i].setBorrowed(true);
                }
            }
        }
    }

    void returnItem(LibraryItem item){
        for(int i = 0;i < libraryItems.length;i ++){
            if(libraryItems[i] != null) {
                if (libraryItems[i].getTitle().equals(item.getTitle())) {
                    libraryItems[i].setBorrowed(false);
                }
            }
        }
    }

    void displayAvailableItems() {
        for (LibraryItem item : libraryItems){
            if(item != null) {
                System.out.printf("%s\t%s\t%d\t%b\t", item.getTitle(), item.getAuthor(), item.getYear(), item.isBorrowed());
                System.out.println(item.getItemType());
            }
        }
    }
    void displayBorrowedItems(){
        for (LibraryItem item : libraryItems){
            if(item != null) {
                if (item.isBorrowed() == true) {
                    System.out.println(item.getTitle());
                }
            }
        }
    }

}
