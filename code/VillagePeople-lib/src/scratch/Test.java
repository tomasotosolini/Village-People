/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package scratch;

/**
 *
 * @author tomaso
 */
public class Test {

    protected String field1 = "Ciao";

    /**
     * Get the value of field1
     *
     * @return the value of field1
     */
    public String getField1() {
        return field1;
    }

    /**
     * Set the value of field1
     *
     * @param field1 new value of field1
     */
    public void setField1(String field1) {
        this.field1 = field1;
    }

    public Test() {
    }

    @Override
    public String toString() {
        return "Test{" + "field1=" + field1 + '}';
    }

    
}
