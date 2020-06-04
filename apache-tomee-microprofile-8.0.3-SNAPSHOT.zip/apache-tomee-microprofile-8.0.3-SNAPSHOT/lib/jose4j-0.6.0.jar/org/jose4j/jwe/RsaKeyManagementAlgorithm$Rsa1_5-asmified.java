package asm.org.jose4j.jwe;
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
public class RsaKeyManagementAlgorithm$Rsa1_5Dump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_7, ACC_PUBLIC | ACC_SUPER, "org/jose4j/jwe/RsaKeyManagementAlgorithm$Rsa1_5", null, "org/jose4j/jwe/RsaKeyManagementAlgorithm", new String[] { "org/jose4j/jwe/KeyManagementAlgorithm" });

classWriter.visitInnerClass("org/jose4j/jwe/RsaKeyManagementAlgorithm$Rsa1_5", "org/jose4j/jwe/RsaKeyManagementAlgorithm", "Rsa1_5", ACC_PUBLIC | ACC_STATIC);

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("RSA/ECB/PKCS1Padding");
methodVisitor.visitLdcInsn("RSA1_5");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/jose4j/jwe/RsaKeyManagementAlgorithm", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
