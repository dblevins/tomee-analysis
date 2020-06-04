package asm.com.sun.xml.bind.v2.model.runtime;
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
public class RuntimeElementInfoDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_7, ACC_PUBLIC | ACC_ABSTRACT | ACC_INTERFACE, "com/sun/xml/bind/v2/model/runtime/RuntimeElementInfo", "Ljava/lang/Object;Lcom/sun/xml/bind/v2/model/core/ElementInfo<Ljava/lang/reflect/Type;Ljava/lang/Class;>;Lcom/sun/xml/bind/v2/model/runtime/RuntimeElement;", "java/lang/Object", new String[] { "com/sun/xml/bind/v2/model/core/ElementInfo", "com/sun/xml/bind/v2/model/runtime/RuntimeElement" });

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getScope", "()Lcom/sun/xml/bind/v2/model/runtime/RuntimeClassInfo;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getProperty", "()Lcom/sun/xml/bind/v2/model/runtime/RuntimeElementPropertyInfo;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getType", "()Ljava/lang/Class;", "()Ljava/lang/Class<+Ljavax/xml/bind/JAXBElement;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getContentType", "()Lcom/sun/xml/bind/v2/model/runtime/RuntimeNonElement;", null, null);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
