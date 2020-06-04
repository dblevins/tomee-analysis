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
public class DESedeDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_5, ACC_PUBLIC | ACC_FINAL | ACC_SUPER, "org/bouncycastle/jcajce/provider/symmetric/DESede", null, "java/lang/Object", null);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/symmetric/DESede$AlgParamGen", "org/bouncycastle/jcajce/provider/symmetric/DESede", "AlgParamGen", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/symmetric/DESede$CBC", "org/bouncycastle/jcajce/provider/symmetric/DESede", "CBC", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/symmetric/DESede$CBCMAC", "org/bouncycastle/jcajce/provider/symmetric/DESede", "CBCMAC", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/symmetric/DESede$CMAC", "org/bouncycastle/jcajce/provider/symmetric/DESede", "CMAC", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/symmetric/DESede$DESede64", "org/bouncycastle/jcajce/provider/symmetric/DESede", "DESede64", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/symmetric/DESede$DESede64with7816d4", "org/bouncycastle/jcajce/provider/symmetric/DESede", "DESede64with7816d4", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/symmetric/DESede$DESedeCFB8", "org/bouncycastle/jcajce/provider/symmetric/DESede", "DESedeCFB8", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/symmetric/DESede$ECB", "org/bouncycastle/jcajce/provider/symmetric/DESede", "ECB", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/symmetric/DESede$KeyFactory", "org/bouncycastle/jcajce/provider/symmetric/DESede", "KeyFactory", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/symmetric/DESede$KeyGenerator", "org/bouncycastle/jcajce/provider/symmetric/DESede", "KeyGenerator", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/symmetric/DESede$KeyGenerator3", "org/bouncycastle/jcajce/provider/symmetric/DESede", "KeyGenerator3", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/symmetric/DESede$Mappings", "org/bouncycastle/jcajce/provider/symmetric/DESede", "Mappings", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/symmetric/DESede$PBEWithSHAAndDES2Key", "org/bouncycastle/jcajce/provider/symmetric/DESede", "PBEWithSHAAndDES2Key", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/symmetric/DESede$PBEWithSHAAndDES2KeyFactory", "org/bouncycastle/jcajce/provider/symmetric/DESede", "PBEWithSHAAndDES2KeyFactory", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/symmetric/DESede$PBEWithSHAAndDES3Key", "org/bouncycastle/jcajce/provider/symmetric/DESede", "PBEWithSHAAndDES3Key", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/symmetric/DESede$PBEWithSHAAndDES3KeyFactory", "org/bouncycastle/jcajce/provider/symmetric/DESede", "PBEWithSHAAndDES3KeyFactory", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/symmetric/DESede$RFC3211", "org/bouncycastle/jcajce/provider/symmetric/DESede", "RFC3211", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/symmetric/DESede$Wrap", "org/bouncycastle/jcajce/provider/symmetric/DESede", "Wrap", ACC_PUBLIC | ACC_STATIC);

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
