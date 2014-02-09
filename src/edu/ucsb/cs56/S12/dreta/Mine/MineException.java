package edu.ucsb.cs56.S12.dreta.Mine;
/**
   An exception for illegal moves in MineSweeper, used in GUIGrid
   (its an unchecked exception, so it extends  RuntimeException rather than Exception)

   @author Daniel Reta
   @version CS56 Spring 2012, UCSB
   @see GUIGrid
 */
public class MineException extends RuntimeException {

    // We must declare this constructor if we want it to exist
    // since we declared the other one, this one won't get made automatically.

    public MineException () {};

    // We must declare this constructor if we want to be able to create
    // instances with messages, because we have to pass the message to the 
    // superclass (parent) constructor.

    public MineException (String message) {
	super(message);
    }
}
