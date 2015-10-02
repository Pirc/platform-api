package pirc.platform.api;

/**
 * The BrandDictionary interface defines the contract for interacting with
 * the Pirc Platform's Brand Dictionary service.  The Brand Dictionary is
 * a service that we use for parsing brand names out of arbitrary chunks of
 * text.
 */
public interface BrandDictionary extends TokenDictionary {
   /**
    * Look up an entry in the brand dictionary.  Note that the input
    * string will be tokenized per the brand dictionary rules and then
    * used to look up an entry in the dictionary.  If the submitted brand
    * name is a synonym for another brand, it will be resolved to the
    * brand that the synonym is linked to.
    */
    Brand lookupEntry(String brandName);

   /**
    * Given a display name, this method will create a new entry in the
    * brand dictionary and return it to the caller.  If the entry
    * already exists, the existing brand dictionary entry is returned.
    *
    * @throws BlockedBrandException if this is an attempt to add a brand
    *  back into the dictionary that has been blocked.
    */
    Brand addEntry(String displayName);
}
