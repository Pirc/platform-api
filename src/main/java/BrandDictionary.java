package pirc.platform.api;

/**
 * The BrandDictionary interface defines the contract for interacting with
 * the Pirc Platform's Brand Dictionary service.  The Brand Dictionary is
 * a service that we use for parsing brand names out of arbitrary chunks of
 * text.
 */
public interface BrandDictionary extends TokenDictionary {
    Brand lookupEntry(String brandName);

   /**
    * @throws BlockedBrandException if this is an attempt to add a brand
    *  back into the dictionary that has been blocked.
    */
    Brand addEntry(String brandName);
}
