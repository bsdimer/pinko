package com.dimomass.pinko.common.serializer;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

import javax.naming.ldap.LdapName;
import java.io.IOException;

/**
 * Created by dimomass on 20.10.18.
 */
public class LdapNameSerializer extends StdSerializer<LdapName> {

    public LdapNameSerializer() {
        this(null);
    }

    public LdapNameSerializer(Class<LdapName> t) {
        super(t);
    }

    @Override
    public void serialize(LdapName name, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        jsonGenerator.writeString(name.toString());
    }
}
