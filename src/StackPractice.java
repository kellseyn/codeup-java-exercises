import java.util.Stack;

public class StackPractice {
    public static void main(String[] args){
        Stack<String>rascalFlattsAlbums = new Stack<>();

        rascalFlattsAlbums.push("Rascal Flatts (2000)");
        rascalFlattsAlbums.push("Melt (2002)");
        rascalFlattsAlbums.push("Feels Like Today (2004)");
        rascalFlattsAlbums.push("Me and My Gang (2006)");
        rascalFlattsAlbums.push("Still Feels Good (2007)");
        rascalFlattsAlbums.push("Unstoppable (2009)");
        rascalFlattsAlbums.push("Nothing Like This (2010)");
        rascalFlattsAlbums.push("Changed (2012)");
        rascalFlattsAlbums.push("Rewind (2014)");
        rascalFlattsAlbums.push("Back To Us (2015)");

        System.out.println(rascalFlattsAlbums);

        String latestAlbum = rascalFlattsAlbums.pop();
        System.out.println();
        System.out.println("Popped: " + latestAlbum);
        System.out.println();
        System.out.println("Current list: " + rascalFlattsAlbums);
        System.out.println();
        rascalFlattsAlbums.push(latestAlbum);
        System.out.println(rascalFlattsAlbums);
        System.out.println();
        rascalFlattsAlbums.pop();
        rascalFlattsAlbums.pop();



        latestAlbum = rascalFlattsAlbums.peek();
        System.out.println("Currently last album: " + latestAlbum);


    }
}
