package step16;

public class ExamControl {
    
public static void main(String args[]){
    Exam exam = new Exam();
    exam.국어성적 = 30;
    exam.영어성적 = 40;
    exam.수학성적 = 50;

    System.out.println("국어성적 : " + exam.국어성적 + "\n영어성적 : " + exam.영어성적 + "\n수학성적 : " + exam.수학성적);
    
    }
}
    class Exam{
    int 국어성적;
    int 영어성적;
    int 수학성적;
    
}