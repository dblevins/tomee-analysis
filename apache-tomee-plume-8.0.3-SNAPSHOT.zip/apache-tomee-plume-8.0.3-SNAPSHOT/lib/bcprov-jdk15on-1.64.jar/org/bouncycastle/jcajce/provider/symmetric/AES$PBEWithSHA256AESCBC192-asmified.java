package asm.org.bouncycastle.jcajce.provider.symmetric;
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
public class AES$PBEWithSHA256AESCBC192Dump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_5, ACC_PUBLIC | ACC_SUPER, "org/bouncycastle/jcajce/provider/symmetric/AES$PBEWithSHA256AESCBC192", null, "org/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher", null);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/symmetric/AES$PBEWithSHA256AESCBC192", "org/bouncycastle/jcajce/provider/symmetric/AES", "PBEWithSHA256AESCBC192", ACC_PUBLIC | ACC_STATIC);

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/crypto/modes/CBCBlockCipher");
methodVisitor.visitInsn(DUP);
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/crypto/engines/AESEngine");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/crypto/engines/AESEngine", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/crypto/modes/CBCBlockCipher", "<init>", "(Lorg/bouncycastle/crypto/BlockCipher;)V", false);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitIntInsn(SIPUSH, 192);
methodVisitor.visitIntInsn(BIPUSH, 16);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher", "<init>", "(Lorg/bouncycastle/crypto/BlockCipher;IIII)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(6, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
