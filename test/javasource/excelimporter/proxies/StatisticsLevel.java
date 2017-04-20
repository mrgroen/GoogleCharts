// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package excelimporter.proxies;

public enum StatisticsLevel
{
	AllStatistics(new java.lang.String[][] { new java.lang.String[] { "en_US", "All Statistics" }, new java.lang.String[] { "nl_NL", "Alle Statistieken" }, new java.lang.String[] { "en_GB", "All Statistics" }, new java.lang.String[] { "en_ZA", "All Statistics" } }),
	OnlyFinalStatistics(new java.lang.String[][] { new java.lang.String[] { "en_US", "Only Final Statistics" }, new java.lang.String[] { "nl_NL", "Alleen volledige statistieken" }, new java.lang.String[] { "en_GB", "Only Final Statistics" }, new java.lang.String[] { "en_ZA", "Only Final Statistics" } }),
	NoStatistics(new java.lang.String[][] { new java.lang.String[] { "en_US", "No Statistics" }, new java.lang.String[] { "nl_NL", "Geen Statistieken" }, new java.lang.String[] { "en_GB", "No Statistics" }, new java.lang.String[] { "en_ZA", "No Statistics" } });

	private java.util.Map<java.lang.String, java.lang.String> captions;

	private StatisticsLevel(java.lang.String[][] captionStrings)
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
