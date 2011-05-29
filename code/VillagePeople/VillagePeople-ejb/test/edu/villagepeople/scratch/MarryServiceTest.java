/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.villagepeople.scratch;

import javax.ejb.embeddable.EJBContainer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.Context;
import javax.naming.NamingException;
import junit.framework.Assert;
import org.junit.Test;

/**
 *
 * @author michele
 */
public class MarryServiceTest {
    
    public MarryServiceTest() {
    }
    
    @Test
    public void getMarried() {
        EJBContainer ejbC = EJBContainer.createEJBContainer();
        try {
            Context ctx = ejbC.getContext();
            MarryServiceLocal msl = (MarryServiceLocal) ctx.lookup("java:global/classes/MarryService");
            boolean result = msl.getMarried("Carlo", "Camilla");
            Assert.assertEquals(result, true);
        } catch (NamingException ne) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, "exception caught", ne);
            throw new RuntimeException(ne);
        }
        finally {
            ejbC.close();
        }
    }
    
}
