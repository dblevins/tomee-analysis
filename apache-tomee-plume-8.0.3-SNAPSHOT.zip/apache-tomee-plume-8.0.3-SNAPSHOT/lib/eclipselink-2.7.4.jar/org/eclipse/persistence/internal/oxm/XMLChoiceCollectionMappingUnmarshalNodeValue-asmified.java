package asm.org.eclipse.persistence.internal.oxm;
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
public class XMLChoiceCollectionMappingUnmarshalNodeValueDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/eclipse/persistence/internal/oxm/XMLChoiceCollectionMappingUnmarshalNodeValue", null, "org/eclipse/persistence/internal/oxm/MappingNodeValue", new String[] { "org/eclipse/persistence/internal/oxm/ContainerValue" });

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "choiceElementNodeValue", "Lorg/eclipse/persistence/internal/oxm/NodeValue;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "choiceElementMarshalNodeValue", "Lorg/eclipse/persistence/internal/oxm/NodeValue;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "xmlChoiceCollectionMapping", "Lorg/eclipse/persistence/internal/oxm/mappings/ChoiceCollectionMapping;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "nestedMapping", "Lorg/eclipse/persistence/internal/oxm/mappings/Mapping;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "fieldToNodeValues", "Ljava/util/Map;", "Ljava/util/Map<Lorg/eclipse/persistence/internal/oxm/mappings/Field;Lorg/eclipse/persistence/internal/oxm/NodeValue;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "xmlField", "Lorg/eclipse/persistence/internal/oxm/mappings/Field;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "containerNodeValue", "Lorg/eclipse/persistence/internal/oxm/ContainerValue;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "isMixedNodeValue", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "isAny", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "index", "I", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/eclipse/persistence/internal/oxm/mappings/ChoiceCollectionMapping;Lorg/eclipse/persistence/internal/oxm/mappings/Field;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/oxm/MappingNodeValue", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_M1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/oxm/XMLChoiceCollectionMappingUnmarshalNodeValue", "index", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/oxm/XMLChoiceCollectionMappingUnmarshalNodeValue", "xmlChoiceCollectionMapping", "Lorg/eclipse/persistence/internal/oxm/mappings/ChoiceCollectionMapping;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/oxm/XMLChoiceCollectionMappingUnmarshalNodeValue", "xmlField", "Lorg/eclipse/persistence/internal/oxm/mappings/Field;");
methodVisitor.visitVarInsn(ALOAD, 2);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/internal/oxm/mappings/ChoiceCollectionMapping", "isAny", "()Z", true);
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/oxm/XMLChoiceCollectionMappingUnmarshalNodeValue", "isAny", "Z");
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_FULL, 3, new Object[] {"org/eclipse/persistence/internal/oxm/XMLChoiceCollectionMappingUnmarshalNodeValue", "org/eclipse/persistence/internal/oxm/mappings/ChoiceCollectionMapping", "org/eclipse/persistence/internal/oxm/mappings/Field"}, 0, new Object[] {});
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/internal/oxm/mappings/ChoiceCollectionMapping", "getChoiceElementMappings", "()Ljava/util/Map;", true);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/persistence/internal/oxm/mappings/Mapping");
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/oxm/XMLChoiceCollectionMappingUnmarshalNodeValue", "nestedMapping", "Lorg/eclipse/persistence/internal/oxm/mappings/Mapping;");
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/oxm/XMLChoiceCollectionMappingUnmarshalNodeValue", "initializeNodeValue", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/eclipse/persistence/internal/oxm/mappings/ChoiceCollectionMapping;Lorg/eclipse/persistence/internal/oxm/mappings/Field;Lorg/eclipse/persistence/internal/oxm/mappings/Mapping;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/oxm/MappingNodeValue", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_M1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/oxm/XMLChoiceCollectionMappingUnmarshalNodeValue", "index", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/oxm/XMLChoiceCollectionMappingUnmarshalNodeValue", "xmlChoiceCollectionMapping", "Lorg/eclipse/persistence/internal/oxm/mappings/ChoiceCollectionMapping;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/oxm/XMLChoiceCollectionMappingUnmarshalNodeValue", "xmlField", "Lorg/eclipse/persistence/internal/oxm/mappings/Field;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/oxm/XMLChoiceCollectionMappingUnmarshalNodeValue", "nestedMapping", "Lorg/eclipse/persistence/internal/oxm/mappings/Mapping;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/oxm/XMLChoiceCollectionMappingUnmarshalNodeValue", "initializeNodeValue", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isOwningNode", "(Lorg/eclipse/persistence/internal/oxm/XPathFragment;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/oxm/XMLChoiceCollectionMappingUnmarshalNodeValue", "isMixedNodeValue", "Z");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/oxm/XPathFragment", "nameIsText", "()Z", false);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/oxm/XMLChoiceCollectionMappingUnmarshalNodeValue", "choiceElementNodeValue", "Lorg/eclipse/persistence/internal/oxm/NodeValue;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/oxm/NodeValue", "isOwningNode", "(Lorg/eclipse/persistence/internal/oxm/XPathFragment;)Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "initializeNodeValue", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/oxm/XMLChoiceCollectionMappingUnmarshalNodeValue", "nestedMapping", "Lorg/eclipse/persistence/internal/oxm/mappings/Mapping;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/oxm/XMLChoiceCollectionMappingUnmarshalNodeValue", "isAny", "Z");
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/oxm/XMLChoiceCollectionMappingUnmarshalNodeValue", "xmlChoiceCollectionMapping", "Lorg/eclipse/persistence/internal/oxm/mappings/ChoiceCollectionMapping;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/internal/oxm/mappings/ChoiceCollectionMapping", "getAnyMapping", "()Lorg/eclipse/persistence/internal/oxm/mappings/AnyCollectionMapping;", true);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/oxm/XMLChoiceCollectionMappingUnmarshalNodeValue", "nestedMapping", "Lorg/eclipse/persistence/internal/oxm/mappings/Mapping;");
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/oxm/XMLChoiceCollectionMappingUnmarshalNodeValue", "nestedMapping", "Lorg/eclipse/persistence/internal/oxm/mappings/Mapping;");
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(INSTANCEOF, "org/eclipse/persistence/internal/oxm/mappings/BinaryDataCollectionMapping");
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/internal/oxm/XMLBinaryDataCollectionMappingNodeValue");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/persistence/internal/oxm/mappings/BinaryDataCollectionMapping");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/oxm/XMLBinaryDataCollectionMappingNodeValue", "<init>", "(Lorg/eclipse/persistence/internal/oxm/mappings/BinaryDataCollectionMapping;)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/oxm/XMLChoiceCollectionMappingUnmarshalNodeValue", "choiceElementNodeValue", "Lorg/eclipse/persistence/internal/oxm/NodeValue;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/oxm/XMLChoiceCollectionMappingUnmarshalNodeValue", "choiceElementNodeValue", "Lorg/eclipse/persistence/internal/oxm/NodeValue;");
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/oxm/XMLChoiceCollectionMappingUnmarshalNodeValue", "choiceElementMarshalNodeValue", "Lorg/eclipse/persistence/internal/oxm/NodeValue;");
Label label2 = new Label();
methodVisitor.visitJumpInsn(GOTO, label2);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"org/eclipse/persistence/internal/oxm/mappings/Mapping"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(INSTANCEOF, "org/eclipse/persistence/internal/oxm/mappings/DirectCollectionMapping");
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/internal/oxm/XMLCompositeDirectCollectionMappingNodeValue");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/persistence/internal/oxm/mappings/DirectCollectionMapping");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/oxm/XMLCompositeDirectCollectionMappingNodeValue", "<init>", "(Lorg/eclipse/persistence/internal/oxm/mappings/DirectCollectionMapping;)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/oxm/XMLChoiceCollectionMappingUnmarshalNodeValue", "choiceElementNodeValue", "Lorg/eclipse/persistence/internal/oxm/NodeValue;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/oxm/XMLChoiceCollectionMappingUnmarshalNodeValue", "choiceElementNodeValue", "Lorg/eclipse/persistence/internal/oxm/NodeValue;");
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/oxm/XMLChoiceCollectionMappingUnmarshalNodeValue", "choiceElementMarshalNodeValue", "Lorg/eclipse/persistence/internal/oxm/NodeValue;");
methodVisitor.visitJumpInsn(GOTO, label2);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(INSTANCEOF, "org/eclipse/persistence/internal/oxm/mappings/CompositeCollectionMapping");
Label label4 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/internal/oxm/XMLCompositeCollectionMappingNodeValue");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/persistence/internal/oxm/mappings/CompositeCollectionMapping");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/oxm/XMLCompositeCollectionMappingNodeValue", "<init>", "(Lorg/eclipse/persistence/internal/oxm/mappings/CompositeCollectionMapping;)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/oxm/XMLChoiceCollectionMappingUnmarshalNodeValue", "choiceElementNodeValue", "Lorg/eclipse/persistence/internal/oxm/NodeValue;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/oxm/XMLChoiceCollectionMappingUnmarshalNodeValue", "choiceElementNodeValue", "Lorg/eclipse/persistence/internal/oxm/NodeValue;");
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/oxm/XMLChoiceCollectionMappingUnmarshalNodeValue", "choiceElementMarshalNodeValue", "Lorg/eclipse/persistence/internal/oxm/NodeValue;");
methodVisitor.visitJumpInsn(GOTO, label2);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(INSTANCEOF, "org/eclipse/persistence/internal/oxm/mappings/AnyCollectionMapping");
Label label5 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label5);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/internal/oxm/XMLAnyCollectionMappingNodeValue");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/persistence/internal/oxm/mappings/AnyCollectionMapping");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/oxm/XMLAnyCollectionMappingNodeValue", "<init>", "(Lorg/eclipse/persistence/internal/oxm/mappings/AnyCollectionMapping;)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/oxm/XMLChoiceCollectionMappingUnmarshalNodeValue", "choiceElementNodeValue", "Lorg/eclipse/persistence/internal/oxm/NodeValue;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/oxm/XMLChoiceCollectionMappingUnmarshalNodeValue", "choiceElementNodeValue", "Lorg/eclipse/persistence/internal/oxm/NodeValue;");
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/oxm/XMLChoiceCollectionMappingUnmarshalNodeValue", "choiceElementMarshalNodeValue", "Lorg/eclipse/persistence/internal/oxm/NodeValue;");
methodVisitor.visitJumpInsn(GOTO, label2);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/internal/oxm/XMLCollectionReferenceMappingNodeValue");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/persistence/internal/oxm/mappings/CollectionReferenceMapping");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/oxm/XMLChoiceCollectionMappingUnmarshalNodeValue", "xmlField", "Lorg/eclipse/persistence/internal/oxm/mappings/Field;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/oxm/XMLCollectionReferenceMappingNodeValue", "<init>", "(Lorg/eclipse/persistence/internal/oxm/mappings/CollectionReferenceMapping;Lorg/eclipse/persistence/internal/oxm/mappings/Field;)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/oxm/XMLChoiceCollectionMappingUnmarshalNodeValue", "choiceElementNodeValue", "Lorg/eclipse/persistence/internal/oxm/NodeValue;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/persistence/internal/oxm/mappings/CollectionReferenceMapping");
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/internal/oxm/mappings/CollectionReferenceMapping", "usesSingleNode", "()Z", true);
Label label6 = new Label();
methodVisitor.visitJumpInsn(IFNE, label6);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/internal/oxm/mappings/CollectionReferenceMapping", "getFields", "()Ljava/util/List;", true);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "size", "()I", true);
methodVisitor.visitInsn(ICONST_1);
Label label7 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPNE, label7);
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"org/eclipse/persistence/internal/oxm/mappings/CollectionReferenceMapping"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/internal/oxm/XMLCollectionReferenceMappingNodeValue");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/oxm/XMLChoiceCollectionMappingUnmarshalNodeValue", "xmlField", "Lorg/eclipse/persistence/internal/oxm/mappings/Field;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/oxm/XMLCollectionReferenceMappingNodeValue", "<init>", "(Lorg/eclipse/persistence/internal/oxm/mappings/CollectionReferenceMapping;Lorg/eclipse/persistence/internal/oxm/mappings/Field;)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/oxm/XMLChoiceCollectionMappingUnmarshalNodeValue", "choiceElementMarshalNodeValue", "Lorg/eclipse/persistence/internal/oxm/NodeValue;");
methodVisitor.visitJumpInsn(GOTO, label2);
methodVisitor.visitLabel(label7);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/internal/oxm/XMLCollectionReferenceMappingMarshalNodeValue");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/persistence/internal/oxm/mappings/CollectionReferenceMapping");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/oxm/XMLCollectionReferenceMappingMarshalNodeValue", "<init>", "(Lorg/eclipse/persistence/internal/oxm/mappings/CollectionReferenceMapping;)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/oxm/XMLChoiceCollectionMappingUnmarshalNodeValue", "choiceElementMarshalNodeValue", "Lorg/eclipse/persistence/internal/oxm/NodeValue;");
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setContainerNodeValue", "(Lorg/eclipse/persistence/internal/oxm/XMLChoiceCollectionMappingUnmarshalNodeValue;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/oxm/XMLChoiceCollectionMappingUnmarshalNodeValue", "containerNodeValue", "Lorg/eclipse/persistence/internal/oxm/ContainerValue;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setNullValue", "(Ljava/lang/Object;Lorg/eclipse/persistence/core/sessions/CoreSession;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/oxm/XMLChoiceCollectionMappingUnmarshalNodeValue", "xmlChoiceCollectionMapping", "Lorg/eclipse/persistence/internal/oxm/mappings/ChoiceCollectionMapping;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/internal/oxm/mappings/ChoiceCollectionMapping", "setAttributeValueInObject", "(Ljava/lang/Object;Ljava/lang/Object;)V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "endElement", "(Lorg/eclipse/persistence/internal/oxm/XPathFragment;Lorg/eclipse/persistence/internal/oxm/record/UnmarshalRecord;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/oxm/XMLChoiceCollectionMappingUnmarshalNodeValue", "containerNodeValue", "Lorg/eclipse/persistence/internal/oxm/ContainerValue;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/internal/oxm/record/UnmarshalRecord", "getContainerInstance", "(Lorg/eclipse/persistence/internal/oxm/ContainerValue;)Ljava/lang/Object;", true);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/oxm/XMLChoiceCollectionMappingUnmarshalNodeValue", "xmlChoiceCollectionMapping", "Lorg/eclipse/persistence/internal/oxm/mappings/ChoiceCollectionMapping;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/internal/oxm/mappings/ChoiceCollectionMapping", "getConverter", "()Lorg/eclipse/persistence/core/mappings/converters/CoreConverter;", true);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/internal/oxm/record/UnmarshalRecord", "getUnmarshalContext", "()Lorg/eclipse/persistence/internal/oxm/record/UnmarshalContext;", true);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/internal/oxm/ChoiceUnmarshalContext");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/oxm/XMLChoiceCollectionMappingUnmarshalNodeValue", "xmlChoiceCollectionMapping", "Lorg/eclipse/persistence/internal/oxm/mappings/ChoiceCollectionMapping;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/oxm/ChoiceUnmarshalContext", "<init>", "(Lorg/eclipse/persistence/internal/oxm/record/UnmarshalContext;Lorg/eclipse/persistence/internal/oxm/mappings/XMLConverterMapping;)V", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/internal/oxm/record/UnmarshalRecord", "setUnmarshalContext", "(Lorg/eclipse/persistence/internal/oxm/record/UnmarshalContext;)V", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/oxm/XMLChoiceCollectionMappingUnmarshalNodeValue", "choiceElementNodeValue", "Lorg/eclipse/persistence/internal/oxm/NodeValue;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/oxm/NodeValue", "endElement", "(Lorg/eclipse/persistence/internal/oxm/XPathFragment;Lorg/eclipse/persistence/internal/oxm/record/UnmarshalRecord;Ljava/lang/Object;)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/internal/oxm/record/UnmarshalRecord", "setUnmarshalContext", "(Lorg/eclipse/persistence/internal/oxm/record/UnmarshalContext;)V", true);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/lang/Object"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/oxm/XMLChoiceCollectionMappingUnmarshalNodeValue", "choiceElementNodeValue", "Lorg/eclipse/persistence/internal/oxm/NodeValue;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/oxm/NodeValue", "endElement", "(Lorg/eclipse/persistence/internal/oxm/XPathFragment;Lorg/eclipse/persistence/internal/oxm/record/UnmarshalRecord;Ljava/lang/Object;)V", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "startElement", "(Lorg/eclipse/persistence/internal/oxm/XPathFragment;Lorg/eclipse/persistence/internal/oxm/record/UnmarshalRecord;Lorg/xml/sax/Attributes;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/oxm/XMLChoiceCollectionMappingUnmarshalNodeValue", "choiceElementNodeValue", "Lorg/eclipse/persistence/internal/oxm/NodeValue;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/oxm/NodeValue", "startElement", "(Lorg/eclipse/persistence/internal/oxm/XPathFragment;Lorg/eclipse/persistence/internal/oxm/record/UnmarshalRecord;Lorg/xml/sax/Attributes;)Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setXPathNode", "(Lorg/eclipse/persistence/internal/oxm/XPathNode;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/oxm/MappingNodeValue", "setXPathNode", "(Lorg/eclipse/persistence/internal/oxm/XPathNode;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/oxm/XMLChoiceCollectionMappingUnmarshalNodeValue", "choiceElementNodeValue", "Lorg/eclipse/persistence/internal/oxm/NodeValue;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/oxm/NodeValue", "setXPathNode", "(Lorg/eclipse/persistence/internal/oxm/XPathNode;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getContainerInstance", "()Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/oxm/XMLChoiceCollectionMappingUnmarshalNodeValue", "getContainerPolicy", "()Lorg/eclipse/persistence/internal/core/queries/CoreContainerPolicy;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/internal/core/queries/CoreContainerPolicy", "containerInstance", "()Ljava/lang/Object;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setContainerInstance", "(Ljava/lang/Object;Ljava/lang/Object;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/oxm/XMLChoiceCollectionMappingUnmarshalNodeValue", "xmlChoiceCollectionMapping", "Lorg/eclipse/persistence/internal/oxm/mappings/ChoiceCollectionMapping;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/internal/oxm/mappings/ChoiceCollectionMapping", "setAttributeValueInObject", "(Ljava/lang/Object;Ljava/lang/Object;)V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getContainerPolicy", "()Lorg/eclipse/persistence/internal/core/queries/CoreContainerPolicy;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/oxm/XMLChoiceCollectionMappingUnmarshalNodeValue", "xmlChoiceCollectionMapping", "Lorg/eclipse/persistence/internal/oxm/mappings/ChoiceCollectionMapping;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/internal/oxm/mappings/ChoiceCollectionMapping", "getContainerPolicy", "()Lorg/eclipse/persistence/internal/core/queries/CoreContainerPolicy;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isContainerValue", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "marshalSingleValue", "(Lorg/eclipse/persistence/internal/oxm/XPathFragment;Lorg/eclipse/persistence/internal/oxm/record/MarshalRecord;Ljava/lang/Object;Ljava/lang/Object;Lorg/eclipse/persistence/internal/core/sessions/CoreAbstractSession;Lorg/eclipse/persistence/internal/oxm/NamespaceResolver;Lorg/eclipse/persistence/internal/oxm/record/MarshalContext;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 8);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "marshal", "(Lorg/eclipse/persistence/internal/oxm/XPathFragment;Lorg/eclipse/persistence/internal/oxm/record/MarshalRecord;Ljava/lang/Object;Lorg/eclipse/persistence/internal/core/sessions/CoreAbstractSession;Lorg/eclipse/persistence/internal/oxm/NamespaceResolver;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 6);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getChoiceElementNodeValue", "()Lorg/eclipse/persistence/internal/oxm/NodeValue;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/oxm/XMLChoiceCollectionMappingUnmarshalNodeValue", "choiceElementNodeValue", "Lorg/eclipse/persistence/internal/oxm/NodeValue;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getChoiceElementMarshalNodeValue", "()Lorg/eclipse/persistence/internal/oxm/NodeValue;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/oxm/XMLChoiceCollectionMappingUnmarshalNodeValue", "choiceElementMarshalNodeValue", "Lorg/eclipse/persistence/internal/oxm/NodeValue;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isUnmarshalNodeValue", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isWrapperAllowedAsCollectionName", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isMarshalNodeValue", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getMapping", "()Lorg/eclipse/persistence/internal/oxm/mappings/ChoiceCollectionMapping;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/oxm/XMLChoiceCollectionMappingUnmarshalNodeValue", "xmlChoiceCollectionMapping", "Lorg/eclipse/persistence/internal/oxm/mappings/ChoiceCollectionMapping;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getReuseContainer", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/oxm/XMLChoiceCollectionMappingUnmarshalNodeValue", "getMapping", "()Lorg/eclipse/persistence/internal/oxm/mappings/ChoiceCollectionMapping;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/internal/oxm/mappings/ChoiceCollectionMapping", "getReuseContainer", "()Z", true);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setFieldToNodeValues", "(Ljava/util/Map;)V", "(Ljava/util/Map<Lorg/eclipse/persistence/internal/oxm/mappings/Field;Lorg/eclipse/persistence/internal/oxm/NodeValue;>;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/oxm/XMLChoiceCollectionMappingUnmarshalNodeValue", "fieldToNodeValues", "Ljava/util/Map;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getAllNodeValues", "()Ljava/util/Collection;", "()Ljava/util/Collection<Lorg/eclipse/persistence/internal/oxm/NodeValue;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/oxm/XMLChoiceCollectionMappingUnmarshalNodeValue", "fieldToNodeValues", "Ljava/util/Map;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "values", "()Ljava/util/Collection;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "attribute", "(Lorg/eclipse/persistence/internal/oxm/record/UnmarshalRecord;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/oxm/XMLChoiceCollectionMappingUnmarshalNodeValue", "choiceElementNodeValue", "Lorg/eclipse/persistence/internal/oxm/NodeValue;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/oxm/NodeValue", "attribute", "(Lorg/eclipse/persistence/internal/oxm/record/UnmarshalRecord;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setIsMixedNodeValue", "(Z)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/oxm/XMLChoiceCollectionMappingUnmarshalNodeValue", "isMixedNodeValue", "Z");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isMixedContentNodeValue", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/oxm/XMLChoiceCollectionMappingUnmarshalNodeValue", "isMixedNodeValue", "Z");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setIndex", "(I)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/oxm/XMLChoiceCollectionMappingUnmarshalNodeValue", "index", "I");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getIndex", "()I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/oxm/XMLChoiceCollectionMappingUnmarshalNodeValue", "index", "I");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isDefaultEmptyContainer", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/oxm/XMLChoiceCollectionMappingUnmarshalNodeValue", "getMapping", "()Lorg/eclipse/persistence/internal/oxm/mappings/ChoiceCollectionMapping;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/internal/oxm/mappings/ChoiceCollectionMapping", "isDefaultEmptyContainer", "()Z", true);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "getMapping", "()Lorg/eclipse/persistence/internal/oxm/mappings/Mapping;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/oxm/XMLChoiceCollectionMappingUnmarshalNodeValue", "getMapping", "()Lorg/eclipse/persistence/internal/oxm/mappings/ChoiceCollectionMapping;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
