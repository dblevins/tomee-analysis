package asm.org.bouncycastle.pqc.crypto.gmss;
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
public class GMSSStateAwareSigner$1Dump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_5, ACC_SUPER, "org/bouncycastle/pqc/crypto/gmss/GMSSStateAwareSigner$1", null, "java/lang/Object", new String[] { "org/bouncycastle/pqc/crypto/gmss/GMSSDigestProvider" });

classWriter.visitOuterClass("org/bouncycastle/pqc/crypto/gmss/GMSSStateAwareSigner", "<init>", "(Lorg/bouncycastle/crypto/Digest;)V");

classWriter.visitInnerClass("org/bouncycastle/pqc/crypto/gmss/GMSSStateAwareSigner$1", null, null, 0);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "val$dig", "Lorg/bouncycastle/util/Memoable;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/bouncycastle/pqc/crypto/gmss/GMSSStateAwareSigner;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/bouncycastle/pqc/crypto/gmss/GMSSStateAwareSigner;Lorg/bouncycastle/util/Memoable;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/pqc/crypto/gmss/GMSSStateAwareSigner$1", "this$0", "Lorg/bouncycastle/pqc/crypto/gmss/GMSSStateAwareSigner;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/pqc/crypto/gmss/GMSSStateAwareSigner$1", "val$dig", "Lorg/bouncycastle/util/Memoable;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "get", "()Lorg/bouncycastle/crypto/Digest;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/pqc/crypto/gmss/GMSSStateAwareSigner$1", "val$dig", "Lorg/bouncycastle/util/Memoable;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/bouncycastle/util/Memoable", "copy", "()Lorg/bouncycastle/util/Memoable;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/bouncycastle/crypto/Digest");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
