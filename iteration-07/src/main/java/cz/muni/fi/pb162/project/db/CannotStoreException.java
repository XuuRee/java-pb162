/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cz.muni.fi.pb162.project.db;

/**
 * @author xvalchar
 */
public class CannotStoreException extends DbException {

    /**
     * Constructor 
     */
    public CannotStoreException() {
        super();
    }
    
    /**
     * Constructor
     * 
     * @param msg message
     */
    public CannotStoreException(String msg) {
        super(msg);
    }
    
    /**
     * Constructor
     * 
     * @param msg message
     * @param cause cause
     */
    public CannotStoreException(String msg, Throwable cause) {
        super(msg, cause);
    }
    
    /**
     * Constructor
     * 
     * @param cause cause
     */
    public CannotStoreException(Throwable cause) {
        super(cause);
    }
    
}
