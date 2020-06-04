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
public class XMLSecStartElementDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_ABSTRACT | ACC_INTERFACE, "org/apache/xml/security/stax/ext/stax/XMLSecStartElement", null, "java/lang/Object", new String[] { "org/apache/xml/security/stax/ext/stax/XMLSecEvent", "javax/xml/stream/events/StartElement" });

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getElementNamespace", "()Lorg/apache/xml/security/stax/ext/stax/XMLSecNamespace;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getNamespacesFromCurrentScope", "(Ljava/util/List;)V", "(Ljava/util/List<Lorg/apache/xml/security/stax/ext/stax/XMLSecNamespace;>;)V", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getOnElementDeclaredNamespaces", "()Ljava/util/List;", "()Ljava/util/List<Lorg/apache/xml/security/stax/ext/stax/XMLSecNamespace;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "addNamespace", "(Lorg/apache/xml/security/stax/ext/stax/XMLSecNamespace;)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getAttributesFromCurrentScope", "(Ljava/util/List;)V", "(Ljava/util/List<Lorg/apache/xml/security/stax/ext/stax/XMLSecAttribute;>;)V", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getOnElementDeclaredAttributes", "()Ljava/util/List;", "()Ljava/util/List<Lorg/apache/xml/security/stax/ext/stax/XMLSecAttribute;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "addAttribute", "(Lorg/apache/xml/security/stax/ext/stax/XMLSecAttribute;)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "asStartElement", "()Lorg/apache/xml/security/stax/ext/stax/XMLSecStartElement;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "asStartElement", "()Ljavax/xml/stream/events/StartElement;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/xml/security/stax/ext/stax/XMLSecStartElement", "asStartElement", "()Lorg/apache/xml/security/stax/ext/stax/XMLSecStartElement;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
