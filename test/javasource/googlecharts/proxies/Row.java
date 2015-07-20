// This file was generated by Mendix Business Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package googlecharts.proxies;

import com.mendix.core.Core;
import com.mendix.core.CoreException;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.systemwideinterfaces.core.IMendixIdentifier;
import com.mendix.systemwideinterfaces.core.IMendixObject;

/**
 * 
 */
public class Row
{
	private final IMendixObject rowMendixObject;

	private final IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final String entityName = "GoogleCharts.Row";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		c("GoogleCharts.c");

		private String metaName;

		MemberNames(String s)
		{
			metaName = s;
		}

		@Override
		public String toString()
		{
			return metaName;
		}
	}

	public Row(IContext context)
	{
		this(context, Core.instantiate(context, "GoogleCharts.Row"));
	}

	protected Row(IContext context, IMendixObject rowMendixObject)
	{
		if (rowMendixObject == null)
			throw new IllegalArgumentException("The given object cannot be null.");
		if (!Core.isSubClassOf("GoogleCharts.Row", rowMendixObject.getType()))
			throw new IllegalArgumentException("The given object is not a GoogleCharts.Row");

		this.rowMendixObject = rowMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'Row.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static googlecharts.proxies.Row initialize(IContext context, IMendixIdentifier mendixIdentifier) throws CoreException
	{
		return googlecharts.proxies.Row.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.getSudoContext() can be used to obtain sudo access).
	 */
	public static googlecharts.proxies.Row initialize(IContext context, IMendixObject mendixObject)
	{
		return new googlecharts.proxies.Row(context, mendixObject);
	}

	public static googlecharts.proxies.Row load(IContext context, IMendixIdentifier mendixIdentifier) throws CoreException
	{
		IMendixObject mendixObject = Core.retrieveId(context, mendixIdentifier);
		return googlecharts.proxies.Row.initialize(context, mendixObject);
	}

	/**
	 * Commit the changes made on this proxy object.
	 */
	public final void commit() throws CoreException
	{
		Core.commit(context, getMendixObject());
	}

	/**
	 * Commit the changes made on this proxy object using the specified context.
	 */
	public final void commit(IContext context) throws CoreException
	{
		Core.commit(context, getMendixObject());
	}

	/**
	 * Delete the object.
	 */
	public final void delete()
	{
		Core.delete(context, getMendixObject());
	}

	/**
	 * Delete the object using the specified context.
	 */
	public final void delete(IContext context)
	{
		Core.delete(context, getMendixObject());
	}
	/**
	 * @return value of c
	 */
	public final java.util.List<googlecharts.proxies.Cell> getc() throws CoreException
	{
		return getc(getContext());
	}

	/**
	 * @param context
	 * @return value of c
	 */
	@SuppressWarnings("unchecked")
	public final java.util.List<googlecharts.proxies.Cell> getc(IContext context) throws CoreException
	{
		java.util.List<googlecharts.proxies.Cell> result = new java.util.ArrayList<googlecharts.proxies.Cell>();
		Object valueObject = getMendixObject().getValue(context, MemberNames.c.toString());
		if (valueObject == null)
			return result;
		for (IMendixObject mendixObject : Core.retrieveIdList(context, (java.util.List<IMendixIdentifier>) valueObject))
			result.add(googlecharts.proxies.Cell.initialize(context, mendixObject));
		return result;
	}

	/**
	 * Set value of c
	 * @param c
	 */
	public final void setc(java.util.List<googlecharts.proxies.Cell> c)
	{
		setc(getContext(), c);
	}

	/**
	 * Set value of c
	 * @param context
	 * @param c
	 */
	public final void setc(IContext context, java.util.List<googlecharts.proxies.Cell> c)
	{
		java.util.List<IMendixIdentifier> identifiers = new java.util.ArrayList<IMendixIdentifier>();
		for (googlecharts.proxies.Cell proxyObject : c)
			identifiers.add(proxyObject.getMendixObject().getId());
		getMendixObject().setValue(context, MemberNames.c.toString(), identifiers);
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final IMendixObject getMendixObject()
	{
		return rowMendixObject;
	}

	/**
	 * @return the IContext instance of this proxy, or null if no IContext instance was specified at initialization.
	 */
	public final IContext getContext()
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
			final googlecharts.proxies.Row that = (googlecharts.proxies.Row) obj;
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
	public static String getType()
	{
		return "GoogleCharts.Row";
	}

	/**
	 * @return String GUID from this object, format: ID_0000000000
	 * @deprecated Use getMendixObject().getId().toLong() to get a unique identifier for this object.
	 */
	@Deprecated
	public String getGUID()
	{
		return "ID_" + getMendixObject().getId().toLong();
	}
}