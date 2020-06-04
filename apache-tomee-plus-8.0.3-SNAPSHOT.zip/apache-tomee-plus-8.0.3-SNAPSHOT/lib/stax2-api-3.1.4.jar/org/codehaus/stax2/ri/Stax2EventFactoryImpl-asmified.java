package asm.org.codehaus.stax2.ri;
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
public class Stax2EventFactoryImplDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_5, ACC_PUBLIC | ACC_SUPER | ACC_ABSTRACT, "org/codehaus/stax2/ri/Stax2EventFactoryImpl", null, "org/codehaus/stax2/evt/XMLEventFactory2", null);

{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "mLocation", "Ljavax/xml/stream/Location;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/codehaus/stax2/evt/XMLEventFactory2", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createAttribute", "(Ljavax/xml/namespace/QName;Ljava/lang/String;)Ljavax/xml/stream/events/Attribute;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/codehaus/stax2/ri/evt/AttributeEventImpl");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/codehaus/stax2/ri/Stax2EventFactoryImpl", "mLocation", "Ljavax/xml/stream/Location;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/codehaus/stax2/ri/evt/AttributeEventImpl", "<init>", "(Ljavax/xml/stream/Location;Ljavax/xml/namespace/QName;Ljava/lang/String;Z)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(6, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createAttribute", "(Ljava/lang/String;Ljava/lang/String;)Ljavax/xml/stream/events/Attribute;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/codehaus/stax2/ri/evt/AttributeEventImpl");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/codehaus/stax2/ri/Stax2EventFactoryImpl", "mLocation", "Ljavax/xml/stream/Location;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/codehaus/stax2/ri/evt/AttributeEventImpl", "<init>", "(Ljavax/xml/stream/Location;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(8, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createAttribute", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljavax/xml/stream/events/Attribute;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/codehaus/stax2/ri/evt/AttributeEventImpl");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/codehaus/stax2/ri/Stax2EventFactoryImpl", "mLocation", "Ljavax/xml/stream/Location;");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/codehaus/stax2/ri/evt/AttributeEventImpl", "<init>", "(Ljavax/xml/stream/Location;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(8, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createCData", "(Ljava/lang/String;)Ljavax/xml/stream/events/Characters;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/codehaus/stax2/ri/evt/CharactersEventImpl");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/codehaus/stax2/ri/Stax2EventFactoryImpl", "mLocation", "Ljavax/xml/stream/Location;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/codehaus/stax2/ri/evt/CharactersEventImpl", "<init>", "(Ljavax/xml/stream/Location;Ljava/lang/String;Z)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createCharacters", "(Ljava/lang/String;)Ljavax/xml/stream/events/Characters;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/codehaus/stax2/ri/evt/CharactersEventImpl");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/codehaus/stax2/ri/Stax2EventFactoryImpl", "mLocation", "Ljavax/xml/stream/Location;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/codehaus/stax2/ri/evt/CharactersEventImpl", "<init>", "(Ljavax/xml/stream/Location;Ljava/lang/String;Z)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createComment", "(Ljava/lang/String;)Ljavax/xml/stream/events/Comment;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/codehaus/stax2/ri/evt/CommentEventImpl");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/codehaus/stax2/ri/Stax2EventFactoryImpl", "mLocation", "Ljavax/xml/stream/Location;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/codehaus/stax2/ri/evt/CommentEventImpl", "<init>", "(Ljavax/xml/stream/Location;Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createDTD", "(Ljava/lang/String;)Ljavax/xml/stream/events/DTD;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/codehaus/stax2/ri/evt/DTDEventImpl");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/codehaus/stax2/ri/Stax2EventFactoryImpl", "mLocation", "Ljavax/xml/stream/Location;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/codehaus/stax2/ri/evt/DTDEventImpl", "<init>", "(Ljavax/xml/stream/Location;Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createEndDocument", "()Ljavax/xml/stream/events/EndDocument;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/codehaus/stax2/ri/evt/EndDocumentEventImpl");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/codehaus/stax2/ri/Stax2EventFactoryImpl", "mLocation", "Ljavax/xml/stream/Location;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/codehaus/stax2/ri/evt/EndDocumentEventImpl", "<init>", "(Ljavax/xml/stream/Location;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createEndElement", "(Ljavax/xml/namespace/QName;Ljava/util/Iterator;)Ljavax/xml/stream/events/EndElement;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/codehaus/stax2/ri/evt/EndElementEventImpl");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/codehaus/stax2/ri/Stax2EventFactoryImpl", "mLocation", "Ljavax/xml/stream/Location;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/codehaus/stax2/ri/evt/EndElementEventImpl", "<init>", "(Ljavax/xml/stream/Location;Ljavax/xml/namespace/QName;Ljava/util/Iterator;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createEndElement", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljavax/xml/stream/events/EndElement;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/codehaus/stax2/ri/Stax2EventFactoryImpl", "createQName", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljavax/xml/namespace/QName;", false);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/codehaus/stax2/ri/Stax2EventFactoryImpl", "createEndElement", "(Ljavax/xml/namespace/QName;Ljava/util/Iterator;)Ljavax/xml/stream/events/EndElement;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createEndElement", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Iterator;)Ljavax/xml/stream/events/EndElement;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/codehaus/stax2/ri/Stax2EventFactoryImpl", "createQName", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljavax/xml/namespace/QName;", false);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/codehaus/stax2/ri/Stax2EventFactoryImpl", "createEndElement", "(Ljavax/xml/namespace/QName;Ljava/util/Iterator;)Ljavax/xml/stream/events/EndElement;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createEntityReference", "(Ljava/lang/String;Ljavax/xml/stream/events/EntityDeclaration;)Ljavax/xml/stream/events/EntityReference;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/codehaus/stax2/ri/evt/EntityReferenceEventImpl");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/codehaus/stax2/ri/Stax2EventFactoryImpl", "mLocation", "Ljavax/xml/stream/Location;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/codehaus/stax2/ri/evt/EntityReferenceEventImpl", "<init>", "(Ljavax/xml/stream/Location;Ljavax/xml/stream/events/EntityDeclaration;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createIgnorableSpace", "(Ljava/lang/String;)Ljavax/xml/stream/events/Characters;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/codehaus/stax2/ri/Stax2EventFactoryImpl", "mLocation", "Ljavax/xml/stream/Location;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/codehaus/stax2/ri/evt/CharactersEventImpl", "createIgnorableWS", "(Ljavax/xml/stream/Location;Ljava/lang/String;)Lorg/codehaus/stax2/ri/evt/CharactersEventImpl;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createNamespace", "(Ljava/lang/String;)Ljavax/xml/stream/events/Namespace;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/codehaus/stax2/ri/Stax2EventFactoryImpl", "mLocation", "Ljavax/xml/stream/Location;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/codehaus/stax2/ri/evt/NamespaceEventImpl", "constructDefaultNamespace", "(Ljavax/xml/stream/Location;Ljava/lang/String;)Lorg/codehaus/stax2/ri/evt/NamespaceEventImpl;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createNamespace", "(Ljava/lang/String;Ljava/lang/String;)Ljavax/xml/stream/events/Namespace;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/codehaus/stax2/ri/Stax2EventFactoryImpl", "mLocation", "Ljavax/xml/stream/Location;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/codehaus/stax2/ri/evt/NamespaceEventImpl", "constructNamespace", "(Ljavax/xml/stream/Location;Ljava/lang/String;Ljava/lang/String;)Lorg/codehaus/stax2/ri/evt/NamespaceEventImpl;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createProcessingInstruction", "(Ljava/lang/String;Ljava/lang/String;)Ljavax/xml/stream/events/ProcessingInstruction;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/codehaus/stax2/ri/evt/ProcInstrEventImpl");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/codehaus/stax2/ri/Stax2EventFactoryImpl", "mLocation", "Ljavax/xml/stream/Location;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/codehaus/stax2/ri/evt/ProcInstrEventImpl", "<init>", "(Ljavax/xml/stream/Location;Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createSpace", "(Ljava/lang/String;)Ljavax/xml/stream/events/Characters;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/codehaus/stax2/ri/Stax2EventFactoryImpl", "mLocation", "Ljavax/xml/stream/Location;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/codehaus/stax2/ri/evt/CharactersEventImpl", "createNonIgnorableWS", "(Ljavax/xml/stream/Location;Ljava/lang/String;)Lorg/codehaus/stax2/ri/evt/CharactersEventImpl;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createStartDocument", "()Ljavax/xml/stream/events/StartDocument;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/codehaus/stax2/ri/evt/StartDocumentEventImpl");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/codehaus/stax2/ri/Stax2EventFactoryImpl", "mLocation", "Ljavax/xml/stream/Location;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/codehaus/stax2/ri/evt/StartDocumentEventImpl", "<init>", "(Ljavax/xml/stream/Location;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createStartDocument", "(Ljava/lang/String;)Ljavax/xml/stream/events/StartDocument;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/codehaus/stax2/ri/evt/StartDocumentEventImpl");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/codehaus/stax2/ri/Stax2EventFactoryImpl", "mLocation", "Ljavax/xml/stream/Location;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/codehaus/stax2/ri/evt/StartDocumentEventImpl", "<init>", "(Ljavax/xml/stream/Location;Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createStartDocument", "(Ljava/lang/String;Ljava/lang/String;)Ljavax/xml/stream/events/StartDocument;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/codehaus/stax2/ri/evt/StartDocumentEventImpl");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/codehaus/stax2/ri/Stax2EventFactoryImpl", "mLocation", "Ljavax/xml/stream/Location;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/codehaus/stax2/ri/evt/StartDocumentEventImpl", "<init>", "(Ljavax/xml/stream/Location;Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createStartDocument", "(Ljava/lang/String;Ljava/lang/String;Z)Ljavax/xml/stream/events/StartDocument;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/codehaus/stax2/ri/evt/StartDocumentEventImpl");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/codehaus/stax2/ri/Stax2EventFactoryImpl", "mLocation", "Ljavax/xml/stream/Location;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/codehaus/stax2/ri/evt/StartDocumentEventImpl", "<init>", "(Ljavax/xml/stream/Location;Ljava/lang/String;Ljava/lang/String;ZZ)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(7, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createStartElement", "(Ljavax/xml/namespace/QName;Ljava/util/Iterator;Ljava/util/Iterator;)Ljavax/xml/stream/events/StartElement;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/codehaus/stax2/ri/Stax2EventFactoryImpl", "createStartElement", "(Ljavax/xml/namespace/QName;Ljava/util/Iterator;Ljava/util/Iterator;Ljavax/xml/namespace/NamespaceContext;)Ljavax/xml/stream/events/StartElement;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createStartElement", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljavax/xml/stream/events/StartElement;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/codehaus/stax2/ri/Stax2EventFactoryImpl", "createQName", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljavax/xml/namespace/QName;", false);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/codehaus/stax2/ri/Stax2EventFactoryImpl", "createStartElement", "(Ljavax/xml/namespace/QName;Ljava/util/Iterator;Ljava/util/Iterator;Ljavax/xml/namespace/NamespaceContext;)Ljavax/xml/stream/events/StartElement;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createStartElement", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Iterator;Ljava/util/Iterator;)Ljavax/xml/stream/events/StartElement;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/codehaus/stax2/ri/Stax2EventFactoryImpl", "createQName", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljavax/xml/namespace/QName;", false);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/codehaus/stax2/ri/Stax2EventFactoryImpl", "createStartElement", "(Ljavax/xml/namespace/QName;Ljava/util/Iterator;Ljava/util/Iterator;Ljavax/xml/namespace/NamespaceContext;)Ljavax/xml/stream/events/StartElement;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 6);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createStartElement", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Iterator;Ljava/util/Iterator;Ljavax/xml/namespace/NamespaceContext;)Ljavax/xml/stream/events/StartElement;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/codehaus/stax2/ri/Stax2EventFactoryImpl", "createQName", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljavax/xml/namespace/QName;", false);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/codehaus/stax2/ri/Stax2EventFactoryImpl", "createStartElement", "(Ljavax/xml/namespace/QName;Ljava/util/Iterator;Ljava/util/Iterator;Ljavax/xml/namespace/NamespaceContext;)Ljavax/xml/stream/events/StartElement;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 7);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setLocation", "(Ljavax/xml/stream/Location;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/codehaus/stax2/ri/Stax2EventFactoryImpl", "mLocation", "Ljavax/xml/stream/Location;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createDTD", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/codehaus/stax2/evt/DTD2;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/codehaus/stax2/ri/evt/DTDEventImpl");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/codehaus/stax2/ri/Stax2EventFactoryImpl", "mLocation", "Ljavax/xml/stream/Location;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/codehaus/stax2/ri/evt/DTDEventImpl", "<init>", "(Ljavax/xml/stream/Location;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(8, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createDTD", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)Lorg/codehaus/stax2/evt/DTD2;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/codehaus/stax2/ri/evt/DTDEventImpl");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/codehaus/stax2/ri/Stax2EventFactoryImpl", "mLocation", "Ljavax/xml/stream/Location;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/codehaus/stax2/ri/evt/DTDEventImpl", "<init>", "(Ljavax/xml/stream/Location;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(8, 6);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED | ACC_ABSTRACT, "createQName", "(Ljava/lang/String;Ljava/lang/String;)Ljavax/xml/namespace/QName;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED | ACC_ABSTRACT, "createQName", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljavax/xml/namespace/QName;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "createStartElement", "(Ljavax/xml/namespace/QName;Ljava/util/Iterator;Ljava/util/Iterator;Ljavax/xml/namespace/NamespaceContext;)Ljavax/xml/stream/events/StartElement;", "(Ljavax/xml/namespace/QName;Ljava/util/Iterator<*>;Ljava/util/Iterator<*>;Ljavax/xml/namespace/NamespaceContext;)Ljavax/xml/stream/events/StartElement;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/codehaus/stax2/ri/Stax2EventFactoryImpl", "mLocation", "Ljavax/xml/stream/Location;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/codehaus/stax2/ri/evt/StartElementEventImpl", "construct", "(Ljavax/xml/stream/Location;Ljavax/xml/namespace/QName;Ljava/util/Iterator;Ljava/util/Iterator;Ljavax/xml/namespace/NamespaceContext;)Lorg/codehaus/stax2/ri/evt/StartElementEventImpl;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 5);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
