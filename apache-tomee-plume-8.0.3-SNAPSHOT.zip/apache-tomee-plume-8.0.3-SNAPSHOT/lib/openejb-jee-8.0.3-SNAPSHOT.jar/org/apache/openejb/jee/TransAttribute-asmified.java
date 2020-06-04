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
public class TransAttributeDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_FINAL | ACC_SUPER | ACC_ENUM, "org/apache/openejb/jee/TransAttribute", "Ljava/lang/Enum<Lorg/apache/openejb/jee/TransAttribute;>;", "java/lang/Enum", null);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "NOT_SUPPORTED", "Lorg/apache/openejb/jee/TransAttribute;", null, null);
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Ljavax/xml/bind/annotation/XmlEnumValue;", true);
annotationVisitor0.visit("value", "NotSupported");
annotationVisitor0.visitEnd();
}
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "SUPPORTS", "Lorg/apache/openejb/jee/TransAttribute;", null, null);
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Ljavax/xml/bind/annotation/XmlEnumValue;", true);
annotationVisitor0.visit("value", "Supports");
annotationVisitor0.visitEnd();
}
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "REQUIRED", "Lorg/apache/openejb/jee/TransAttribute;", null, null);
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Ljavax/xml/bind/annotation/XmlEnumValue;", true);
annotationVisitor0.visit("value", "Required");
annotationVisitor0.visitEnd();
}
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "REQUIRES_NEW", "Lorg/apache/openejb/jee/TransAttribute;", null, null);
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Ljavax/xml/bind/annotation/XmlEnumValue;", true);
annotationVisitor0.visit("value", "RequiresNew");
annotationVisitor0.visitEnd();
}
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "MANDATORY", "Lorg/apache/openejb/jee/TransAttribute;", null, null);
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Ljavax/xml/bind/annotation/XmlEnumValue;", true);
annotationVisitor0.visit("value", "Mandatory");
annotationVisitor0.visitEnd();
}
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "NEVER", "Lorg/apache/openejb/jee/TransAttribute;", null, null);
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Ljavax/xml/bind/annotation/XmlEnumValue;", true);
annotationVisitor0.visit("value", "Never");
annotationVisitor0.visitEnd();
}
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "name", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_SYNTHETIC, "$VALUES", "[Lorg/apache/openejb/jee/TransAttribute;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "values", "()[Lorg/apache/openejb/jee/TransAttribute;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/jee/TransAttribute", "$VALUES", "[Lorg/apache/openejb/jee/TransAttribute;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "[Lorg/apache/openejb/jee/TransAttribute;", "clone", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Lorg/apache/openejb/jee/TransAttribute;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "valueOf", "(Ljava/lang/String;)Lorg/apache/openejb/jee/TransAttribute;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/openejb/jee/TransAttribute;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Enum", "valueOf", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/openejb/jee/TransAttribute");
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
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/jee/TransAttribute", "name", "Ljava/lang/String;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "toString", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/jee/TransAttribute", "name", "Ljava/lang/String;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/jee/TransAttribute");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("NOT_SUPPORTED");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLdcInsn("NotSupported");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/jee/TransAttribute", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/jee/TransAttribute", "NOT_SUPPORTED", "Lorg/apache/openejb/jee/TransAttribute;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/jee/TransAttribute");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("SUPPORTS");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitLdcInsn("Supports");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/jee/TransAttribute", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/jee/TransAttribute", "SUPPORTS", "Lorg/apache/openejb/jee/TransAttribute;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/jee/TransAttribute");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("REQUIRED");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitLdcInsn("Required");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/jee/TransAttribute", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/jee/TransAttribute", "REQUIRED", "Lorg/apache/openejb/jee/TransAttribute;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/jee/TransAttribute");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("REQUIRES_NEW");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitLdcInsn("RequiresNew");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/jee/TransAttribute", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/jee/TransAttribute", "REQUIRES_NEW", "Lorg/apache/openejb/jee/TransAttribute;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/jee/TransAttribute");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("MANDATORY");
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitLdcInsn("Mandatory");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/jee/TransAttribute", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/jee/TransAttribute", "MANDATORY", "Lorg/apache/openejb/jee/TransAttribute;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/jee/TransAttribute");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("NEVER");
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitLdcInsn("Never");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/jee/TransAttribute", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/jee/TransAttribute", "NEVER", "Lorg/apache/openejb/jee/TransAttribute;");
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitTypeInsn(ANEWARRAY, "org/apache/openejb/jee/TransAttribute");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/jee/TransAttribute", "NOT_SUPPORTED", "Lorg/apache/openejb/jee/TransAttribute;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/jee/TransAttribute", "SUPPORTS", "Lorg/apache/openejb/jee/TransAttribute;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/jee/TransAttribute", "REQUIRED", "Lorg/apache/openejb/jee/TransAttribute;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/jee/TransAttribute", "REQUIRES_NEW", "Lorg/apache/openejb/jee/TransAttribute;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/jee/TransAttribute", "MANDATORY", "Lorg/apache/openejb/jee/TransAttribute;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/jee/TransAttribute", "NEVER", "Lorg/apache/openejb/jee/TransAttribute;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/jee/TransAttribute", "$VALUES", "[Lorg/apache/openejb/jee/TransAttribute;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
