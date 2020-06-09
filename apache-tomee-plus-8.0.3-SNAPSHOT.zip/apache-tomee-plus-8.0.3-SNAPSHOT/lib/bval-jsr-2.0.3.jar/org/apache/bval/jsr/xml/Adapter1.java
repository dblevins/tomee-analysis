//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 generiert 
// Siehe <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2019.08.12 um 11:46:34 AM CEST 
//


package org.apache.bval.jsr.xml;

import jakarta.validation.executable.ExecutableType;
import jakarta.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter1
    extends XmlAdapter<String, ExecutableType>
{


    public ExecutableType unmarshal(String value) {
        return (jakarta.validation.executable.ExecutableType.valueOf(value));
    }

    public String marshal(ExecutableType value) {
        if (value == null) {
            return null;
        }
        return value.toString();
    }

}
