package asm.org.opensaml.saml.common.assertion;
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
public class ValidationResultDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_7, ACC_PUBLIC | ACC_FINAL | ACC_SUPER | ACC_ENUM, "org/opensaml/saml/common/assertion/ValidationResult", "Ljava/lang/Enum<Lorg/opensaml/saml/common/assertion/ValidationResult;>;", "java/lang/Enum", null);

{
annotationVisitor0 = classWriter.visitAnnotation("Ljakarta/annotation/concurrent/ThreadSafe;", false);
annotationVisitor0.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "VALID", "Lorg/opensaml/saml/common/assertion/ValidationResult;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "INDETERMINATE", "Lorg/opensaml/saml/common/assertion/ValidationResult;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "INVALID", "Lorg/opensaml/saml/common/assertion/ValidationResult;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_SYNTHETIC, "$VALUES", "[Lorg/opensaml/saml/common/assertion/ValidationResult;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "values", "()[Lorg/opensaml/saml/common/assertion/ValidationResult;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/opensaml/saml/common/assertion/ValidationResult", "$VALUES", "[Lorg/opensaml/saml/common/assertion/ValidationResult;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "[Lorg/opensaml/saml/common/assertion/ValidationResult;", "clone", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Lorg/opensaml/saml/common/assertion/ValidationResult;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "valueOf", "(Ljava/lang/String;)Lorg/opensaml/saml/common/assertion/ValidationResult;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lorg/opensaml/saml/common/assertion/ValidationResult;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Enum", "valueOf", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/opensaml/saml/common/assertion/ValidationResult");
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
methodVisitor.visitTypeInsn(NEW, "org/opensaml/saml/common/assertion/ValidationResult");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("VALID");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/opensaml/saml/common/assertion/ValidationResult", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/opensaml/saml/common/assertion/ValidationResult", "VALID", "Lorg/opensaml/saml/common/assertion/ValidationResult;");
methodVisitor.visitTypeInsn(NEW, "org/opensaml/saml/common/assertion/ValidationResult");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("INDETERMINATE");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/opensaml/saml/common/assertion/ValidationResult", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/opensaml/saml/common/assertion/ValidationResult", "INDETERMINATE", "Lorg/opensaml/saml/common/assertion/ValidationResult;");
methodVisitor.visitTypeInsn(NEW, "org/opensaml/saml/common/assertion/ValidationResult");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("INVALID");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/opensaml/saml/common/assertion/ValidationResult", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/opensaml/saml/common/assertion/ValidationResult", "INVALID", "Lorg/opensaml/saml/common/assertion/ValidationResult;");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitTypeInsn(ANEWARRAY, "org/opensaml/saml/common/assertion/ValidationResult");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/opensaml/saml/common/assertion/ValidationResult", "VALID", "Lorg/opensaml/saml/common/assertion/ValidationResult;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/opensaml/saml/common/assertion/ValidationResult", "INDETERMINATE", "Lorg/opensaml/saml/common/assertion/ValidationResult;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitFieldInsn(GETSTATIC, "org/opensaml/saml/common/assertion/ValidationResult", "INVALID", "Lorg/opensaml/saml/common/assertion/ValidationResult;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/opensaml/saml/common/assertion/ValidationResult", "$VALUES", "[Lorg/opensaml/saml/common/assertion/ValidationResult;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
