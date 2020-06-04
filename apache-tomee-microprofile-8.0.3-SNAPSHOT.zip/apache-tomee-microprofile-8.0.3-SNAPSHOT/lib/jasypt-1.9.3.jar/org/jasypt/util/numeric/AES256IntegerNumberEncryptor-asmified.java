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
public class AES256IntegerNumberEncryptorDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_6, ACC_PUBLIC | ACC_FINAL | ACC_SUPER, "org/jasypt/util/numeric/AES256IntegerNumberEncryptor", null, "java/lang/Object", new String[] { "org/jasypt/util/numeric/IntegerNumberEncryptor" });

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "encryptor", "Lorg/jasypt/encryption/pbe/StandardPBEBigIntegerEncryptor;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/jasypt/encryption/pbe/StandardPBEBigIntegerEncryptor");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/jasypt/encryption/pbe/StandardPBEBigIntegerEncryptor", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/jasypt/util/numeric/AES256IntegerNumberEncryptor", "encryptor", "Lorg/jasypt/encryption/pbe/StandardPBEBigIntegerEncryptor;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/jasypt/util/numeric/AES256IntegerNumberEncryptor", "encryptor", "Lorg/jasypt/encryption/pbe/StandardPBEBigIntegerEncryptor;");
methodVisitor.visitLdcInsn("PBEWithHMACSHA512AndAES_256");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jasypt/encryption/pbe/StandardPBEBigIntegerEncryptor", "setAlgorithm", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/jasypt/util/numeric/AES256IntegerNumberEncryptor", "encryptor", "Lorg/jasypt/encryption/pbe/StandardPBEBigIntegerEncryptor;");
methodVisitor.visitTypeInsn(NEW, "org/jasypt/iv/RandomIvGenerator");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/jasypt/iv/RandomIvGenerator", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jasypt/encryption/pbe/StandardPBEBigIntegerEncryptor", "setIvGenerator", "(Lorg/jasypt/iv/IvGenerator;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setPassword", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/jasypt/util/numeric/AES256IntegerNumberEncryptor", "encryptor", "Lorg/jasypt/encryption/pbe/StandardPBEBigIntegerEncryptor;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jasypt/encryption/pbe/StandardPBEBigIntegerEncryptor", "setPassword", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setPasswordCharArray", "([C)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/jasypt/util/numeric/AES256IntegerNumberEncryptor", "encryptor", "Lorg/jasypt/encryption/pbe/StandardPBEBigIntegerEncryptor;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jasypt/encryption/pbe/StandardPBEBigIntegerEncryptor", "setPasswordCharArray", "([C)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "encrypt", "(Ljava/math/BigInteger;)Ljava/math/BigInteger;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/jasypt/util/numeric/AES256IntegerNumberEncryptor", "encryptor", "Lorg/jasypt/encryption/pbe/StandardPBEBigIntegerEncryptor;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jasypt/encryption/pbe/StandardPBEBigIntegerEncryptor", "encrypt", "(Ljava/math/BigInteger;)Ljava/math/BigInteger;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "decrypt", "(Ljava/math/BigInteger;)Ljava/math/BigInteger;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/jasypt/util/numeric/AES256IntegerNumberEncryptor", "encryptor", "Lorg/jasypt/encryption/pbe/StandardPBEBigIntegerEncryptor;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jasypt/encryption/pbe/StandardPBEBigIntegerEncryptor", "decrypt", "(Ljava/math/BigInteger;)Ljava/math/BigInteger;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
