package asm.org.apache.cxf.ws.security.policy.interceptors;
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
public class SecureConversationInInterceptor$1Dump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/cxf/ws/security/policy/interceptors/SecureConversationInInterceptor$1", "Lorg/apache/cxf/phase/AbstractPhaseInterceptor<Lorg/apache/cxf/binding/soap/SoapMessage;>;", "org/apache/cxf/phase/AbstractPhaseInterceptor", null);

classWriter.visitOuterClass("org/apache/cxf/ws/security/policy/interceptors/SecureConversationInInterceptor", "handleMessage", "(Lorg/apache/cxf/binding/soap/SoapMessage;)V");

classWriter.visitInnerClass("org/apache/cxf/ws/security/policy/interceptors/SecureConversationInInterceptor$1", null, null, 0);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "val$aim", "Lorg/apache/cxf/ws/policy/AssertionInfoMap;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "val$ais", "Ljava/util/Collection;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/apache/cxf/ws/security/policy/interceptors/SecureConversationInInterceptor;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/apache/cxf/ws/security/policy/interceptors/SecureConversationInInterceptor;Ljava/lang/String;Lorg/apache/cxf/ws/policy/AssertionInfoMap;Ljava/util/Collection;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/cxf/ws/security/policy/interceptors/SecureConversationInInterceptor$1", "this$0", "Lorg/apache/cxf/ws/security/policy/interceptors/SecureConversationInInterceptor;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/cxf/ws/security/policy/interceptors/SecureConversationInInterceptor$1", "val$aim", "Lorg/apache/cxf/ws/policy/AssertionInfoMap;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/cxf/ws/security/policy/interceptors/SecureConversationInInterceptor$1", "val$ais", "Ljava/util/Collection;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/phase/AbstractPhaseInterceptor", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "handleMessage", "(Lorg/apache/cxf/binding/soap/SoapMessage;)V", null, new String[] { "org/apache/cxf/interceptor/Fault" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("SOAPAction");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/binding/soap/SoapMessage", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/String");
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/cxf/binding/soap/interceptor/SoapActionInInterceptor", "getSoapAction", "(Lorg/apache/cxf/message/Message;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/lang/String"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/ws/security/policy/interceptors/SecureConversationInInterceptor$1", "this$0", "Lorg/apache/cxf/ws/security/policy/interceptors/SecureConversationInInterceptor;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/ws/security/policy/interceptors/SecureConversationInInterceptor$1", "val$aim", "Lorg/apache/cxf/ws/policy/AssertionInfoMap;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/ws/security/policy/interceptors/SecureConversationInInterceptor$1", "val$ais", "Ljava/util/Collection;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/ws/security/policy/interceptors/SecureConversationInInterceptor", "handleMessageForAction", "(Lorg/apache/cxf/binding/soap/SoapMessage;Ljava/lang/String;Lorg/apache/cxf/ws/policy/AssertionInfoMap;Ljava/util/Collection;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "handleMessage", "(Lorg/apache/cxf/message/Message;)V", null, new String[] { "org/apache/cxf/interceptor/Fault" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/cxf/binding/soap/SoapMessage");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/ws/security/policy/interceptors/SecureConversationInInterceptor$1", "handleMessage", "(Lorg/apache/cxf/binding/soap/SoapMessage;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
