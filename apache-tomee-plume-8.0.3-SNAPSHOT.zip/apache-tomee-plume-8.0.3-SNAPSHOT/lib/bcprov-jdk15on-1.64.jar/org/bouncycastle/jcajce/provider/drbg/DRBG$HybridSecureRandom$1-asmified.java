package asm.org.bouncycastle.jcajce.provider.drbg;
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
public class DRBG$HybridSecureRandom$1Dump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_5, ACC_SUPER, "org/bouncycastle/jcajce/provider/drbg/DRBG$HybridSecureRandom$1", null, "java/lang/Object", new String[] { "org/bouncycastle/crypto/prng/EntropySourceProvider" });

classWriter.visitOuterClass("org/bouncycastle/jcajce/provider/drbg/DRBG$HybridSecureRandom", "<init>", "()V");

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/drbg/DRBG$HybridSecureRandom", "org/bouncycastle/jcajce/provider/drbg/DRBG", "HybridSecureRandom", ACC_PRIVATE | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/drbg/DRBG$HybridSecureRandom$1", null, null, 0);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/drbg/DRBG$HybridSecureRandom$SignallingEntropySource", "org/bouncycastle/jcajce/provider/drbg/DRBG$HybridSecureRandom", "SignallingEntropySource", ACC_PRIVATE);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/bouncycastle/jcajce/provider/drbg/DRBG$HybridSecureRandom;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/bouncycastle/jcajce/provider/drbg/DRBG$HybridSecureRandom;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/jcajce/provider/drbg/DRBG$HybridSecureRandom$1", "this$0", "Lorg/bouncycastle/jcajce/provider/drbg/DRBG$HybridSecureRandom;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "get", "(I)Lorg/bouncycastle/crypto/prng/EntropySource;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/jcajce/provider/drbg/DRBG$HybridSecureRandom$SignallingEntropySource");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jcajce/provider/drbg/DRBG$HybridSecureRandom$1", "this$0", "Lorg/bouncycastle/jcajce/provider/drbg/DRBG$HybridSecureRandom;");
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/jcajce/provider/drbg/DRBG$HybridSecureRandom$SignallingEntropySource", "<init>", "(Lorg/bouncycastle/jcajce/provider/drbg/DRBG$HybridSecureRandom;I)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
