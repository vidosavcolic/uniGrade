public class gradeCalc {

    public String determinateGrade (int points){
        if (points < 0){
            throw new IllegalArgumentException("Grade can not be valid");
        } else if (points < 51) {
            return "5";
        } else if (points < 61) {
            return "6";
        } else if (points < 71) {
            return "7";
        } else if (points < 81) {
            return "8";
        } else if (points < 91) {
            return "9";
        }else {
            return "10";
        }


    }



}
