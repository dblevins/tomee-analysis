package asm.org.jasypt.util.numeric;
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
public class AES256DecimalNumberEncryptorDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_6, ACC_PUBLIC | ACC_FINAL | ACC_SUPER, "org/jasypt/util/numeric/AES256DecimalNumberEncryptor", null, "java/lang/Object", new String[] { "org/jasypt/util/numeric/DecimalNumberEncryptor" });

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "encryptor", "Lorg/jasypt/encryption/pbe/StandardPBEBigDecimalEncryptor;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/jasypt/encryption/pbe/StandardPBEBigDecimalEncryptor");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/jasypt/encryption/pbe/StandardPBEBigDecimalEncryptor", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/jasypt/util/numeric/AES256DecimalNumberEncryptor", "encryptor", "Lorg/jasypt/encryption/pbe/StandardPBEBigDecimalEncryptor;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/jasypt/util/numeric/AES256DecimalNumberEncryptor", "encryptor", "Lorg/jasypt/encryption/pbe/StandardPBEBigDecimalEncryptor;");
methodVisitor.visitLdcInsn("PBEWithHMACSHA512AndAES_256");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jasypt/encryption/pbe/StandardPBEBigDecimalEncryptor", "setAlgorithm", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/jasypt/util/numeric/AES256DecimalNumberEncryptor", "encryptor", "Lorg/jasypt/encryption/pbe/StandardPBEBigDecimalEncryptor;");
methodVisitor.visitTypeInsn(NEW, "org/jasypt/iv/RandomIvGenerator");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/jasypt/iv/RandomIvGenerator", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jasypt/encryption/pbe/StandardPBEBigDecimalEncryptor", "setIvGenerator", "(Lorg/jasypt/iv/IvGenerator;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setPassword", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/jasypt/util/numeric/AES256DecimalNumberEncryptor", "encryptor", "Lorg/jasypt/encryption/pbe/StandardPBEBigDecimalEncryptor;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jasypt/encryption/pbe/StandardPBEBigDecimalEncryptor", "setPassword", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setPasswordCharArray", "([C)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/jasypt/util/numeric/AES256DecimalNumberEncryptor", "encryptor", "Lorg/jasypt/encryption/pbe/StandardPBEBigDecimalEncryptor;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jasypt/encryption/pbe/StandardPBEBigDecimalEncryptor", "setPasswordCharArray", "([C)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "encrypt", "(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/jasypt/util/numeric/AES256DecimalNumberEncryptor", "encryptor", "Lorg/jasypt/encryption/pbe/StandardPBEBigDecimalEncryptor;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jasypt/encryption/pbe/StandardPBEBigDecimalEncryptor", "encrypt", "(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "decrypt", "(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/jasypt/util/numeric/AES256DecimalNumberEncryptor", "encryptor", "Lorg/jasypt/encryption/pbe/StandardPBEBigDecimalEncryptor;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jasypt/encryption/pbe/StandardPBEBigDecimalEncryptor", "decrypt", "(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
