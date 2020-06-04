package asm.org.bouncycastle.jcajce.provider.digest;
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
public class Blake2b$Blake2b256Dump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_5, ACC_PUBLIC | ACC_SUPER, "org/bouncycastle/jcajce/provider/digest/Blake2b$Blake2b256", null, "org/bouncycastle/jcajce/provider/digest/BCMessageDigest", new String[] { "java/lang/Cloneable" });

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/digest/Blake2b$Blake2b256", "org/bouncycastle/jcajce/provider/digest/Blake2b", "Blake2b256", ACC_PUBLIC | ACC_STATIC);

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/crypto/digests/Blake2bDigest");
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(SIPUSH, 256);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/crypto/digests/Blake2bDigest", "<init>", "(I)V", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/jcajce/provider/digest/BCMessageDigest", "<init>", "(Lorg/bouncycastle/crypto/Digest;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "clone", "()Ljava/lang/Object;", null, new String[] { "java/lang/CloneNotSupportedException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/jcajce/provider/digest/BCMessageDigest", "clone", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/bouncycastle/jcajce/provider/digest/Blake2b$Blake2b256");
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/crypto/digests/Blake2bDigest");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/jcajce/provider/digest/Blake2b$Blake2b256", "digest", "Lorg/bouncycastle/crypto/Digest;");
methodVisitor.visitTypeInsn(CHECKCAST, "org/bouncycastle/crypto/digests/Blake2bDigest");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/crypto/digests/Blake2bDigest", "<init>", "(Lorg/bouncycastle/crypto/digests/Blake2bDigest;)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/jcajce/provider/digest/Blake2b$Blake2b256", "digest", "Lorg/bouncycastle/crypto/Digest;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
