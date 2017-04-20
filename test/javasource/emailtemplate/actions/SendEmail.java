// This file was generated by Mendix Modeler.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
// Special characters, e.g., é, ö, à, etc. are supported in comments.

package emailtemplate.actions;

import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.webui.CustomJavaAction;
import com.mendix.systemwideinterfaces.core.IMendixObject;

public class SendEmail extends CustomJavaAction<java.lang.Boolean>
{
	private java.lang.String SMTPHost;
	private java.lang.String SMTPUserName;
	private java.lang.String SMTPPassword;
	private java.lang.String CCAddresses;
	private java.lang.String BCCAddresses;
	private java.lang.String ToAddresses;
	private java.lang.String FromAddress;
	private java.lang.String HtmlBody;
	private java.lang.String PlainBody;
	private java.lang.String Subject;
	private java.lang.Long SMTPPort;
	private java.util.List<IMendixObject> __AttachmentList;
	private java.util.List<system.proxies.FileDocument> AttachmentList;
	private java.lang.Boolean UseSSL;
	private java.lang.Boolean UseTLS;

	public SendEmail(IContext context, java.lang.String SMTPHost, java.lang.String SMTPUserName, java.lang.String SMTPPassword, java.lang.String CCAddresses, java.lang.String BCCAddresses, java.lang.String ToAddresses, java.lang.String FromAddress, java.lang.String HtmlBody, java.lang.String PlainBody, java.lang.String Subject, java.lang.Long SMTPPort, java.util.List<IMendixObject> AttachmentList, java.lang.Boolean UseSSL, java.lang.Boolean UseTLS)
	{
		super(context);
		this.SMTPHost = SMTPHost;
		this.SMTPUserName = SMTPUserName;
		this.SMTPPassword = SMTPPassword;
		this.CCAddresses = CCAddresses;
		this.BCCAddresses = BCCAddresses;
		this.ToAddresses = ToAddresses;
		this.FromAddress = FromAddress;
		this.HtmlBody = HtmlBody;
		this.PlainBody = PlainBody;
		this.Subject = Subject;
		this.SMTPPort = SMTPPort;
		this.__AttachmentList = AttachmentList;
		this.UseSSL = UseSSL;
		this.UseTLS = UseTLS;
	}

	@Override
	public java.lang.Boolean executeAction() throws Exception
	{
		this.AttachmentList = new java.util.ArrayList<system.proxies.FileDocument>();
		if (__AttachmentList != null)
			for (IMendixObject __AttachmentListElement : __AttachmentList)
				this.AttachmentList.add(system.proxies.FileDocument.initialize(getContext(), __AttachmentListElement));

		// BEGIN USER CODE
		throw new com.mendix.systemwideinterfaces.MendixRuntimeException("Java action was not implemented");
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 */
	@Override
	public java.lang.String toString()
	{
		return "SendEmail";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}
