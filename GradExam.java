
package chaptereight;


public class GradExam {
    
    public static void main(String[]args){
        
        char [][] answers={
            {'A','B','A','C'},
            {'D','B','A','B'},
            {'E','D','D','A'},
            {'D','B','D','D'},
            {'A','B','D','C'},
            {'B','B','E','C'},
            {'B','B','A','C'},
            {'E','B','E','C'}
        };
        int studentNumber=0;
        int highScore=0;
        int []score=new int[8];
        char [] keys={'D','B','D','D'};
        for(int i=0;i<answers.length;i++){
            int correctCount=0;
            for(int j=0;j<answers[0].length;j++){
                if(answers[i][j]==keys[j])
                    correctCount++;
                
            }
            score[i]=correctCount;
            
        }
        for(int i=0;i<score.length;i++){
            if(score[i]>highScore){
                highScore=score[i];
                studentNumber=i;
            }
        }
        
        System.out.println(studentNumber+" Student has high score "+highScore);
        
        
    }
    
    
}
