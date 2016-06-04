package org.one2team.highcharts.server;

import com.google.gson.*;

import java.lang.reflect.Type;
import java.util.Map;
import java.util.Map.Entry;

public abstract class JSMSerializer<K> implements JsonSerializer<K> {

	public JSMSerializer() {
		super ();
	}

	@Override
	public JsonElement serialize (K instance, Type arg1, JsonSerializationContext arg2) {
		Map<String, String> map = getProperties (instance);
		if (map == null)
			return new JsonPrimitive ("");

		JsonObject r = new JsonObject ();
		for (Entry<String, String> e : map.entrySet ()) {
			r.addProperty (e.getKey (), e.getValue ());
		}

		return r;
	}

	public abstract Map<String, String> getProperties (K instance);

}