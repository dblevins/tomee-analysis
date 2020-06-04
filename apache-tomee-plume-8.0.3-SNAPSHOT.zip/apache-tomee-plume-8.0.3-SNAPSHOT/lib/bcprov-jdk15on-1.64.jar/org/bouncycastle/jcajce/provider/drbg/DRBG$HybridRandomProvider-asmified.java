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
public class DRBG$HybridRandomProviderDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_5, ACC_SUPER, "org/bouncycastle/jcajce/provider/drbg/DRBG$HybridRandomProvider", null, "java/security/Provider", null);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/drbg/DRBG$HybridRandomProvider", "org/bouncycastle/jcajce/provider/drbg/DRBG", "HybridRandomProvider", ACC_PRIVATE | ACC_STATIC);

{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("BCHEP");
methodVisitor.visitInsn(DCONST_1);
methodVisitor.visitLdcInsn("Bouncy Castle Hybrid Entropy Provider");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/security/Provider", "<init>", "(Ljava/lang/String;DLjava/lang/String;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
