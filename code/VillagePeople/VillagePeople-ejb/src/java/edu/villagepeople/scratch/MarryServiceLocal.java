/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.villagepeople.scratch;

import javax.ejb.Local;

/**
 *
 * @author michele
 */
@Local
public interface MarryServiceLocal {

    public boolean getMarried(String thisOne, String thatOne);
    
}
