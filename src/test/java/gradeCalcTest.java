import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class gradeCalcTest {

    @Test
    void fiftyGivesGrade5 (){
        var grade = new gradeCalc();
        assertEquals("5",grade.determinateGrade(50));
    }

    @Test
    void sixtyGivesGrade6 (){
        var grade = new gradeCalc();
        assertEquals("6",grade.determinateGrade(60));
    }

    @Test
    void seventyGivesGrade7 (){
        var grade = new gradeCalc();
        assertEquals("7",grade.determinateGrade(70));
    }

    @Test
    void eightyGivesGrade8 (){
        var grade = new gradeCalc();
        assertEquals("8",grade.determinateGrade(80));
    }

    @Test
    void ninetyGivesGrade9 (){
        var grade = new gradeCalc();
        assertEquals("9",grade.determinateGrade(90));
    }

    @Test
    void hundredGivesGrade10 (){
        var grade = new gradeCalc();
        assertEquals("10",grade.determinateGrade(100));
    }

    @Test
    void fiftyOneGivesGrade6 (){
        var grade = new gradeCalc();
        assertEquals("6",grade.determinateGrade(51));
    }

    @Test
    void sixtyOneGivesGrade7 (){
        var grade = new gradeCalc();
        assertEquals("7",grade.determinateGrade(61));
    }

    @Test
    void seventyOneGivesGrade8 (){
        var grade = new gradeCalc();
        assertEquals("8",grade.determinateGrade(71));
    }

    @Test
    void eightryOneGivesGrade9 (){
        var grade = new gradeCalc();
        assertEquals("9",grade.determinateGrade(81));
    }

    @Test
    void ninetyOneGivesGrade10 (){
        var grade = new gradeCalc();
        assertEquals("10",grade.determinateGrade(91));
    }

    @Test
    void zeroOneGivesGrade5 (){
        var grade = new gradeCalc();
        assertEquals("5",grade.determinateGrade(0));
    }

    @Test
    void negativeReturnsIllegalArgumentExep (){
        var grade = new gradeCalc();
        assertThrows(IllegalArgumentException.class, () ->{
            grade.determinateGrade(-1);
        });
    }



}