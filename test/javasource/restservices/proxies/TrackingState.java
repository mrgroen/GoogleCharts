// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package restservices.proxies;

public enum TrackingState
{
	Paused(new String[][] { new String[] { "en_US", "Disconnected" }, new String[] { "nl_NL", "Disconnected" } }),
	Tracking(new String[][] { new String[] { "en_US", "Tracking" }, new String[] { "nl_NL", "Tracking" } }),
	Connecting(new String[][] { new String[] { "en_US", "Connecting" }, new String[] { "nl_NL", "Connecting" } });

	private java.util.Map<String,String> captions;

	private TrackingState(String[][] captionStrings)
	{
		this.captions = new java.util.HashMap<String,String>();
		for (String[] captionString : captionStrings)
			captions.put(captionString[0], captionString[1]);
	}

	public String getCaption(String languageCode)
	{
		if (captions.containsKey(languageCode))
			return captions.get(languageCode);
		return captions.get("en_US");
	}

	public String getCaption()
	{
		return captions.get("en_US");
	}
}