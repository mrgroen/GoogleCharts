// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package databasereplication.proxies;

public class ReferenceHandling
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject referenceHandlingMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "DatabaseReplication.ReferenceHandling";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Handling("Handling"),
		DataHandling("DataHandling"),
		PrintNotFoundMessages("PrintNotFoundMessages"),
		CommitUnchangedObjects("CommitUnchangedObjects"),
		IgnoreEmptyKeys("IgnoreEmptyKeys"),
		ReferenceHandling_TableMapping("DatabaseReplication.ReferenceHandling_TableMapping"),
		ReferenceHandling_MxObjectReferenceTemp("DatabaseReplication.ReferenceHandling_MxObjectReferenceTemp"),
		ReferenceHandling_MxObjectReference("DatabaseReplication.ReferenceHandling_MxObjectReference");

		private java.lang.String metaName;

		MemberNames(java.lang.String s)
		{
			metaName = s;
		}

		@Override
		public java.lang.String toString()
		{
			return metaName;
		}
	}

	public ReferenceHandling(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "DatabaseReplication.ReferenceHandling"));
	}

	protected ReferenceHandling(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject referenceHandlingMendixObject)
	{
		if (referenceHandlingMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("DatabaseReplication.ReferenceHandling", referenceHandlingMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a DatabaseReplication.ReferenceHandling");

		this.referenceHandlingMendixObject = referenceHandlingMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'ReferenceHandling.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static databasereplication.proxies.ReferenceHandling initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return databasereplication.proxies.ReferenceHandling.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.getSudoContext() can be used to obtain sudo access).
	 */
	public static databasereplication.proxies.ReferenceHandling initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new databasereplication.proxies.ReferenceHandling(context, mendixObject);
	}

	public static databasereplication.proxies.ReferenceHandling load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return databasereplication.proxies.ReferenceHandling.initialize(context, mendixObject);
	}

	public static java.util.List<databasereplication.proxies.ReferenceHandling> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<databasereplication.proxies.ReferenceHandling> result = new java.util.ArrayList<databasereplication.proxies.ReferenceHandling>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//DatabaseReplication.ReferenceHandling" + xpathConstraint))
			result.add(databasereplication.proxies.ReferenceHandling.initialize(context, obj));
		return result;
	}

	/**
	 * Commit the changes made on this proxy object.
	 */
	public final void commit() throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Commit the changes made on this proxy object using the specified context.
	 */
	public final void commit(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Delete the object.
	 */
	public final void delete()
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}

	/**
	 * Delete the object using the specified context.
	 */
	public final void delete(com.mendix.systemwideinterfaces.core.IContext context)
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}
	/**
	 * Set value of Handling
	 * @param handling
	 */
	public final databasereplication.proxies.ReferenceHandlingEnum getHandling()
	{
		return getHandling(getContext());
	}

	/**
	 * @param context
	 * @return value of Handling
	 */
	public final databasereplication.proxies.ReferenceHandlingEnum getHandling(com.mendix.systemwideinterfaces.core.IContext context)
	{
		Object obj = getMendixObject().getValue(context, MemberNames.Handling.toString());
		if (obj == null)
			return null;

		return databasereplication.proxies.ReferenceHandlingEnum.valueOf((java.lang.String) obj);
	}

	/**
	 * Set value of Handling
	 * @param handling
	 */
	public final void setHandling(databasereplication.proxies.ReferenceHandlingEnum handling)
	{
		setHandling(getContext(), handling);
	}

	/**
	 * Set value of Handling
	 * @param context
	 * @param handling
	 */
	public final void setHandling(com.mendix.systemwideinterfaces.core.IContext context, databasereplication.proxies.ReferenceHandlingEnum handling)
	{
		if (handling != null)
			getMendixObject().setValue(context, MemberNames.Handling.toString(), handling.toString());
		else
			getMendixObject().setValue(context, MemberNames.Handling.toString(), null);
	}

	/**
	 * Set value of DataHandling
	 * @param datahandling
	 */
	public final databasereplication.proxies.ReferenceDataHandling getDataHandling()
	{
		return getDataHandling(getContext());
	}

	/**
	 * @param context
	 * @return value of DataHandling
	 */
	public final databasereplication.proxies.ReferenceDataHandling getDataHandling(com.mendix.systemwideinterfaces.core.IContext context)
	{
		Object obj = getMendixObject().getValue(context, MemberNames.DataHandling.toString());
		if (obj == null)
			return null;

		return databasereplication.proxies.ReferenceDataHandling.valueOf((java.lang.String) obj);
	}

	/**
	 * Set value of DataHandling
	 * @param datahandling
	 */
	public final void setDataHandling(databasereplication.proxies.ReferenceDataHandling datahandling)
	{
		setDataHandling(getContext(), datahandling);
	}

	/**
	 * Set value of DataHandling
	 * @param context
	 * @param datahandling
	 */
	public final void setDataHandling(com.mendix.systemwideinterfaces.core.IContext context, databasereplication.proxies.ReferenceDataHandling datahandling)
	{
		if (datahandling != null)
			getMendixObject().setValue(context, MemberNames.DataHandling.toString(), datahandling.toString());
		else
			getMendixObject().setValue(context, MemberNames.DataHandling.toString(), null);
	}

	/**
	 * @return value of PrintNotFoundMessages
	 */
	public final Boolean getPrintNotFoundMessages()
	{
		return getPrintNotFoundMessages(getContext());
	}

	/**
	 * @param context
	 * @return value of PrintNotFoundMessages
	 */
	public final Boolean getPrintNotFoundMessages(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (Boolean) getMendixObject().getValue(context, MemberNames.PrintNotFoundMessages.toString());
	}

	/**
	 * Set value of PrintNotFoundMessages
	 * @param printnotfoundmessages
	 */
	public final void setPrintNotFoundMessages(Boolean printnotfoundmessages)
	{
		setPrintNotFoundMessages(getContext(), printnotfoundmessages);
	}

	/**
	 * Set value of PrintNotFoundMessages
	 * @param context
	 * @param printnotfoundmessages
	 */
	public final void setPrintNotFoundMessages(com.mendix.systemwideinterfaces.core.IContext context, Boolean printnotfoundmessages)
	{
		getMendixObject().setValue(context, MemberNames.PrintNotFoundMessages.toString(), printnotfoundmessages);
	}

	/**
	 * @return value of CommitUnchangedObjects
	 */
	public final Boolean getCommitUnchangedObjects()
	{
		return getCommitUnchangedObjects(getContext());
	}

	/**
	 * @param context
	 * @return value of CommitUnchangedObjects
	 */
	public final Boolean getCommitUnchangedObjects(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (Boolean) getMendixObject().getValue(context, MemberNames.CommitUnchangedObjects.toString());
	}

	/**
	 * Set value of CommitUnchangedObjects
	 * @param commitunchangedobjects
	 */
	public final void setCommitUnchangedObjects(Boolean commitunchangedobjects)
	{
		setCommitUnchangedObjects(getContext(), commitunchangedobjects);
	}

	/**
	 * Set value of CommitUnchangedObjects
	 * @param context
	 * @param commitunchangedobjects
	 */
	public final void setCommitUnchangedObjects(com.mendix.systemwideinterfaces.core.IContext context, Boolean commitunchangedobjects)
	{
		getMendixObject().setValue(context, MemberNames.CommitUnchangedObjects.toString(), commitunchangedobjects);
	}

	/**
	 * @return value of IgnoreEmptyKeys
	 */
	public final Boolean getIgnoreEmptyKeys()
	{
		return getIgnoreEmptyKeys(getContext());
	}

	/**
	 * @param context
	 * @return value of IgnoreEmptyKeys
	 */
	public final Boolean getIgnoreEmptyKeys(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (Boolean) getMendixObject().getValue(context, MemberNames.IgnoreEmptyKeys.toString());
	}

	/**
	 * Set value of IgnoreEmptyKeys
	 * @param ignoreemptykeys
	 */
	public final void setIgnoreEmptyKeys(Boolean ignoreemptykeys)
	{
		setIgnoreEmptyKeys(getContext(), ignoreemptykeys);
	}

	/**
	 * Set value of IgnoreEmptyKeys
	 * @param context
	 * @param ignoreemptykeys
	 */
	public final void setIgnoreEmptyKeys(com.mendix.systemwideinterfaces.core.IContext context, Boolean ignoreemptykeys)
	{
		getMendixObject().setValue(context, MemberNames.IgnoreEmptyKeys.toString(), ignoreemptykeys);
	}

	/**
	 * @return value of ReferenceHandling_TableMapping
	 */
	public final databasereplication.proxies.TableMapping getReferenceHandling_TableMapping() throws com.mendix.core.CoreException
	{
		return getReferenceHandling_TableMapping(getContext());
	}

	/**
	 * @param context
	 * @return value of ReferenceHandling_TableMapping
	 */
	public final databasereplication.proxies.TableMapping getReferenceHandling_TableMapping(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		databasereplication.proxies.TableMapping result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.ReferenceHandling_TableMapping.toString());
		if (identifier != null)
			result = databasereplication.proxies.TableMapping.load(context, identifier);
		return result;
	}

	/**
	 * Set value of ReferenceHandling_TableMapping
	 * @param referencehandling_tablemapping
	 */
	public final void setReferenceHandling_TableMapping(databasereplication.proxies.TableMapping referencehandling_tablemapping)
	{
		setReferenceHandling_TableMapping(getContext(), referencehandling_tablemapping);
	}

	/**
	 * Set value of ReferenceHandling_TableMapping
	 * @param context
	 * @param referencehandling_tablemapping
	 */
	public final void setReferenceHandling_TableMapping(com.mendix.systemwideinterfaces.core.IContext context, databasereplication.proxies.TableMapping referencehandling_tablemapping)
	{
		if (referencehandling_tablemapping == null)
			getMendixObject().setValue(context, MemberNames.ReferenceHandling_TableMapping.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.ReferenceHandling_TableMapping.toString(), referencehandling_tablemapping.getMendixObject().getId());
	}

	/**
	 * @return value of ReferenceHandling_MxObjectReferenceTemp
	 */
	public final databasereplication.proxies.MxObjectReferenceTemp getReferenceHandling_MxObjectReferenceTemp() throws com.mendix.core.CoreException
	{
		return getReferenceHandling_MxObjectReferenceTemp(getContext());
	}

	/**
	 * @param context
	 * @return value of ReferenceHandling_MxObjectReferenceTemp
	 */
	public final databasereplication.proxies.MxObjectReferenceTemp getReferenceHandling_MxObjectReferenceTemp(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		databasereplication.proxies.MxObjectReferenceTemp result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.ReferenceHandling_MxObjectReferenceTemp.toString());
		if (identifier != null)
			result = databasereplication.proxies.MxObjectReferenceTemp.load(context, identifier);
		return result;
	}

	/**
	 * Set value of ReferenceHandling_MxObjectReferenceTemp
	 * @param referencehandling_mxobjectreferencetemp
	 */
	public final void setReferenceHandling_MxObjectReferenceTemp(databasereplication.proxies.MxObjectReferenceTemp referencehandling_mxobjectreferencetemp)
	{
		setReferenceHandling_MxObjectReferenceTemp(getContext(), referencehandling_mxobjectreferencetemp);
	}

	/**
	 * Set value of ReferenceHandling_MxObjectReferenceTemp
	 * @param context
	 * @param referencehandling_mxobjectreferencetemp
	 */
	public final void setReferenceHandling_MxObjectReferenceTemp(com.mendix.systemwideinterfaces.core.IContext context, databasereplication.proxies.MxObjectReferenceTemp referencehandling_mxobjectreferencetemp)
	{
		if (referencehandling_mxobjectreferencetemp == null)
			getMendixObject().setValue(context, MemberNames.ReferenceHandling_MxObjectReferenceTemp.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.ReferenceHandling_MxObjectReferenceTemp.toString(), referencehandling_mxobjectreferencetemp.getMendixObject().getId());
	}

	/**
	 * @return value of ReferenceHandling_MxObjectReference
	 */
	public final mxmodelreflection.proxies.MxObjectReference getReferenceHandling_MxObjectReference() throws com.mendix.core.CoreException
	{
		return getReferenceHandling_MxObjectReference(getContext());
	}

	/**
	 * @param context
	 * @return value of ReferenceHandling_MxObjectReference
	 */
	public final mxmodelreflection.proxies.MxObjectReference getReferenceHandling_MxObjectReference(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		mxmodelreflection.proxies.MxObjectReference result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.ReferenceHandling_MxObjectReference.toString());
		if (identifier != null)
			result = mxmodelreflection.proxies.MxObjectReference.load(context, identifier);
		return result;
	}

	/**
	 * Set value of ReferenceHandling_MxObjectReference
	 * @param referencehandling_mxobjectreference
	 */
	public final void setReferenceHandling_MxObjectReference(mxmodelreflection.proxies.MxObjectReference referencehandling_mxobjectreference)
	{
		setReferenceHandling_MxObjectReference(getContext(), referencehandling_mxobjectreference);
	}

	/**
	 * Set value of ReferenceHandling_MxObjectReference
	 * @param context
	 * @param referencehandling_mxobjectreference
	 */
	public final void setReferenceHandling_MxObjectReference(com.mendix.systemwideinterfaces.core.IContext context, mxmodelreflection.proxies.MxObjectReference referencehandling_mxobjectreference)
	{
		if (referencehandling_mxobjectreference == null)
			getMendixObject().setValue(context, MemberNames.ReferenceHandling_MxObjectReference.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.ReferenceHandling_MxObjectReference.toString(), referencehandling_mxobjectreference.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return referenceHandlingMendixObject;
	}

	/**
	 * @return the IContext instance of this proxy, or null if no IContext instance was specified at initialization.
	 */
	public final com.mendix.systemwideinterfaces.core.IContext getContext()
	{
		return context;
	}

	@Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final databasereplication.proxies.ReferenceHandling that = (databasereplication.proxies.ReferenceHandling) obj;
			return getMendixObject().equals(that.getMendixObject());
		}
		return false;
	}

	@Override
	public int hashCode()
	{
		return getMendixObject().hashCode();
	}

	/**
	 * @return String name of this class
	 */
	public static java.lang.String getType()
	{
		return "DatabaseReplication.ReferenceHandling";
	}

	/**
	 * @return String GUID from this object, format: ID_0000000000
	 * @deprecated Use getMendixObject().getId().toLong() to get a unique identifier for this object.
	 */
	@Deprecated
	public java.lang.String getGUID()
	{
		return "ID_" + getMendixObject().getId().toLong();
	}
}