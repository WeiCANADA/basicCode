package week13;

/**
 * @author Wei Liu
 * @version V1.0
 */
public class ArtCollectionDrive {
    public static void main(String[] args) {
        ArtCollection artCollection = new ArtCollection();
        artCollection.addArt(new Art("art1", "A", 100));
        artCollection.addArt(new Art("art2", "A", 200));
        artCollection.addArt(new Art("art3", "A", 300));
        artCollection.addArt(new Art("art4", "A", 400));
        artCollection.addArt(new Art("art5", "A", 500));
        System.out.println(artCollection.collectionSize());
        System.out.println(artCollection);
       // artCollection.removeArt("art1");
        //System.out.println(artCollection.collectionSize());
      //  System.out.println(artCollection);
    }
}
