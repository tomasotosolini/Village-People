/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.villagepeople.scratch;

import javax.ejb.Singleton;
import javax.ejb.LocalBean;

/**
 *
 * @author michele
 */
@Singleton
@LocalBean
public class Fortuna {

    public double marringChances() {
        return 0.5;
    }

}
