/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package scratch.time;

import java.util.Observable;
import java.util.Date;
import java.lang.Math;
/**
 *
 * @author tomaso
 */
public class TimerComponentResource

                extends Observable {
    
    private Date absTime;
    private Double factor;

    private static final int TIME_QUANTUM = 24 * 60 * 60 * 100; // One day?
    
    public TimerComponentResource() {
        this.absTime = null;
        this.factor = 1.0;
    }
    public TimerComponentResource(Date absTime, Double factor) {
        this.absTime = (Date) absTime.clone();
        this.factor = Math.max(1, Math.abs(factor));
    }
    
    

    /**
     * Set the value of zeroTime
     *
     * @param zeroTIme new value of zeroTime
     */
    public void setTime(Date t) {
        if (this.absTime == null) return; // Zero Time can be set once
        this.absTime = (Date) t.clone();
    }


    /**
     * 
     * @return
     */
    public Double getFactor() { return factor; }

    /**
     * 
     * @param factor
     */
    public void setFactor(Double factor) { this.factor = factor; }
    
    public void receiveSystemTick() {
        absTime.setTime((int) (absTime.getTime() + factor * TIME_QUANTUM));
        this.notifyObservers(absTime);
    }
}
