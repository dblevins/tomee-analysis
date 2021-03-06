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
public class SHA3Dump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_5, ACC_PUBLIC | ACC_SUPER, "org/bouncycastle/jcajce/provider/digest/SHA3", null, "java/lang/Object", null);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/digest/SHA3$Digest224", "org/bouncycastle/jcajce/provider/digest/SHA3", "Digest224", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/digest/SHA3$Digest256", "org/bouncycastle/jcajce/provider/digest/SHA3", "Digest256", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/digest/SHA3$Digest384", "org/bouncycastle/jcajce/provider/digest/SHA3", "Digest384", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/digest/SHA3$Digest512", "org/bouncycastle/jcajce/provider/digest/SHA3", "Digest512", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/digest/SHA3$DigestSHA3", "org/bouncycastle/jcajce/provider/digest/SHA3", "DigestSHA3", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/digest/SHA3$HashMac224", "org/bouncycastle/jcajce/provider/digest/SHA3", "HashMac224", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/digest/SHA3$HashMac256", "org/bouncycastle/jcajce/provider/digest/SHA3", "HashMac256", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/digest/SHA3$HashMac384", "org/bouncycastle/jcajce/provider/digest/SHA3", "HashMac384", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/digest/SHA3$HashMac512", "org/bouncycastle/jcajce/provider/digest/SHA3", "HashMac512", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/digest/SHA3$HashMacSHA3", "org/bouncycastle/jcajce/provider/digest/SHA3", "HashMacSHA3", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/digest/SHA3$KeyGenerator224", "org/bouncycastle/jcajce/provider/digest/SHA3", "KeyGenerator224", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/digest/SHA3$KeyGenerator256", "org/bouncycastle/jcajce/provider/digest/SHA3", "KeyGenerator256", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/digest/SHA3$KeyGenerator384", "org/bouncycastle/jcajce/provider/digest/SHA3", "KeyGenerator384", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/digest/SHA3$KeyGenerator512", "org/bouncycastle/jcajce/provider/digest/SHA3", "KeyGenerator512", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/digest/SHA3$KeyGeneratorSHA3", "org/bouncycastle/jcajce/provider/digest/SHA3", "KeyGeneratorSHA3", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/digest/SHA3$Mappings", "org/bouncycastle/jcajce/provider/digest/SHA3", "Mappings", ACC_PUBLIC | ACC_STATIC);

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
