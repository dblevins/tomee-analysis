package asm.org.bouncycastle.math.ec.custom.djb;
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
public class Curve25519$1Dump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_5, ACC_SUPER, "org/bouncycastle/math/ec/custom/djb/Curve25519$1", null, "org/bouncycastle/math/ec/AbstractECLookupTable", null);

classWriter.visitOuterClass("org/bouncycastle/math/ec/custom/djb/Curve25519", "createCacheSafeLookupTable", "([Lorg/bouncycastle/math/ec/ECPoint;II)Lorg/bouncycastle/math/ec/ECLookupTable;");

classWriter.visitInnerClass("org/bouncycastle/math/ec/custom/djb/Curve25519$1", null, null, 0);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "val$len", "I", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "val$table", "[I", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/bouncycastle/math/ec/custom/djb/Curve25519;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/bouncycastle/math/ec/custom/djb/Curve25519;I[I)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/math/ec/custom/djb/Curve25519$1", "this$0", "Lorg/bouncycastle/math/ec/custom/djb/Curve25519;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/math/ec/custom/djb/Curve25519$1", "val$len", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/math/ec/custom/djb/Curve25519$1", "val$table", "[I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/math/ec/AbstractECLookupTable", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getSize", "()I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/math/ec/custom/djb/Curve25519$1", "val$len", "I");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "lookup", "(I)Lorg/bouncycastle/math/ec/ECPoint;", null, null);
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/math/raw/Nat256", "create", "()[I", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/math/raw/Nat256", "create", "()[I", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 4);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 5);
Label label0 = new Label();
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ILOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/math/ec/custom/djb/Curve25519$1", "val$len", "I");
Label label1 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPGE, label1);
methodVisitor.visitVarInsn(ILOAD, 5);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitInsn(IXOR);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(ISUB);
methodVisitor.visitIntInsn(BIPUSH, 31);
methodVisitor.visitInsn(ISHR);
methodVisitor.visitVarInsn(ISTORE, 6);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 7);
Label label2 = new Label();
methodVisitor.visitLabel(label2);
methodVisitor.visitVarInsn(ILOAD, 7);
methodVisitor.visitIntInsn(BIPUSH, 8);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPGE, label3);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 7);
methodVisitor.visitInsn(DUP2);
methodVisitor.visitInsn(IALOAD);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/math/ec/custom/djb/Curve25519$1", "val$table", "[I");
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitVarInsn(ILOAD, 7);
methodVisitor.visitInsn(IADD);
methodVisitor.visitInsn(IALOAD);
methodVisitor.visitVarInsn(ILOAD, 6);
methodVisitor.visitInsn(IAND);
methodVisitor.visitInsn(IXOR);
methodVisitor.visitInsn(IASTORE);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ILOAD, 7);
methodVisitor.visitInsn(DUP2);
methodVisitor.visitInsn(IALOAD);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/math/ec/custom/djb/Curve25519$1", "val$table", "[I");
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitInsn(IADD);
methodVisitor.visitVarInsn(ILOAD, 7);
methodVisitor.visitInsn(IADD);
methodVisitor.visitInsn(IALOAD);
methodVisitor.visitVarInsn(ILOAD, 6);
methodVisitor.visitInsn(IAND);
methodVisitor.visitInsn(IXOR);
methodVisitor.visitInsn(IASTORE);
methodVisitor.visitIincInsn(7, 1);
methodVisitor.visitJumpInsn(GOTO, label2);
methodVisitor.visitLabel(label3);
methodVisitor.visitIincInsn(4, 16);
methodVisitor.visitIincInsn(5, 1);
methodVisitor.visitJumpInsn(GOTO, label0);
methodVisitor.visitLabel(label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/math/ec/custom/djb/Curve25519$1", "createPoint", "([I[I)Lorg/bouncycastle/math/ec/ECPoint;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(6, 8);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "lookupVar", "(I)Lorg/bouncycastle/math/ec/ECPoint;", null, null);
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/math/raw/Nat256", "create", "()[I", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/math/raw/Nat256", "create", "()[I", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitInsn(IMUL);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitInsn(IMUL);
methodVisitor.visitVarInsn(ISTORE, 4);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 5);
Label label0 = new Label();
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ILOAD, 5);
methodVisitor.visitIntInsn(BIPUSH, 8);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPGE, label1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/math/ec/custom/djb/Curve25519$1", "val$table", "[I");
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitVarInsn(ILOAD, 5);
methodVisitor.visitInsn(IADD);
methodVisitor.visitInsn(IALOAD);
methodVisitor.visitInsn(IASTORE);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ILOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/math/ec/custom/djb/Curve25519$1", "val$table", "[I");
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitInsn(IADD);
methodVisitor.visitVarInsn(ILOAD, 5);
methodVisitor.visitInsn(IADD);
methodVisitor.visitInsn(IALOAD);
methodVisitor.visitInsn(IASTORE);
methodVisitor.visitIincInsn(5, 1);
methodVisitor.visitJumpInsn(GOTO, label0);
methodVisitor.visitLabel(label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/math/ec/custom/djb/Curve25519$1", "createPoint", "([I[I)Lorg/bouncycastle/math/ec/ECPoint;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 6);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "createPoint", "([I[I)Lorg/bouncycastle/math/ec/ECPoint;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/math/ec/custom/djb/Curve25519$1", "this$0", "Lorg/bouncycastle/math/ec/custom/djb/Curve25519;");
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/math/ec/custom/djb/Curve25519FieldElement");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/math/ec/custom/djb/Curve25519FieldElement", "<init>", "([I)V", false);
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/math/ec/custom/djb/Curve25519FieldElement");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/math/ec/custom/djb/Curve25519FieldElement", "<init>", "([I)V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/math/ec/custom/djb/Curve25519", "access$000", "()[Lorg/bouncycastle/math/ec/ECFieldElement;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/math/ec/custom/djb/Curve25519", "createRawPoint", "(Lorg/bouncycastle/math/ec/ECFieldElement;Lorg/bouncycastle/math/ec/ECFieldElement;[Lorg/bouncycastle/math/ec/ECFieldElement;)Lorg/bouncycastle/math/ec/ECPoint;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 3);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
