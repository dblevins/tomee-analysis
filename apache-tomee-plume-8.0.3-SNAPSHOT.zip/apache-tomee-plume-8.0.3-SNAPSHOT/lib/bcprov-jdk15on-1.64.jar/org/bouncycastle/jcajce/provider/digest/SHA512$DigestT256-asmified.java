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
public class SHA512$DigestT256Dump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_5, ACC_PUBLIC | ACC_SUPER, "org/bouncycastle/jcajce/provider/digest/SHA512$DigestT256", null, "org/bouncycastle/jcajce/provider/digest/SHA512$DigestT", null);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/digest/SHA512$DigestT", "org/bouncycastle/jcajce/provider/digest/SHA512", "DigestT", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/digest/SHA512$DigestT256", "org/bouncycastle/jcajce/provider/digest/SHA512", "DigestT256", ACC_PUBLIC | ACC_STATIC);

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitIntInsn(SIPUSH, 256);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/jcajce/provider/digest/SHA512$DigestT", "<init>", "(I)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}