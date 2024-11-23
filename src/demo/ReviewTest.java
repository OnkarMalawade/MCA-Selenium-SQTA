package demo;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ReviewTest {

    @Test
    @Parameters({"reviewer1Marks", "reviewer2Marks"})
    public void calculateAverageMarks(int reviewer1Marks, int reviewer2Marks) {
        double average = (reviewer1Marks + reviewer2Marks) / 2.0;
        System.out.println("Average Marks: " + average);
        
        if (average > 4.0) {
            System.out.println("Writer is shortlisted.");
        } else {
            System.out.println("Writer is not shortlisted.");
        }
    }
}
