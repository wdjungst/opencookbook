@XmlSchema(xmlns = { @XmlNs(prefix = "ocb", namespaceURI = "http://www.ocobo.org") },
namespace="http://www.ocobo.org",
elementFormDefault=XmlNsForm.QUALIFIED)
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlJavaTypeAdapters(@XmlJavaTypeAdapter(type = Locale.class, value = LocaleToStringXmlAdapter.class
))
package org.ocobo.model;

import java.util.Locale;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlNsForm;
import javax.xml.bind.annotation.XmlSchema;
import javax.xml.bind.annotation.XmlNs;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapters;
import org.ocobo.xml.bind.annotation.adapters.LocaleToStringXmlAdapter;

