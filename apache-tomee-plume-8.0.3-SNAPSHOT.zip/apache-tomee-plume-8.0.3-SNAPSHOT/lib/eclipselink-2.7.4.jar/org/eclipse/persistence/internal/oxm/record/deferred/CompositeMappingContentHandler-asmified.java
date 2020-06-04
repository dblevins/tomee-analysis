package asm.org.eclipse.persistence.internal.oxm.record.deferred;
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
public class CompositeMappingContentHandlerDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER | ACC_ABSTRACT, "org/eclipse/persistence/internal/oxm/record/deferred/CompositeMappingContentHandler", null, "org/eclipse/persistence/internal/oxm/record/deferred/DeferredContentHandler", null);

classWriter.visitInnerClass("org/eclipse/persistence/internal/oxm/record/deferred/DeferredContentHandler$AttributeList", "org/eclipse/persistence/internal/oxm/record/deferred/DeferredContentHandler", "AttributeList", ACC_PRIVATE | ACC_FINAL | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "nullPolicy", "Lorg/eclipse/persistence/oxm/mappings/nullpolicy/AbstractNullPolicy;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "attributes", "Lorg/xml/sax/Attributes;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "mapping", "Lorg/eclipse/persistence/internal/oxm/mappings/Mapping;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "xPathFragment", "Lorg/eclipse/persistence/internal/oxm/XPathFragment;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "xmlDescriptor", "Lorg/eclipse/persistence/internal/oxm/mappings/Descriptor;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/eclipse/persistence/internal/oxm/record/UnmarshalRecord;Lorg/eclipse/persistence/internal/oxm/mappings/Mapping;Lorg/xml/sax/Attributes;Lorg/eclipse/persistence/oxm/mappings/nullpolicy/AbstractNullPolicy;Lorg/eclipse/persistence/internal/oxm/XPathFragment;Lorg/eclipse/persistence/internal/oxm/mappings/Descriptor;)V", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "org/xml/sax/SAXException");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/oxm/record/deferred/DeferredContentHandler", "<init>", "(Lorg/eclipse/persistence/internal/oxm/record/UnmarshalRecord;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/oxm/record/deferred/CompositeMappingContentHandler", "mapping", "Lorg/eclipse/persistence/internal/oxm/mappings/Mapping;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/oxm/record/deferred/CompositeMappingContentHandler", "nullPolicy", "Lorg/eclipse/persistence/oxm/mappings/nullpolicy/AbstractNullPolicy;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/oxm/record/deferred/CompositeMappingContentHandler", "xPathFragment", "Lorg/eclipse/persistence/internal/oxm/XPathFragment;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/oxm/record/deferred/CompositeMappingContentHandler", "xmlDescriptor", "Lorg/eclipse/persistence/internal/oxm/mappings/Descriptor;");
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/oxm/record/deferred/CompositeMappingContentHandler", "buildAttributeList", "(Lorg/xml/sax/Attributes;)Lorg/eclipse/persistence/internal/oxm/record/deferred/DeferredContentHandler$AttributeList;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/oxm/record/deferred/CompositeMappingContentHandler", "attributes", "Lorg/xml/sax/Attributes;");
methodVisitor.visitLabel(label1);
Label label3 = new Label();
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_FULL, 7, new Object[] {"org/eclipse/persistence/internal/oxm/record/deferred/CompositeMappingContentHandler", "org/eclipse/persistence/internal/oxm/record/UnmarshalRecord", "org/eclipse/persistence/internal/oxm/mappings/Mapping", "org/xml/sax/Attributes", "org/eclipse/persistence/oxm/mappings/nullpolicy/AbstractNullPolicy", "org/eclipse/persistence/internal/oxm/XPathFragment", "org/eclipse/persistence/internal/oxm/mappings/Descriptor"}, 1, new Object[] {"org/xml/sax/SAXException"});
methodVisitor.visitVarInsn(ASTORE, 7);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 8);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED | ACC_ABSTRACT, "getNodeValue", "()Lorg/eclipse/persistence/internal/oxm/XMLRelationshipMappingNodeValue;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "createEmptyObject", "()V", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "org/xml/sax/SAXException");
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/oxm/record/deferred/CompositeMappingContentHandler", "mapping", "Lorg/eclipse/persistence/internal/oxm/mappings/Mapping;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/internal/oxm/mappings/Mapping", "getField", "()Lorg/eclipse/persistence/internal/core/helper/CoreField;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/persistence/internal/oxm/mappings/Field");
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/internal/oxm/mappings/Field", "hasLastXPathFragment", "()Z", true);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/oxm/record/deferred/CompositeMappingContentHandler", "getParent", "()Lorg/eclipse/persistence/internal/oxm/record/UnmarshalRecord;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/internal/oxm/mappings/Field", "getLastXPathFragment", "()Lorg/eclipse/persistence/internal/oxm/XPathFragment;", true);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/oxm/XPathFragment", "getLeafElementType", "()Ljavax/xml/namespace/QName;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/internal/oxm/record/UnmarshalRecord", "setLeafElementType", "(Ljavax/xml/namespace/QName;)V", true);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"org/eclipse/persistence/internal/oxm/mappings/Field"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/oxm/record/deferred/CompositeMappingContentHandler", "getNodeValue", "()Lorg/eclipse/persistence/internal/oxm/XMLRelationshipMappingNodeValue;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/oxm/record/deferred/CompositeMappingContentHandler", "xPathFragment", "Lorg/eclipse/persistence/internal/oxm/XPathFragment;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/oxm/record/deferred/CompositeMappingContentHandler", "getParent", "()Lorg/eclipse/persistence/internal/oxm/record/UnmarshalRecord;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/oxm/record/deferred/CompositeMappingContentHandler", "attributes", "Lorg/xml/sax/Attributes;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/oxm/record/deferred/CompositeMappingContentHandler", "xmlDescriptor", "Lorg/eclipse/persistence/internal/oxm/mappings/Descriptor;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/oxm/record/deferred/CompositeMappingContentHandler", "mapping", "Lorg/eclipse/persistence/internal/oxm/mappings/Mapping;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/oxm/XMLRelationshipMappingNodeValue", "processChild", "(Lorg/eclipse/persistence/internal/oxm/XPathFragment;Lorg/eclipse/persistence/internal/oxm/record/UnmarshalRecord;Lorg/xml/sax/Attributes;Lorg/eclipse/persistence/internal/oxm/mappings/Descriptor;Lorg/eclipse/persistence/internal/oxm/mappings/Mapping;)V", false);
methodVisitor.visitLabel(label1);
Label label4 = new Label();
methodVisitor.visitJumpInsn(GOTO, label4);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_FULL, 1, new Object[] {"org/eclipse/persistence/internal/oxm/record/deferred/CompositeMappingContentHandler"}, 1, new Object[] {"org/xml/sax/SAXException"});
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/XMLMarshalException", "unmarshalException", "(Ljava/lang/Exception;)Lorg/eclipse/persistence/exceptions/XMLMarshalException;", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(6, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "processEmptyElementWithAttributes", "()V", null, new String[] { "org/xml/sax/SAXException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/oxm/record/deferred/CompositeMappingContentHandler", "processComplexElement", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "processComplexElement", "()V", null, new String[] { "org/xml/sax/SAXException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/oxm/record/deferred/CompositeMappingContentHandler", "getEvents", "()Ljava/util/List;", false);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "remove", "(I)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/oxm/record/deferred/CompositeMappingContentHandler", "createEmptyObject", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/oxm/record/deferred/CompositeMappingContentHandler", "getParent", "()Lorg/eclipse/persistence/internal/oxm/record/UnmarshalRecord;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/internal/oxm/record/UnmarshalRecord", "getChildRecord", "()Lorg/eclipse/persistence/internal/oxm/record/UnmarshalRecord;", true);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/oxm/record/deferred/CompositeMappingContentHandler", "executeEvents", "(Lorg/eclipse/persistence/internal/oxm/record/UnmarshalRecord;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "processSimpleElement", "()V", null, new String[] { "org/xml/sax/SAXException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/oxm/record/deferred/CompositeMappingContentHandler", "getEvents", "()Ljava/util/List;", false);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "remove", "(I)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/oxm/record/deferred/CompositeMappingContentHandler", "createEmptyObject", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/oxm/record/deferred/CompositeMappingContentHandler", "getParent", "()Lorg/eclipse/persistence/internal/oxm/record/UnmarshalRecord;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/internal/oxm/record/UnmarshalRecord", "getChildRecord", "()Lorg/eclipse/persistence/internal/oxm/record/UnmarshalRecord;", true);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/oxm/record/deferred/CompositeMappingContentHandler", "executeEvents", "(Lorg/eclipse/persistence/internal/oxm/record/UnmarshalRecord;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
