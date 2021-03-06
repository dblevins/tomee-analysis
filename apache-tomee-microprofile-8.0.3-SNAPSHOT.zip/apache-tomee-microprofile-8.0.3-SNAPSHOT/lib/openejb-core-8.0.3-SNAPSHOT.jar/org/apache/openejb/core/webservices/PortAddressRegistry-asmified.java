package asm.org.apache.openejb.core.webservices;
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
public class PortAddressRegistryDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_ABSTRACT | ACC_INTERFACE, "org/apache/openejb/core/webservices/PortAddressRegistry", null, "java/lang/Object", null);

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "addPort", "(Ljava/lang/String;Ljavax/xml/namespace/QName;Ljava/lang/String;Ljavax/xml/namespace/QName;Ljava/lang/String;Ljava/lang/String;)V", null, new String[] { "org/apache/openejb/OpenEJBException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "removePort", "(Ljava/lang/String;Ljavax/xml/namespace/QName;Ljava/lang/String;Ljava/lang/String;)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getPorts", "(Ljava/lang/String;Ljavax/xml/namespace/QName;Ljava/lang/String;)Ljava/util/Set;", "(Ljava/lang/String;Ljavax/xml/namespace/QName;Ljava/lang/String;)Ljava/util/Set<Lorg/apache/openejb/core/webservices/PortAddress;>;", null);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
