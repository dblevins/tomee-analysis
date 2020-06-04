package asm.org.apache.wss4j.dom.message;
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
public class WSSecSignatureConfirmationDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/wss4j/dom/message/WSSecSignatureConfirmation", null, "org/apache/wss4j/dom/message/WSSecBase", null);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "LOG", "Lorg/slf4j/Logger;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "sc", "Lorg/apache/wss4j/dom/message/token/SignatureConfirmation;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "signatureValue", "[B", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/apache/wss4j/dom/message/WSSecHeader;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/wss4j/dom/message/WSSecBase", "<init>", "(Lorg/apache/wss4j/dom/message/WSSecHeader;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/w3c/dom/Document;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/wss4j/dom/message/WSSecBase", "<init>", "(Lorg/w3c/dom/Document;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setSignatureValue", "([B)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/wss4j/dom/message/WSSecSignatureConfirmation", "signatureValue", "[B");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "prepare", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/apache/wss4j/dom/message/token/SignatureConfirmation");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/dom/message/WSSecSignatureConfirmation", "getDocument", "()Lorg/w3c/dom/Document;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/wss4j/dom/message/WSSecSignatureConfirmation", "signatureValue", "[B");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/wss4j/dom/message/token/SignatureConfirmation", "<init>", "(Lorg/w3c/dom/Document;[B)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/wss4j/dom/message/WSSecSignatureConfirmation", "sc", "Lorg/apache/wss4j/dom/message/token/SignatureConfirmation;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/wss4j/dom/message/WSSecSignatureConfirmation", "sc", "Lorg/apache/wss4j/dom/message/token/SignatureConfirmation;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/dom/message/WSSecSignatureConfirmation", "getIdAllocator", "()Lorg/apache/wss4j/dom/WsuIdAllocator;", false);
methodVisitor.visitLdcInsn("SC-");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/wss4j/dom/message/WSSecSignatureConfirmation", "sc", "Lorg/apache/wss4j/dom/message/token/SignatureConfirmation;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/wss4j/dom/WsuIdAllocator", "createId", "(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;", true);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/dom/message/token/SignatureConfirmation", "setID", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/wss4j/dom/message/WSSecSignatureConfirmation", "addWSUNamespace", "Z");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/wss4j/dom/message/WSSecSignatureConfirmation", "sc", "Lorg/apache/wss4j/dom/message/token/SignatureConfirmation;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/dom/message/token/SignatureConfirmation", "addWSUNamespace", "()V", false);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "prependToHeader", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/dom/message/WSSecSignatureConfirmation", "getSecurityHeader", "()Lorg/apache/wss4j/dom/message/WSSecHeader;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/dom/message/WSSecHeader", "getSecurityHeaderElement", "()Lorg/w3c/dom/Element;", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/wss4j/dom/message/WSSecSignatureConfirmation", "sc", "Lorg/apache/wss4j/dom/message/token/SignatureConfirmation;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/dom/message/token/SignatureConfirmation", "getElement", "()Lorg/w3c/dom/Element;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/wss4j/dom/util/WSSecurityUtil", "prependChildElement", "(Lorg/w3c/dom/Element;Lorg/w3c/dom/Element;)Lorg/w3c/dom/Element;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "build", "([B)Lorg/w3c/dom/Document;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/wss4j/dom/message/WSSecSignatureConfirmation", "LOG", "Lorg/slf4j/Logger;");
methodVisitor.visitLdcInsn("Begin add signature confirmation...");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/slf4j/Logger", "debug", "(Ljava/lang/String;)V", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/wss4j/dom/message/WSSecSignatureConfirmation", "signatureValue", "[B");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/dom/message/WSSecSignatureConfirmation", "prepare", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/dom/message/WSSecSignatureConfirmation", "prependToHeader", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/dom/message/WSSecSignatureConfirmation", "getDocument", "()Lorg/w3c/dom/Document;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getId", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/wss4j/dom/message/WSSecSignatureConfirmation", "sc", "Lorg/apache/wss4j/dom/message/token/SignatureConfirmation;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/wss4j/dom/message/WSSecSignatureConfirmation", "sc", "Lorg/apache/wss4j/dom/message/token/SignatureConfirmation;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/dom/message/token/SignatureConfirmation", "getID", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getSignatureConfirmationElement", "()Lorg/w3c/dom/Element;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/wss4j/dom/message/WSSecSignatureConfirmation", "sc", "Lorg/apache/wss4j/dom/message/token/SignatureConfirmation;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/wss4j/dom/message/WSSecSignatureConfirmation", "sc", "Lorg/apache/wss4j/dom/message/token/SignatureConfirmation;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/dom/message/token/SignatureConfirmation", "getElement", "()Lorg/w3c/dom/Element;", false);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"org/w3c/dom/Element"});
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/wss4j/dom/message/WSSecSignatureConfirmation;"));
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/slf4j/LoggerFactory", "getLogger", "(Ljava/lang/Class;)Lorg/slf4j/Logger;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/dom/message/WSSecSignatureConfirmation", "LOG", "Lorg/slf4j/Logger;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
