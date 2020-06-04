package asm.org.apache.cxf.ws.policy.blueprint;
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
public class PolicyEngineBPDefinitionParserDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/cxf/ws/policy/blueprint/PolicyEngineBPDefinitionParser", null, "org/apache/cxf/configuration/blueprint/AbstractBPBeanDefinitionParser", null);

classWriter.visitInnerClass("org/apache/cxf/ws/policy/blueprint/PolicyEngineBPDefinitionParser$PolicyEngineConfig", "org/apache/cxf/ws/policy/blueprint/PolicyEngineBPDefinitionParser", "PolicyEngineConfig", ACC_PUBLIC | ACC_STATIC);

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/configuration/blueprint/AbstractBPBeanDefinitionParser", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "parse", "(Lorg/w3c/dom/Element;Lorg/apache/aries/blueprint/ParserContext;)Lorg/osgi/service/blueprint/reflect/Metadata;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/aries/blueprint/mutable/MutableBeanMetadata;"));
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/aries/blueprint/ParserContext", "createMetadata", "(Ljava/lang/Class;)Lorg/osgi/service/blueprint/reflect/Metadata;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/aries/blueprint/mutable/MutableBeanMetadata");
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/cxf/ws/policy/blueprint/PolicyEngineBPDefinitionParser$PolicyEngineConfig;"));
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/aries/blueprint/mutable/MutableBeanMetadata", "setRuntimeClass", "(Ljava/lang/Class;)V", true);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("bus");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/w3c/dom/Element", "getAttribute", "(Ljava/lang/String;)Ljava/lang/String;", true);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/cxf/common/util/StringUtils", "isEmpty", "(Ljava/lang/String;)Z", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitLdcInsn("cxf");
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {"org/apache/aries/blueprint/mutable/MutableBeanMetadata", "java/lang/String"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/ws/policy/blueprint/PolicyEngineBPDefinitionParser", "getBusRef", "(Lorg/apache/aries/blueprint/ParserContext;Ljava/lang/String;)Lorg/osgi/service/blueprint/reflect/RefMetadata;", false);
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/cxf/Bus;"));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "getName", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/aries/blueprint/mutable/MutableBeanMetadata", "addArgument", "(Lorg/osgi/service/blueprint/reflect/Metadata;Ljava/lang/String;I)Lorg/osgi/service/blueprint/reflect/BeanArgument;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/ws/policy/blueprint/PolicyEngineBPDefinitionParser", "parseAttributes", "(Lorg/w3c/dom/Element;Lorg/apache/aries/blueprint/ParserContext;Lorg/apache/aries/blueprint/mutable/MutableBeanMetadata;)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/ws/policy/blueprint/PolicyEngineBPDefinitionParser", "parseChildElements", "(Lorg/w3c/dom/Element;Lorg/apache/aries/blueprint/ParserContext;Lorg/apache/aries/blueprint/mutable/MutableBeanMetadata;)V", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/cxf/ws/policy/blueprint/PolicyEngineBPDefinitionParser$PolicyEngineConfig;"));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "getName", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/aries/blueprint/ParserContext", "generateId", "()Ljava/lang/String;", true);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/aries/blueprint/mutable/MutableBeanMetadata", "setId", "(Ljava/lang/String;)V", true);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "mapElement", "(Lorg/apache/aries/blueprint/ParserContext;Lorg/apache/aries/blueprint/mutable/MutableBeanMetadata;Lorg/w3c/dom/Element;Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn("alternativeSelector");
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equals", "(Ljava/lang/Object;)Z", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/ws/policy/blueprint/PolicyEngineBPDefinitionParser", "setFirstChildAsProperty", "(Lorg/w3c/dom/Element;Lorg/apache/aries/blueprint/ParserContext;Lorg/apache/aries/blueprint/mutable/MutableBeanMetadata;Ljava/lang/String;)V", false);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 5);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
