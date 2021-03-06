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
public class DSTU7624$AlgParamGen512Dump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_5, ACC_PUBLIC | ACC_SUPER, "org/bouncycastle/jcajce/provider/symmetric/DSTU7624$AlgParamGen512", null, "org/bouncycastle/jcajce/provider/symmetric/DSTU7624$AlgParamGen", null);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/symmetric/DSTU7624$AlgParamGen", "org/bouncycastle/jcajce/provider/symmetric/DSTU7624", "AlgParamGen", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/symmetric/DSTU7624$AlgParamGen512", "org/bouncycastle/jcajce/provider/symmetric/DSTU7624", "AlgParamGen512", ACC_PUBLIC | ACC_STATIC);

{
methodVisitor = classWriter.visitMethod(0, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitIntInsn(SIPUSH, 512);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/jcajce/provider/symmetric/DSTU7624$AlgParamGen", "<init>", "(I)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
