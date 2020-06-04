package asm.org.bouncycastle.crypto;
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
public class CryptoServicesRegistrar$PropertyDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_5, ACC_PUBLIC | ACC_FINAL | ACC_SUPER, "org/bouncycastle/crypto/CryptoServicesRegistrar$Property", null, "java/lang/Object", null);

classWriter.visitInnerClass("org/bouncycastle/crypto/CryptoServicesRegistrar$Property", "org/bouncycastle/crypto/CryptoServicesRegistrar", "Property", ACC_PUBLIC | ACC_FINAL | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "EC_IMPLICITLY_CA", "Lorg/bouncycastle/crypto/CryptoServicesRegistrar$Property;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "DH_DEFAULT_PARAMS", "Lorg/bouncycastle/crypto/CryptoServicesRegistrar$Property;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "DSA_DEFAULT_PARAMS", "Lorg/bouncycastle/crypto/CryptoServicesRegistrar$Property;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "name", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "type", "Ljava/lang/Class;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "(Ljava/lang/String;Ljava/lang/Class;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/crypto/CryptoServicesRegistrar$Property", "name", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/crypto/CryptoServicesRegistrar$Property", "type", "Ljava/lang/Class;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$000", "(Lorg/bouncycastle/crypto/CryptoServicesRegistrar$Property;)Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/crypto/CryptoServicesRegistrar$Property", "name", "Ljava/lang/String;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$100", "(Lorg/bouncycastle/crypto/CryptoServicesRegistrar$Property;)Ljava/lang/Class;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/bouncycastle/crypto/CryptoServicesRegistrar$Property", "type", "Ljava/lang/Class;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/crypto/CryptoServicesRegistrar$Property");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("ecImplicitlyCA");
methodVisitor.visitLdcInsn(Type.getType("Lorg/bouncycastle/asn1/x9/X9ECParameters;"));
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/crypto/CryptoServicesRegistrar$Property", "<init>", "(Ljava/lang/String;Ljava/lang/Class;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/bouncycastle/crypto/CryptoServicesRegistrar$Property", "EC_IMPLICITLY_CA", "Lorg/bouncycastle/crypto/CryptoServicesRegistrar$Property;");
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/crypto/CryptoServicesRegistrar$Property");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("dhDefaultParams");
methodVisitor.visitLdcInsn(Type.getType("Lorg/bouncycastle/crypto/params/DHParameters;"));
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/crypto/CryptoServicesRegistrar$Property", "<init>", "(Ljava/lang/String;Ljava/lang/Class;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/bouncycastle/crypto/CryptoServicesRegistrar$Property", "DH_DEFAULT_PARAMS", "Lorg/bouncycastle/crypto/CryptoServicesRegistrar$Property;");
methodVisitor.visitTypeInsn(NEW, "org/bouncycastle/crypto/CryptoServicesRegistrar$Property");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("dsaDefaultParams");
methodVisitor.visitLdcInsn(Type.getType("Lorg/bouncycastle/crypto/params/DSAParameters;"));
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/bouncycastle/crypto/CryptoServicesRegistrar$Property", "<init>", "(Ljava/lang/String;Ljava/lang/Class;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/bouncycastle/crypto/CryptoServicesRegistrar$Property", "DSA_DEFAULT_PARAMS", "Lorg/bouncycastle/crypto/CryptoServicesRegistrar$Property;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
