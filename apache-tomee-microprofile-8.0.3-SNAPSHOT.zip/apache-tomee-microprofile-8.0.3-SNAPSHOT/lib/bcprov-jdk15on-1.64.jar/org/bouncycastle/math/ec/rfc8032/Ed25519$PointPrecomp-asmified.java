package asm.org.bouncycastle.math.ec.rfc8032;
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
public class Ed25519$PointPrecompDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_5, ACC_SUPER, "org/bouncycastle/math/ec/rfc8032/Ed25519$PointPrecomp", null, "java/lang/Object", null);

classWriter.visitInnerClass("org/bouncycastle/math/ec/rfc8032/Ed25519$PointPrecomp", "org/bouncycastle/math/ec/rfc8032/Ed25519", "PointPrecomp", ACC_PRIVATE | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/math/ec/rfc8032/Ed25519$1", null, null, ACC_STATIC | ACC_SYNTHETIC);

{
fieldVisitor = classWriter.visitField(0, "ypx_h", "[I", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(0, "ymx_h", "[I", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(0, "xyd", "[I", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/math/ec/rfc7748/X25519Field", "create", "()[I", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/math/ec/rfc8032/Ed25519$PointPrecomp", "ypx_h", "[I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/math/ec/rfc7748/X25519Field", "create", "()[I", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/math/ec/rfc8032/Ed25519$PointPrecomp", "ymx_h", "[I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/math/ec/rfc7748/X25519Field", "create", "()[I", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/math/ec/rfc8032/Ed25519$PointPrecomp", "xyd", "[I");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_SYNTHETIC, "<init>", "(Lorg/bouncycastle/math/ec/rfc8032/Ed25519$1;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/math/ec/rfc8032/Ed25519$PointPrecomp", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
