package progbar;

import java.util.Vector;

/*implementazione di una coda come struttura dati generica adatta a trattare qualsiasi tipo di oggetto
import java.util.*;*/

class Coda{
    
  private Vector elementi;

  public Coda()
  {
    elementi = new Vector();
  }

  public void aggiungi(Object obj)
  {
    elementi.addElement(obj);
  }

  public Object togli()
  {
    Object obj = null;
    int size = elementi.size();

    if (size > 0)
    {
      obj = elementi.elementAt(0);
      elementi.removeElementAt(0);
    }
    return obj;
  }

  public boolean vuota()
  {
    if (elementi.size() > 0)
    {
      return false;
    }
    else
    {
      return true;
    }
  }

  public int size()
  {
    return elementi.size();
  }
}