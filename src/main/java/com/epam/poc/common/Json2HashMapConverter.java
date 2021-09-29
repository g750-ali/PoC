/*package com.epam.demo.common;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.TypeFactory;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.persistence.Converter;

import org.postgresql.util.PGobject;

@Converter(autoApply = true)
public class Json2HashMapConverter implements javax.persistence.AttributeConverter<HashMap, Object> {

    ObjectMapper mapper = new ObjectMapper();

    @Override
    public Object convertToDatabaseColumn(HashMap x) {
        try {
            if (x == null) {
                x = new HashMap();
            }
            String json = mapper.writeValueAsString(x);
            PGobject out = new PGobject();
            out.setType("jsonb");
            out.setValue(json);
            return out;
        } catch (Exception e) {
            throw new IllegalArgumentException("Unable to serialize to json field", e);
        }
    }

    @Override
    public HashMap convertToEntityAttribute(Object y) {
        HashMap<String, Object> map = new HashMap<>();
        try {
            if (y instanceof PGobject && (((PGobject) y).getType().equals("jsonb") || ((PGobject) y).getType().equals("json"))) {
                String strValue = (String) ((PGobject) y).getValue();
                map = mapper.readValue(strValue, new TypeReference<HashMap<String, Object>>() {
                });
            }
            return map;
        } catch (Exception e) {
            throw new IllegalArgumentException("Unable to deserialize to json field ", e);
        }
    }

}
*/