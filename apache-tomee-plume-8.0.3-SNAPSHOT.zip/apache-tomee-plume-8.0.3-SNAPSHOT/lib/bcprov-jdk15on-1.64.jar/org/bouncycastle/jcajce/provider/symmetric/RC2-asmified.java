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
public class RC2Dump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_5, ACC_PUBLIC | ACC_FINAL | ACC_SUPER, "org/bouncycastle/jcajce/provider/symmetric/RC2", null, "java/lang/Object", null);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/symmetric/RC2$AlgParamGen", "org/bouncycastle/jcajce/provider/symmetric/RC2", "AlgParamGen", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/symmetric/RC2$AlgParams", "org/bouncycastle/jcajce/provider/symmetric/RC2", "AlgParams", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/symmetric/RC2$CBC", "org/bouncycastle/jcajce/provider/symmetric/RC2", "CBC", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/symmetric/RC2$CBCMAC", "org/bouncycastle/jcajce/provider/symmetric/RC2", "CBCMAC", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/symmetric/RC2$CFB8MAC", "org/bouncycastle/jcajce/provider/symmetric/RC2", "CFB8MAC", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/symmetric/RC2$ECB", "org/bouncycastle/jcajce/provider/symmetric/RC2", "ECB", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/symmetric/RC2$KeyGenerator", "org/bouncycastle/jcajce/provider/symmetric/RC2", "KeyGenerator", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/symmetric/RC2$Mappings", "org/bouncycastle/jcajce/provider/symmetric/RC2", "Mappings", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/symmetric/RC2$PBEWithMD2KeyFactory", "org/bouncycastle/jcajce/provider/symmetric/RC2", "PBEWithMD2KeyFactory", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/symmetric/RC2$PBEWithMD5AndRC2", "org/bouncycastle/jcajce/provider/symmetric/RC2", "PBEWithMD5AndRC2", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/symmetric/RC2$PBEWithMD5KeyFactory", "org/bouncycastle/jcajce/provider/symmetric/RC2", "PBEWithMD5KeyFactory", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/symmetric/RC2$PBEWithSHA1AndRC2", "org/bouncycastle/jcajce/provider/symmetric/RC2", "PBEWithSHA1AndRC2", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/symmetric/RC2$PBEWithSHA1KeyFactory", "org/bouncycastle/jcajce/provider/symmetric/RC2", "PBEWithSHA1KeyFactory", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/symmetric/RC2$PBEWithSHAAnd128BitKeyFactory", "org/bouncycastle/jcajce/provider/symmetric/RC2", "PBEWithSHAAnd128BitKeyFactory", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/symmetric/RC2$PBEWithSHAAnd128BitRC2", "org/bouncycastle/jcajce/provider/symmetric/RC2", "PBEWithSHAAnd128BitRC2", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/symmetric/RC2$PBEWithSHAAnd40BitKeyFactory", "org/bouncycastle/jcajce/provider/symmetric/RC2", "PBEWithSHAAnd40BitKeyFactory", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/symmetric/RC2$PBEWithSHAAnd40BitRC2", "org/bouncycastle/jcajce/provider/symmetric/RC2", "PBEWithSHAAnd40BitRC2", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/symmetric/RC2$Wrap", "org/bouncycastle/jcajce/provider/symmetric/RC2", "Wrap", ACC_PUBLIC | ACC_STATIC);

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
