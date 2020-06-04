package asm.org.apache.catalina.filters;
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
public class HttpHeaderSecurityFilter$XFrameOptionDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_FINAL | ACC_SUPER | ACC_ENUM, "org/apache/catalina/filters/HttpHeaderSecurityFilter$XFrameOption", "Ljava/lang/Enum<Lorg/apache/catalina/filters/HttpHeaderSecurityFilter$XFrameOption;>;", "java/lang/Enum", null);

classWriter.visitInnerClass("org/apache/catalina/filters/HttpHeaderSecurityFilter$XFrameOption", "org/apache/catalina/filters/HttpHeaderSecurityFilter", "XFrameOption", ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_ENUM);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "DENY", "Lorg/apache/catalina/filters/HttpHeaderSecurityFilter$XFrameOption;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "SAME_ORIGIN", "Lorg/apache/catalina/filters/HttpHeaderSecurityFilter$XFrameOption;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "ALLOW_FROM", "Lorg/apache/catalina/filters/HttpHeaderSecurityFilter$XFrameOption;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "headerValue", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_SYNTHETIC, "$VALUES", "[Lorg/apache/catalina/filters/HttpHeaderSecurityFilter$XFrameOption;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "values", "()[Lorg/apache/catalina/filters/HttpHeaderSecurityFilter$XFrameOption;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/catalina/filters/HttpHeaderSecurityFilter$XFrameOption", "$VALUES", "[Lorg/apache/catalina/filters/HttpHeaderSecurityFilter$XFrameOption;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "[Lorg/apache/catalina/filters/HttpHeaderSecurityFilter$XFrameOption;", "clone", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Lorg/apache/catalina/filters/HttpHeaderSecurityFilter$XFrameOption;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "valueOf", "(Ljava/lang/String;)Lorg/apache/catalina/filters/HttpHeaderSecurityFilter$XFrameOption;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/catalina/filters/HttpHeaderSecurityFilter$XFrameOption;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Enum", "valueOf", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/catalina/filters/HttpHeaderSecurityFilter$XFrameOption");
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
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/catalina/filters/HttpHeaderSecurityFilter$XFrameOption", "headerValue", "Ljava/lang/String;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getHeaderValue", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/catalina/filters/HttpHeaderSecurityFilter$XFrameOption", "headerValue", "Ljava/lang/String;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$000", "(Lorg/apache/catalina/filters/HttpHeaderSecurityFilter$XFrameOption;)Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/catalina/filters/HttpHeaderSecurityFilter$XFrameOption", "headerValue", "Ljava/lang/String;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/catalina/filters/HttpHeaderSecurityFilter$XFrameOption");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("DENY");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLdcInsn("DENY");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/catalina/filters/HttpHeaderSecurityFilter$XFrameOption", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/catalina/filters/HttpHeaderSecurityFilter$XFrameOption", "DENY", "Lorg/apache/catalina/filters/HttpHeaderSecurityFilter$XFrameOption;");
methodVisitor.visitTypeInsn(NEW, "org/apache/catalina/filters/HttpHeaderSecurityFilter$XFrameOption");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("SAME_ORIGIN");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitLdcInsn("SAMEORIGIN");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/catalina/filters/HttpHeaderSecurityFilter$XFrameOption", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/catalina/filters/HttpHeaderSecurityFilter$XFrameOption", "SAME_ORIGIN", "Lorg/apache/catalina/filters/HttpHeaderSecurityFilter$XFrameOption;");
methodVisitor.visitTypeInsn(NEW, "org/apache/catalina/filters/HttpHeaderSecurityFilter$XFrameOption");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("ALLOW_FROM");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitLdcInsn("ALLOW-FROM");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/catalina/filters/HttpHeaderSecurityFilter$XFrameOption", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/catalina/filters/HttpHeaderSecurityFilter$XFrameOption", "ALLOW_FROM", "Lorg/apache/catalina/filters/HttpHeaderSecurityFilter$XFrameOption;");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitTypeInsn(ANEWARRAY, "org/apache/catalina/filters/HttpHeaderSecurityFilter$XFrameOption");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/catalina/filters/HttpHeaderSecurityFilter$XFrameOption", "DENY", "Lorg/apache/catalina/filters/HttpHeaderSecurityFilter$XFrameOption;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/catalina/filters/HttpHeaderSecurityFilter$XFrameOption", "SAME_ORIGIN", "Lorg/apache/catalina/filters/HttpHeaderSecurityFilter$XFrameOption;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/catalina/filters/HttpHeaderSecurityFilter$XFrameOption", "ALLOW_FROM", "Lorg/apache/catalina/filters/HttpHeaderSecurityFilter$XFrameOption;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/catalina/filters/HttpHeaderSecurityFilter$XFrameOption", "$VALUES", "[Lorg/apache/catalina/filters/HttpHeaderSecurityFilter$XFrameOption;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
