package asm.org.jose4j.jwk;
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
public class KeyOperationsDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_7, ACC_PUBLIC | ACC_SUPER, "org/jose4j/jwk/KeyOperations", null, "java/lang/Object", null);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_STATIC, "SIGN", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_STATIC, "VERIFY", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_STATIC, "ENCRYPT", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_STATIC, "DECRYPT", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_STATIC, "WRAP_KEY", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_STATIC, "UNWRAP_KEY", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_STATIC, "DERIVE_KEY", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_STATIC, "DERIVE_BITS", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn("sign");
methodVisitor.visitFieldInsn(PUTSTATIC, "org/jose4j/jwk/KeyOperations", "SIGN", "Ljava/lang/String;");
methodVisitor.visitLdcInsn("verify");
methodVisitor.visitFieldInsn(PUTSTATIC, "org/jose4j/jwk/KeyOperations", "VERIFY", "Ljava/lang/String;");
methodVisitor.visitLdcInsn("encrypt");
methodVisitor.visitFieldInsn(PUTSTATIC, "org/jose4j/jwk/KeyOperations", "ENCRYPT", "Ljava/lang/String;");
methodVisitor.visitLdcInsn("decrypt");
methodVisitor.visitFieldInsn(PUTSTATIC, "org/jose4j/jwk/KeyOperations", "DECRYPT", "Ljava/lang/String;");
methodVisitor.visitLdcInsn("wrapKey");
methodVisitor.visitFieldInsn(PUTSTATIC, "org/jose4j/jwk/KeyOperations", "WRAP_KEY", "Ljava/lang/String;");
methodVisitor.visitLdcInsn("unwrapKey");
methodVisitor.visitFieldInsn(PUTSTATIC, "org/jose4j/jwk/KeyOperations", "UNWRAP_KEY", "Ljava/lang/String;");
methodVisitor.visitLdcInsn("deriveKey");
methodVisitor.visitFieldInsn(PUTSTATIC, "org/jose4j/jwk/KeyOperations", "DERIVE_KEY", "Ljava/lang/String;");
methodVisitor.visitLdcInsn("deriveBits");
methodVisitor.visitFieldInsn(PUTSTATIC, "org/jose4j/jwk/KeyOperations", "DERIVE_BITS", "Ljava/lang/String;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
