package org.platform.modules.abstr.dao.hibernate.type;

import com.google.common.collect.Maps;

import java.io.Serializable;
import java.util.Map;

public class JsonMap implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Map<Object, Object> map;

    public JsonMap() {
    }

    public JsonMap(Map<Object, Object> map) {
        this.map = map;
    }

    public Map<Object, Object> getMap() {
        if (map == null) {
            map = Maps.newHashMap();
        }
        return map;
    }

    public void setMap(Map<Object, Object> map) {
        this.map = map;
    }
}
