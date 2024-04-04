import java.util.*;

public class WordList
{
  private ArrayList <String> myList;

  public WordList() { myList = new ArrayList<String>(); }
  public void add(String word) { myList.add(word); }
  public String toString() { return myList.toString(); }

  public int numWordsOfLength(int len)
  {
    int count = 0;
    for(int i = 0; i < myList.length; i++){
      if(myList[i].length() == len){
        count++;
      }
    }
    return count;
  }

  public void removeWordsOfLength(int len)
  {
    int i = 0;
    int co = 0;
    while(i < myList.length){
      if(myList[i-co].length() == len){
        myList.remove(i-co);
        co++;
      }
      i++;
    }
}
