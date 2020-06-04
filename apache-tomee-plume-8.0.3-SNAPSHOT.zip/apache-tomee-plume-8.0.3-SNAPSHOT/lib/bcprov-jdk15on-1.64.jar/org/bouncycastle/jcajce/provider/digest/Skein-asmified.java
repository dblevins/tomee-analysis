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
public class SkeinDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_5, ACC_PUBLIC | ACC_SUPER, "org/bouncycastle/jcajce/provider/digest/Skein", null, "java/lang/Object", null);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/digest/Skein$DigestSkein1024", "org/bouncycastle/jcajce/provider/digest/Skein", "DigestSkein1024", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/digest/Skein$DigestSkein256", "org/bouncycastle/jcajce/provider/digest/Skein", "DigestSkein256", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/digest/Skein$DigestSkein512", "org/bouncycastle/jcajce/provider/digest/Skein", "DigestSkein512", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/digest/Skein$Digest_1024_1024", "org/bouncycastle/jcajce/provider/digest/Skein", "Digest_1024_1024", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/digest/Skein$Digest_1024_384", "org/bouncycastle/jcajce/provider/digest/Skein", "Digest_1024_384", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/digest/Skein$Digest_1024_512", "org/bouncycastle/jcajce/provider/digest/Skein", "Digest_1024_512", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/digest/Skein$Digest_256_128", "org/bouncycastle/jcajce/provider/digest/Skein", "Digest_256_128", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/digest/Skein$Digest_256_160", "org/bouncycastle/jcajce/provider/digest/Skein", "Digest_256_160", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/digest/Skein$Digest_256_224", "org/bouncycastle/jcajce/provider/digest/Skein", "Digest_256_224", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/digest/Skein$Digest_256_256", "org/bouncycastle/jcajce/provider/digest/Skein", "Digest_256_256", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/digest/Skein$Digest_512_128", "org/bouncycastle/jcajce/provider/digest/Skein", "Digest_512_128", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/digest/Skein$Digest_512_160", "org/bouncycastle/jcajce/provider/digest/Skein", "Digest_512_160", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/digest/Skein$Digest_512_224", "org/bouncycastle/jcajce/provider/digest/Skein", "Digest_512_224", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/digest/Skein$Digest_512_256", "org/bouncycastle/jcajce/provider/digest/Skein", "Digest_512_256", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/digest/Skein$Digest_512_384", "org/bouncycastle/jcajce/provider/digest/Skein", "Digest_512_384", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/digest/Skein$Digest_512_512", "org/bouncycastle/jcajce/provider/digest/Skein", "Digest_512_512", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/digest/Skein$HMacKeyGenerator_1024_1024", "org/bouncycastle/jcajce/provider/digest/Skein", "HMacKeyGenerator_1024_1024", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/digest/Skein$HMacKeyGenerator_1024_384", "org/bouncycastle/jcajce/provider/digest/Skein", "HMacKeyGenerator_1024_384", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/digest/Skein$HMacKeyGenerator_1024_512", "org/bouncycastle/jcajce/provider/digest/Skein", "HMacKeyGenerator_1024_512", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/digest/Skein$HMacKeyGenerator_256_128", "org/bouncycastle/jcajce/provider/digest/Skein", "HMacKeyGenerator_256_128", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/digest/Skein$HMacKeyGenerator_256_160", "org/bouncycastle/jcajce/provider/digest/Skein", "HMacKeyGenerator_256_160", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/digest/Skein$HMacKeyGenerator_256_224", "org/bouncycastle/jcajce/provider/digest/Skein", "HMacKeyGenerator_256_224", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/digest/Skein$HMacKeyGenerator_256_256", "org/bouncycastle/jcajce/provider/digest/Skein", "HMacKeyGenerator_256_256", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/digest/Skein$HMacKeyGenerator_512_128", "org/bouncycastle/jcajce/provider/digest/Skein", "HMacKeyGenerator_512_128", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/digest/Skein$HMacKeyGenerator_512_160", "org/bouncycastle/jcajce/provider/digest/Skein", "HMacKeyGenerator_512_160", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/digest/Skein$HMacKeyGenerator_512_224", "org/bouncycastle/jcajce/provider/digest/Skein", "HMacKeyGenerator_512_224", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/digest/Skein$HMacKeyGenerator_512_256", "org/bouncycastle/jcajce/provider/digest/Skein", "HMacKeyGenerator_512_256", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/digest/Skein$HMacKeyGenerator_512_384", "org/bouncycastle/jcajce/provider/digest/Skein", "HMacKeyGenerator_512_384", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/digest/Skein$HMacKeyGenerator_512_512", "org/bouncycastle/jcajce/provider/digest/Skein", "HMacKeyGenerator_512_512", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/digest/Skein$HashMac_1024_1024", "org/bouncycastle/jcajce/provider/digest/Skein", "HashMac_1024_1024", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/digest/Skein$HashMac_1024_384", "org/bouncycastle/jcajce/provider/digest/Skein", "HashMac_1024_384", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/digest/Skein$HashMac_1024_512", "org/bouncycastle/jcajce/provider/digest/Skein", "HashMac_1024_512", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/digest/Skein$HashMac_256_128", "org/bouncycastle/jcajce/provider/digest/Skein", "HashMac_256_128", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/digest/Skein$HashMac_256_160", "org/bouncycastle/jcajce/provider/digest/Skein", "HashMac_256_160", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/digest/Skein$HashMac_256_224", "org/bouncycastle/jcajce/provider/digest/Skein", "HashMac_256_224", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/digest/Skein$HashMac_256_256", "org/bouncycastle/jcajce/provider/digest/Skein", "HashMac_256_256", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/digest/Skein$HashMac_512_128", "org/bouncycastle/jcajce/provider/digest/Skein", "HashMac_512_128", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/digest/Skein$HashMac_512_160", "org/bouncycastle/jcajce/provider/digest/Skein", "HashMac_512_160", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/digest/Skein$HashMac_512_224", "org/bouncycastle/jcajce/provider/digest/Skein", "HashMac_512_224", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/digest/Skein$HashMac_512_256", "org/bouncycastle/jcajce/provider/digest/Skein", "HashMac_512_256", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/digest/Skein$HashMac_512_384", "org/bouncycastle/jcajce/provider/digest/Skein", "HashMac_512_384", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/digest/Skein$HashMac_512_512", "org/bouncycastle/jcajce/provider/digest/Skein", "HashMac_512_512", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/digest/Skein$Mappings", "org/bouncycastle/jcajce/provider/digest/Skein", "Mappings", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/digest/Skein$SkeinMacKeyGenerator_1024_1024", "org/bouncycastle/jcajce/provider/digest/Skein", "SkeinMacKeyGenerator_1024_1024", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/digest/Skein$SkeinMacKeyGenerator_1024_384", "org/bouncycastle/jcajce/provider/digest/Skein", "SkeinMacKeyGenerator_1024_384", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/digest/Skein$SkeinMacKeyGenerator_1024_512", "org/bouncycastle/jcajce/provider/digest/Skein", "SkeinMacKeyGenerator_1024_512", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/digest/Skein$SkeinMacKeyGenerator_256_128", "org/bouncycastle/jcajce/provider/digest/Skein", "SkeinMacKeyGenerator_256_128", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/digest/Skein$SkeinMacKeyGenerator_256_160", "org/bouncycastle/jcajce/provider/digest/Skein", "SkeinMacKeyGenerator_256_160", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/digest/Skein$SkeinMacKeyGenerator_256_224", "org/bouncycastle/jcajce/provider/digest/Skein", "SkeinMacKeyGenerator_256_224", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/digest/Skein$SkeinMacKeyGenerator_256_256", "org/bouncycastle/jcajce/provider/digest/Skein", "SkeinMacKeyGenerator_256_256", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/digest/Skein$SkeinMacKeyGenerator_512_128", "org/bouncycastle/jcajce/provider/digest/Skein", "SkeinMacKeyGenerator_512_128", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/digest/Skein$SkeinMacKeyGenerator_512_160", "org/bouncycastle/jcajce/provider/digest/Skein", "SkeinMacKeyGenerator_512_160", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/digest/Skein$SkeinMacKeyGenerator_512_224", "org/bouncycastle/jcajce/provider/digest/Skein", "SkeinMacKeyGenerator_512_224", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/digest/Skein$SkeinMacKeyGenerator_512_256", "org/bouncycastle/jcajce/provider/digest/Skein", "SkeinMacKeyGenerator_512_256", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/digest/Skein$SkeinMacKeyGenerator_512_384", "org/bouncycastle/jcajce/provider/digest/Skein", "SkeinMacKeyGenerator_512_384", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/digest/Skein$SkeinMacKeyGenerator_512_512", "org/bouncycastle/jcajce/provider/digest/Skein", "SkeinMacKeyGenerator_512_512", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/digest/Skein$SkeinMac_1024_1024", "org/bouncycastle/jcajce/provider/digest/Skein", "SkeinMac_1024_1024", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/digest/Skein$SkeinMac_1024_384", "org/bouncycastle/jcajce/provider/digest/Skein", "SkeinMac_1024_384", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/digest/Skein$SkeinMac_1024_512", "org/bouncycastle/jcajce/provider/digest/Skein", "SkeinMac_1024_512", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/digest/Skein$SkeinMac_256_128", "org/bouncycastle/jcajce/provider/digest/Skein", "SkeinMac_256_128", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/digest/Skein$SkeinMac_256_160", "org/bouncycastle/jcajce/provider/digest/Skein", "SkeinMac_256_160", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/digest/Skein$SkeinMac_256_224", "org/bouncycastle/jcajce/provider/digest/Skein", "SkeinMac_256_224", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/digest/Skein$SkeinMac_256_256", "org/bouncycastle/jcajce/provider/digest/Skein", "SkeinMac_256_256", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/digest/Skein$SkeinMac_512_128", "org/bouncycastle/jcajce/provider/digest/Skein", "SkeinMac_512_128", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/digest/Skein$SkeinMac_512_160", "org/bouncycastle/jcajce/provider/digest/Skein", "SkeinMac_512_160", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/digest/Skein$SkeinMac_512_224", "org/bouncycastle/jcajce/provider/digest/Skein", "SkeinMac_512_224", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/digest/Skein$SkeinMac_512_256", "org/bouncycastle/jcajce/provider/digest/Skein", "SkeinMac_512_256", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/digest/Skein$SkeinMac_512_384", "org/bouncycastle/jcajce/provider/digest/Skein", "SkeinMac_512_384", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/bouncycastle/jcajce/provider/digest/Skein$SkeinMac_512_512", "org/bouncycastle/jcajce/provider/digest/Skein", "SkeinMac_512_512", ACC_PUBLIC | ACC_STATIC);

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
