import fi.helsinki.cs.tmc.edutestutils.MockStdio;
import fi.helsinki.cs.tmc.edutestutils.Points;
import fi.helsinki.cs.tmc.edutestutils.ReflectionUtils;
import java.lang.reflect.Method;
import java.util.NoSuchElementException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.junit.*;
import static org.junit.Assert.*;

@Points("02-20.5")
public class Part5bTest {
    @Rule
    public MockStdio io = new MockStdio();

    @Test
    public void test() {
        int[][] input = { { 1, -1, 1 }, { 2, 5, -1, 1 }, { 6, 1, 4, 7, 4, 9, -1, 3 },
                { 7, 2, 4, 7, 4, 9, 5, 1, 5, 7, -1, 7 } };

        for (int i = 0; i < input.length; i++) {
            check(input[i], "Odd");
        }
    }

    private void check(int[] input, String str) {
        int oldOut = io.getSysOut().length();
        io.setSysIn(stringify(input));
        callMain(RepeatingBreakingAndRemembering.class);
        String out = io.getSysOut().substring(oldOut);
        int expected = result(input);

        String errorMsg = "With the input " + stringifyInBetween(input) + " output should be \"" + str + ": " + expected
                + "\"";
        assertTrue("you aren't printing anything!", out.length() > 0);
        assertEquals(errorMsg, expected, getLastNumber(line(out, str)));
    }

    private void callMain(Class kl) {
        try {
            kl = ReflectionUtils.newInstanceOfClass(kl);
            String[] t = null;
            String x[] = new String[0];
            Method m = ReflectionUtils.requireMethod(kl, "main", x.getClass());
            ReflectionUtils.invokeMethod(Void.TYPE, m, null, (Object) x);
        } catch (NoSuchElementException e) {
            fail("remember to quit when the user gives -1");
        } catch (Throwable e) {
            fail("unexpected error, are you sure you aren't dividing by zero?");
        }
    }

    private static int getLastNumber(String inputStr) {
        String patternStr = "(?s).*?(\\d+)\\s*$";

        Matcher matcher = Pattern.compile(patternStr).matcher(inputStr);

        assertTrue("Output should contain od line of the type \"Odd: 3\"", matcher.find());

        int number = Integer.valueOf(matcher.group(1));
        return number;
    }

    private String stringify(int[] array) {
        String str = "";
        for (int i = 0; i < array.length - 1; i++) {
            str += array[i] + "\n";

        }

        return str;
    }

    private String stringifyInBetween(int[] array) {
        String str = "";
        for (int i = 0; i < array.length - 1; i++) {
            str += array[i] + " ";
        }

        return str;
    }

    private int result(int[] input) {
        return input[input.length - 1];
    }

    private String line(String out, String str) {
        for (String line : out.split("\n")) {
            if (line.toLowerCase().contains(str.toLowerCase()))
                return line;
        }

        fail("Your program should print the number of odd the numbers" + "with a line of the type \"Odd: 3\"\n");
        return "";
    }
}
