/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package scratch.time;

import java.util.Observable;
import java.util.Date;

/**
 *
 * This class acts as a mediator between system timer and time affected entities.
 * System time ticks a regular time intervals, while simulated time allows simulated
 * time to change at different (faster) speed.
 * 
 * @author tomaso
 * 
 */
public class TimerComponentResource

                extends Observable {
    
    private Date absTime;
    private Double factor;

    private static final int TIME_QUANTUM = 24 * 60 * 60 * 100; // One day?
    
    /**
     * 
     */
    public TimerComponentResource() {
        this.absTime = null;
        this.factor = 1.0;
    }
    /**
     * 
     * @param absTime
     * @param factor
     */
    public TimerComponentResource(Date absTime, Double factor) {
        this.absTime = (Date) absTime.clone();
        this.factor = Math.max(1, Math.abs(factor));
    }
    
    

    /**
     * Set the value of zeroTime
     *
     * @param t 
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
    
    /**
     * 
     */
//    @Timer?
    public void receiveSystemTick() {
        if (absTime == null) return;
        absTime.setTime((int) (absTime.getTime() + factor * TIME_QUANTUM));
        this.notifyObservers(absTime);
    }
}
