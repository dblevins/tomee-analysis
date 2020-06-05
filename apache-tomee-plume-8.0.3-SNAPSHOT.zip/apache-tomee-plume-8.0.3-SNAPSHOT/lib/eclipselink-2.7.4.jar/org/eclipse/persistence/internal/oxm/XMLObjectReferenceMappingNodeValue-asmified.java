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
public class XMLObjectReferenceMappingNodeValueDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/eclipse/persistence/internal/oxm/XMLObjectReferenceMappingNodeValue", null, "org/eclipse/persistence/internal/oxm/MappingNodeValue", null);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "xmlObjectReferenceMapping", "Lorg/eclipse/persistence/internal/oxm/mappings/ObjectReferenceMapping;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "xmlField", "Lorg/eclipse/persistence/internal/oxm/mappings/Field;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/eclipse/persistence/internal/oxm/mappings/ObjectReferenceMapping;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/oxm/MappingNodeValue", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/oxm/XMLObjectReferenceMappingNodeValue", "xmlObjectReferenceMapping", "Lorg/eclipse/persistence/internal/oxm/mappings/ObjectReferenceMapping;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/eclipse/persistence/internal/oxm/mappings/ObjectReferenceMapping;Lorg/eclipse/persistence/internal/oxm/mappings/Field;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/oxm/MappingNodeValue", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/oxm/XMLObjectReferenceMappingNodeValue", "xmlObjectReferenceMapping", "Lorg/eclipse/persistence/internal/oxm/mappings/ObjectReferenceMapping;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/oxm/XMLObjectReferenceMappingNodeValue", "xmlField", "Lorg/eclipse/persistence/internal/oxm/mappings/Field;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "attribute", "(Lorg/eclipse/persistence/internal/oxm/record/UnmarshalRecord;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 4);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/internal/oxm/record/UnmarshalRecord", "getXMLReader", "()Lorg/eclipse/persistence/internal/oxm/record/XMLReader;", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/oxm/XMLObjectReferenceMappingNodeValue", "xmlField", "Lorg/eclipse/persistence/internal/oxm/mappings/Field;");
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/internal/oxm/record/UnmarshalRecord", "getSession", "()Lorg/eclipse/persistence/internal/core/sessions/CoreAbstractSession;", true);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/core/sessions/CoreAbstractSession", "getDatasourcePlatform", "()Lorg/eclipse/persistence/internal/core/databaseaccess/CorePlatform;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/internal/core/databaseaccess/CorePlatform", "getConversionManager", "()Lorg/eclipse/persistence/internal/core/helper/CoreConversionManager;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/persistence/internal/oxm/ConversionManager");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/oxm/record/XMLReader", "convertValueBasedOnSchemaType", "(Lorg/eclipse/persistence/internal/oxm/mappings/Field;Ljava/lang/Object;Lorg/eclipse/persistence/internal/oxm/ConversionManager;Lorg/eclipse/persistence/internal/oxm/record/AbstractUnmarshalRecord;)Ljava/lang/Object;", false);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/oxm/XMLObjectReferenceMappingNodeValue", "xmlObjectReferenceMapping", "Lorg/eclipse/persistence/internal/oxm/mappings/ObjectReferenceMapping;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/oxm/XMLObjectReferenceMappingNodeValue", "xmlField", "Lorg/eclipse/persistence/internal/oxm/mappings/Field;");
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/internal/oxm/record/UnmarshalRecord", "getSession", "()Lorg/eclipse/persistence/internal/core/sessions/CoreAbstractSession;", true);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/internal/oxm/mappings/ObjectReferenceMapping", "buildReference", "(Lorg/eclipse/persistence/internal/oxm/record/UnmarshalRecord;Lorg/eclipse/persistence/internal/oxm/mappings/Field;Ljava/lang/Object;Lorg/eclipse/persistence/internal/core/sessions/CoreAbstractSession;)V", true);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 6);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "endElement", "(Lorg/eclipse/persistence/internal/oxm/XPathFragment;Lorg/eclipse/persistence/internal/oxm/record/UnmarshalRecord;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/oxm/XMLObjectReferenceMappingNodeValue", "xmlField", "Lorg/eclipse/persistence/internal/oxm/mappings/Field;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/internal/oxm/mappings/Field", "getLastXPathFragment", "()Lorg/eclipse/persistence/internal/oxm/XPathFragment;", true);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/oxm/XPathFragment", "nameIsText", "()Z", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/internal/oxm/record/UnmarshalRecord", "getCharacters", "()Ljava/lang/CharSequence;", true);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/lang/CharSequence", "toString", "()Ljava/lang/String;", true);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "trim", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/internal/oxm/record/UnmarshalRecord", "resetStringBuffer", "()V", true);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/internal/oxm/record/UnmarshalRecord", "getConversionManager", "()Lorg/eclipse/persistence/internal/oxm/ConversionManager;", true);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/internal/oxm/record/UnmarshalRecord", "getTypeQName", "()Ljavax/xml/namespace/QName;", true);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/oxm/XMLObjectReferenceMappingNodeValue", "xmlField", "Lorg/eclipse/persistence/internal/oxm/mappings/Field;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/internal/oxm/record/UnmarshalRecord", "getTypeQName", "()Ljavax/xml/namespace/QName;", true);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/internal/oxm/mappings/Field", "getJavaClass", "(Ljavax/xml/namespace/QName;Lorg/eclipse/persistence/internal/oxm/ConversionManager;)Ljava/lang/Class;", true);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/internal/oxm/record/UnmarshalRecord", "getTypeQName", "()Ljavax/xml/namespace/QName;", true);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/internal/oxm/ConversionManager", "convertObject", "(Ljava/lang/Object;Ljava/lang/Class;Ljavax/xml/namespace/QName;)Ljava/lang/Object;", true);
methodVisitor.visitVarInsn(ASTORE, 3);
Label label2 = new Label();
methodVisitor.visitJumpInsn(GOTO, label2);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {"java/lang/Object", "org/eclipse/persistence/internal/oxm/ConversionManager"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/internal/oxm/record/UnmarshalRecord", "getXMLReader", "()Lorg/eclipse/persistence/internal/oxm/record/XMLReader;", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/oxm/XMLObjectReferenceMappingNodeValue", "xmlField", "Lorg/eclipse/persistence/internal/oxm/mappings/Field;");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/oxm/record/XMLReader", "convertValueBasedOnSchemaType", "(Lorg/eclipse/persistence/internal/oxm/mappings/Field;Ljava/lang/Object;Lorg/eclipse/persistence/internal/oxm/ConversionManager;Lorg/eclipse/persistence/internal/oxm/record/AbstractUnmarshalRecord;)Ljava/lang/Object;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/oxm/XMLObjectReferenceMappingNodeValue", "xmlObjectReferenceMapping", "Lorg/eclipse/persistence/internal/oxm/mappings/ObjectReferenceMapping;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/oxm/XMLObjectReferenceMappingNodeValue", "xmlField", "Lorg/eclipse/persistence/internal/oxm/mappings/Field;");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/internal/oxm/record/UnmarshalRecord", "getSession", "()Lorg/eclipse/persistence/internal/core/sessions/CoreAbstractSession;", true);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/internal/oxm/mappings/ObjectReferenceMapping", "buildReference", "(Lorg/eclipse/persistence/internal/oxm/record/UnmarshalRecord;Lorg/eclipse/persistence/internal/oxm/mappings/Field;Ljava/lang/Object;Lorg/eclipse/persistence/internal/core/sessions/CoreAbstractSession;)V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 6);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isOwningNode", "(Lorg/eclipse/persistence/internal/oxm/XPathFragment;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/oxm/XPathFragment", "isAttribute", "()Z", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/oxm/XPathFragment", "nameIsText", "()Z", false);
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "marshal", "(Lorg/eclipse/persistence/internal/oxm/XPathFragment;Lorg/eclipse/persistence/internal/oxm/record/MarshalRecord;Ljava/lang/Object;Lorg/eclipse/persistence/internal/core/sessions/CoreAbstractSession;Lorg/eclipse/persistence/internal/oxm/NamespaceResolver;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/internal/oxm/record/ObjectMarshalContext", "getInstance", "()Lorg/eclipse/persistence/internal/oxm/record/ObjectMarshalContext;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/oxm/XMLObjectReferenceMappingNodeValue", "marshal", "(Lorg/eclipse/persistence/internal/oxm/XPathFragment;Lorg/eclipse/persistence/internal/oxm/record/MarshalRecord;Ljava/lang/Object;Lorg/eclipse/persistence/internal/core/sessions/CoreAbstractSession;Lorg/eclipse/persistence/internal/oxm/NamespaceResolver;Lorg/eclipse/persistence/internal/oxm/record/MarshalContext;)Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(7, 6);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "marshal", "(Lorg/eclipse/persistence/internal/oxm/XPathFragment;Lorg/eclipse/persistence/internal/oxm/record/MarshalRecord;Ljava/lang/Object;Lorg/eclipse/persistence/internal/core/sessions/CoreAbstractSession;Lorg/eclipse/persistence/internal/oxm/NamespaceResolver;Lorg/eclipse/persistence/internal/oxm/record/MarshalContext;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/oxm/XMLObjectReferenceMappingNodeValue", "xmlObjectReferenceMapping", "Lorg/eclipse/persistence/internal/oxm/mappings/ObjectReferenceMapping;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/internal/oxm/mappings/ObjectReferenceMapping", "isReadOnly", "()Z", true);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/oxm/XMLObjectReferenceMappingNodeValue", "xmlObjectReferenceMapping", "Lorg/eclipse/persistence/internal/oxm/mappings/ObjectReferenceMapping;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/internal/oxm/record/MarshalContext", "getAttributeValue", "(Ljava/lang/Object;Lorg/eclipse/persistence/internal/oxm/mappings/Mapping;)Ljava/lang/Object;", true);
methodVisitor.visitVarInsn(ASTORE, 7);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/oxm/XMLObjectReferenceMappingNodeValue", "marshalSingleValue", "(Lorg/eclipse/persistence/internal/oxm/XPathFragment;Lorg/eclipse/persistence/internal/oxm/record/MarshalRecord;Ljava/lang/Object;Ljava/lang/Object;Lorg/eclipse/persistence/internal/core/sessions/CoreAbstractSession;Lorg/eclipse/persistence/internal/oxm/NamespaceResolver;Lorg/eclipse/persistence/internal/oxm/record/MarshalContext;)Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(8, 8);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "marshalSingleValue", "(Lorg/eclipse/persistence/internal/oxm/XPathFragment;Lorg/eclipse/persistence/internal/oxm/record/MarshalRecord;Ljava/lang/Object;Ljava/lang/Object;Lorg/eclipse/persistence/internal/core/sessions/CoreAbstractSession;Lorg/eclipse/persistence/internal/oxm/NamespaceResolver;Lorg/eclipse/persistence/internal/oxm/record/MarshalContext;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/oxm/XMLObjectReferenceMappingNodeValue", "xmlObjectReferenceMapping", "Lorg/eclipse/persistence/internal/oxm/mappings/ObjectReferenceMapping;");
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/oxm/XMLObjectReferenceMappingNodeValue", "xmlField", "Lorg/eclipse/persistence/internal/oxm/mappings/Field;");
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/internal/oxm/mappings/ObjectReferenceMapping", "buildFieldValue", "(Ljava/lang/Object;Lorg/eclipse/persistence/internal/oxm/mappings/Field;Lorg/eclipse/persistence/internal/core/sessions/CoreAbstractSession;)Ljava/lang/Object;", true);
methodVisitor.visitVarInsn(ASTORE, 8);
methodVisitor.visitVarInsn(ALOAD, 8);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 4);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/oxm/XMLObjectReferenceMappingNodeValue", "xmlObjectReferenceMapping", "Lorg/eclipse/persistence/internal/oxm/mappings/ObjectReferenceMapping;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/internal/oxm/mappings/ObjectReferenceMapping", "getSourceToTargetKeyFieldAssociations", "()Ljava/util/Map;", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/oxm/XMLObjectReferenceMappingNodeValue", "xmlField", "Lorg/eclipse/persistence/internal/oxm/mappings/Field;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/persistence/internal/oxm/mappings/Field");
methodVisitor.visitVarInsn(ASTORE, 9);
methodVisitor.visitVarInsn(ALOAD, 9);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label2);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/core/sessions/CoreAbstractSession", "getDescriptor", "(Ljava/lang/Object;)Lorg/eclipse/persistence/core/descriptors/CoreDescriptor;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/persistence/internal/oxm/mappings/Descriptor");
methodVisitor.visitVarInsn(ASTORE, 10);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/internal/oxm/record/MarshalRecord", "getMarshaller", "()Lorg/eclipse/persistence/internal/oxm/Marshaller;", true);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/oxm/Marshaller", "getContext", "()Lorg/eclipse/persistence/internal/oxm/Context;", false);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 10);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/internal/oxm/mappings/Descriptor", "getPrimaryKeyFields", "()Ljava/util/List;", true);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "get", "(I)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/persistence/internal/core/helper/CoreField");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/internal/core/helper/CoreField", "getName", "()Ljava/lang/String;", true);
methodVisitor.visitVarInsn(ALOAD, 10);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/internal/oxm/mappings/Descriptor", "getNamespaceResolver", "()Lorg/eclipse/persistence/internal/oxm/NamespaceResolver;", true);
methodVisitor.visitLdcInsn(Type.getType("Ljava/lang/Object;"));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/oxm/Context", "getValueByXPath", "(Ljava/lang/Object;Ljava/lang/String;Lorg/eclipse/persistence/internal/oxm/NamespaceResolver;Ljava/lang/Class;)Ljava/lang/Object;", false);
methodVisitor.visitVarInsn(ASTORE, 8);
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {"java/lang/Object", "org/eclipse/persistence/internal/oxm/mappings/Field"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/internal/oxm/record/MarshalRecord", "getMarshaller", "()Lorg/eclipse/persistence/internal/oxm/Marshaller;", true);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/oxm/Marshaller", "getContext", "()Lorg/eclipse/persistence/internal/oxm/Context;", false);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 9);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/internal/oxm/mappings/Field", "getXPath", "()Ljava/lang/String;", true);
methodVisitor.visitVarInsn(ALOAD, 9);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/internal/oxm/mappings/Field", "getNamespaceResolver", "()Lorg/eclipse/persistence/internal/oxm/NamespaceResolver;", true);
methodVisitor.visitLdcInsn(Type.getType("Ljava/lang/Object;"));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/oxm/Context", "getValueByXPath", "(Ljava/lang/Object;Ljava/lang/String;Lorg/eclipse/persistence/internal/oxm/NamespaceResolver;Ljava/lang/Class;)Ljava/lang/Object;", false);
methodVisitor.visitVarInsn(ASTORE, 8);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/oxm/XMLObjectReferenceMappingNodeValue", "xmlField", "Lorg/eclipse/persistence/internal/oxm/mappings/Field;");
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/internal/oxm/mappings/Field", "getSchemaTypeForValue", "(Ljava/lang/Object;Lorg/eclipse/persistence/internal/core/sessions/CoreAbstractSession;)Ljavax/xml/namespace/QName;", true);
methodVisitor.visitVarInsn(ASTORE, 9);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/internal/oxm/record/MarshalRecord", "openStartGroupingElements", "(Lorg/eclipse/persistence/internal/oxm/NamespaceResolver;)Lorg/eclipse/persistence/internal/oxm/XPathFragment;", true);
methodVisitor.visitVarInsn(ASTORE, 10);
methodVisitor.visitVarInsn(ALOAD, 1);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label3);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/oxm/XPathFragment", "isAttribute", "()Z", false);
methodVisitor.visitJumpInsn(IFEQ, label3);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitVarInsn(ALOAD, 9);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/internal/oxm/record/MarshalRecord", "attribute", "(Lorg/eclipse/persistence/internal/oxm/XPathFragment;Lorg/eclipse/persistence/internal/oxm/NamespaceResolver;Ljava/lang/Object;Ljavax/xml/namespace/QName;)V", true);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 10);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/internal/oxm/record/MarshalRecord", "closeStartGroupingElements", "(Lorg/eclipse/persistence/internal/oxm/XPathFragment;)V", true);
Label label4 = new Label();
methodVisitor.visitJumpInsn(GOTO, label4);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {"javax/xml/namespace/QName", "org/eclipse/persistence/internal/oxm/XPathFragment"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 10);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/internal/oxm/record/MarshalRecord", "closeStartGroupingElements", "(Lorg/eclipse/persistence/internal/oxm/XPathFragment;)V", true);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 9);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/internal/oxm/record/MarshalRecord", "characters", "(Ljavax/xml/namespace/QName;Ljava/lang/Object;Ljava/lang/String;Z)V", true);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(5, 11);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getMapping", "()Lorg/eclipse/persistence/internal/oxm/mappings/ObjectReferenceMapping;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/oxm/XMLObjectReferenceMappingNodeValue", "xmlObjectReferenceMapping", "Lorg/eclipse/persistence/internal/oxm/mappings/ObjectReferenceMapping;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "getMapping", "()Lorg/eclipse/persistence/internal/oxm/mappings/Mapping;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/oxm/XMLObjectReferenceMappingNodeValue", "getMapping", "()Lorg/eclipse/persistence/internal/oxm/mappings/ObjectReferenceMapping;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}