package pirc.platform.api;

public interface Brand {
   /**
    * This is the display name for this brand entry, which is the string
    * that should be used to display this brand in user-facing applications.
    */
    String getDisplayName();

   /**
    * Adds new dictionary entry as a synonym to this one.  Brand synonyms 
    * provide us with the capability to understand many different possible 
    * spellings or "nick names" for a Brand while still being able to 
    * understand that the different expressions of the brand name are 
    * still actually referring to the same brand.  The classic use case 
    * here is that you want a coupon for Coke to match a sale on Coca-Cola.
    */
    void addSynonym(String synonym);

   /**
    * Remove this brand from the brand dictionary.
    */
    void remove();

   /**
    * The block method is used to remove a Brand from the Brand dictionary
    * and prevent it from being re-added in the future.  This is a useful
    * feature for situations where we find that an automated process is
    * adding new values to the brand dictionary but those values are not
    * in fact valid brands.  Of course it would be nice if this weren't the
    * case, but if it does happen we may want to be sure that we don't
    * re-add something that has already been removed for a reason.
    */
    void block();
}
