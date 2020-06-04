package asm.org.apache.cxf.ws.security.wss4j.policyhandlers;
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
public class AbstractBindingBuilder$SupportingTokenDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/cxf/ws/security/wss4j/policyhandlers/AbstractBindingBuilder$SupportingToken", null, "java/lang/Object", null);

classWriter.visitInnerClass("org/apache/cxf/ws/security/wss4j/policyhandlers/AbstractBindingBuilder$SupportingToken", "org/apache/cxf/ws/security/wss4j/policyhandlers/AbstractBindingBuilder", "SupportingToken", ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "token", "Lorg/apache/wss4j/policy/model/AbstractToken;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "tokenImplementation", "Ljava/lang/Object;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "signedParts", "Ljava/util/List;", "Ljava/util/List<Lorg/apache/wss4j/common/WSEncryptionPart;>;", null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/apache/wss4j/policy/model/AbstractToken;Ljava/lang/Object;Ljava/util/List;)V", "(Lorg/apache/wss4j/policy/model/AbstractToken;Ljava/lang/Object;Ljava/util/List<Lorg/apache/wss4j/common/WSEncryptionPart;>;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/cxf/ws/security/wss4j/policyhandlers/AbstractBindingBuilder$SupportingToken", "token", "Lorg/apache/wss4j/policy/model/AbstractToken;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/cxf/ws/security/wss4j/policyhandlers/AbstractBindingBuilder$SupportingToken", "tokenImplementation", "Ljava/lang/Object;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/cxf/ws/security/wss4j/policyhandlers/AbstractBindingBuilder$SupportingToken", "signedParts", "Ljava/util/List;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getToken", "()Lorg/apache/wss4j/policy/model/AbstractToken;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/ws/security/wss4j/policyhandlers/AbstractBindingBuilder$SupportingToken", "token", "Lorg/apache/wss4j/policy/model/AbstractToken;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getTokenImplementation", "()Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/ws/security/wss4j/policyhandlers/AbstractBindingBuilder$SupportingToken", "tokenImplementation", "Ljava/lang/Object;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getSignedParts", "()Ljava/util/List;", "()Ljava/util/List<Lorg/apache/wss4j/common/WSEncryptionPart;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/ws/security/wss4j/policyhandlers/AbstractBindingBuilder$SupportingToken", "signedParts", "Ljava/util/List;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
