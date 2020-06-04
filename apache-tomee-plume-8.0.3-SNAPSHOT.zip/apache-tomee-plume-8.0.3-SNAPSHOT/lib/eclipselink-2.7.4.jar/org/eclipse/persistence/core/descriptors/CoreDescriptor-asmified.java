package asm.org.eclipse.persistence.core.descriptors;
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
public class CoreDescriptorDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER | ACC_ABSTRACT, "org/eclipse/persistence/core/descriptors/CoreDescriptor", "<ATTRIBUTE_GROUP:Lorg/eclipse/persistence/core/queries/CoreAttributeGroup;DESCRIPTOR_EVENT_MANAGER:Lorg/eclipse/persistence/core/descriptors/CoreDescriptorEventManager;FIELD::Lorg/eclipse/persistence/internal/core/helper/CoreField;INHERITANCE_POLICY:Lorg/eclipse/persistence/core/descriptors/CoreInheritancePolicy;INSTANTIATION_POLICY:Lorg/eclipse/persistence/internal/core/descriptors/CoreInstantiationPolicy;LIST::Ljava/util/List;OBJECT_BUILDER:Lorg/eclipse/persistence/internal/core/descriptors/CoreObjectBuilder;>Ljava/lang/Object;Ljava/io/Serializable;", "java/lang/Object", new String[] { "java/io/Serializable" });

{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "eventManager", "Lorg/eclipse/persistence/core/descriptors/CoreDescriptorEventManager;", "TDESCRIPTOR_EVENT_MANAGER;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "field", "Lorg/eclipse/persistence/internal/core/helper/CoreField;", "TFIELD;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "instantiationPolicy", "Lorg/eclipse/persistence/internal/core/descriptors/CoreInstantiationPolicy;", "TINSTANTIATION_POLICY;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "inheritancePolicy", "Lorg/eclipse/persistence/core/descriptors/CoreInheritancePolicy;", "TINHERITANCE_POLICY;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "objectBuilder", "Lorg/eclipse/persistence/internal/core/descriptors/CoreObjectBuilder;", "TOBJECT_BUILDER;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "attributeGroups", "Ljava/util/Map;", "Ljava/util/Map<Ljava/lang/String;TATTRIBUTE_GROUP;>;", null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "addAttributeGroup", "(Lorg/eclipse/persistence/core/queries/CoreAttributeGroup;)V", "(TATTRIBUTE_GROUP;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/core/descriptors/CoreDescriptor", "attributeGroups", "Ljava/util/Map;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "java/util/HashMap");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/HashMap", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/core/descriptors/CoreDescriptor", "attributeGroups", "Ljava/util/Map;");
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/core/descriptors/CoreDescriptor", "attributeGroups", "Ljava/util/Map;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/core/queries/CoreAttributeGroup", "getName", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getAttributeGroup", "(Ljava/lang/String;)Lorg/eclipse/persistence/core/queries/CoreAttributeGroup;", "(Ljava/lang/String;)TATTRIBUTE_GROUP;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/core/descriptors/CoreDescriptor", "attributeGroups", "Ljava/util/Map;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/core/descriptors/CoreDescriptor", "attributeGroups", "Ljava/util/Map;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/persistence/core/queries/CoreAttributeGroup");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "java/lang/IllegalArgumentException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("null_argument_get_attributegroup");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/internal/localization/ExceptionLocalization", "buildMessage", "(Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/IllegalArgumentException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getAttributeGroups", "()Ljava/util/Map;", "()Ljava/util/Map<Ljava/lang/String;TATTRIBUTE_GROUP;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/core/descriptors/CoreDescriptor", "attributeGroups", "Ljava/util/Map;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getEventManager", "()Lorg/eclipse/persistence/core/descriptors/CoreDescriptorEventManager;", "()TDESCRIPTOR_EVENT_MANAGER;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getInheritancePolicy", "()Lorg/eclipse/persistence/core/descriptors/CoreInheritancePolicy;", "()TINHERITANCE_POLICY;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getInstantiationPolicy", "()Lorg/eclipse/persistence/internal/core/descriptors/CoreInstantiationPolicy;", "()TINSTANTIATION_POLICY;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getJavaClass", "()Ljava/lang/Class;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getObjectBuilder", "()Lorg/eclipse/persistence/internal/core/descriptors/CoreObjectBuilder;", "()TOBJECT_BUILDER;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getPrimaryKeyFieldNames", "()Ljava/util/List;", "()Ljava/util/List<Ljava/lang/String;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getPrimaryKeyFields", "()Ljava/util/List;", "()Ljava/util/List<TFIELD;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getTypedField", "(Lorg/eclipse/persistence/internal/core/helper/CoreField;)Lorg/eclipse/persistence/internal/core/helper/CoreField;", "(TFIELD;)TFIELD;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "hasEventManager", "()Z", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "hasInheritance", "()Z", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setEventManager", "(Lorg/eclipse/persistence/core/descriptors/CoreDescriptorEventManager;)V", "(TDESCRIPTOR_EVENT_MANAGER;)V", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setInheritancePolicy", "(Lorg/eclipse/persistence/core/descriptors/CoreInheritancePolicy;)V", "(TINHERITANCE_POLICY;)V", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setInstantiationPolicy", "(Lorg/eclipse/persistence/internal/core/descriptors/CoreInstantiationPolicy;)V", "(TINSTANTIATION_POLICY;)V", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setJavaClass", "(Ljava/lang/Class;)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED | ACC_ABSTRACT, "setObjectBuilder", "(Lorg/eclipse/persistence/internal/core/descriptors/CoreObjectBuilder;)V", "(TOBJECT_BUILDER;)V", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setPrimaryKeyFieldNames", "(Ljava/util/List;)V", "(TLIST;)V", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setPrimaryKeyFields", "(Ljava/util/List;)V", "(Ljava/util/List<TFIELD;>;)V", null);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
