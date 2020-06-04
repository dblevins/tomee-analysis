package asm.org.cryptacular.pbe;
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
public class OpenSSLAlgorithmDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_FINAL | ACC_SUPER | ACC_ENUM, "org/cryptacular/pbe/OpenSSLAlgorithm", "Ljava/lang/Enum<Lorg/cryptacular/pbe/OpenSSLAlgorithm;>;", "java/lang/Enum", null);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "AES_128_CBC", "Lorg/cryptacular/pbe/OpenSSLAlgorithm;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "AES_192_CBC", "Lorg/cryptacular/pbe/OpenSSLAlgorithm;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "AES_256_CBC", "Lorg/cryptacular/pbe/OpenSSLAlgorithm;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "DES_CBC", "Lorg/cryptacular/pbe/OpenSSLAlgorithm;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "DES_EDE3_CBC", "Lorg/cryptacular/pbe/OpenSSLAlgorithm;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "RC2_CBC", "Lorg/cryptacular/pbe/OpenSSLAlgorithm;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "RC2_40_CBC", "Lorg/cryptacular/pbe/OpenSSLAlgorithm;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "RC2_64_CBC", "Lorg/cryptacular/pbe/OpenSSLAlgorithm;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "algorithmId", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "cipherSpec", "Lorg/cryptacular/spec/KeyedBlockCipherSpec;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_SYNTHETIC, "$VALUES", "[Lorg/cryptacular/pbe/OpenSSLAlgorithm;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "values", "()[Lorg/cryptacular/pbe/OpenSSLAlgorithm;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/cryptacular/pbe/OpenSSLAlgorithm", "$VALUES", "[Lorg/cryptacular/pbe/OpenSSLAlgorithm;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "[Lorg/cryptacular/pbe/OpenSSLAlgorithm;", "clone", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Lorg/cryptacular/pbe/OpenSSLAlgorithm;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "valueOf", "(Ljava/lang/String;)Lorg/cryptacular/pbe/OpenSSLAlgorithm;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lorg/cryptacular/pbe/OpenSSLAlgorithm;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Enum", "valueOf", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/cryptacular/pbe/OpenSSLAlgorithm");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "(Ljava/lang/String;ILjava/lang/String;Lorg/cryptacular/spec/KeyedBlockCipherSpec;)V", "(Ljava/lang/String;Lorg/cryptacular/spec/KeyedBlockCipherSpec;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Enum", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(PUTFIELD, "org/cryptacular/pbe/OpenSSLAlgorithm", "algorithmId", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitFieldInsn(PUTFIELD, "org/cryptacular/pbe/OpenSSLAlgorithm", "cipherSpec", "Lorg/cryptacular/spec/KeyedBlockCipherSpec;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getAlgorithmId", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/cryptacular/pbe/OpenSSLAlgorithm", "algorithmId", "Ljava/lang/String;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getCipherSpec", "()Lorg/cryptacular/spec/KeyedBlockCipherSpec;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/cryptacular/pbe/OpenSSLAlgorithm", "cipherSpec", "Lorg/cryptacular/spec/KeyedBlockCipherSpec;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "fromAlgorithmId", "(Ljava/lang/String;)Lorg/cryptacular/pbe/OpenSSLAlgorithm;", null, null);
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/cryptacular/pbe/OpenSSLAlgorithm", "values", "()[Lorg/cryptacular/pbe/OpenSSLAlgorithm;", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitVarInsn(ISTORE, 2);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 3);
Label label0 = new Label();
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,3, new Object[] {"[Lorg/cryptacular/pbe/OpenSSLAlgorithm;", Opcodes.INTEGER, Opcodes.INTEGER}, 0, null);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitVarInsn(ILOAD, 2);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPGE, label1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/cryptacular/pbe/OpenSSLAlgorithm", "getAlgorithmId", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equalsIgnoreCase", "(Ljava/lang/String;)Z", false);
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
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitLdcInsn("Unsupported algorithm ");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/IllegalArgumentException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(4, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/cryptacular/pbe/OpenSSLAlgorithm");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("AES_128_CBC");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLdcInsn("aes-128-cbc");
methodVisitor.visitTypeInsn(NEW, "org/cryptacular/spec/KeyedBlockCipherSpec");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("AES");
methodVisitor.visitLdcInsn("CBC");
methodVisitor.visitLdcInsn("PKCS5");
methodVisitor.visitIntInsn(SIPUSH, 128);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/cryptacular/spec/KeyedBlockCipherSpec", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/cryptacular/pbe/OpenSSLAlgorithm", "<init>", "(Ljava/lang/String;ILjava/lang/String;Lorg/cryptacular/spec/KeyedBlockCipherSpec;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/cryptacular/pbe/OpenSSLAlgorithm", "AES_128_CBC", "Lorg/cryptacular/pbe/OpenSSLAlgorithm;");
methodVisitor.visitTypeInsn(NEW, "org/cryptacular/pbe/OpenSSLAlgorithm");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("AES_192_CBC");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitLdcInsn("aes-192-cbc");
methodVisitor.visitTypeInsn(NEW, "org/cryptacular/spec/KeyedBlockCipherSpec");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("AES");
methodVisitor.visitLdcInsn("CBC");
methodVisitor.visitLdcInsn("PKCS5");
methodVisitor.visitIntInsn(SIPUSH, 192);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/cryptacular/spec/KeyedBlockCipherSpec", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/cryptacular/pbe/OpenSSLAlgorithm", "<init>", "(Ljava/lang/String;ILjava/lang/String;Lorg/cryptacular/spec/KeyedBlockCipherSpec;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/cryptacular/pbe/OpenSSLAlgorithm", "AES_192_CBC", "Lorg/cryptacular/pbe/OpenSSLAlgorithm;");
methodVisitor.visitTypeInsn(NEW, "org/cryptacular/pbe/OpenSSLAlgorithm");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("AES_256_CBC");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitLdcInsn("aes-256-cbc");
methodVisitor.visitTypeInsn(NEW, "org/cryptacular/spec/KeyedBlockCipherSpec");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("AES");
methodVisitor.visitLdcInsn("CBC");
methodVisitor.visitLdcInsn("PKCS5");
methodVisitor.visitIntInsn(SIPUSH, 256);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/cryptacular/spec/KeyedBlockCipherSpec", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/cryptacular/pbe/OpenSSLAlgorithm", "<init>", "(Ljava/lang/String;ILjava/lang/String;Lorg/cryptacular/spec/KeyedBlockCipherSpec;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/cryptacular/pbe/OpenSSLAlgorithm", "AES_256_CBC", "Lorg/cryptacular/pbe/OpenSSLAlgorithm;");
methodVisitor.visitTypeInsn(NEW, "org/cryptacular/pbe/OpenSSLAlgorithm");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("DES_CBC");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitLdcInsn("des-cbc");
methodVisitor.visitTypeInsn(NEW, "org/cryptacular/spec/KeyedBlockCipherSpec");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("DES");
methodVisitor.visitLdcInsn("CBC");
methodVisitor.visitLdcInsn("PKCS5");
methodVisitor.visitIntInsn(BIPUSH, 64);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/cryptacular/spec/KeyedBlockCipherSpec", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/cryptacular/pbe/OpenSSLAlgorithm", "<init>", "(Ljava/lang/String;ILjava/lang/String;Lorg/cryptacular/spec/KeyedBlockCipherSpec;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/cryptacular/pbe/OpenSSLAlgorithm", "DES_CBC", "Lorg/cryptacular/pbe/OpenSSLAlgorithm;");
methodVisitor.visitTypeInsn(NEW, "org/cryptacular/pbe/OpenSSLAlgorithm");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("DES_EDE3_CBC");
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitLdcInsn("des-ede3-cbc");
methodVisitor.visitTypeInsn(NEW, "org/cryptacular/spec/KeyedBlockCipherSpec");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("DESede");
methodVisitor.visitLdcInsn("CBC");
methodVisitor.visitLdcInsn("PKCS5");
methodVisitor.visitIntInsn(SIPUSH, 192);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/cryptacular/spec/KeyedBlockCipherSpec", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/cryptacular/pbe/OpenSSLAlgorithm", "<init>", "(Ljava/lang/String;ILjava/lang/String;Lorg/cryptacular/spec/KeyedBlockCipherSpec;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/cryptacular/pbe/OpenSSLAlgorithm", "DES_EDE3_CBC", "Lorg/cryptacular/pbe/OpenSSLAlgorithm;");
methodVisitor.visitTypeInsn(NEW, "org/cryptacular/pbe/OpenSSLAlgorithm");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("RC2_CBC");
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitLdcInsn("rc2-cbc");
methodVisitor.visitTypeInsn(NEW, "org/cryptacular/spec/KeyedBlockCipherSpec");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("RC2");
methodVisitor.visitLdcInsn("CBC");
methodVisitor.visitLdcInsn("PKCS5");
methodVisitor.visitIntInsn(SIPUSH, 128);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/cryptacular/spec/KeyedBlockCipherSpec", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/cryptacular/pbe/OpenSSLAlgorithm", "<init>", "(Ljava/lang/String;ILjava/lang/String;Lorg/cryptacular/spec/KeyedBlockCipherSpec;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/cryptacular/pbe/OpenSSLAlgorithm", "RC2_CBC", "Lorg/cryptacular/pbe/OpenSSLAlgorithm;");
methodVisitor.visitTypeInsn(NEW, "org/cryptacular/pbe/OpenSSLAlgorithm");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("RC2_40_CBC");
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitLdcInsn("rc2-40-cbc");
methodVisitor.visitTypeInsn(NEW, "org/cryptacular/spec/KeyedBlockCipherSpec");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("RC2");
methodVisitor.visitLdcInsn("CBC");
methodVisitor.visitLdcInsn("PKCS5");
methodVisitor.visitIntInsn(BIPUSH, 40);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/cryptacular/spec/KeyedBlockCipherSpec", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/cryptacular/pbe/OpenSSLAlgorithm", "<init>", "(Ljava/lang/String;ILjava/lang/String;Lorg/cryptacular/spec/KeyedBlockCipherSpec;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/cryptacular/pbe/OpenSSLAlgorithm", "RC2_40_CBC", "Lorg/cryptacular/pbe/OpenSSLAlgorithm;");
methodVisitor.visitTypeInsn(NEW, "org/cryptacular/pbe/OpenSSLAlgorithm");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("RC2_64_CBC");
methodVisitor.visitIntInsn(BIPUSH, 7);
methodVisitor.visitLdcInsn("rc2-64-cbc");
methodVisitor.visitTypeInsn(NEW, "org/cryptacular/spec/KeyedBlockCipherSpec");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("RC2");
methodVisitor.visitLdcInsn("CBC");
methodVisitor.visitLdcInsn("PKCS5");
methodVisitor.visitIntInsn(BIPUSH, 64);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/cryptacular/spec/KeyedBlockCipherSpec", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/cryptacular/pbe/OpenSSLAlgorithm", "<init>", "(Ljava/lang/String;ILjava/lang/String;Lorg/cryptacular/spec/KeyedBlockCipherSpec;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/cryptacular/pbe/OpenSSLAlgorithm", "RC2_64_CBC", "Lorg/cryptacular/pbe/OpenSSLAlgorithm;");
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitTypeInsn(ANEWARRAY, "org/cryptacular/pbe/OpenSSLAlgorithm");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/cryptacular/pbe/OpenSSLAlgorithm", "AES_128_CBC", "Lorg/cryptacular/pbe/OpenSSLAlgorithm;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/cryptacular/pbe/OpenSSLAlgorithm", "AES_192_CBC", "Lorg/cryptacular/pbe/OpenSSLAlgorithm;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitFieldInsn(GETSTATIC, "org/cryptacular/pbe/OpenSSLAlgorithm", "AES_256_CBC", "Lorg/cryptacular/pbe/OpenSSLAlgorithm;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitFieldInsn(GETSTATIC, "org/cryptacular/pbe/OpenSSLAlgorithm", "DES_CBC", "Lorg/cryptacular/pbe/OpenSSLAlgorithm;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitFieldInsn(GETSTATIC, "org/cryptacular/pbe/OpenSSLAlgorithm", "DES_EDE3_CBC", "Lorg/cryptacular/pbe/OpenSSLAlgorithm;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitFieldInsn(GETSTATIC, "org/cryptacular/pbe/OpenSSLAlgorithm", "RC2_CBC", "Lorg/cryptacular/pbe/OpenSSLAlgorithm;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitFieldInsn(GETSTATIC, "org/cryptacular/pbe/OpenSSLAlgorithm", "RC2_40_CBC", "Lorg/cryptacular/pbe/OpenSSLAlgorithm;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 7);
methodVisitor.visitFieldInsn(GETSTATIC, "org/cryptacular/pbe/OpenSSLAlgorithm", "RC2_64_CBC", "Lorg/cryptacular/pbe/OpenSSLAlgorithm;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/cryptacular/pbe/OpenSSLAlgorithm", "$VALUES", "[Lorg/cryptacular/pbe/OpenSSLAlgorithm;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(11, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
