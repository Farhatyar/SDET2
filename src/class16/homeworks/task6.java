package class16.homeworks;

public class task6 {

    char getGrade (int a){
        if(a>=90) {
            return ('A');
        }
        else if(a>=80) {
            return ('B');
        }
        else if(a>=70 ) {
            return ('C');
        }
        else if (a>=50 ){
            return ('D');
        }else {
            return ('F');
        }
    }
}
