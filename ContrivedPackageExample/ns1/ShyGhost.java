/**
 * Ghosts!
 * @version 0.3
 * @author Linus Torvalds
 */

// The classes defined here belong to the "ns1" package
package ns1;

// Since we're importing all classes in ns2, we don't have to use the
// ns2 prefix. e.g. we can use SuperManlyIguana instead of ns2.SuperManlyIguana
import ns2.*;

public class ShyGhost
{
    public void talk() {
        // the shy ghost can't speak for himself and has to get
        // someone else to do it for him
        
        SuperManlyIguana smi = new SuperManlyIguana();
        smi.talk();
    }
}
