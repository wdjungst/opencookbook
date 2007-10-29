package org.ocobo.xml.bind.annotation.adapters;

import java.util.Locale;

import javax.xml.bind.annotation.adapters.XmlAdapter;

import org.apache.commons.lang.LocaleUtils;

public class LocaleToStringXmlAdapter extends XmlAdapter<String, Locale> {

	@Override
	public String marshal(Locale v) throws Exception {
		if (v == null) {
			return null;
		} else {
			return v.toString();
		}
	}

	@Override
	public Locale unmarshal(String v) throws Exception {
		if (v == null) {
			return null;
		} else {
			return LocaleUtils.toLocale(v);
		}
	}
}
