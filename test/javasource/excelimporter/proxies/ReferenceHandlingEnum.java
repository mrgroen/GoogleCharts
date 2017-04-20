// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package excelimporter.proxies;

public enum ReferenceHandlingEnum
{
	FindCreate(new java.lang.String[][] { new java.lang.String[] { "en_US", "Find reference, create if not found" }, new java.lang.String[] { "nl_NL", "Zoek referentie creeër wanneer niet gevonden" }, new java.lang.String[] { "en_GB", "Find reference, create if not found" }, new java.lang.String[] { "en_ZA", "Find reference, create if not found" } }),
	FindIgnore(new java.lang.String[][] { new java.lang.String[] { "en_US", "Find reference, ignore if not found" }, new java.lang.String[] { "nl_NL", "Zoek referentie negeren wanneer niet gevonden" }, new java.lang.String[] { "en_GB", "Find reference, ignore if not found" }, new java.lang.String[] { "en_ZA", "Find reference, ignore if not found" } }),
	CreateEverything(new java.lang.String[][] { new java.lang.String[] { "en_US", "Create all referenced objects" }, new java.lang.String[] { "nl_NL", "Creeër alle gerefereerde objecten" }, new java.lang.String[] { "en_GB", "Create all referenced objects" }, new java.lang.String[] { "en_ZA", "Create all referenced objects" } }),
	OnlyCreateNewObjects(new java.lang.String[][] { new java.lang.String[] { "en_US", "Only create not existing objects" }, new java.lang.String[] { "nl_NL", "Creeër alleen niet bestaande objecten" }, new java.lang.String[] { "en_GB", "Only create not existing objects" }, new java.lang.String[] { "en_ZA", "Only create not existing objects" } });

	private java.util.Map<java.lang.String, java.lang.String> captions;

	private ReferenceHandlingEnum(java.lang.String[][] captionStrings)
	{
		this.captions = new java.util.HashMap<java.lang.String, java.lang.String>();
		for (java.lang.String[] captionString : captionStrings)
			captions.put(captionString[0], captionString[1]);
	}

	public java.lang.String getCaption(java.lang.String languageCode)
	{
		if (captions.containsKey(languageCode))
			return captions.get(languageCode);
		return captions.get("en_US");
	}

	public java.lang.String getCaption()
	{
		return captions.get("en_US");
	}
}
