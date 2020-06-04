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
public class TwofishDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_5, ACC_PUBLIC | ACC_FINAL | ACC_SUPER, "org/bouncycastle/jcajce/provider/symmetric/Twofish", null, "java/lang/Object", null);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/symmetric/Twofish$AlgParams", "org/bouncycastle/jcajce/provider/symmetric/Twofish", "AlgParams", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/symmetric/Twofish$ECB", "org/bouncycastle/jcajce/provider/symmetric/Twofish", "ECB", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/symmetric/Twofish$GMAC", "org/bouncycastle/jcajce/provider/symmetric/Twofish", "GMAC", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/symmetric/Twofish$KeyGen", "org/bouncycastle/jcajce/provider/symmetric/Twofish", "KeyGen", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/symmetric/Twofish$Mappings", "org/bouncycastle/jcajce/provider/symmetric/Twofish", "Mappings", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/symmetric/Twofish$PBEWithSHA", "org/bouncycastle/jcajce/provider/symmetric/Twofish", "PBEWithSHA", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/symmetric/Twofish$PBEWithSHAKeyFactory", "org/bouncycastle/jcajce/provider/symmetric/Twofish", "PBEWithSHAKeyFactory", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/symmetric/Twofish$Poly1305", "org/bouncycastle/jcajce/provider/symmetric/Twofish", "Poly1305", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/symmetric/Twofish$Poly1305KeyGen", "org/bouncycastle/jcajce/provider/symmetric/Twofish", "Poly1305KeyGen", ACC_PUBLIC | ACC_STATIC);

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
