/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.villagepeople.scratch;

import javax.ejb.Stateless;
import javax.inject.Inject;

/**
 *
 * @author michele
 */
@Stateless
public class MarryService implements MarryServiceLocal {

    @Inject
    Fortuna f;
    
    @Override
    public boolean getMarried(String thisOne, String thatOne) {
        if ( f.marringChances() > 0 ) return true;
        return false;
    }

    
}
