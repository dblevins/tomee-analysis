package asm.org.bouncycastle.util.test;
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
public class TestRandomDataDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_5, ACC_PUBLIC | ACC_SUPER, "org/bouncycastle/util/test/TestRandomData", null, "org/bouncycastle/util/test/FixedSecureRandom", null);

classWriter.visitInnerClass("org/bouncycastle/util/test/FixedSecureRandom$Data", "org/bouncycastle/util/test/FixedSecureRandom", "Data", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/util/test/FixedSecureRandom$Source", "org/bouncycastle/util/test/FixedSecureRandom", "Source", ACC_PUBLIC | ACC_STATIC);

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitTypeInsn(ANEWARRAY, "org/bouncycastle/util/test/FixedSecureRandom$Source");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/util/test/FixedSecureRandom$Data");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/bouncycastle/util/encoders/Hex", "decode", "(Ljava/lang/String;)[B", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/util/test/FixedSecureRandom$Data", "<init>", "([B)V", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/util/test/FixedSecureRandom", "<init>", "([Lorg/bouncycastle/util/test/FixedSecureRandom$Source;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(7, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "([B)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitTypeInsn(ANEWARRAY, "org/bouncycastle/util/test/FixedSecureRandom$Source");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/util/test/FixedSecureRandom$Data");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/util/test/FixedSecureRandom$Data", "<init>", "([B)V", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/util/test/FixedSecureRandom", "<init>", "([Lorg/bouncycastle/util/test/FixedSecureRandom$Source;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(7, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
