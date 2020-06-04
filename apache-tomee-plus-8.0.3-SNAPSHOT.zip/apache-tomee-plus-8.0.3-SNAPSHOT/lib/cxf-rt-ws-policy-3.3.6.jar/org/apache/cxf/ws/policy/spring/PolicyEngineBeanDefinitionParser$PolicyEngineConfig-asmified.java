package asm.org.apache.cxf.ws.policy.spring;
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
public class PolicyEngineBeanDefinitionParser$PolicyEngineConfigDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/cxf/ws/policy/spring/PolicyEngineBeanDefinitionParser$PolicyEngineConfig", null, "java/lang/Object", null);

classWriter.visitInnerClass("org/apache/cxf/ws/policy/spring/PolicyEngineBeanDefinitionParser$PolicyEngineConfig", "org/apache/cxf/ws/policy/spring/PolicyEngineBeanDefinitionParser", "PolicyEngineConfig", ACC_PUBLIC | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "engine", "Lorg/apache/cxf/ws/policy/PolicyEngineImpl;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/apache/cxf/Bus;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/cxf/ws/policy/PolicyEngine;"));
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/cxf/Bus", "getExtension", "(Ljava/lang/Class;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/cxf/ws/policy/PolicyEngineImpl");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/cxf/ws/policy/spring/PolicyEngineBeanDefinitionParser$PolicyEngineConfig", "engine", "Lorg/apache/cxf/ws/policy/PolicyEngineImpl;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getEnabled", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/ws/policy/spring/PolicyEngineBeanDefinitionParser$PolicyEngineConfig", "engine", "Lorg/apache/cxf/ws/policy/PolicyEngineImpl;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/ws/policy/PolicyEngineImpl", "isEnabled", "()Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setEnabled", "(Z)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/ws/policy/spring/PolicyEngineBeanDefinitionParser$PolicyEngineConfig", "engine", "Lorg/apache/cxf/ws/policy/PolicyEngineImpl;");
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/ws/policy/PolicyEngineImpl", "setEnabled", "(Z)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getIgnoreUnknownAssertions", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/ws/policy/spring/PolicyEngineBeanDefinitionParser$PolicyEngineConfig", "engine", "Lorg/apache/cxf/ws/policy/PolicyEngineImpl;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/ws/policy/PolicyEngineImpl", "isIgnoreUnknownAssertions", "()Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setIgnoreUnknownAssertions", "(Z)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/ws/policy/spring/PolicyEngineBeanDefinitionParser$PolicyEngineConfig", "engine", "Lorg/apache/cxf/ws/policy/PolicyEngineImpl;");
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/ws/policy/PolicyEngineImpl", "setIgnoreUnknownAssertions", "(Z)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getAlternativeSelector", "()Lorg/apache/cxf/ws/policy/AlternativeSelector;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/ws/policy/spring/PolicyEngineBeanDefinitionParser$PolicyEngineConfig", "engine", "Lorg/apache/cxf/ws/policy/PolicyEngineImpl;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/ws/policy/PolicyEngineImpl", "getAlternativeSelector", "()Lorg/apache/cxf/ws/policy/AlternativeSelector;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setAlternativeSelector", "(Lorg/apache/cxf/ws/policy/AlternativeSelector;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/ws/policy/spring/PolicyEngineBeanDefinitionParser$PolicyEngineConfig", "engine", "Lorg/apache/cxf/ws/policy/PolicyEngineImpl;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/ws/policy/PolicyEngineImpl", "setAlternativeSelector", "(Lorg/apache/cxf/ws/policy/AlternativeSelector;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
