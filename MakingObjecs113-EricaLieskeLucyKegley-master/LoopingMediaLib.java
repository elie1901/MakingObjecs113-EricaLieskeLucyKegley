

public class LoopingMediaLib
{
  public static void main()
  {
    /*for (int i = 1; i<=3; i++){
      System.out.println(MediaFile.readString());
    }*/
        
    String songInfo = MediaFile.readString();
    
    while (songInfo != null){
        System.out.println(songInfo);
        songInfo = MediaFile.readString();
    }
    
    
      
    
      
      
      
   }
}
