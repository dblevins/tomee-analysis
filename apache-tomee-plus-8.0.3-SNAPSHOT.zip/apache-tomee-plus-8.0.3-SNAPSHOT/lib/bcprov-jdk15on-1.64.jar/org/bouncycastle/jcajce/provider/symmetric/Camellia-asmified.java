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
public class CamelliaDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_5, ACC_PUBLIC | ACC_FINAL | ACC_SUPER, "org/bouncycastle/jcajce/provider/symmetric/Camellia", null, "java/lang/Object", null);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/symmetric/Camellia$AlgParamGen", "org/bouncycastle/jcajce/provider/symmetric/Camellia", "AlgParamGen", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/symmetric/Camellia$AlgParams", "org/bouncycastle/jcajce/provider/symmetric/Camellia", "AlgParams", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/symmetric/Camellia$CBC", "org/bouncycastle/jcajce/provider/symmetric/Camellia", "CBC", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/symmetric/Camellia$ECB", "org/bouncycastle/jcajce/provider/symmetric/Camellia", "ECB", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/symmetric/Camellia$GMAC", "org/bouncycastle/jcajce/provider/symmetric/Camellia", "GMAC", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/symmetric/Camellia$KeyFactory", "org/bouncycastle/jcajce/provider/symmetric/Camellia", "KeyFactory", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/symmetric/Camellia$KeyGen", "org/bouncycastle/jcajce/provider/symmetric/Camellia", "KeyGen", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/symmetric/Camellia$KeyGen128", "org/bouncycastle/jcajce/provider/symmetric/Camellia", "KeyGen128", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/symmetric/Camellia$KeyGen192", "org/bouncycastle/jcajce/provider/symmetric/Camellia", "KeyGen192", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/symmetric/Camellia$KeyGen256", "org/bouncycastle/jcajce/provider/symmetric/Camellia", "KeyGen256", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/symmetric/Camellia$Mappings", "org/bouncycastle/jcajce/provider/symmetric/Camellia", "Mappings", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/symmetric/Camellia$Poly1305", "org/bouncycastle/jcajce/provider/symmetric/Camellia", "Poly1305", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/symmetric/Camellia$Poly1305KeyGen", "org/bouncycastle/jcajce/provider/symmetric/Camellia", "Poly1305KeyGen", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/symmetric/Camellia$RFC3211Wrap", "org/bouncycastle/jcajce/provider/symmetric/Camellia", "RFC3211Wrap", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/symmetric/Camellia$Wrap", "org/bouncycastle/jcajce/provider/symmetric/Camellia", "Wrap", ACC_PUBLIC | ACC_STATIC);

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
