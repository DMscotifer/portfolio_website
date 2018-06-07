import models.Blog;
import org.junit.Before;
import org.junit.Test;

import java.sql.Blob;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class BlogTest {

    ArrayList<String> tags1;
    Blog blog1;

    @Before
    public void setUp() throws Exception {
        blog1 = new Blog("The Simple Solution to the UK's Housing Problem - Apartments", "Apartments are cheaper to heat, have better views and use land more efficiently", tags1);
    }

    @Test
    public void hasTitle() {
        assertEquals("The Simple Solution to the UK's Housing Problem - Apartments", blog1.getTitle());
    }
}
