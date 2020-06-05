package asm.org.apache.openejb.cipher;
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
public class StaticDESPasswordCipherDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/openejb/cipher/StaticDESPasswordCipher", null, "java/lang/Object", new String[] { "org/apache/openejb/cipher/PasswordCipher" });

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "_3desData", "[B", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "KEY", "Ljavax/crypto/spec/SecretKeySpec;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "TRANSFORMATION", "Ljava/lang/String;", null, "DESede");
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
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "encrypt", "(Ljava/lang/String;)[C", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/lang/Exception");
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ALOAD, 1);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPEQ, label3);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "length", "()I", false);
Label label4 = new Label();
methodVisitor.visitJumpInsn(IFNE, label4);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "java/lang/IllegalArgumentException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("plainPassword cannot be null nor empty.");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/IllegalArgumentException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "getBytes", "()[B", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitLabel(label0);
methodVisitor.visitLdcInsn("DESede");
methodVisitor.visitMethodInsn(INVOKESTATIC, "javax/crypto/Cipher", "getInstance", "(Ljava/lang/String;)Ljavax/crypto/Cipher;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/cipher/StaticDESPasswordCipher", "KEY", "Ljavax/crypto/spec/SecretKeySpec;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/crypto/Cipher", "init", "(ILjava/security/Key;)V", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/crypto/Cipher", "doFinal", "([B)[B", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitTypeInsn(NEW, "java/lang/String");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/util/Base64", "encodeBase64", "([B)[B", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/String", "<init>", "([B)V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_FULL, 3, new Object[] {"org/apache/openejb/cipher/StaticDESPasswordCipher", "java/lang/String", "[B"}, 1, new Object[] {"java/lang/Exception"});
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/OpenEJBRuntimeException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/OpenEJBRuntimeException", "<init>", "(Ljava/lang/Exception;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(3, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "decrypt", "([C)Ljava/lang/String;", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/lang/Exception");
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ALOAD, 1);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPEQ, label3);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "java/lang/IllegalArgumentException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("encodedPassword cannot be null nor empty.");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/IllegalArgumentException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/String", "valueOf", "([C)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "getBytes", "()[B", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/util/Base64", "decodeBase64", "([B)[B", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitLdcInsn("DESede");
methodVisitor.visitMethodInsn(INVOKESTATIC, "javax/crypto/Cipher", "getInstance", "(Ljava/lang/String;)Ljavax/crypto/Cipher;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/cipher/StaticDESPasswordCipher", "KEY", "Ljavax/crypto/spec/SecretKeySpec;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/crypto/Cipher", "init", "(ILjava/security/Key;)V", false);
methodVisitor.visitTypeInsn(NEW, "java/lang/String");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/crypto/Cipher", "doFinal", "([B)[B", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/String", "<init>", "([B)V", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/Exception"});
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/OpenEJBRuntimeException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/OpenEJBRuntimeException", "<init>", "(Ljava/lang/Exception;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitIntInsn(BIPUSH, 24);
methodVisitor.visitIntInsn(NEWARRAY, T_BYTE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitIntInsn(BIPUSH, 118);
methodVisitor.visitInsn(BASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitIntInsn(BIPUSH, 111);
methodVisitor.visitInsn(BASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitIntInsn(BIPUSH, -70);
methodVisitor.visitInsn(BASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitIntInsn(BIPUSH, 57);
methodVisitor.visitInsn(BASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitIntInsn(BIPUSH, 49);
methodVisitor.visitInsn(BASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitIntInsn(BIPUSH, 47);
methodVisitor.visitInsn(BASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitIntInsn(BIPUSH, 13);
methodVisitor.visitInsn(BASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 7);
methodVisitor.visitIntInsn(BIPUSH, 74);
methodVisitor.visitInsn(BASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitIntInsn(BIPUSH, -93);
methodVisitor.visitInsn(BASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 9);
methodVisitor.visitIntInsn(BIPUSH, -112);
methodVisitor.visitInsn(BASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 10);
methodVisitor.visitIntInsn(BIPUSH, 85);
methodVisitor.visitInsn(BASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 11);
methodVisitor.visitIntInsn(BIPUSH, -2);
methodVisitor.visitInsn(BASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 12);
methodVisitor.visitIntInsn(BIPUSH, 85);
methodVisitor.visitInsn(BASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 13);
methodVisitor.visitIntInsn(BIPUSH, 101);
methodVisitor.visitInsn(BASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 14);
methodVisitor.visitIntInsn(BIPUSH, 97);
methodVisitor.visitInsn(BASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 15);
methodVisitor.visitIntInsn(BIPUSH, 19);
methodVisitor.visitInsn(BASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 16);
methodVisitor.visitIntInsn(BIPUSH, 52);
methodVisitor.visitInsn(BASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 17);
methodVisitor.visitIntInsn(BIPUSH, -126);
methodVisitor.visitInsn(BASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 18);
methodVisitor.visitIntInsn(BIPUSH, 18);
methodVisitor.visitInsn(BASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 19);
methodVisitor.visitIntInsn(BIPUSH, 23);
methodVisitor.visitInsn(BASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 20);
methodVisitor.visitIntInsn(BIPUSH, -84);
methodVisitor.visitInsn(BASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 21);
methodVisitor.visitIntInsn(BIPUSH, 119);
methodVisitor.visitInsn(BASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 22);
methodVisitor.visitIntInsn(BIPUSH, 57);
methodVisitor.visitInsn(BASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 23);
methodVisitor.visitIntInsn(BIPUSH, 25);
methodVisitor.visitInsn(BASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/cipher/StaticDESPasswordCipher", "_3desData", "[B");
methodVisitor.visitTypeInsn(NEW, "javax/crypto/spec/SecretKeySpec");
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/cipher/StaticDESPasswordCipher", "_3desData", "[B");
methodVisitor.visitLdcInsn("DESede");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/crypto/spec/SecretKeySpec", "<init>", "([BLjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/cipher/StaticDESPasswordCipher", "KEY", "Ljavax/crypto/spec/SecretKeySpec;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}