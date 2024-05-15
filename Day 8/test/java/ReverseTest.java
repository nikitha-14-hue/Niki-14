import org.example.ReverseString;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ReverseTest {
    @Test
    void SinglewordInput()
    {
        String expected="Hello";
        String actual= ReverseString.Reverse("Hello");
        Assertions.assertEquals(actual,expected);

    }
    @Test
    void Multiplewords()
    {
        String e="world hello";
        String a=ReverseString.Reverse("hello world");
        Assertions.assertEquals(a,e);
    }
    @Test

    void leadingtrailingspaces()
    {
        String e="world hello";
        String a=ReverseString.Reverse("  hello world   ");

        Assertions.assertEquals(a,e);
    }
    @Test
    void extraspaces()
    {

        String e="world hello";
        String a=ReverseString.Reverse("hello    world");
        Assertions.assertEquals(a,e);

    }
    @Test
    void emptystring()
    {
        String e="";
        String a=ReverseString.Reverse("");
        Assertions.assertEquals(a,e);
    }
    @Test
    void specialcharacters()
    {
        String e="world???\\ \\hello!";
        String a=ReverseString.Reverse("\\hello! world???\\");
        Assertions.assertEquals(a,e);

    }
}
