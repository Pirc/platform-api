package pirc.platform.api;

/**
 * The BrandDictionary interface defines the contract for interacting with
 * the Pirc Platform's Brand Dictionary service.  The Brand Dictionary is
 * a service that we use for parsing brand names out of arbitrary chunks of
 * text.
 */
public interface BrandDictionary {
    Brand lookupEntry(String brandName);
    void addEntry(String brandName);
    void blockEntry(String brandName);
    void removeEntry(String brandName);
}
