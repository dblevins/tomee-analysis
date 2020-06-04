package asm.org.apache.openejb.jee.oejb2;
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
public class package_infoDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_ABSTRACT | ACC_INTERFACE | ACC_SYNTHETIC, "org/apache/openejb/jee/oejb2/package-info", null, "java/lang/Object", null);

{
annotationVisitor0 = classWriter.visitAnnotation("Ljavax/xml/bind/annotation/adapters/XmlJavaTypeAdapter;", true);
annotationVisitor0.visit("value", Type.getType("Ljavax/xml/bind/annotation/adapters/CollapsedStringAdapter;"));
annotationVisitor0.visit("type", Type.getType("Ljava/lang/String;"));
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = classWriter.visitAnnotation("Ljavax/xml/bind/annotation/XmlSchema;", true);
annotationVisitor0.visit("namespace", "http://tomee.apache.org/xml/ns/openejb-jar-2.2");
annotationVisitor0.visitEnum("elementFormDefault", "Ljavax/xml/bind/annotation/XmlNsForm;", "QUALIFIED");
{
AnnotationVisitor annotationVisitor1 = annotationVisitor0.visitArray("xmlns");
{
AnnotationVisitor annotationVisitor2 = annotationVisitor1.visitAnnotation(null, "Ljavax/xml/bind/annotation/XmlNs;");
annotationVisitor2.visit("prefix", "o");
annotationVisitor2.visit("namespaceURI", "http://tomee.apache.org/xml/ns/openejb-jar-2.2");
annotationVisitor2.visitEnd();
}
{
AnnotationVisitor annotationVisitor2 = annotationVisitor1.visitAnnotation(null, "Ljavax/xml/bind/annotation/XmlNs;");
annotationVisitor2.visit("prefix", "sys");
annotationVisitor2.visit("namespaceURI", "http://geronimo.apache.org/xml/ns/deployment-1.2");
annotationVisitor2.visitEnd();
}
{
AnnotationVisitor annotationVisitor2 = annotationVisitor1.visitAnnotation(null, "Ljavax/xml/bind/annotation/XmlNs;");
annotationVisitor2.visit("prefix", "pkgen");
annotationVisitor2.visit("namespaceURI", "http://tomee.apache.org/xml/ns/pkgen-2.1");
annotationVisitor2.visitEnd();
}
{
AnnotationVisitor annotationVisitor2 = annotationVisitor1.visitAnnotation(null, "Ljavax/xml/bind/annotation/XmlNs;");
annotationVisitor2.visit("prefix", "naming");
annotationVisitor2.visit("namespaceURI", "http://geronimo.apache.org/xml/ns/naming-1.2");
annotationVisitor2.visitEnd();
}
{
AnnotationVisitor annotationVisitor2 = annotationVisitor1.visitAnnotation(null, "Ljavax/xml/bind/annotation/XmlNs;");
annotationVisitor2.visit("prefix", "app");
annotationVisitor2.visit("namespaceURI", "http://geronimo.apache.org/xml/ns/j2ee/application-1.2");
annotationVisitor2.visitEnd();
}
{
AnnotationVisitor annotationVisitor2 = annotationVisitor1.visitAnnotation(null, "Ljavax/xml/bind/annotation/XmlNs;");
annotationVisitor2.visit("prefix", "secu");
annotationVisitor2.visit("namespaceURI", "http://geronimo.apache.org/xml/ns/security-2.0");
annotationVisitor2.visitEnd();
}
annotationVisitor1.visitEnd();
}
annotationVisitor0.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
