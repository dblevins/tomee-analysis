package asm.org.apache.catalina.authenticator;
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
public class AuthenticatorBase$AllowCorsPreflightDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_FINAL | ACC_SUPER | ACC_ENUM, "org/apache/catalina/authenticator/AuthenticatorBase$AllowCorsPreflight", "Ljava/lang/Enum<Lorg/apache/catalina/authenticator/AuthenticatorBase$AllowCorsPreflight;>;", "java/lang/Enum", null);

classWriter.visitInnerClass("org/apache/catalina/authenticator/AuthenticatorBase$AllowCorsPreflight", "org/apache/catalina/authenticator/AuthenticatorBase", "AllowCorsPreflight", ACC_PROTECTED | ACC_FINAL | ACC_STATIC | ACC_ENUM);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "NEVER", "Lorg/apache/catalina/authenticator/AuthenticatorBase$AllowCorsPreflight;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "FILTER", "Lorg/apache/catalina/authenticator/AuthenticatorBase$AllowCorsPreflight;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "ALWAYS", "Lorg/apache/catalina/authenticator/AuthenticatorBase$AllowCorsPreflight;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_SYNTHETIC, "$VALUES", "[Lorg/apache/catalina/authenticator/AuthenticatorBase$AllowCorsPreflight;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "values", "()[Lorg/apache/catalina/authenticator/AuthenticatorBase$AllowCorsPreflight;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/catalina/authenticator/AuthenticatorBase$AllowCorsPreflight", "$VALUES", "[Lorg/apache/catalina/authenticator/AuthenticatorBase$AllowCorsPreflight;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "[Lorg/apache/catalina/authenticator/AuthenticatorBase$AllowCorsPreflight;", "clone", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Lorg/apache/catalina/authenticator/AuthenticatorBase$AllowCorsPreflight;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "valueOf", "(Ljava/lang/String;)Lorg/apache/catalina/authenticator/AuthenticatorBase$AllowCorsPreflight;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/catalina/authenticator/AuthenticatorBase$AllowCorsPreflight;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Enum", "valueOf", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/catalina/authenticator/AuthenticatorBase$AllowCorsPreflight");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "(Ljava/lang/String;I)V", "()V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Enum", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/catalina/authenticator/AuthenticatorBase$AllowCorsPreflight");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("NEVER");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/catalina/authenticator/AuthenticatorBase$AllowCorsPreflight", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/catalina/authenticator/AuthenticatorBase$AllowCorsPreflight", "NEVER", "Lorg/apache/catalina/authenticator/AuthenticatorBase$AllowCorsPreflight;");
methodVisitor.visitTypeInsn(NEW, "org/apache/catalina/authenticator/AuthenticatorBase$AllowCorsPreflight");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("FILTER");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/catalina/authenticator/AuthenticatorBase$AllowCorsPreflight", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/catalina/authenticator/AuthenticatorBase$AllowCorsPreflight", "FILTER", "Lorg/apache/catalina/authenticator/AuthenticatorBase$AllowCorsPreflight;");
methodVisitor.visitTypeInsn(NEW, "org/apache/catalina/authenticator/AuthenticatorBase$AllowCorsPreflight");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("ALWAYS");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/catalina/authenticator/AuthenticatorBase$AllowCorsPreflight", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/catalina/authenticator/AuthenticatorBase$AllowCorsPreflight", "ALWAYS", "Lorg/apache/catalina/authenticator/AuthenticatorBase$AllowCorsPreflight;");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitTypeInsn(ANEWARRAY, "org/apache/catalina/authenticator/AuthenticatorBase$AllowCorsPreflight");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/catalina/authenticator/AuthenticatorBase$AllowCorsPreflight", "NEVER", "Lorg/apache/catalina/authenticator/AuthenticatorBase$AllowCorsPreflight;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/catalina/authenticator/AuthenticatorBase$AllowCorsPreflight", "FILTER", "Lorg/apache/catalina/authenticator/AuthenticatorBase$AllowCorsPreflight;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/catalina/authenticator/AuthenticatorBase$AllowCorsPreflight", "ALWAYS", "Lorg/apache/catalina/authenticator/AuthenticatorBase$AllowCorsPreflight;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/catalina/authenticator/AuthenticatorBase$AllowCorsPreflight", "$VALUES", "[Lorg/apache/catalina/authenticator/AuthenticatorBase$AllowCorsPreflight;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
