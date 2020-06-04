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
public class PBES1AlgorithmDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_FINAL | ACC_SUPER | ACC_ENUM, "org/cryptacular/pbe/PBES1Algorithm", "Ljava/lang/Enum<Lorg/cryptacular/pbe/PBES1Algorithm;>;", "java/lang/Enum", null);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "PbeWithMD2AndDES_CBC", "Lorg/cryptacular/pbe/PBES1Algorithm;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "PbeWithMD2AndRC2_CBC", "Lorg/cryptacular/pbe/PBES1Algorithm;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "PbeWithMD5AndDES_CBC", "Lorg/cryptacular/pbe/PBES1Algorithm;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "PbeWithMD5AndRC2_CBC", "Lorg/cryptacular/pbe/PBES1Algorithm;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "PbeWithSHA1AndDES_CBC", "Lorg/cryptacular/pbe/PBES1Algorithm;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "PbeWithSHA1AndRC2_CBC", "Lorg/cryptacular/pbe/PBES1Algorithm;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "oid", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "cipherSpec", "Lorg/cryptacular/spec/BufferedBlockCipherSpec;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "digestSpec", "Lorg/cryptacular/spec/DigestSpec;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_SYNTHETIC, "$VALUES", "[Lorg/cryptacular/pbe/PBES1Algorithm;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "values", "()[Lorg/cryptacular/pbe/PBES1Algorithm;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/cryptacular/pbe/PBES1Algorithm", "$VALUES", "[Lorg/cryptacular/pbe/PBES1Algorithm;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "[Lorg/cryptacular/pbe/PBES1Algorithm;", "clone", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Lorg/cryptacular/pbe/PBES1Algorithm;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "valueOf", "(Ljava/lang/String;)Lorg/cryptacular/pbe/PBES1Algorithm;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lorg/cryptacular/pbe/PBES1Algorithm;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Enum", "valueOf", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/cryptacular/pbe/PBES1Algorithm");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "(Ljava/lang/String;ILjava/lang/String;Lorg/cryptacular/spec/BufferedBlockCipherSpec;Lorg/cryptacular/spec/DigestSpec;)V", "(Ljava/lang/String;Lorg/cryptacular/spec/BufferedBlockCipherSpec;Lorg/cryptacular/spec/DigestSpec;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Enum", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(PUTFIELD, "org/cryptacular/pbe/PBES1Algorithm", "oid", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitFieldInsn(PUTFIELD, "org/cryptacular/pbe/PBES1Algorithm", "cipherSpec", "Lorg/cryptacular/spec/BufferedBlockCipherSpec;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitFieldInsn(PUTFIELD, "org/cryptacular/pbe/PBES1Algorithm", "digestSpec", "Lorg/cryptacular/spec/DigestSpec;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 6);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "fromOid", "(Ljava/lang/String;)Lorg/cryptacular/pbe/PBES1Algorithm;", null, null);
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/cryptacular/pbe/PBES1Algorithm", "values", "()[Lorg/cryptacular/pbe/PBES1Algorithm;", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitVarInsn(ISTORE, 2);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 3);
Label label0 = new Label();
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,3, new Object[] {"[Lorg/cryptacular/pbe/PBES1Algorithm;", Opcodes.INTEGER, Opcodes.INTEGER}, 0, null);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitVarInsn(ILOAD, 2);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPGE, label1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/cryptacular/pbe/PBES1Algorithm", "getOid", "()Ljava/lang/String;", false);
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
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitLdcInsn("Unknown PBES1Algorithm for OID ");
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
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getOid", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/cryptacular/pbe/PBES1Algorithm", "oid", "Ljava/lang/String;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getCipherSpec", "()Lorg/cryptacular/spec/BufferedBlockCipherSpec;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/cryptacular/pbe/PBES1Algorithm", "cipherSpec", "Lorg/cryptacular/spec/BufferedBlockCipherSpec;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getDigestSpec", "()Lorg/cryptacular/spec/DigestSpec;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/cryptacular/pbe/PBES1Algorithm", "digestSpec", "Lorg/cryptacular/spec/DigestSpec;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/cryptacular/pbe/PBES1Algorithm");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("PbeWithMD2AndDES_CBC");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLdcInsn("1.2.840.113549.1.5.1");
methodVisitor.visitTypeInsn(NEW, "org/cryptacular/spec/BufferedBlockCipherSpec");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("DES");
methodVisitor.visitLdcInsn("CBC");
methodVisitor.visitLdcInsn("PKCS5");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/cryptacular/spec/BufferedBlockCipherSpec", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/cryptacular/spec/DigestSpec");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("MD2");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/cryptacular/spec/DigestSpec", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/cryptacular/pbe/PBES1Algorithm", "<init>", "(Ljava/lang/String;ILjava/lang/String;Lorg/cryptacular/spec/BufferedBlockCipherSpec;Lorg/cryptacular/spec/DigestSpec;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/cryptacular/pbe/PBES1Algorithm", "PbeWithMD2AndDES_CBC", "Lorg/cryptacular/pbe/PBES1Algorithm;");
methodVisitor.visitTypeInsn(NEW, "org/cryptacular/pbe/PBES1Algorithm");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("PbeWithMD2AndRC2_CBC");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitLdcInsn("1.2.840.113549.1.5.4");
methodVisitor.visitTypeInsn(NEW, "org/cryptacular/spec/BufferedBlockCipherSpec");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("RC2");
methodVisitor.visitLdcInsn("CBC");
methodVisitor.visitLdcInsn("PKCS5");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/cryptacular/spec/BufferedBlockCipherSpec", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/cryptacular/spec/DigestSpec");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("MD2");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/cryptacular/spec/DigestSpec", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/cryptacular/pbe/PBES1Algorithm", "<init>", "(Ljava/lang/String;ILjava/lang/String;Lorg/cryptacular/spec/BufferedBlockCipherSpec;Lorg/cryptacular/spec/DigestSpec;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/cryptacular/pbe/PBES1Algorithm", "PbeWithMD2AndRC2_CBC", "Lorg/cryptacular/pbe/PBES1Algorithm;");
methodVisitor.visitTypeInsn(NEW, "org/cryptacular/pbe/PBES1Algorithm");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("PbeWithMD5AndDES_CBC");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitLdcInsn("1.2.840.113549.1.5.3");
methodVisitor.visitTypeInsn(NEW, "org/cryptacular/spec/BufferedBlockCipherSpec");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("DES");
methodVisitor.visitLdcInsn("CBC");
methodVisitor.visitLdcInsn("PKCS5");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/cryptacular/spec/BufferedBlockCipherSpec", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/cryptacular/spec/DigestSpec");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("MD5");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/cryptacular/spec/DigestSpec", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/cryptacular/pbe/PBES1Algorithm", "<init>", "(Ljava/lang/String;ILjava/lang/String;Lorg/cryptacular/spec/BufferedBlockCipherSpec;Lorg/cryptacular/spec/DigestSpec;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/cryptacular/pbe/PBES1Algorithm", "PbeWithMD5AndDES_CBC", "Lorg/cryptacular/pbe/PBES1Algorithm;");
methodVisitor.visitTypeInsn(NEW, "org/cryptacular/pbe/PBES1Algorithm");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("PbeWithMD5AndRC2_CBC");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitLdcInsn("1.2.840.113549.1.5.6");
methodVisitor.visitTypeInsn(NEW, "org/cryptacular/spec/BufferedBlockCipherSpec");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("RC2");
methodVisitor.visitLdcInsn("CBC");
methodVisitor.visitLdcInsn("PKCS5");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/cryptacular/spec/BufferedBlockCipherSpec", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/cryptacular/spec/DigestSpec");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("MD5");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/cryptacular/spec/DigestSpec", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/cryptacular/pbe/PBES1Algorithm", "<init>", "(Ljava/lang/String;ILjava/lang/String;Lorg/cryptacular/spec/BufferedBlockCipherSpec;Lorg/cryptacular/spec/DigestSpec;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/cryptacular/pbe/PBES1Algorithm", "PbeWithMD5AndRC2_CBC", "Lorg/cryptacular/pbe/PBES1Algorithm;");
methodVisitor.visitTypeInsn(NEW, "org/cryptacular/pbe/PBES1Algorithm");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("PbeWithSHA1AndDES_CBC");
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitLdcInsn("1.2.840.113549.1.5.10");
methodVisitor.visitTypeInsn(NEW, "org/cryptacular/spec/BufferedBlockCipherSpec");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("DES");
methodVisitor.visitLdcInsn("CBC");
methodVisitor.visitLdcInsn("PKCS5");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/cryptacular/spec/BufferedBlockCipherSpec", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/cryptacular/spec/DigestSpec");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("SHA1");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/cryptacular/spec/DigestSpec", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/cryptacular/pbe/PBES1Algorithm", "<init>", "(Ljava/lang/String;ILjava/lang/String;Lorg/cryptacular/spec/BufferedBlockCipherSpec;Lorg/cryptacular/spec/DigestSpec;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/cryptacular/pbe/PBES1Algorithm", "PbeWithSHA1AndDES_CBC", "Lorg/cryptacular/pbe/PBES1Algorithm;");
methodVisitor.visitTypeInsn(NEW, "org/cryptacular/pbe/PBES1Algorithm");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("PbeWithSHA1AndRC2_CBC");
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitLdcInsn("1.2.840.113549.1.5.11");
methodVisitor.visitTypeInsn(NEW, "org/cryptacular/spec/BufferedBlockCipherSpec");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("RC2");
methodVisitor.visitLdcInsn("CBC");
methodVisitor.visitLdcInsn("PKCS5");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/cryptacular/spec/BufferedBlockCipherSpec", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/cryptacular/spec/DigestSpec");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("SHA1");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/cryptacular/spec/DigestSpec", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/cryptacular/pbe/PBES1Algorithm", "<init>", "(Ljava/lang/String;ILjava/lang/String;Lorg/cryptacular/spec/BufferedBlockCipherSpec;Lorg/cryptacular/spec/DigestSpec;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/cryptacular/pbe/PBES1Algorithm", "PbeWithSHA1AndRC2_CBC", "Lorg/cryptacular/pbe/PBES1Algorithm;");
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitTypeInsn(ANEWARRAY, "org/cryptacular/pbe/PBES1Algorithm");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/cryptacular/pbe/PBES1Algorithm", "PbeWithMD2AndDES_CBC", "Lorg/cryptacular/pbe/PBES1Algorithm;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/cryptacular/pbe/PBES1Algorithm", "PbeWithMD2AndRC2_CBC", "Lorg/cryptacular/pbe/PBES1Algorithm;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitFieldInsn(GETSTATIC, "org/cryptacular/pbe/PBES1Algorithm", "PbeWithMD5AndDES_CBC", "Lorg/cryptacular/pbe/PBES1Algorithm;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitFieldInsn(GETSTATIC, "org/cryptacular/pbe/PBES1Algorithm", "PbeWithMD5AndRC2_CBC", "Lorg/cryptacular/pbe/PBES1Algorithm;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitFieldInsn(GETSTATIC, "org/cryptacular/pbe/PBES1Algorithm", "PbeWithSHA1AndDES_CBC", "Lorg/cryptacular/pbe/PBES1Algorithm;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitFieldInsn(GETSTATIC, "org/cryptacular/pbe/PBES1Algorithm", "PbeWithSHA1AndRC2_CBC", "Lorg/cryptacular/pbe/PBES1Algorithm;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/cryptacular/pbe/PBES1Algorithm", "$VALUES", "[Lorg/cryptacular/pbe/PBES1Algorithm;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(10, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
