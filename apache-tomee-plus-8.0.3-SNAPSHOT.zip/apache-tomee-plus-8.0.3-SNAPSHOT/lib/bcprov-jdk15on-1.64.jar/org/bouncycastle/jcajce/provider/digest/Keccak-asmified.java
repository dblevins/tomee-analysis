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
public class KeccakDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_5, ACC_PUBLIC | ACC_SUPER, "org/bouncycastle/jcajce/provider/digest/Keccak", null, "java/lang/Object", null);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/digest/Keccak$Digest224", "org/bouncycastle/jcajce/provider/digest/Keccak", "Digest224", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/digest/Keccak$Digest256", "org/bouncycastle/jcajce/provider/digest/Keccak", "Digest256", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/digest/Keccak$Digest288", "org/bouncycastle/jcajce/provider/digest/Keccak", "Digest288", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/digest/Keccak$Digest384", "org/bouncycastle/jcajce/provider/digest/Keccak", "Digest384", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/digest/Keccak$Digest512", "org/bouncycastle/jcajce/provider/digest/Keccak", "Digest512", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/digest/Keccak$DigestKeccak", "org/bouncycastle/jcajce/provider/digest/Keccak", "DigestKeccak", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/digest/Keccak$HashMac224", "org/bouncycastle/jcajce/provider/digest/Keccak", "HashMac224", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/digest/Keccak$HashMac256", "org/bouncycastle/jcajce/provider/digest/Keccak", "HashMac256", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/digest/Keccak$HashMac288", "org/bouncycastle/jcajce/provider/digest/Keccak", "HashMac288", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/digest/Keccak$HashMac384", "org/bouncycastle/jcajce/provider/digest/Keccak", "HashMac384", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/digest/Keccak$HashMac512", "org/bouncycastle/jcajce/provider/digest/Keccak", "HashMac512", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/digest/Keccak$KeyGenerator224", "org/bouncycastle/jcajce/provider/digest/Keccak", "KeyGenerator224", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/digest/Keccak$KeyGenerator256", "org/bouncycastle/jcajce/provider/digest/Keccak", "KeyGenerator256", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/digest/Keccak$KeyGenerator288", "org/bouncycastle/jcajce/provider/digest/Keccak", "KeyGenerator288", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/digest/Keccak$KeyGenerator384", "org/bouncycastle/jcajce/provider/digest/Keccak", "KeyGenerator384", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/digest/Keccak$KeyGenerator512", "org/bouncycastle/jcajce/provider/digest/Keccak", "KeyGenerator512", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/digest/Keccak$Mappings", "org/bouncycastle/jcajce/provider/digest/Keccak", "Mappings", ACC_PUBLIC | ACC_STATIC);

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
