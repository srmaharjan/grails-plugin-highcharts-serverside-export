package org.one2team.highcharts.server;

import org.one2team.highcharts.shared.DateTimeLabelFormats.TimeUnit;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;


public class JSMDateTimeLabelFormatsSerializer extends JSMSerializer<JSMDateTimeLabelFormats> {

	@Override
	public Map<String, String> getProperties (JSMDateTimeLabelFormats instance) {
		Map<TimeUnit, String> map = instance.getFormats ();
		Map<String, String> r = new HashMap<String, String>();
		for (Entry<TimeUnit, String> e : map.entrySet ())
			r.put (e.getKey ().name (), e.getValue ());
		return r;
	}

}
