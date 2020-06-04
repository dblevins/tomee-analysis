package asm.org.apache.xml.security.stax.ext.stax;
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
public class XMLSecAttributeDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_ABSTRACT | ACC_INTERFACE, "org/apache/xml/security/stax/ext/stax/XMLSecAttribute", "Ljava/lang/Object;Lorg/apache/xml/security/stax/ext/stax/XMLSecEvent;Ljavax/xml/stream/events/Attribute;Ljava/lang/Comparable<Lorg/apache/xml/security/stax/ext/stax/XMLSecAttribute;>;", "java/lang/Object", new String[] { "org/apache/xml/security/stax/ext/stax/XMLSecEvent", "javax/xml/stream/events/Attribute", "java/lang/Comparable" });

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getAttributeNamespace", "()Lorg/apache/xml/security/stax/ext/stax/XMLSecNamespace;", null, null);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
