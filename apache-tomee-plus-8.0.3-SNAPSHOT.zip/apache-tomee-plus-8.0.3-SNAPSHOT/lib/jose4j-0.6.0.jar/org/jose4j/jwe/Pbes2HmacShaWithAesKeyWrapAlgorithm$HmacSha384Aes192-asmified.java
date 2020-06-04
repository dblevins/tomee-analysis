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
public class Pbes2HmacShaWithAesKeyWrapAlgorithm$HmacSha384Aes192Dump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_7, ACC_PUBLIC | ACC_SUPER, "org/jose4j/jwe/Pbes2HmacShaWithAesKeyWrapAlgorithm$HmacSha384Aes192", null, "org/jose4j/jwe/Pbes2HmacShaWithAesKeyWrapAlgorithm", null);

classWriter.visitInnerClass("org/jose4j/jwe/Pbes2HmacShaWithAesKeyWrapAlgorithm$HmacSha384Aes192", "org/jose4j/jwe/Pbes2HmacShaWithAesKeyWrapAlgorithm", "HmacSha384Aes192", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/jose4j/jwe/AesKeyWrapManagementAlgorithm$Aes192", "org/jose4j/jwe/AesKeyWrapManagementAlgorithm", "Aes192", ACC_PUBLIC | ACC_STATIC);

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("PBES2-HS384+A192KW");
methodVisitor.visitLdcInsn("HmacSHA384");
methodVisitor.visitTypeInsn(NEW, "org/jose4j/jwe/AesKeyWrapManagementAlgorithm$Aes192");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/jose4j/jwe/AesKeyWrapManagementAlgorithm$Aes192", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jose4j/jwe/AesKeyWrapManagementAlgorithm$Aes192", "setUseGeneralProviderContext", "()Lorg/jose4j/jwe/AesKeyWrapManagementAlgorithm;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/jose4j/jwe/Pbes2HmacShaWithAesKeyWrapAlgorithm", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lorg/jose4j/jwe/AesKeyWrapManagementAlgorithm;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
