package asm.org.apache.openejb.jee;
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
public class MethodIntfDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_FINAL | ACC_SUPER | ACC_ENUM, "org/apache/openejb/jee/MethodIntf", "Ljava/lang/Enum<Lorg/apache/openejb/jee/MethodIntf;>;", "java/lang/Enum", null);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "HOME", "Lorg/apache/openejb/jee/MethodIntf;", null, null);
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Ljavax/xml/bind/annotation/XmlEnumValue;", true);
annotationVisitor0.visit("value", "Home");
annotationVisitor0.visitEnd();
}
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "REMOTE", "Lorg/apache/openejb/jee/MethodIntf;", null, null);
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Ljavax/xml/bind/annotation/XmlEnumValue;", true);
annotationVisitor0.visit("value", "Remote");
annotationVisitor0.visitEnd();
}
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "LOCALHOME", "Lorg/apache/openejb/jee/MethodIntf;", null, null);
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Ljavax/xml/bind/annotation/XmlEnumValue;", true);
annotationVisitor0.visit("value", "LocalHome");
annotationVisitor0.visitEnd();
}
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "LOCAL", "Lorg/apache/openejb/jee/MethodIntf;", null, null);
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Ljavax/xml/bind/annotation/XmlEnumValue;", true);
annotationVisitor0.visit("value", "Local");
annotationVisitor0.visitEnd();
}
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "SERVICEENDPOINT", "Lorg/apache/openejb/jee/MethodIntf;", null, null);
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Ljavax/xml/bind/annotation/XmlEnumValue;", true);
annotationVisitor0.visit("value", "ServiceEndpoint");
annotationVisitor0.visitEnd();
}
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "TIMER", "Lorg/apache/openejb/jee/MethodIntf;", null, null);
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Ljavax/xml/bind/annotation/XmlEnumValue;", true);
annotationVisitor0.visit("value", "Timer");
annotationVisitor0.visitEnd();
}
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "MESSAGEENDPOINT", "Lorg/apache/openejb/jee/MethodIntf;", null, null);
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Ljavax/xml/bind/annotation/XmlEnumValue;", true);
annotationVisitor0.visit("value", "MessageEndpoint");
annotationVisitor0.visitEnd();
}
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "name", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_SYNTHETIC, "$VALUES", "[Lorg/apache/openejb/jee/MethodIntf;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "values", "()[Lorg/apache/openejb/jee/MethodIntf;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/jee/MethodIntf", "$VALUES", "[Lorg/apache/openejb/jee/MethodIntf;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "[Lorg/apache/openejb/jee/MethodIntf;", "clone", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Lorg/apache/openejb/jee/MethodIntf;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "valueOf", "(Ljava/lang/String;)Lorg/apache/openejb/jee/MethodIntf;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/openejb/jee/MethodIntf;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Enum", "valueOf", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/openejb/jee/MethodIntf");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "(Ljava/lang/String;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Enum", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/jee/MethodIntf", "name", "Ljava/lang/String;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "toString", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/jee/MethodIntf", "name", "Ljava/lang/String;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/jee/MethodIntf");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("HOME");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLdcInsn("Home");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/jee/MethodIntf", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/jee/MethodIntf", "HOME", "Lorg/apache/openejb/jee/MethodIntf;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/jee/MethodIntf");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("REMOTE");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitLdcInsn("Remote");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/jee/MethodIntf", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/jee/MethodIntf", "REMOTE", "Lorg/apache/openejb/jee/MethodIntf;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/jee/MethodIntf");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("LOCALHOME");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitLdcInsn("LocalHome");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/jee/MethodIntf", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/jee/MethodIntf", "LOCALHOME", "Lorg/apache/openejb/jee/MethodIntf;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/jee/MethodIntf");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("LOCAL");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitLdcInsn("Local");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/jee/MethodIntf", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/jee/MethodIntf", "LOCAL", "Lorg/apache/openejb/jee/MethodIntf;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/jee/MethodIntf");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("SERVICEENDPOINT");
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitLdcInsn("ServiceEndpoint");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/jee/MethodIntf", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/jee/MethodIntf", "SERVICEENDPOINT", "Lorg/apache/openejb/jee/MethodIntf;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/jee/MethodIntf");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("TIMER");
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitLdcInsn("Timer");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/jee/MethodIntf", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/jee/MethodIntf", "TIMER", "Lorg/apache/openejb/jee/MethodIntf;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/jee/MethodIntf");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("MESSAGEENDPOINT");
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitLdcInsn("MessageEndpoint");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/jee/MethodIntf", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/jee/MethodIntf", "MESSAGEENDPOINT", "Lorg/apache/openejb/jee/MethodIntf;");
methodVisitor.visitIntInsn(BIPUSH, 7);
methodVisitor.visitTypeInsn(ANEWARRAY, "org/apache/openejb/jee/MethodIntf");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/jee/MethodIntf", "HOME", "Lorg/apache/openejb/jee/MethodIntf;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/jee/MethodIntf", "REMOTE", "Lorg/apache/openejb/jee/MethodIntf;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/jee/MethodIntf", "LOCALHOME", "Lorg/apache/openejb/jee/MethodIntf;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/jee/MethodIntf", "LOCAL", "Lorg/apache/openejb/jee/MethodIntf;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/jee/MethodIntf", "SERVICEENDPOINT", "Lorg/apache/openejb/jee/MethodIntf;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/jee/MethodIntf", "TIMER", "Lorg/apache/openejb/jee/MethodIntf;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/jee/MethodIntf", "MESSAGEENDPOINT", "Lorg/apache/openejb/jee/MethodIntf;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/jee/MethodIntf", "$VALUES", "[Lorg/apache/openejb/jee/MethodIntf;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
