import com.github1.interviewquestion.InterviewQuestion;
import org.junit.Test;
import org.junit.Assert;

public class FirstTest {
    int a =3, b=6, c=9;
    @Test
    public void testAdd(){
        Assert.assertEquals(c, InterviewQuestion.add(a,b));
    }

    @Test
    public void testSub(){
        Assert.assertEquals(c, InterviewQuestion.sub(a,b));
    }


    @Test
    public void testMul(){
        Assert.assertEquals(c, InterviewQuestion.multiply(a,b));
    }

    @Test
    public void testDivide(){

        Assert.assertEquals(c, InterviewQuestion.divide(a,b));
    }

}

