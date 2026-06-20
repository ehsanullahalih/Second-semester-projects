
package ninethchapter;



    
    import java.io.BufferedReader;

import java.io.FileReader;
import java.io.IOException;


public class HiSceneBild {

   
    public static void main(String[] args) throws IOException{
        
        String phat="C:\\Users\\Osmani\\Desktop\\osmani.txt";
        BufferedReader br=null;
        String data="";
        try{
        br=new BufferedReader(new FileReader(phat));
        data=br.readLine();
            System.out.println(data);
        }
         finally{
            
            br.close();
          
        }
    }
    
}

    

