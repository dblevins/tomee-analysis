package asm.org.eclipse.persistence.internal.oxm.record;
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
public class MarshalRecordDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_ABSTRACT | ACC_INTERFACE, "org/eclipse/persistence/internal/oxm/record/MarshalRecord", "<ABSTRACT_SESSION:Lorg/eclipse/persistence/internal/core/sessions/CoreAbstractSession;FIELD::Lorg/eclipse/persistence/internal/core/helper/CoreField;MARSHALLER:Lorg/eclipse/persistence/internal/oxm/Marshaller;NAMESPACE_RESOLVER:Lorg/eclipse/persistence/internal/oxm/NamespaceResolver;>Ljava/lang/Object;Lorg/eclipse/persistence/internal/oxm/record/AbstractMarshalRecord<TABSTRACT_SESSION;TFIELD;TMARSHALLER;TNAMESPACE_RESOLVER;>;", "java/lang/Object", new String[] { "org/eclipse/persistence/internal/oxm/record/AbstractMarshalRecord" });

classWriter.visitInnerClass("org/eclipse/persistence/internal/oxm/record/MarshalRecord$CycleDetectionStack", "org/eclipse/persistence/internal/oxm/record/MarshalRecord", "CycleDetectionStack", ACC_PUBLIC | ACC_STATIC);

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "add", "(Lorg/eclipse/persistence/internal/core/helper/CoreField;Ljava/lang/Object;)V", "(TFIELD;Ljava/lang/Object;)V", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "addGroupingElement", "(Lorg/eclipse/persistence/internal/oxm/XPathNode;)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "afterContainmentMarshal", "(Ljava/lang/Object;Ljava/lang/Object;)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "attribute", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "attribute", "(Lorg/eclipse/persistence/internal/oxm/XPathFragment;Lorg/eclipse/persistence/internal/oxm/NamespaceResolver;Ljava/lang/Object;Ljavax/xml/namespace/QName;)V", "(Lorg/eclipse/persistence/internal/oxm/XPathFragment;TNAMESPACE_RESOLVER;Ljava/lang/Object;Ljavax/xml/namespace/QName;)V", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "attribute", "(Lorg/eclipse/persistence/internal/oxm/XPathFragment;Lorg/eclipse/persistence/internal/oxm/NamespaceResolver;Ljava/lang/String;)V", "(Lorg/eclipse/persistence/internal/oxm/XPathFragment;TNAMESPACE_RESOLVER;Ljava/lang/String;)V", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "attributeWithoutQName", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "beforeContainmentMarshal", "(Ljava/lang/Object;)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "cdata", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "characters", "(Ljavax/xml/namespace/QName;Ljava/lang/Object;Ljava/lang/String;Z)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "characters", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "closeStartElement", "()V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "closeStartGroupingElements", "(Lorg/eclipse/persistence/internal/oxm/XPathFragment;)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "emptyAttribute", "(Lorg/eclipse/persistence/internal/oxm/XPathFragment;Lorg/eclipse/persistence/internal/oxm/NamespaceResolver;)V", "(Lorg/eclipse/persistence/internal/oxm/XPathFragment;TNAMESPACE_RESOLVER;)V", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "emptyCollection", "(Lorg/eclipse/persistence/internal/oxm/XPathFragment;Lorg/eclipse/persistence/internal/oxm/NamespaceResolver;Z)Z", "(Lorg/eclipse/persistence/internal/oxm/XPathFragment;TNAMESPACE_RESOLVER;Z)Z", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "emptyComplex", "(Lorg/eclipse/persistence/internal/oxm/XPathFragment;Lorg/eclipse/persistence/internal/oxm/NamespaceResolver;)V", "(Lorg/eclipse/persistence/internal/oxm/XPathFragment;TNAMESPACE_RESOLVER;)V", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "emptySimple", "(Lorg/eclipse/persistence/internal/oxm/NamespaceResolver;)V", "(TNAMESPACE_RESOLVER;)V", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "endCollection", "()V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "endElement", "(Lorg/eclipse/persistence/internal/oxm/XPathFragment;Lorg/eclipse/persistence/internal/oxm/NamespaceResolver;)V", "(Lorg/eclipse/persistence/internal/oxm/XPathFragment;TNAMESPACE_RESOLVER;)V", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "endPrefixMapping", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "flush", "()V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "forceValueWrapper", "()V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getCurrentAttributeGroup", "()Lorg/eclipse/persistence/core/queries/CoreAttributeGroup;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getCycleDetectionStack", "()Lorg/eclipse/persistence/internal/oxm/record/MarshalRecord$CycleDetectionStack;", "()Lorg/eclipse/persistence/internal/oxm/record/MarshalRecord$CycleDetectionStack<Ljava/lang/Object;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getGroupingElements", "()Ljava/util/ArrayList;", "()Ljava/util/ArrayList<Lorg/eclipse/persistence/internal/oxm/XPathNode;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getTextWrapperFragment", "()Lorg/eclipse/persistence/internal/oxm/XPathFragment;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getValueToWrite", "(Ljavax/xml/namespace/QName;Ljava/lang/Object;Lorg/eclipse/persistence/internal/oxm/ConversionManager;)Ljava/lang/String;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "hasCustomNamespaceMapper", "()Z", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "isWrapperAsCollectionName", "()Z", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "isXOPPackage", "()Z", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "namespaceDeclaration", "(Ljava/lang/String;Ljava/lang/String;)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "nilComplex", "(Lorg/eclipse/persistence/internal/oxm/XPathFragment;Lorg/eclipse/persistence/internal/oxm/NamespaceResolver;)V", "(Lorg/eclipse/persistence/internal/oxm/XPathFragment;TNAMESPACE_RESOLVER;)V", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "nilSimple", "(Lorg/eclipse/persistence/internal/oxm/NamespaceResolver;)V", "(TNAMESPACE_RESOLVER;)V", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "node", "(Lorg/w3c/dom/Node;Lorg/eclipse/persistence/internal/oxm/NamespaceResolver;)V", "(Lorg/w3c/dom/Node;TNAMESPACE_RESOLVER;)V", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "openStartElement", "(Lorg/eclipse/persistence/internal/oxm/XPathFragment;Lorg/eclipse/persistence/internal/oxm/NamespaceResolver;)V", "(Lorg/eclipse/persistence/internal/oxm/XPathFragment;TNAMESPACE_RESOLVER;)V", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "openStartGroupingElements", "(Lorg/eclipse/persistence/internal/oxm/NamespaceResolver;)Lorg/eclipse/persistence/internal/oxm/XPathFragment;", "(TNAMESPACE_RESOLVER;)Lorg/eclipse/persistence/internal/oxm/XPathFragment;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "popAttributeGroup", "()V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "predicateAttribute", "(Lorg/eclipse/persistence/internal/oxm/XPathFragment;Lorg/eclipse/persistence/internal/oxm/NamespaceResolver;)V", "(Lorg/eclipse/persistence/internal/oxm/XPathFragment;TNAMESPACE_RESOLVER;)V", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "pushAttributeGroup", "(Lorg/eclipse/persistence/core/queries/CoreAttributeGroup;)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "removeExtraNamespacesFromNamespaceResolver", "(Ljava/util/List;Lorg/eclipse/persistence/internal/core/sessions/CoreAbstractSession;)V", "(Ljava/util/List<Lorg/eclipse/persistence/internal/oxm/Namespace;>;Lorg/eclipse/persistence/internal/core/sessions/CoreAbstractSession;)V", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "removeGroupingElement", "(Lorg/eclipse/persistence/internal/oxm/XPathNode;)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setGroupingElement", "(Ljava/util/ArrayList;)V", "(Ljava/util/ArrayList<Lorg/eclipse/persistence/internal/oxm/XPathNode;>;)V", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setLeafElementType", "(Ljavax/xml/namespace/QName;)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setMarshaller", "(Lorg/eclipse/persistence/internal/oxm/Marshaller;)V", "(TMARSHALLER;)V", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "startCollection", "()V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "startPrefixMapping", "(Ljava/lang/String;Ljava/lang/String;)V", null, null);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
