package pirc.platform.api;

/**
 * This interface contract provides some methods that are needed by the 
 * token processor to figure properly process dictionary tokens.  These 
 * methods are used by the dictionary tokenizer for figure out whether 
 * a multiword token is part or all of a previously existing dictionary
 * entry.  In the case of our multi-word token parse, the issue here is 
 * need to look at the inbound words one by one to figure out whether we 
 * have a multi-word token.
 */
public interface TokenDictionary {
   /**
    * @return true if the provided term constitutes part of a
    *  previously existing dictionary entry.  If so, it is assumed that we
    *  want to continue looking at the following terms to see if we have 
    *  a complete match.
    */
    boolean isRawPartialEntry(String tokenizedTerm);

   /**
    * @return true if the provided term constitutes a complete entry in the
    *  dictionary.
    */
    boolean isRawCompleteEntry(String tokenizedTerm);

   /**
    * @return the actual term that is tied to the tokenized term.  This is
    *  here to account for the fact that the term we encountered in the 
    *  dictionary may in fact map to a completely different term in the 
    *  dictionary (as in <pre>coke._</pre> mapping to <pre>coca.cola._</pre>).
    */
    String getTermForRawCompleteEntry(String tokenizedTerm);

   /**
    * All dictionary implementations will define this method as a way to 
    * report back to the caller what types of entries are contained in this
    * dictionary.
    */
    String getType();
}
