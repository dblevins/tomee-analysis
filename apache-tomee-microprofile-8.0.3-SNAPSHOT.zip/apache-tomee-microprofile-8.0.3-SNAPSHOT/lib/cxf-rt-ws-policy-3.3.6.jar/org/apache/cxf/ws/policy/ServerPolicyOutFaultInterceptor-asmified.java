package asm.org.apache.cxf.ws.policy;
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
public class ServerPolicyOutFaultInterceptorDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/cxf/ws/policy/ServerPolicyOutFaultInterceptor", null, "org/apache/cxf/ws/policy/AbstractPolicyInterceptor", null);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "INSTANCE", "Lorg/apache/cxf/ws/policy/ServerPolicyOutFaultInterceptor;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "LOG", "Ljava/util/logging/Logger;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC | ACC_SYNTHETIC, "$assertionsDisabled", "Z", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("org.apache.cxf.ws.policy.ServerPolicyOutFaultInterceptor");
methodVisitor.visitLdcInsn("setup");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/ws/policy/AbstractPolicyInterceptor", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "handle", "(Lorg/apache/cxf/message/Message;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/cxf/message/MessageUtils", "isRequestor", "(Lorg/apache/cxf/message/Message;)Z", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/ws/policy/ServerPolicyOutFaultInterceptor", "LOG", "Ljava/util/logging/Logger;");
methodVisitor.visitLdcInsn("Is a requestor.");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/logging/Logger", "fine", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/cxf/message/Message", "getExchange", "()Lorg/apache/cxf/message/Exchange;", true);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/ws/policy/ServerPolicyOutFaultInterceptor", "$assertionsDisabled", "Z");
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNE, label1);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitJumpInsn(IF_ACMPNE, label1);
methodVisitor.visitTypeInsn(NEW, "java/lang/AssertionError");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/AssertionError", "<init>", "()V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"org/apache/cxf/message/Exchange"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/cxf/message/Exchange", "getBindingOperationInfo", "()Lorg/apache/cxf/service/model/BindingOperationInfo;", true);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ALOAD, 3);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPNE, label2);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/ws/policy/ServerPolicyOutFaultInterceptor", "LOG", "Ljava/util/logging/Logger;");
methodVisitor.visitLdcInsn("No binding operation info.");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/logging/Logger", "fine", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"org/apache/cxf/service/model/BindingOperationInfo"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/cxf/message/Exchange", "getEndpoint", "()Lorg/apache/cxf/endpoint/Endpoint;", true);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ALOAD, 4);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPNE, label3);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/ws/policy/ServerPolicyOutFaultInterceptor", "LOG", "Ljava/util/logging/Logger;");
methodVisitor.visitLdcInsn("No endpoint.");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/logging/Logger", "fine", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"org/apache/cxf/endpoint/Endpoint"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/cxf/endpoint/Endpoint", "getEndpointInfo", "()Lorg/apache/cxf/service/model/EndpointInfo;", true);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/cxf/message/Exchange", "getBus", "()Lorg/apache/cxf/Bus;", true);
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/cxf/ws/policy/PolicyEngine;"));
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/cxf/Bus", "getExtension", "(Ljava/lang/Class;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/cxf/ws/policy/PolicyEngine");
methodVisitor.visitVarInsn(ASTORE, 7);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ALOAD, 7);
Label label4 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPNE, label4);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_APPEND,3, new Object[] {"org/apache/cxf/service/model/EndpointInfo", "org/apache/cxf/Bus", "org/apache/cxf/ws/policy/PolicyEngine"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/cxf/message/Exchange", "getDestination", "()Lorg/apache/cxf/transport/Destination;", true);
methodVisitor.visitVarInsn(ASTORE, 8);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitLdcInsn(Type.getType("Ljava/lang/Exception;"));
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/cxf/message/Exchange", "get", "(Ljava/lang/Class;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/Exception");
methodVisitor.visitVarInsn(ASTORE, 9);
methodVisitor.visitTypeInsn(NEW, "java/util/ArrayList");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/ArrayList", "<init>", "()V", false);
methodVisitor.visitVarInsn(ASTORE, 10);
methodVisitor.visitTypeInsn(NEW, "java/util/ArrayList");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/ArrayList", "<init>", "()V", false);
methodVisitor.visitVarInsn(ASTORE, 11);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("org.apache.cxf.ws.policy.override");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/cxf/message/Message", "getContextualProperty", "(Ljava/lang/String;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/neethi/Policy");
methodVisitor.visitVarInsn(ASTORE, 12);
methodVisitor.visitVarInsn(ALOAD, 12);
Label label5 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label5);
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/ws/policy/EndpointPolicyImpl");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 12);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/ws/policy/EndpointPolicyImpl", "<init>", "(Lorg/apache/neethi/Policy;)V", false);
methodVisitor.visitVarInsn(ASTORE, 13);
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/ws/policy/EffectivePolicyImpl");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/ws/policy/EffectivePolicyImpl", "<init>", "()V", false);
methodVisitor.visitVarInsn(ASTORE, 14);
methodVisitor.visitVarInsn(ALOAD, 14);
methodVisitor.visitVarInsn(ALOAD, 13);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/ws/policy/EffectivePolicyImpl", "initialise", "(Lorg/apache/cxf/ws/policy/EndpointPolicy;Lorg/apache/cxf/ws/policy/PolicyEngine;ZZLorg/apache/cxf/message/Message;)V", false);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/ws/policy/ServerPolicyOutFaultInterceptor", "LOG", "Ljava/util/logging/Logger;");
methodVisitor.visitFieldInsn(GETSTATIC, "java/util/logging/Level", "FINEST", "Ljava/util/logging/Level;");
methodVisitor.visitLdcInsn("Using effective policy: ");
methodVisitor.visitVarInsn(ALOAD, 14);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/ws/policy/EffectivePolicyImpl", "getPolicy", "()Lorg/apache/neethi/Policy;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/cxf/ws/policy/PolicyUtils", "logPolicy", "(Ljava/util/logging/Logger;Ljava/util/logging/Level;Ljava/lang/String;Lorg/apache/neethi/PolicyComponent;)V", false);
methodVisitor.visitVarInsn(ALOAD, 10);
methodVisitor.visitVarInsn(ALOAD, 14);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/ws/policy/EffectivePolicyImpl", "getInterceptors", "()Ljava/util/List;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "addAll", "(Ljava/util/Collection;)Z", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 11);
methodVisitor.visitVarInsn(ALOAD, 14);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/ws/policy/EffectivePolicyImpl", "getChosenAlternative", "()Ljava/util/Collection;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Collection", "addAll", "(Ljava/util/Collection;)Z", true);
methodVisitor.visitInsn(POP);
Label label6 = new Label();
methodVisitor.visitJumpInsn(GOTO, label6);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_FULL, 13, new Object[] {"org/apache/cxf/ws/policy/ServerPolicyOutFaultInterceptor", "org/apache/cxf/message/Message", "org/apache/cxf/message/Exchange", "org/apache/cxf/service/model/BindingOperationInfo", "org/apache/cxf/endpoint/Endpoint", "org/apache/cxf/service/model/EndpointInfo", "org/apache/cxf/Bus", "org/apache/cxf/ws/policy/PolicyEngine", "org/apache/cxf/transport/Destination", "java/lang/Exception", "java/util/List", "java/util/Collection", "org/apache/neethi/Policy"}, 0, new Object[] {});
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 9);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/ws/policy/ServerPolicyOutFaultInterceptor", "getBindingFaultInfo", "(Lorg/apache/cxf/message/Message;Ljava/lang/Exception;Lorg/apache/cxf/service/model/BindingOperationInfo;)Lorg/apache/cxf/service/model/BindingFaultInfo;", false);
methodVisitor.visitVarInsn(ASTORE, 13);
methodVisitor.visitVarInsn(ALOAD, 13);
Label label7 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label7);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/cxf/message/FaultMode;"));
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/cxf/message/Message", "get", "(Ljava/lang/Class;)Ljava/lang/Object;", true);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/message/FaultMode", "UNCHECKED_APPLICATION_FAULT", "Lorg/apache/cxf/message/FaultMode;");
methodVisitor.visitJumpInsn(IF_ACMPEQ, label7);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/cxf/message/FaultMode;"));
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/cxf/message/Message", "get", "(Ljava/lang/Class;)Ljava/lang/Object;", true);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/message/FaultMode", "CHECKED_APPLICATION_FAULT", "Lorg/apache/cxf/message/FaultMode;");
methodVisitor.visitJumpInsn(IF_ACMPEQ, label7);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitLabel(label7);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"org/apache/cxf/service/model/BindingFaultInfo"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 13);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/cxf/ws/policy/PolicyEngine", "getEffectiveServerFaultPolicy", "(Lorg/apache/cxf/service/model/EndpointInfo;Lorg/apache/cxf/service/model/BindingOperationInfo;Lorg/apache/cxf/service/model/BindingFaultInfo;Lorg/apache/cxf/transport/Destination;Lorg/apache/cxf/message/Message;)Lorg/apache/cxf/ws/policy/EffectivePolicy;", true);
methodVisitor.visitVarInsn(ASTORE, 14);
methodVisitor.visitVarInsn(ALOAD, 14);
methodVisitor.visitJumpInsn(IFNULL, label6);
methodVisitor.visitVarInsn(ALOAD, 10);
methodVisitor.visitVarInsn(ALOAD, 14);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/cxf/ws/policy/EffectivePolicy", "getInterceptors", "()Ljava/util/List;", true);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "addAll", "(Ljava/util/Collection;)Z", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 11);
methodVisitor.visitVarInsn(ALOAD, 14);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/cxf/ws/policy/EffectivePolicy", "getChosenAlternative", "()Ljava/util/Collection;", true);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Collection", "addAll", "(Ljava/util/Collection;)Z", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 10);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "iterator", "()Ljava/util/Iterator;", true);
methodVisitor.visitVarInsn(ASTORE, 13);
Label label8 = new Label();
methodVisitor.visitLabel(label8);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/util/Iterator"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 13);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "hasNext", "()Z", true);
Label label9 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label9);
methodVisitor.visitVarInsn(ALOAD, 13);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "next", "()Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/cxf/interceptor/Interceptor");
methodVisitor.visitVarInsn(ASTORE, 14);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/cxf/message/Message", "getInterceptorChain", "()Lorg/apache/cxf/interceptor/InterceptorChain;", true);
methodVisitor.visitVarInsn(ALOAD, 14);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/cxf/interceptor/InterceptorChain", "add", "(Lorg/apache/cxf/interceptor/Interceptor;)V", true);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/ws/policy/ServerPolicyOutFaultInterceptor", "LOG", "Ljava/util/logging/Logger;");
methodVisitor.visitFieldInsn(GETSTATIC, "java/util/logging/Level", "FINE", "Ljava/util/logging/Level;");
methodVisitor.visitLdcInsn("Added interceptor of type {0}");
methodVisitor.visitVarInsn(ALOAD, 14);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "getClass", "()Ljava/lang/Class;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "getSimpleName", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/logging/Logger", "log", "(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Object;)V", false);
methodVisitor.visitJumpInsn(GOTO, label8);
methodVisitor.visitLabel(label9);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ALOAD, 11);
Label label10 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPEQ, label10);
methodVisitor.visitVarInsn(ALOAD, 11);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Collection", "isEmpty", "()Z", true);
methodVisitor.visitJumpInsn(IFNE, label10);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/cxf/ws/policy/AssertionInfoMap;"));
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/ws/policy/AssertionInfoMap");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 11);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/ws/policy/AssertionInfoMap", "<init>", "(Ljava/util/Collection;)V", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/cxf/message/Message", "put", "(Ljava/lang/Class;Ljava/lang/Object;)V", true);
methodVisitor.visitLabel(label10);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(6, 15);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/cxf/ws/policy/ServerPolicyOutFaultInterceptor;"));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "desiredAssertionStatus", "()Z", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitInsn(ICONST_1);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {Opcodes.INTEGER});
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/cxf/ws/policy/ServerPolicyOutFaultInterceptor", "$assertionsDisabled", "Z");
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/ws/policy/ServerPolicyOutFaultInterceptor");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/ws/policy/ServerPolicyOutFaultInterceptor", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/cxf/ws/policy/ServerPolicyOutFaultInterceptor", "INSTANCE", "Lorg/apache/cxf/ws/policy/ServerPolicyOutFaultInterceptor;");
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/cxf/ws/policy/ServerPolicyOutFaultInterceptor;"));
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/cxf/common/logging/LogUtils", "getL7dLogger", "(Ljava/lang/Class;)Ljava/util/logging/Logger;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/cxf/ws/policy/ServerPolicyOutFaultInterceptor", "LOG", "Ljava/util/logging/Logger;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}