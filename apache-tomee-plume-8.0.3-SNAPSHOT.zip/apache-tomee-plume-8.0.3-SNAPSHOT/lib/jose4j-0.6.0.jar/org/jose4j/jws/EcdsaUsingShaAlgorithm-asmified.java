package asm.org.jose4j.jws;
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
public class EcdsaUsingShaAlgorithmDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_7, ACC_PUBLIC | ACC_SUPER, "org/jose4j/jws/EcdsaUsingShaAlgorithm", null, "org/jose4j/jws/BaseSignatureAlgorithm", new String[] { "org/jose4j/jws/JsonWebSignatureAlgorithm" });

classWriter.visitInnerClass("org/jose4j/jws/EcdsaUsingShaAlgorithm$EcdsaP521UsingSha512", "org/jose4j/jws/EcdsaUsingShaAlgorithm", "EcdsaP521UsingSha512", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/jose4j/jws/EcdsaUsingShaAlgorithm$EcdsaP384UsingSha384", "org/jose4j/jws/EcdsaUsingShaAlgorithm", "EcdsaP384UsingSha384", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/jose4j/jws/EcdsaUsingShaAlgorithm$EcdsaP256UsingSha256", "org/jose4j/jws/EcdsaUsingShaAlgorithm", "EcdsaP256UsingSha256", ACC_PUBLIC | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "curveName", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "signatureByteLength", "I", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitLdcInsn("EC");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/jose4j/jws/BaseSignatureAlgorithm", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(PUTFIELD, "org/jose4j/jws/EcdsaUsingShaAlgorithm", "curveName", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitFieldInsn(PUTFIELD, "org/jose4j/jws/EcdsaUsingShaAlgorithm", "signatureByteLength", "I");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "verifySignature", "([BLjava/security/Key;[BLorg/jose4j/jca/ProviderContext;)Z", null, new String[] { "org/jose4j/lang/JoseException" });
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/io/IOException");
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/jose4j/jws/EcdsaUsingShaAlgorithm", "convertConcatenatedToDer", "([B)[B", false);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitLabel(label1);
Label label3 = new Label();
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/io/IOException"});
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitTypeInsn(NEW, "org/jose4j/lang/JoseException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Unable to convert R and S as a concatenated byte array to DER encoding.");
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/jose4j/lang/JoseException", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"[B"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/jose4j/jws/BaseSignatureAlgorithm", "verifySignature", "([BLjava/security/Key;[BLorg/jose4j/jca/ProviderContext;)Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(5, 7);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "sign", "(Ljava/security/Key;[BLorg/jose4j/jca/ProviderContext;)[B", null, new String[] { "org/jose4j/lang/JoseException" });
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/io/IOException");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/jose4j/jws/BaseSignatureAlgorithm", "sign", "(Ljava/security/Key;[BLorg/jose4j/jca/ProviderContext;)[B", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/jose4j/jws/EcdsaUsingShaAlgorithm", "signatureByteLength", "I");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/jose4j/jws/EcdsaUsingShaAlgorithm", "convertDerToConcatenated", "([BI)[B", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_FULL, 5, new Object[] {"org/jose4j/jws/EcdsaUsingShaAlgorithm", "java/security/Key", "[B", "org/jose4j/jca/ProviderContext", "[B"}, 1, new Object[] {"java/io/IOException"});
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitTypeInsn(NEW, "org/jose4j/lang/JoseException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Unable to convert DER encoding to R and S as a concatenated byte array.");
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/jose4j/lang/JoseException", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(4, 6);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "convertConcatenatedToDer", "([B)[B", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitInsn(IDIV);
methodVisitor.visitVarInsn(ISTORE, 1);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitVarInsn(ISTORE, 2);
Label label0 = new Label();
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {Opcodes.INTEGER, Opcodes.INTEGER}, 0, null);
methodVisitor.visitVarInsn(ILOAD, 2);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFLE, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitInsn(ISUB);
methodVisitor.visitInsn(BALOAD);
methodVisitor.visitJumpInsn(IFNE, label1);
methodVisitor.visitIincInsn(2, -1);
methodVisitor.visitJumpInsn(GOTO, label0);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitVarInsn(ISTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitInsn(ISUB);
methodVisitor.visitInsn(BALOAD);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFGE, label2);
methodVisitor.visitIincInsn(3, 1);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {Opcodes.INTEGER}, 0, null);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitVarInsn(ISTORE, 4);
Label label3 = new Label();
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {Opcodes.INTEGER}, 0, null);
methodVisitor.visitVarInsn(ILOAD, 4);
Label label4 = new Label();
methodVisitor.visitJumpInsn(IFLE, label4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitInsn(IMUL);
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitInsn(ISUB);
methodVisitor.visitInsn(BALOAD);
methodVisitor.visitJumpInsn(IFNE, label4);
methodVisitor.visitIincInsn(4, -1);
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitVarInsn(ISTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitInsn(IMUL);
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitInsn(ISUB);
methodVisitor.visitInsn(BALOAD);
Label label5 = new Label();
methodVisitor.visitJumpInsn(IFGE, label5);
methodVisitor.visitIincInsn(5, 1);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {Opcodes.INTEGER}, 0, null);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitInsn(IADD);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitInsn(IADD);
methodVisitor.visitVarInsn(ILOAD, 5);
methodVisitor.visitInsn(IADD);
methodVisitor.visitVarInsn(ISTORE, 6);
methodVisitor.visitVarInsn(ILOAD, 6);
methodVisitor.visitIntInsn(SIPUSH, 255);
Label label6 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPLE, label6);
methodVisitor.visitTypeInsn(NEW, "java/io/IOException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Invalid format of ECDSA signature");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/io/IOException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {Opcodes.INTEGER}, 0, null);
methodVisitor.visitVarInsn(ILOAD, 6);
methodVisitor.visitIntInsn(SIPUSH, 128);
Label label7 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPGE, label7);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitInsn(IADD);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitInsn(IADD);
methodVisitor.visitVarInsn(ILOAD, 5);
methodVisitor.visitInsn(IADD);
methodVisitor.visitIntInsn(NEWARRAY, T_BYTE);
methodVisitor.visitVarInsn(ASTORE, 8);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitVarInsn(ISTORE, 7);
Label label8 = new Label();
methodVisitor.visitJumpInsn(GOTO, label8);
methodVisitor.visitLabel(label7);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitInsn(IADD);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitInsn(IADD);
methodVisitor.visitVarInsn(ILOAD, 5);
methodVisitor.visitInsn(IADD);
methodVisitor.visitIntInsn(NEWARRAY, T_BYTE);
methodVisitor.visitVarInsn(ASTORE, 8);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitIntInsn(BIPUSH, -127);
methodVisitor.visitInsn(BASTORE);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitVarInsn(ISTORE, 7);
methodVisitor.visitLabel(label8);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {Opcodes.INTEGER, "[B"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitIntInsn(BIPUSH, 48);
methodVisitor.visitInsn(BASTORE);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitVarInsn(ILOAD, 7);
methodVisitor.visitIincInsn(7, 1);
methodVisitor.visitVarInsn(ILOAD, 6);
methodVisitor.visitInsn(I2B);
methodVisitor.visitInsn(BASTORE);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitVarInsn(ILOAD, 7);
methodVisitor.visitIincInsn(7, 1);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitInsn(BASTORE);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitVarInsn(ILOAD, 7);
methodVisitor.visitIincInsn(7, 1);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitInsn(I2B);
methodVisitor.visitInsn(BASTORE);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitInsn(ISUB);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitVarInsn(ILOAD, 7);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitInsn(IADD);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitInsn(ISUB);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/System", "arraycopy", "(Ljava/lang/Object;ILjava/lang/Object;II)V", false);
methodVisitor.visitVarInsn(ILOAD, 7);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitInsn(IADD);
methodVisitor.visitVarInsn(ISTORE, 7);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitVarInsn(ILOAD, 7);
methodVisitor.visitIincInsn(7, 1);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitInsn(BASTORE);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitVarInsn(ILOAD, 7);
methodVisitor.visitIincInsn(7, 1);
methodVisitor.visitVarInsn(ILOAD, 5);
methodVisitor.visitInsn(I2B);
methodVisitor.visitInsn(BASTORE);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitInsn(IMUL);
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitInsn(ISUB);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitVarInsn(ILOAD, 7);
methodVisitor.visitVarInsn(ILOAD, 5);
methodVisitor.visitInsn(IADD);
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitInsn(ISUB);
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/System", "arraycopy", "(Ljava/lang/Object;ILjava/lang/Object;II)V", false);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 9);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "convertDerToConcatenated", "([BI)[B", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitIntInsn(BIPUSH, 8);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPLT, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(BALOAD);
methodVisitor.visitIntInsn(BIPUSH, 48);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPEQ, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "java/io/IOException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Invalid format of ECDSA signature");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/io/IOException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(BALOAD);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFLE, label2);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitVarInsn(ISTORE, 2);
Label label3 = new Label();
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(BALOAD);
methodVisitor.visitIntInsn(BIPUSH, -127);
Label label4 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPNE, label4);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitVarInsn(ISTORE, 2);
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "java/io/IOException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Invalid format of ECDSA signature");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/io/IOException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {Opcodes.INTEGER}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IADD);
methodVisitor.visitInsn(BALOAD);
methodVisitor.visitVarInsn(ISTORE, 3);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitVarInsn(ISTORE, 4);
Label label5 = new Label();
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {Opcodes.INTEGER, Opcodes.INTEGER}, 0, null);
methodVisitor.visitVarInsn(ILOAD, 4);
Label label6 = new Label();
methodVisitor.visitJumpInsn(IFLE, label6);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitInsn(IADD);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitInsn(IADD);
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitInsn(ISUB);
methodVisitor.visitInsn(BALOAD);
methodVisitor.visitJumpInsn(IFNE, label6);
methodVisitor.visitIincInsn(4, -1);
methodVisitor.visitJumpInsn(GOTO, label5);
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitInsn(IADD);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitInsn(IADD);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IADD);
methodVisitor.visitInsn(BALOAD);
methodVisitor.visitVarInsn(ISTORE, 5);
methodVisitor.visitVarInsn(ILOAD, 5);
methodVisitor.visitVarInsn(ISTORE, 6);
Label label7 = new Label();
methodVisitor.visitLabel(label7);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {Opcodes.INTEGER, Opcodes.INTEGER}, 0, null);
methodVisitor.visitVarInsn(ILOAD, 6);
Label label8 = new Label();
methodVisitor.visitJumpInsn(IFLE, label8);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitInsn(IADD);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitInsn(IADD);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitInsn(IADD);
methodVisitor.visitVarInsn(ILOAD, 5);
methodVisitor.visitInsn(IADD);
methodVisitor.visitVarInsn(ILOAD, 6);
methodVisitor.visitInsn(ISUB);
methodVisitor.visitInsn(BALOAD);
methodVisitor.visitJumpInsn(IFNE, label8);
methodVisitor.visitIincInsn(6, -1);
methodVisitor.visitJumpInsn(GOTO, label7);
methodVisitor.visitLabel(label8);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitVarInsn(ILOAD, 6);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Math", "max", "(II)I", false);
methodVisitor.visitVarInsn(ISTORE, 7);
methodVisitor.visitVarInsn(ILOAD, 7);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitInsn(IDIV);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Math", "max", "(II)I", false);
methodVisitor.visitVarInsn(ISTORE, 7);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(ISUB);
methodVisitor.visitInsn(BALOAD);
methodVisitor.visitIntInsn(SIPUSH, 255);
methodVisitor.visitInsn(IAND);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitInsn(ISUB);
Label label9 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPNE, label9);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(ISUB);
methodVisitor.visitInsn(BALOAD);
methodVisitor.visitIntInsn(SIPUSH, 255);
methodVisitor.visitInsn(IAND);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitInsn(IADD);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitInsn(IADD);
methodVisitor.visitVarInsn(ILOAD, 5);
methodVisitor.visitInsn(IADD);
methodVisitor.visitJumpInsn(IF_ICMPNE, label9);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitInsn(BALOAD);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitJumpInsn(IF_ICMPNE, label9);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitInsn(IADD);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitInsn(IADD);
methodVisitor.visitInsn(BALOAD);
methodVisitor.visitInsn(ICONST_2);
Label label10 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPEQ, label10);
methodVisitor.visitLabel(label9);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {Opcodes.INTEGER}, 0, null);
methodVisitor.visitTypeInsn(NEW, "java/io/IOException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Invalid format of ECDSA signature");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/io/IOException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label10);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitVarInsn(ILOAD, 7);
methodVisitor.visitInsn(IMUL);
methodVisitor.visitIntInsn(NEWARRAY, T_BYTE);
methodVisitor.visitVarInsn(ASTORE, 8);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitInsn(IADD);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitInsn(IADD);
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitInsn(ISUB);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitVarInsn(ILOAD, 7);
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitInsn(ISUB);
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/System", "arraycopy", "(Ljava/lang/Object;ILjava/lang/Object;II)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitInsn(IADD);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitInsn(IADD);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitInsn(IADD);
methodVisitor.visitVarInsn(ILOAD, 5);
methodVisitor.visitInsn(IADD);
methodVisitor.visitVarInsn(ILOAD, 6);
methodVisitor.visitInsn(ISUB);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitVarInsn(ILOAD, 7);
methodVisitor.visitInsn(IMUL);
methodVisitor.visitVarInsn(ILOAD, 6);
methodVisitor.visitInsn(ISUB);
methodVisitor.visitVarInsn(ILOAD, 6);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/System", "arraycopy", "(Ljava/lang/Object;ILjava/lang/Object;II)V", false);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 9);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "validatePrivateKey", "(Ljava/security/PrivateKey;)V", null, new String[] { "org/jose4j/lang/InvalidKeyException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/jose4j/jws/EcdsaUsingShaAlgorithm", "validateKeySpec", "(Ljava/security/Key;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "validatePublicKey", "(Ljava/security/PublicKey;)V", null, new String[] { "org/jose4j/lang/InvalidKeyException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/jose4j/jws/EcdsaUsingShaAlgorithm", "validateKeySpec", "(Ljava/security/Key;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "validateKeySpec", "(Ljava/security/Key;)V", null, new String[] { "org/jose4j/lang/InvalidKeyException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(INSTANCEOF, "java/security/interfaces/ECKey");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "java/security/interfaces/ECKey");
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/security/interfaces/ECKey", "getParams", "()Ljava/security/spec/ECParameterSpec;", true);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/security/spec/ECParameterSpec", "getCurve", "()Ljava/security/spec/EllipticCurve;", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/jose4j/keys/EllipticCurves", "getName", "(Ljava/security/spec/EllipticCurve;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jose4j/jws/EcdsaUsingShaAlgorithm", "getCurveName", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equals", "(Ljava/lang/Object;)Z", false);
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitTypeInsn(NEW, "org/jose4j/lang/InvalidKeyException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jose4j/jws/EcdsaUsingShaAlgorithm", "getAlgorithmIdentifier", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitLdcInsn("/");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jose4j/jws/EcdsaUsingShaAlgorithm", "getJavaAlgorithm", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitLdcInsn(" expects a key using ");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jose4j/jws/EcdsaUsingShaAlgorithm", "getCurveName", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitLdcInsn(" but was ");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/jose4j/lang/InvalidKeyException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 6);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getCurveName", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/jose4j/jws/EcdsaUsingShaAlgorithm", "curveName", "Ljava/lang/String;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
