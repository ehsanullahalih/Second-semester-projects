
package chaptereight;


public class ChapterEight {

    
    public static void main(String[] args) {
       
        int [][] toDimArr={
            {1,3,4,5,9},
            {2,4,3,4,9},
            {5,6,8,9,0},
            {1,9,4,8,6},
            {7,4,7,9,8}
                
        };

        int maxRow=0;
        int indexOfMaxRow=0;
        
        for(int colum=0;colum<toDimArr[0].length;colum++){
            maxRow+=toDimArr[0][colum];
        }        
        for(int row=0;row<toDimArr.length;row++){
            int totalOfThisRow=0;
            for(int colum=0;colum<toDimArr[row].length;colum++)
                totalOfThisRow+=toDimArr[row][colum];
            if(totalOfThisRow>maxRow){
                maxRow=totalOfThisRow;
                indexOfMaxRow=row;
            }
           
        }
        System.out.println("Row"+indexOfMaxRow+"has the maximum sum of "+maxRow);
        
        }
       
    }
    

