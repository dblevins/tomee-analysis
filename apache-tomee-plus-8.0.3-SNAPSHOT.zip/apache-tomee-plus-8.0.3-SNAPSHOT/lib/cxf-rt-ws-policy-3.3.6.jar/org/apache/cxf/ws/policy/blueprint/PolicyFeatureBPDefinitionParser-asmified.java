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
public class PolicyFeatureBPDefinitionParserDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/cxf/ws/policy/blueprint/PolicyFeatureBPDefinitionParser", null, "org/apache/cxf/configuration/blueprint/AbstractBPBeanDefinitionParser", null);

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
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/aries/blueprint/mutable/MutableCollectionMetadata;"));
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/aries/blueprint/ParserContext", "createMetadata", "(Ljava/lang/Class;)Lorg/osgi/service/blueprint/reflect/Metadata;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/aries/blueprint/mutable/MutableCollectionMetadata");
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitLdcInsn(Type.getType("Ljava/util/List;"));
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/aries/blueprint/mutable/MutableCollectionMetadata", "setCollectionClass", "(Ljava/lang/Class;)V", true);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/aries/blueprint/mutable/MutableCollectionMetadata;"));
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/aries/blueprint/ParserContext", "createMetadata", "(Ljava/lang/Class;)Lorg/osgi/service/blueprint/reflect/Metadata;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/aries/blueprint/mutable/MutableCollectionMetadata");
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitLdcInsn(Type.getType("Ljava/util/List;"));
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/aries/blueprint/mutable/MutableCollectionMetadata", "setCollectionClass", "(Ljava/lang/Class;)V", true);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/aries/blueprint/mutable/MutableBeanMetadata;"));
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/aries/blueprint/ParserContext", "createMetadata", "(Ljava/lang/Class;)Lorg/osgi/service/blueprint/reflect/Metadata;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/aries/blueprint/mutable/MutableBeanMetadata");
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/cxf/ws/policy/WSPolicyFeature;"));
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/aries/blueprint/mutable/MutableBeanMetadata", "setRuntimeClass", "(Ljava/lang/Class;)V", true);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/cxf/helpers/DOMUtils", "getFirstElement", "(Lorg/w3c/dom/Node;)Lorg/w3c/dom/Element;", false);
methodVisitor.visitVarInsn(ASTORE, 6);
Label label0 = new Label();
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_FULL, 7, new Object[] {"org/apache/cxf/ws/policy/blueprint/PolicyFeatureBPDefinitionParser", "org/w3c/dom/Element", "org/apache/aries/blueprint/ParserContext", "org/apache/aries/blueprint/mutable/MutableCollectionMetadata", "org/apache/aries/blueprint/mutable/MutableCollectionMetadata", "org/apache/aries/blueprint/mutable/MutableBeanMetadata", "org/w3c/dom/Element"}, 0, new Object[] {});
methodVisitor.visitVarInsn(ALOAD, 6);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label1);
methodVisitor.visitLdcInsn("Policy");
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/w3c/dom/Element", "getLocalName", "()Ljava/lang/String;", true);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equals", "(Ljava/lang/Object;)Z", false);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/cxf/ws/policy/blueprint/PolicyFeatureBPDefinitionParser", "createElement", "(Lorg/apache/aries/blueprint/ParserContext;Lorg/w3c/dom/Element;)Lorg/osgi/service/blueprint/reflect/Metadata;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/aries/blueprint/mutable/MutableCollectionMetadata", "addValue", "(Lorg/osgi/service/blueprint/reflect/Metadata;)V", true);
Label label3 = new Label();
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitLdcInsn("PolicyReference");
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/w3c/dom/Element", "getLocalName", "()Ljava/lang/String;", true);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equals", "(Ljava/lang/Object;)Z", false);
methodVisitor.visitJumpInsn(IFEQ, label3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/cxf/ws/policy/blueprint/PolicyFeatureBPDefinitionParser", "createElement", "(Lorg/apache/aries/blueprint/ParserContext;Lorg/w3c/dom/Element;)Lorg/osgi/service/blueprint/reflect/Metadata;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/aries/blueprint/mutable/MutableCollectionMetadata", "addValue", "(Lorg/osgi/service/blueprint/reflect/Metadata;)V", true);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/cxf/helpers/DOMUtils", "getNextElement", "(Lorg/w3c/dom/Element;)Lorg/w3c/dom/Element;", false);
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitJumpInsn(GOTO, label0);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitLdcInsn("policyElements");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/aries/blueprint/mutable/MutableBeanMetadata", "addProperty", "(Ljava/lang/String;Lorg/osgi/service/blueprint/reflect/Metadata;)Lorg/osgi/service/blueprint/reflect/BeanProperty;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitLdcInsn("policyReferenceElements");
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/aries/blueprint/mutable/MutableBeanMetadata", "addProperty", "(Ljava/lang/String;Lorg/osgi/service/blueprint/reflect/Metadata;)Lorg/osgi/service/blueprint/reflect/BeanProperty;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/configuration/blueprint/AbstractBPBeanDefinitionParser", "parseChildElements", "(Lorg/w3c/dom/Element;Lorg/apache/aries/blueprint/ParserContext;Lorg/apache/aries/blueprint/mutable/MutableBeanMetadata;)V", false);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 7);
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
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/ws/policy/blueprint/PolicyFeatureBPDefinitionParser", "setFirstChildAsProperty", "(Lorg/w3c/dom/Element;Lorg/apache/aries/blueprint/ParserContext;Lorg/apache/aries/blueprint/mutable/MutableBeanMetadata;Ljava/lang/String;)V", false);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "createElement", "(Lorg/apache/aries/blueprint/ParserContext;Lorg/w3c/dom/Element;)Lorg/osgi/service/blueprint/reflect/Metadata;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/aries/blueprint/mutable/MutablePassThroughMetadata;"));
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/aries/blueprint/ParserContext", "createMetadata", "(Ljava/lang/Class;)Lorg/osgi/service/blueprint/reflect/Metadata;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/aries/blueprint/mutable/MutablePassThroughMetadata");
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/aries/blueprint/mutable/MutablePassThroughMetadata", "setObject", "(Ljava/lang/Object;)V", true);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
