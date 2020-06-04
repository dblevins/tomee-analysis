package asm.com.sun.xml.bind.v2.schemagen.xmlschema;
import org.objectweb.asm.AnnotationVisitor;
import org.objectweb.asm.Attribute;
import org.objectweb.asm.ClassReader;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.ConstantDynamic;
import org.objectweb.asm.FieldVisitor;
import org.objectweb.asm.Handle;
import org.objectweb.asm.Label;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.RecordComponentVisitor;
import org.objectweb.asm.Type;
import org.objectweb.asm.TypePath;
public class SimpleExtensionDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_7, ACC_PUBLIC | ACC_ABSTRACT | ACC_INTERFACE, "com/sun/xml/bind/v2/schemagen/xmlschema/SimpleExtension", null, "java/lang/Object", new String[] { "com/sun/xml/bind/v2/schemagen/xmlschema/AttrDecls", "com/sun/xml/bind/v2/schemagen/xmlschema/ExtensionType", "com/sun/xml/txw2/TypedXmlWriter" });

{
annotationVisitor0 = classWriter.visitAnnotation("Lcom/sun/xml/txw2/annotation/XmlElement;", true);
annotationVisitor0.visit("value", "extension");
annotationVisitor0.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
