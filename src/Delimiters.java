import java.util.ArrayList;

public class Delimiters
{
    /** The open and close delimiters **/
    private String openDel;
    private String closeDel;

    /** Constructs a Delimiters object where open is the open delimiter and close is the
     *  close delimiter.
     *  Precondition: open and close are non-empty strings.
     */
    public Delimiters(String open, String close)
    {
        openDel = open;
        closeDel = close;
    }

    /** Returns an ArrayList of delimiters from the array tokens, as described in part (a). */
    public ArrayList<String> getDelimitersList(String[] tokens)
    {
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < tokens.length; i++) {
            String s =  tokens[i];
            if (s.equals(openDel) || s.equals(closeDel)){
                list.add(s);
            }
        }
        return list;
    }

    /** Returns true if the delimiters are balanced and false otherwise, as described in part (b).
     *  Precondition: delimiters contains only valid open and close delimiters.
     */
    public boolean isBalanced(ArrayList<String> delimiters)
    {
        int open = 0;
        int closed = 0;
        for (String s : delimiters) {
            if (s.equals(openDel)) {
                open++;
            }
            if (s.equals(closeDel)) {
                closed++;
            }
            if (closed > open) {
                return false;
            }
        }
        if (closed != open){
            return false;
        }
        return true;
    }
}