
package org.w3._2001.xmlschema;

import javax.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter2
    extends XmlAdapter<String, Integer>
{


    public Integer unmarshal(String value) {
        return new Integer(value);
    }

    public String marshal(Integer value) {
        if (value == null) {
            return null;
        }
        return value.toString();
    }

}
