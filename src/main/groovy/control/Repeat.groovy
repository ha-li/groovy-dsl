package control

/**
 * Created by hlieu on 12/2/16.
 * a working implementation of
 *    Groovy in Action, 2nd Ed.,  Konig, King, Laforge, et al, Manning Publications, 2015
 *      section 19.6: Defining Your Own Control Structures
 *
 * using this we can define our own control structures.
 */
def repeat(int n, String output, Closure b) {
   for(int i = 0; i < n; i++) {
      b(output);
   }
}

def m = {
   String it ->
      println it;
}


repeat(3, "repeat me", m);
