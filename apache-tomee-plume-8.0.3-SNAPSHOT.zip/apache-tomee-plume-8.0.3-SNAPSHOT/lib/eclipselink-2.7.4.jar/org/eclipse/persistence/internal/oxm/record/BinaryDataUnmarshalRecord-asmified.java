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
public class BinaryDataUnmarshalRecordDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/eclipse/persistence/internal/oxm/record/BinaryDataUnmarshalRecord", null, "org/eclipse/persistence/internal/oxm/record/UnmarshalRecordImpl", null);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "xmlBinaryDataMapping", "Lorg/eclipse/persistence/internal/oxm/mappings/BinaryDataMapping;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "xmlBinaryDataMappingNodeValue", "Lorg/eclipse/persistence/internal/oxm/XMLBinaryDataMappingNodeValue;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "parentRecord", "Lorg/eclipse/persistence/internal/oxm/record/UnmarshalRecord;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "handler", "Lorg/eclipse/persistence/internal/oxm/record/deferred/BinaryMappingContentHandler;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "activeContentHandler", "Lorg/xml/sax/ContentHandler;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/eclipse/persistence/internal/oxm/ObjectBuilder;Lorg/eclipse/persistence/internal/oxm/record/UnmarshalRecord;Lorg/eclipse/persistence/internal/oxm/XMLBinaryDataMappingNodeValue;Lorg/eclipse/persistence/internal/oxm/mappings/BinaryDataMapping;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/oxm/record/UnmarshalRecordImpl", "<init>", "(Lorg/eclipse/persistence/internal/oxm/ObjectBuilder;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/oxm/record/BinaryDataUnmarshalRecord", "parentRecord", "Lorg/eclipse/persistence/internal/oxm/record/UnmarshalRecord;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/oxm/record/BinaryDataUnmarshalRecord", "xmlBinaryDataMappingNodeValue", "Lorg/eclipse/persistence/internal/oxm/XMLBinaryDataMappingNodeValue;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/oxm/record/BinaryDataUnmarshalRecord", "xmlBinaryDataMapping", "Lorg/eclipse/persistence/internal/oxm/mappings/BinaryDataMapping;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/internal/oxm/record/deferred/BinaryMappingContentHandler");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/oxm/record/deferred/BinaryMappingContentHandler", "<init>", "(Lorg/eclipse/persistence/internal/oxm/record/UnmarshalRecord;Lorg/eclipse/persistence/internal/oxm/NodeValue;Lorg/eclipse/persistence/internal/oxm/mappings/BinaryDataMapping;)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/oxm/record/BinaryDataUnmarshalRecord", "handler", "Lorg/eclipse/persistence/internal/oxm/record/deferred/BinaryMappingContentHandler;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/oxm/record/BinaryDataUnmarshalRecord", "handler", "Lorg/eclipse/persistence/internal/oxm/record/deferred/BinaryMappingContentHandler;");
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/oxm/record/BinaryDataUnmarshalRecord", "activeContentHandler", "Lorg/xml/sax/ContentHandler;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(6, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "startElement", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xml/sax/Attributes;)V", null, new String[] { "org/xml/sax/SAXException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/oxm/record/BinaryDataUnmarshalRecord", "activeContentHandler", "Lorg/xml/sax/ContentHandler;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/xml/sax/ContentHandler", "startElement", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xml/sax/Attributes;)V", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/oxm/record/BinaryDataUnmarshalRecord", "handler", "Lorg/eclipse/persistence/internal/oxm/record/deferred/BinaryMappingContentHandler;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/oxm/record/deferred/BinaryMappingContentHandler", "isFinished", "()Z", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/oxm/record/BinaryDataUnmarshalRecord", "handler", "Lorg/eclipse/persistence/internal/oxm/record/deferred/BinaryMappingContentHandler;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/oxm/record/deferred/BinaryMappingContentHandler", "getWorkingUnmarshalRecord", "()Lorg/eclipse/persistence/internal/oxm/record/UnmarshalRecord;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/oxm/record/BinaryDataUnmarshalRecord", "activeContentHandler", "Lorg/xml/sax/ContentHandler;");
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "characters", "([CII)V", null, new String[] { "org/xml/sax/SAXException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/oxm/record/BinaryDataUnmarshalRecord", "activeContentHandler", "Lorg/xml/sax/ContentHandler;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/xml/sax/ContentHandler", "characters", "([CII)V", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/oxm/record/BinaryDataUnmarshalRecord", "handler", "Lorg/eclipse/persistence/internal/oxm/record/deferred/BinaryMappingContentHandler;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/oxm/record/deferred/BinaryMappingContentHandler", "isFinished", "()Z", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/oxm/record/BinaryDataUnmarshalRecord", "handler", "Lorg/eclipse/persistence/internal/oxm/record/deferred/BinaryMappingContentHandler;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/oxm/record/deferred/BinaryMappingContentHandler", "getWorkingUnmarshalRecord", "()Lorg/eclipse/persistence/internal/oxm/record/UnmarshalRecord;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/oxm/record/BinaryDataUnmarshalRecord", "activeContentHandler", "Lorg/xml/sax/ContentHandler;");
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "endElement", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", null, new String[] { "org/xml/sax/SAXException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/oxm/record/BinaryDataUnmarshalRecord", "activeContentHandler", "Lorg/xml/sax/ContentHandler;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/xml/sax/ContentHandler", "endElement", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/oxm/record/BinaryDataUnmarshalRecord", "handler", "Lorg/eclipse/persistence/internal/oxm/record/deferred/BinaryMappingContentHandler;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/oxm/record/deferred/BinaryMappingContentHandler", "isFinished", "()Z", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/oxm/record/BinaryDataUnmarshalRecord", "handler", "Lorg/eclipse/persistence/internal/oxm/record/deferred/BinaryMappingContentHandler;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/oxm/record/deferred/BinaryMappingContentHandler", "getWorkingUnmarshalRecord", "()Lorg/eclipse/persistence/internal/oxm/record/UnmarshalRecord;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/oxm/record/BinaryDataUnmarshalRecord", "activeContentHandler", "Lorg/xml/sax/ContentHandler;");
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getAttributeChildNodeValue", "(Ljava/lang/String;Ljava/lang/String;)Lorg/eclipse/persistence/internal/oxm/NodeValue;", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "endDocument", "()V", null, new String[] { "org/xml/sax/SAXException" });
methodVisitor.visitCode();
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(0, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
