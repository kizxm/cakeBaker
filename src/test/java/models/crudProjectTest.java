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
        crudProject project = new crudProject("cake", "something", "vanilla", "none");
        assertEquals(true, project instanceof crudProject);
    }

    public crudProject customCake(){
        return new crudProject("cake", "rainbow", "vanilla", "none");
    }
    public crudProject customCake2(){
        return new crudProject("choco", "pink only", "raspberry", "unicorn truffle");
    }


    @Test
    public void crudProjectCountsInstancesCorrectly() throws Exception {
        crudProject cake = customCake();
        crudProject cake2 = customCake2();
        assertEquals(2, crudProject.getAllCakes().size());
    }
    @Test
    public void updateChangesPostContent() throws Exception {
        crudProject cake = customCake();
        String formerContent = cake.getCakes();
        int formerId = cake.getId();

        cake.update("Chocolate", "Rainbow", "yellow", "none");

        assertEquals(formerId, cake.getId());
        assertNotEquals(formerContent, cake.getCakes());
    }



}