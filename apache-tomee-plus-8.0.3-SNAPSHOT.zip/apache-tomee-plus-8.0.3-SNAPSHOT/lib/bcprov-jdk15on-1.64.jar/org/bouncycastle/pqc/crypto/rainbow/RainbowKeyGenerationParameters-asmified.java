package asm.org.bouncycastle.pqc.crypto.rainbow;
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
public class RainbowKeyGenerationParametersDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_5, ACC_PUBLIC | ACC_SUPER, "org/bouncycastle/pqc/crypto/rainbow/RainbowKeyGenerationParameters", null, "org/bouncycastle/crypto/KeyGenerationParameters", null);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "params", "Lorg/bouncycastle/pqc/crypto/rainbow/RainbowParameters;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljava/security/SecureRandom;Lorg/bouncycastle/pqc/crypto/rainbow/RainbowParameters;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/pqc/crypto/rainbow/RainbowParameters", "getVi", "()[I", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/pqc/crypto/rainbow/RainbowParameters", "getVi", "()[I", false);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(ISUB);
methodVisitor.visitInsn(IALOAD);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/bouncycastle/pqc/crypto/rainbow/RainbowParameters", "getVi", "()[I", false);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IALOAD);
methodVisitor.visitInsn(ISUB);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/crypto/KeyGenerationParameters", "<init>", "(Ljava/security/SecureRandom;I)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/pqc/crypto/rainbow/RainbowKeyGenerationParameters", "params", "Lorg/bouncycastle/pqc/crypto/rainbow/RainbowParameters;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getParameters", "()Lorg/bouncycastle/pqc/crypto/rainbow/RainbowParameters;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/pqc/crypto/rainbow/RainbowKeyGenerationParameters", "params", "Lorg/bouncycastle/pqc/crypto/rainbow/RainbowParameters;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
