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
public class ARIADump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_5, ACC_PUBLIC | ACC_FINAL | ACC_SUPER, "org/bouncycastle/jcajce/provider/symmetric/ARIA", null, "java/lang/Object", null);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/symmetric/ARIA$AlgParamGen", "org/bouncycastle/jcajce/provider/symmetric/ARIA", "AlgParamGen", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/symmetric/ARIA$AlgParams", "org/bouncycastle/jcajce/provider/symmetric/ARIA", "AlgParams", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/symmetric/ARIA$AlgParamsCCM", "org/bouncycastle/jcajce/provider/symmetric/ARIA", "AlgParamsCCM", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/symmetric/ARIA$AlgParamsGCM", "org/bouncycastle/jcajce/provider/symmetric/ARIA", "AlgParamsGCM", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/symmetric/ARIA$CBC", "org/bouncycastle/jcajce/provider/symmetric/ARIA", "CBC", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/symmetric/ARIA$CFB", "org/bouncycastle/jcajce/provider/symmetric/ARIA", "CFB", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/symmetric/ARIA$ECB", "org/bouncycastle/jcajce/provider/symmetric/ARIA", "ECB", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/symmetric/ARIA$GMAC", "org/bouncycastle/jcajce/provider/symmetric/ARIA", "GMAC", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/symmetric/ARIA$KeyFactory", "org/bouncycastle/jcajce/provider/symmetric/ARIA", "KeyFactory", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/symmetric/ARIA$KeyGen", "org/bouncycastle/jcajce/provider/symmetric/ARIA", "KeyGen", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/symmetric/ARIA$KeyGen128", "org/bouncycastle/jcajce/provider/symmetric/ARIA", "KeyGen128", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/symmetric/ARIA$KeyGen192", "org/bouncycastle/jcajce/provider/symmetric/ARIA", "KeyGen192", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/symmetric/ARIA$KeyGen256", "org/bouncycastle/jcajce/provider/symmetric/ARIA", "KeyGen256", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/symmetric/ARIA$Mappings", "org/bouncycastle/jcajce/provider/symmetric/ARIA", "Mappings", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/symmetric/ARIA$OFB", "org/bouncycastle/jcajce/provider/symmetric/ARIA", "OFB", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/symmetric/ARIA$Poly1305", "org/bouncycastle/jcajce/provider/symmetric/ARIA", "Poly1305", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/symmetric/ARIA$Poly1305KeyGen", "org/bouncycastle/jcajce/provider/symmetric/ARIA", "Poly1305KeyGen", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/symmetric/ARIA$RFC3211Wrap", "org/bouncycastle/jcajce/provider/symmetric/ARIA", "RFC3211Wrap", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/symmetric/ARIA$Wrap", "org/bouncycastle/jcajce/provider/symmetric/ARIA", "Wrap", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/symmetric/ARIA$WrapPad", "org/bouncycastle/jcajce/provider/symmetric/ARIA", "WrapPad", ACC_PUBLIC | ACC_STATIC);

{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
