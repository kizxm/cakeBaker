package models;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;


public class crudProjectTest {
    @After
    public void tearDown() throws Exception {
        crudProject.clearAllCakes();
    }
    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void instantiatesCorrectly() throws Exception {
        crudProject project = new crudProject("cake");
        assertEquals(true, project instanceof crudProject);
    }

    public crudProject cakeProject(){
        return new crudProject("cake")
    }

}