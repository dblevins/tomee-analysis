package asm.org.bouncycastle.crypto.encodings;
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
public class PKCS1Encoding$2Dump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_5, ACC_SUPER, "org/bouncycastle/crypto/encodings/PKCS1Encoding$2", null, "java/lang/Object", new String[] { "java/security/PrivilegedAction" });

classWriter.visitOuterClass("org/bouncycastle/crypto/encodings/PKCS1Encoding", "useStrict", "()Z");

classWriter.visitInnerClass("org/bouncycastle/crypto/encodings/PKCS1Encoding$2", null, null, 0);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/bouncycastle/crypto/encodings/PKCS1Encoding;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/bouncycastle/crypto/encodings/PKCS1Encoding;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/bouncycastle/crypto/encodings/PKCS1Encoding$2", "this$0", "Lorg/bouncycastle/crypto/encodings/PKCS1Encoding;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "run", "()Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn("org.bouncycastle.pkcs1.not_strict");
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/System", "getProperty", "(Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
