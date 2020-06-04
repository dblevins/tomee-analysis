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
public class DESDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_5, ACC_PUBLIC | ACC_FINAL | ACC_SUPER, "org/bouncycastle/jcajce/provider/symmetric/DES", null, "java/lang/Object", null);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/symmetric/DES$AlgParamGen", "org/bouncycastle/jcajce/provider/symmetric/DES", "AlgParamGen", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/symmetric/DES$CBC", "org/bouncycastle/jcajce/provider/symmetric/DES", "CBC", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/symmetric/DES$CBCMAC", "org/bouncycastle/jcajce/provider/symmetric/DES", "CBCMAC", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/symmetric/DES$CMAC", "org/bouncycastle/jcajce/provider/symmetric/DES", "CMAC", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/symmetric/DES$DES64", "org/bouncycastle/jcajce/provider/symmetric/DES", "DES64", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/symmetric/DES$DES64with7816d4", "org/bouncycastle/jcajce/provider/symmetric/DES", "DES64with7816d4", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/symmetric/DES$DES9797Alg3", "org/bouncycastle/jcajce/provider/symmetric/DES", "DES9797Alg3", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/symmetric/DES$DES9797Alg3with7816d4", "org/bouncycastle/jcajce/provider/symmetric/DES", "DES9797Alg3with7816d4", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/symmetric/DES$DESCFB8", "org/bouncycastle/jcajce/provider/symmetric/DES", "DESCFB8", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/symmetric/DES$DESPBEKeyFactory", "org/bouncycastle/jcajce/provider/symmetric/DES", "DESPBEKeyFactory", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/symmetric/DES$ECB", "org/bouncycastle/jcajce/provider/symmetric/DES", "ECB", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/symmetric/DES$KeyFactory", "org/bouncycastle/jcajce/provider/symmetric/DES", "KeyFactory", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/symmetric/DES$KeyGenerator", "org/bouncycastle/jcajce/provider/symmetric/DES", "KeyGenerator", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/symmetric/DES$Mappings", "org/bouncycastle/jcajce/provider/symmetric/DES", "Mappings", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/symmetric/DES$PBEWithMD2", "org/bouncycastle/jcajce/provider/symmetric/DES", "PBEWithMD2", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/symmetric/DES$PBEWithMD2KeyFactory", "org/bouncycastle/jcajce/provider/symmetric/DES", "PBEWithMD2KeyFactory", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/symmetric/DES$PBEWithMD5", "org/bouncycastle/jcajce/provider/symmetric/DES", "PBEWithMD5", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/symmetric/DES$PBEWithMD5KeyFactory", "org/bouncycastle/jcajce/provider/symmetric/DES", "PBEWithMD5KeyFactory", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/symmetric/DES$PBEWithSHA1", "org/bouncycastle/jcajce/provider/symmetric/DES", "PBEWithSHA1", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/symmetric/DES$PBEWithSHA1KeyFactory", "org/bouncycastle/jcajce/provider/symmetric/DES", "PBEWithSHA1KeyFactory", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/symmetric/DES$RFC3211", "org/bouncycastle/jcajce/provider/symmetric/DES", "RFC3211", ACC_PUBLIC | ACC_STATIC);

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
