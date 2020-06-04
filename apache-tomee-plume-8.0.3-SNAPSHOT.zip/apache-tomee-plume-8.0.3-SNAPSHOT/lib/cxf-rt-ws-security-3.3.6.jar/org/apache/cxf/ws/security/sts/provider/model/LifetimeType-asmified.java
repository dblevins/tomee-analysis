package asm.org.apache.cxf.ws.security.sts.provider.model;
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
public class LifetimeTypeDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/cxf/ws/security/sts/provider/model/LifetimeType", null, "java/lang/Object", null);

{
annotationVisitor0 = classWriter.visitAnnotation("Ljavax/xml/bind/annotation/XmlAccessorType;", true);
annotationVisitor0.visitEnum("value", "Ljavax/xml/bind/annotation/XmlAccessType;", "FIELD");
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = classWriter.visitAnnotation("Ljavax/xml/bind/annotation/XmlType;", true);
annotationVisitor0.visit("name", "LifetimeType");
{
AnnotationVisitor annotationVisitor1 = annotationVisitor0.visitArray("propOrder");
annotationVisitor1.visit(null, "created");
annotationVisitor1.visit(null, "expires");
annotationVisitor1.visitEnd();
}
annotationVisitor0.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "created", "Lorg/apache/cxf/ws/security/sts/provider/model/utility/AttributedDateTime;", null, null);
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Ljavax/xml/bind/annotation/XmlElement;", true);
annotationVisitor0.visit("name", "Created");
annotationVisitor0.visit("namespace", "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd");
annotationVisitor0.visitEnd();
}
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "expires", "Lorg/apache/cxf/ws/security/sts/provider/model/utility/AttributedDateTime;", null, null);
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Ljavax/xml/bind/annotation/XmlElement;", true);
annotationVisitor0.visit("name", "Expires");
annotationVisitor0.visit("namespace", "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd");
annotationVisitor0.visitEnd();
}
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getCreated", "()Lorg/apache/cxf/ws/security/sts/provider/model/utility/AttributedDateTime;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/ws/security/sts/provider/model/LifetimeType", "created", "Lorg/apache/cxf/ws/security/sts/provider/model/utility/AttributedDateTime;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setCreated", "(Lorg/apache/cxf/ws/security/sts/provider/model/utility/AttributedDateTime;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/cxf/ws/security/sts/provider/model/LifetimeType", "created", "Lorg/apache/cxf/ws/security/sts/provider/model/utility/AttributedDateTime;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getExpires", "()Lorg/apache/cxf/ws/security/sts/provider/model/utility/AttributedDateTime;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/ws/security/sts/provider/model/LifetimeType", "expires", "Lorg/apache/cxf/ws/security/sts/provider/model/utility/AttributedDateTime;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setExpires", "(Lorg/apache/cxf/ws/security/sts/provider/model/utility/AttributedDateTime;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/cxf/ws/security/sts/provider/model/LifetimeType", "expires", "Lorg/apache/cxf/ws/security/sts/provider/model/utility/AttributedDateTime;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
