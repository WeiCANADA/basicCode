package week13;


import java.util.Arrays;

/**
 * @author Wei Liu
 */
public class ArtCollection {
private Art[] collection;
private int count;

    public ArtCollection() {
        int maxSize = 7;
        this.collection = new Art[maxSize];
        this.count = 0;
    }

    public boolean addArt(Art addPiece){
        boolean b = false;
        if(count < collection.length){
        collection[count++] = addPiece;
        b = true;
        }
        return b;
    }


    public boolean removeArt(Art removePiece ){
        boolean b = false;
        int len = collection.length;
        for (int i = 0; i < len; i++) {
            if(collection[i].equals(removePiece)){
                if(i < len - 1){//防止数组越界
                    collection[i] = collection[i + 1];
                }else {
                    collection[i] = null;//如果是最后一个element
                }
                count--;
            }
            b = true;
        }
        return b;
    }
    public int collectionSize(){
    return count;
    }
    public void increaseSize (){
        Art[] temp = new Art[collection.length * 2];
        for (int i = 0; i < collection.length; i++) {
            temp[i] = collection[i];
        }
        collection = temp;
    }

    @Override
    public String toString() {
        String  output = null;
        for (int i = 0; i < count; i++) {
            output += collection[i].toString() + "\n";
        }
        return output;
    }
}
