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
public class PolicyEngineDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_ABSTRACT | ACC_INTERFACE, "org/apache/cxf/ws/policy/PolicyEngine", null, "java/lang/Object", null);

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "isEnabled", "()Z", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setEnabled", "(Z)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getAlternativeSelector", "()Lorg/apache/cxf/ws/policy/AlternativeSelector;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setAlternativeSelector", "(Lorg/apache/cxf/ws/policy/AlternativeSelector;)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "isIgnoreUnknownAssertions", "()Z", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setIgnoreUnknownAssertions", "(Z)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "supportsAlternative", "(Ljava/util/Collection;Lorg/apache/cxf/ws/policy/Assertor;Lorg/apache/cxf/message/Message;)Z", "(Ljava/util/Collection<+Lorg/apache/neethi/PolicyComponent;>;Lorg/apache/cxf/ws/policy/Assertor;Lorg/apache/cxf/message/Message;)Z", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getEffectiveClientRequestPolicy", "(Lorg/apache/cxf/service/model/EndpointInfo;Lorg/apache/cxf/service/model/BindingOperationInfo;Lorg/apache/cxf/transport/Conduit;Lorg/apache/cxf/message/Message;)Lorg/apache/cxf/ws/policy/EffectivePolicy;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setEffectiveClientRequestPolicy", "(Lorg/apache/cxf/service/model/EndpointInfo;Lorg/apache/cxf/service/model/BindingOperationInfo;Lorg/apache/cxf/ws/policy/EffectivePolicy;)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getEffectiveServerResponsePolicy", "(Lorg/apache/cxf/service/model/EndpointInfo;Lorg/apache/cxf/service/model/BindingOperationInfo;Lorg/apache/cxf/transport/Destination;Ljava/util/List;Lorg/apache/cxf/message/Message;)Lorg/apache/cxf/ws/policy/EffectivePolicy;", "(Lorg/apache/cxf/service/model/EndpointInfo;Lorg/apache/cxf/service/model/BindingOperationInfo;Lorg/apache/cxf/transport/Destination;Ljava/util/List<Ljava/util/List<Lorg/apache/neethi/Assertion;>;>;Lorg/apache/cxf/message/Message;)Lorg/apache/cxf/ws/policy/EffectivePolicy;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setEffectiveServerResponsePolicy", "(Lorg/apache/cxf/service/model/EndpointInfo;Lorg/apache/cxf/service/model/BindingOperationInfo;Lorg/apache/cxf/ws/policy/EffectivePolicy;)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getEffectiveServerFaultPolicy", "(Lorg/apache/cxf/service/model/EndpointInfo;Lorg/apache/cxf/service/model/BindingOperationInfo;Lorg/apache/cxf/service/model/BindingFaultInfo;Lorg/apache/cxf/transport/Destination;Lorg/apache/cxf/message/Message;)Lorg/apache/cxf/ws/policy/EffectivePolicy;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setEffectiveServerFaultPolicy", "(Lorg/apache/cxf/service/model/EndpointInfo;Lorg/apache/cxf/service/model/BindingFaultInfo;Lorg/apache/cxf/ws/policy/EffectivePolicy;)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getClientEndpointPolicy", "(Lorg/apache/cxf/service/model/EndpointInfo;Lorg/apache/cxf/transport/Conduit;Lorg/apache/cxf/message/Message;)Lorg/apache/cxf/ws/policy/EndpointPolicy;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getServerEndpointPolicy", "(Lorg/apache/cxf/service/model/EndpointInfo;Lorg/apache/cxf/transport/Destination;Lorg/apache/cxf/message/Message;)Lorg/apache/cxf/ws/policy/EndpointPolicy;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setServerEndpointPolicy", "(Lorg/apache/cxf/service/model/EndpointInfo;Lorg/apache/cxf/ws/policy/EndpointPolicy;)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setClientEndpointPolicy", "(Lorg/apache/cxf/service/model/EndpointInfo;Lorg/apache/cxf/ws/policy/EndpointPolicy;)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getEffectiveServerRequestPolicy", "(Lorg/apache/cxf/service/model/EndpointInfo;Lorg/apache/cxf/service/model/BindingOperationInfo;Lorg/apache/cxf/message/Message;)Lorg/apache/cxf/ws/policy/EffectivePolicy;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setEffectiveServerRequestPolicy", "(Lorg/apache/cxf/service/model/EndpointInfo;Lorg/apache/cxf/service/model/BindingOperationInfo;Lorg/apache/cxf/ws/policy/EffectivePolicy;)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getEffectiveClientResponsePolicy", "(Lorg/apache/cxf/service/model/EndpointInfo;Lorg/apache/cxf/service/model/BindingOperationInfo;Lorg/apache/cxf/message/Message;)Lorg/apache/cxf/ws/policy/EffectivePolicy;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setEffectiveClientResponsePolicy", "(Lorg/apache/cxf/service/model/EndpointInfo;Lorg/apache/cxf/service/model/BindingOperationInfo;Lorg/apache/cxf/ws/policy/EffectivePolicy;)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getEffectiveClientFaultPolicy", "(Lorg/apache/cxf/service/model/EndpointInfo;Lorg/apache/cxf/service/model/BindingOperationInfo;Lorg/apache/cxf/service/model/BindingFaultInfo;Lorg/apache/cxf/message/Message;)Lorg/apache/cxf/ws/policy/EffectivePolicy;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setEffectiveClientFaultPolicy", "(Lorg/apache/cxf/service/model/EndpointInfo;Lorg/apache/cxf/service/model/BindingFaultInfo;Lorg/apache/cxf/ws/policy/EffectivePolicy;)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "addPolicy", "(Lorg/apache/neethi/Policy;)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getRegistry", "()Lorg/apache/neethi/PolicyRegistry;", null, null);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
