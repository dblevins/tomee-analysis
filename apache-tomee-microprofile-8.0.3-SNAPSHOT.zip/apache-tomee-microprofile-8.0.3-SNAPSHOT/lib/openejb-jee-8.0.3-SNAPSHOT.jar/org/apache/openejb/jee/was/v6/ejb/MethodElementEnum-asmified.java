package asm.org.apache.openejb.jee.was.v6.ejb;
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
public class MethodElementEnumDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_FINAL | ACC_SUPER | ACC_ENUM, "org/apache/openejb/jee/was/v6/ejb/MethodElementEnum", "Ljava/lang/Enum<Lorg/apache/openejb/jee/was/v6/ejb/MethodElementEnum;>;", "java/lang/Enum", null);

{
annotationVisitor0 = classWriter.visitAnnotation("Ljakarta/xml/bind/annotation/XmlEnum;", true);
annotationVisitor0.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "UNSPECIFIED", "Lorg/apache/openejb/jee/was/v6/ejb/MethodElementEnum;", null, null);
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Ljakarta/xml/bind/annotation/XmlEnumValue;", true);
annotationVisitor0.visit("value", "Unspecified");
annotationVisitor0.visitEnd();
}
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "REMOTE", "Lorg/apache/openejb/jee/was/v6/ejb/MethodElementEnum;", null, null);
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Ljakarta/xml/bind/annotation/XmlEnumValue;", true);
annotationVisitor0.visit("value", "Remote");
annotationVisitor0.visitEnd();
}
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "HOME", "Lorg/apache/openejb/jee/was/v6/ejb/MethodElementEnum;", null, null);
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Ljakarta/xml/bind/annotation/XmlEnumValue;", true);
annotationVisitor0.visit("value", "Home");
annotationVisitor0.visitEnd();
}
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "LOCAL", "Lorg/apache/openejb/jee/was/v6/ejb/MethodElementEnum;", null, null);
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Ljakarta/xml/bind/annotation/XmlEnumValue;", true);
annotationVisitor0.visit("value", "Local");
annotationVisitor0.visitEnd();
}
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "LOCAL_HOME", "Lorg/apache/openejb/jee/was/v6/ejb/MethodElementEnum;", null, null);
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Ljakarta/xml/bind/annotation/XmlEnumValue;", true);
annotationVisitor0.visit("value", "LocalHome");
annotationVisitor0.visitEnd();
}
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "SERVICE_ENDPOINT", "Lorg/apache/openejb/jee/was/v6/ejb/MethodElementEnum;", null, null);
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Ljakarta/xml/bind/annotation/XmlEnumValue;", true);
annotationVisitor0.visit("value", "ServiceEndpoint");
annotationVisitor0.visitEnd();
}
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "value", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_SYNTHETIC, "$VALUES", "[Lorg/apache/openejb/jee/was/v6/ejb/MethodElementEnum;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "values", "()[Lorg/apache/openejb/jee/was/v6/ejb/MethodElementEnum;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/jee/was/v6/ejb/MethodElementEnum", "$VALUES", "[Lorg/apache/openejb/jee/was/v6/ejb/MethodElementEnum;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "[Lorg/apache/openejb/jee/was/v6/ejb/MethodElementEnum;", "clone", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Lorg/apache/openejb/jee/was/v6/ejb/MethodElementEnum;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "valueOf", "(Ljava/lang/String;)Lorg/apache/openejb/jee/was/v6/ejb/MethodElementEnum;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/openejb/jee/was/v6/ejb/MethodElementEnum;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Enum", "valueOf", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/openejb/jee/was/v6/ejb/MethodElementEnum");
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
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/jee/was/v6/ejb/MethodElementEnum", "value", "Ljava/lang/String;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "value", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/jee/was/v6/ejb/MethodElementEnum", "value", "Ljava/lang/String;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "fromValue", "(Ljava/lang/String;)Lorg/apache/openejb/jee/was/v6/ejb/MethodElementEnum;", null, null);
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/jee/was/v6/ejb/MethodElementEnum", "values", "()[Lorg/apache/openejb/jee/was/v6/ejb/MethodElementEnum;", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitVarInsn(ISTORE, 2);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 3);
Label label0 = new Label();
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,3, new Object[] {"[Lorg/apache/openejb/jee/was/v6/ejb/MethodElementEnum;", Opcodes.INTEGER, Opcodes.INTEGER}, 0, null);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitVarInsn(ILOAD, 2);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPGE, label1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/jee/was/v6/ejb/MethodElementEnum", "value", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equals", "(Ljava/lang/Object;)Z", false);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label2);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitIincInsn(3, 1);
methodVisitor.visitJumpInsn(GOTO, label0);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_CHOP,3, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "java/lang/IllegalArgumentException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/IllegalArgumentException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(3, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/jee/was/v6/ejb/MethodElementEnum");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("UNSPECIFIED");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLdcInsn("Unspecified");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/jee/was/v6/ejb/MethodElementEnum", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/jee/was/v6/ejb/MethodElementEnum", "UNSPECIFIED", "Lorg/apache/openejb/jee/was/v6/ejb/MethodElementEnum;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/jee/was/v6/ejb/MethodElementEnum");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("REMOTE");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitLdcInsn("Remote");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/jee/was/v6/ejb/MethodElementEnum", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/jee/was/v6/ejb/MethodElementEnum", "REMOTE", "Lorg/apache/openejb/jee/was/v6/ejb/MethodElementEnum;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/jee/was/v6/ejb/MethodElementEnum");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("HOME");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitLdcInsn("Home");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/jee/was/v6/ejb/MethodElementEnum", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/jee/was/v6/ejb/MethodElementEnum", "HOME", "Lorg/apache/openejb/jee/was/v6/ejb/MethodElementEnum;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/jee/was/v6/ejb/MethodElementEnum");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("LOCAL");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitLdcInsn("Local");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/jee/was/v6/ejb/MethodElementEnum", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/jee/was/v6/ejb/MethodElementEnum", "LOCAL", "Lorg/apache/openejb/jee/was/v6/ejb/MethodElementEnum;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/jee/was/v6/ejb/MethodElementEnum");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("LOCAL_HOME");
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitLdcInsn("LocalHome");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/jee/was/v6/ejb/MethodElementEnum", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/jee/was/v6/ejb/MethodElementEnum", "LOCAL_HOME", "Lorg/apache/openejb/jee/was/v6/ejb/MethodElementEnum;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/jee/was/v6/ejb/MethodElementEnum");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("SERVICE_ENDPOINT");
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitLdcInsn("ServiceEndpoint");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/jee/was/v6/ejb/MethodElementEnum", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/jee/was/v6/ejb/MethodElementEnum", "SERVICE_ENDPOINT", "Lorg/apache/openejb/jee/was/v6/ejb/MethodElementEnum;");
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitTypeInsn(ANEWARRAY, "org/apache/openejb/jee/was/v6/ejb/MethodElementEnum");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/jee/was/v6/ejb/MethodElementEnum", "UNSPECIFIED", "Lorg/apache/openejb/jee/was/v6/ejb/MethodElementEnum;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/jee/was/v6/ejb/MethodElementEnum", "REMOTE", "Lorg/apache/openejb/jee/was/v6/ejb/MethodElementEnum;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/jee/was/v6/ejb/MethodElementEnum", "HOME", "Lorg/apache/openejb/jee/was/v6/ejb/MethodElementEnum;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/jee/was/v6/ejb/MethodElementEnum", "LOCAL", "Lorg/apache/openejb/jee/was/v6/ejb/MethodElementEnum;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/jee/was/v6/ejb/MethodElementEnum", "LOCAL_HOME", "Lorg/apache/openejb/jee/was/v6/ejb/MethodElementEnum;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/jee/was/v6/ejb/MethodElementEnum", "SERVICE_ENDPOINT", "Lorg/apache/openejb/jee/was/v6/ejb/MethodElementEnum;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/jee/was/v6/ejb/MethodElementEnum", "$VALUES", "[Lorg/apache/openejb/jee/was/v6/ejb/MethodElementEnum;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
