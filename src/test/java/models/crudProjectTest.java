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
        crudProject project = new crudProject("cake", "something");
        assertEquals(true, project instanceof crudProject);
    }

    public crudProject customCake(){
        return new crudProject("cake", "rainbow");
    }
    public crudProject customCake2(){
        return new crudProject("choco", "pink only");
    }


    @Test
    public void crudProjectCountsInstancesCorrectly() throws Exception {
        crudProject cake = customCake();
        crudProject cake2 = customCake2();
        assertEquals(1, crudProject.getAllCakes().size());
    }

}