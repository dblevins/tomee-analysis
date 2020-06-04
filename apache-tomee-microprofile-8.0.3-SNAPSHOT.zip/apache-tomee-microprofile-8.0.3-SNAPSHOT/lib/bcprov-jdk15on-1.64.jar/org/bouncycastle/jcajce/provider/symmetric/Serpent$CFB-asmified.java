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
public class Serpent$CFBDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_5, ACC_PUBLIC | ACC_SUPER, "org/bouncycastle/jcajce/provider/symmetric/Serpent$CFB", null, "org/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher", null);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/symmetric/Serpent$CFB", "org/bouncycastle/jcajce/provider/symmetric/Serpent", "CFB", ACC_PUBLIC | ACC_STATIC);

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/crypto/BufferedBlockCipher");
methodVisitor.visitInsn(DUP);
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/crypto/modes/CFBBlockCipher");
methodVisitor.visitInsn(DUP);
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/crypto/engines/SerpentEngine");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/crypto/engines/SerpentEngine", "<init>", "()V", false);
methodVisitor.visitIntInsn(SIPUSH, 128);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/crypto/modes/CFBBlockCipher", "<init>", "(Lorg/bouncycastle/crypto/BlockCipher;I)V", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/crypto/BufferedBlockCipher", "<init>", "(Lorg/bouncycastle/crypto/BlockCipher;)V", false);
methodVisitor.visitIntInsn(SIPUSH, 128);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/jcajce/provider/symmetric/util/BaseBlockCipher", "<init>", "(Lorg/bouncycastle/crypto/BufferedBlockCipher;I)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(7, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
