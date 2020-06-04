package asm.org.apache.xml.security.stax.impl.processor.input;
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
public class AbstractDecryptInputProcessor$AbstractDecryptedEventReaderInputProcessorDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER | ACC_ABSTRACT, "org/apache/xml/security/stax/impl/processor/input/AbstractDecryptInputProcessor$AbstractDecryptedEventReaderInputProcessor", null, "org/apache/xml/security/stax/ext/AbstractInputProcessor", new String[] { "java/lang/Thread$UncaughtExceptionHandler" });

classWriter.visitInnerClass("org/apache/xml/security/stax/ext/SecurePart$Modifier", "org/apache/xml/security/stax/ext/SecurePart", "Modifier", ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM);

classWriter.visitInnerClass("org/apache/xml/security/stax/impl/processor/input/AbstractDecryptInputProcessor$AbstractDecryptedEventReaderInputProcessor", "org/apache/xml/security/stax/impl/processor/input/AbstractDecryptInputProcessor", "AbstractDecryptedEventReaderInputProcessor", ACC_PUBLIC | ACC_ABSTRACT);

classWriter.visitInnerClass("java/lang/Thread$UncaughtExceptionHandler", "java/lang/Thread", "UncaughtExceptionHandler", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "currentXMLStructureDepth", "I", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "xmlStreamReader", "Ljavax/xml/stream/XMLStreamReader;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "parentXmlSecStartElement", "Lorg/apache/xml/security/stax/ext/stax/XMLSecStartElement;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "encryptedHeader", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "inboundSecurityToken", "Lorg/apache/xml/security/stax/securityToken/InboundSecurityToken;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "rootElementProcessed", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "encryptedDataType", "Lorg/apache/xml/security/binding/xmlenc/EncryptedDataType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "decryptionThread", "Ljava/lang/Thread;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_VOLATILE, "thrownException", "Ljava/lang/Throwable;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/apache/xml/security/stax/impl/processor/input/AbstractDecryptInputProcessor;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/apache/xml/security/stax/impl/processor/input/AbstractDecryptInputProcessor;Lorg/apache/xml/security/stax/ext/XMLSecurityProperties;Lorg/apache/xml/security/stax/ext/SecurePart$Modifier;ZLorg/apache/xml/security/stax/ext/stax/XMLSecStartElement;Lorg/apache/xml/security/binding/xmlenc/EncryptedDataType;Lorg/apache/xml/security/stax/impl/processor/input/AbstractDecryptInputProcessor;Lorg/apache/xml/security/stax/securityToken/InboundSecurityToken;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/xml/security/stax/impl/processor/input/AbstractDecryptInputProcessor$AbstractDecryptedEventReaderInputProcessor", "this$0", "Lorg/apache/xml/security/stax/impl/processor/input/AbstractDecryptInputProcessor;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/xml/security/stax/ext/AbstractInputProcessor", "<init>", "(Lorg/apache/xml/security/stax/ext/XMLSecurityProperties;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/xml/security/stax/impl/processor/input/AbstractDecryptInputProcessor$AbstractDecryptedEventReaderInputProcessor", "encryptedHeader", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xml/security/stax/impl/processor/input/AbstractDecryptInputProcessor$AbstractDecryptedEventReaderInputProcessor", "addAfterProcessor", "(Ljava/lang/Object;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/xml/security/stax/ext/SecurePart$Modifier", "Content", "Lorg/apache/xml/security/stax/ext/SecurePart$Modifier;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPNE, label0);
methodVisitor.visitInsn(ICONST_1);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_FULL, 9, new Object[] {"org/apache/xml/security/stax/impl/processor/input/AbstractDecryptInputProcessor$AbstractDecryptedEventReaderInputProcessor", "org/apache/xml/security/stax/impl/processor/input/AbstractDecryptInputProcessor", "org/apache/xml/security/stax/ext/XMLSecurityProperties", "org/apache/xml/security/stax/ext/SecurePart$Modifier", Opcodes.INTEGER, "org/apache/xml/security/stax/ext/stax/XMLSecStartElement", "org/apache/xml/security/binding/xmlenc/EncryptedDataType", "org/apache/xml/security/stax/impl/processor/input/AbstractDecryptInputProcessor", "org/apache/xml/security/stax/securityToken/InboundSecurityToken"}, 1, new Object[] {"org/apache/xml/security/stax/impl/processor/input/AbstractDecryptInputProcessor$AbstractDecryptedEventReaderInputProcessor"});
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_FULL, 9, new Object[] {"org/apache/xml/security/stax/impl/processor/input/AbstractDecryptInputProcessor$AbstractDecryptedEventReaderInputProcessor", "org/apache/xml/security/stax/impl/processor/input/AbstractDecryptInputProcessor", "org/apache/xml/security/stax/ext/XMLSecurityProperties", "org/apache/xml/security/stax/ext/SecurePart$Modifier", Opcodes.INTEGER, "org/apache/xml/security/stax/ext/stax/XMLSecStartElement", "org/apache/xml/security/binding/xmlenc/EncryptedDataType", "org/apache/xml/security/stax/impl/processor/input/AbstractDecryptInputProcessor", "org/apache/xml/security/stax/securityToken/InboundSecurityToken"}, 2, new Object[] {"org/apache/xml/security/stax/impl/processor/input/AbstractDecryptInputProcessor$AbstractDecryptedEventReaderInputProcessor", Opcodes.INTEGER});
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/xml/security/stax/impl/processor/input/AbstractDecryptInputProcessor$AbstractDecryptedEventReaderInputProcessor", "rootElementProcessed", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/xml/security/stax/impl/processor/input/AbstractDecryptInputProcessor$AbstractDecryptedEventReaderInputProcessor", "encryptedHeader", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/xml/security/stax/impl/processor/input/AbstractDecryptInputProcessor$AbstractDecryptedEventReaderInputProcessor", "inboundSecurityToken", "Lorg/apache/xml/security/stax/securityToken/InboundSecurityToken;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/xml/security/stax/impl/processor/input/AbstractDecryptInputProcessor$AbstractDecryptedEventReaderInputProcessor", "parentXmlSecStartElement", "Lorg/apache/xml/security/stax/ext/stax/XMLSecStartElement;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/xml/security/stax/impl/processor/input/AbstractDecryptInputProcessor$AbstractDecryptedEventReaderInputProcessor", "encryptedDataType", "Lorg/apache/xml/security/binding/xmlenc/EncryptedDataType;");
methodVisitor.visitVarInsn(ALOAD, 5);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/xml/security/stax/ext/stax/XMLSecStartElement", "getDocumentLevel", "()I", true);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/xml/security/stax/impl/processor/input/AbstractDecryptInputProcessor$AbstractDecryptedEventReaderInputProcessor", "currentXMLStructureDepth", "I");
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 9);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setDecryptionThread", "(Ljava/lang/Thread;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/xml/security/stax/impl/processor/input/AbstractDecryptInputProcessor$AbstractDecryptedEventReaderInputProcessor", "decryptionThread", "Ljava/lang/Thread;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setXmlStreamReader", "(Ljavax/xml/stream/XMLStreamReader;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/xml/security/stax/impl/processor/input/AbstractDecryptInputProcessor$AbstractDecryptedEventReaderInputProcessor", "xmlStreamReader", "Ljavax/xml/stream/XMLStreamReader;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "processNextHeaderEvent", "(Lorg/apache/xml/security/stax/ext/InputProcessorChain;)Lorg/apache/xml/security/stax/ext/stax/XMLSecEvent;", null, new String[] { "javax/xml/stream/XMLStreamException", "org/apache/xml/security/exceptions/XMLSecurityException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/xml/security/stax/impl/processor/input/AbstractDecryptInputProcessor$AbstractDecryptedEventReaderInputProcessor", "processEvent", "(Lorg/apache/xml/security/stax/ext/InputProcessorChain;Z)Lorg/apache/xml/security/stax/ext/stax/XMLSecEvent;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "processNextEvent", "(Lorg/apache/xml/security/stax/ext/InputProcessorChain;)Lorg/apache/xml/security/stax/ext/stax/XMLSecEvent;", null, new String[] { "javax/xml/stream/XMLStreamException", "org/apache/xml/security/exceptions/XMLSecurityException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/xml/security/stax/impl/processor/input/AbstractDecryptInputProcessor$AbstractDecryptedEventReaderInputProcessor", "processEvent", "(Lorg/apache/xml/security/stax/ext/InputProcessorChain;Z)Lorg/apache/xml/security/stax/ext/stax/XMLSecEvent;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "processEvent", "(Lorg/apache/xml/security/stax/ext/InputProcessorChain;Z)Lorg/apache/xml/security/stax/ext/stax/XMLSecEvent;", null, new String[] { "javax/xml/stream/XMLStreamException", "org/apache/xml/security/exceptions/XMLSecurityException" });
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/lang/InterruptedException");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/xml/security/stax/impl/processor/input/AbstractDecryptInputProcessor$AbstractDecryptedEventReaderInputProcessor", "testAndThrowUncaughtException", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xml/security/stax/impl/processor/input/AbstractDecryptInputProcessor$AbstractDecryptedEventReaderInputProcessor", "xmlStreamReader", "Ljavax/xml/stream/XMLStreamReader;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xml/security/stax/impl/processor/input/AbstractDecryptInputProcessor$AbstractDecryptedEventReaderInputProcessor", "parentXmlSecStartElement", "Lorg/apache/xml/security/stax/ext/stax/XMLSecStartElement;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/xml/security/stax/ext/stax/XMLSecEventFactory", "allocate", "(Ljavax/xml/stream/XMLStreamReader;Lorg/apache/xml/security/stax/ext/stax/XMLSecStartElement;)Lorg/apache/xml/security/stax/ext/stax/XMLSecEvent;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/xml/security/stax/ext/stax/XMLSecEvent", "getEventType", "()I", true);
Label label3 = new Label();
Label label4 = new Label();
Label label5 = new Label();
methodVisitor.visitLookupSwitchInsn(label5, new int[] { 1, 2 }, new Label[] { label3, label4 });
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"org/apache/xml/security/stax/ext/stax/XMLSecEvent"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xml/security/stax/impl/processor/input/AbstractDecryptInputProcessor$AbstractDecryptedEventReaderInputProcessor", "currentXMLStructureDepth", "I");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IADD);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/xml/security/stax/impl/processor/input/AbstractDecryptInputProcessor$AbstractDecryptedEventReaderInputProcessor", "currentXMLStructureDepth", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xml/security/stax/impl/processor/input/AbstractDecryptInputProcessor$AbstractDecryptedEventReaderInputProcessor", "currentXMLStructureDepth", "I");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/xml/security/stax/impl/processor/input/AbstractDecryptInputProcessor", "maximumAllowedXMLStructureDepth", "Ljava/lang/Integer;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Integer", "intValue", "()I", false);
Label label6 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPLE, label6);
methodVisitor.visitTypeInsn(NEW, "org/apache/xml/security/exceptions/XMLSecurityException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("secureProcessing.MaximumAllowedXMLStructureDepth");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/xml/security/stax/impl/processor/input/AbstractDecryptInputProcessor", "maximumAllowedXMLStructureDepth", "Ljava/lang/Integer;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/xml/security/exceptions/XMLSecurityException", "<init>", "(Ljava/lang/String;[Ljava/lang/Object;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/xml/security/stax/ext/stax/XMLSecEvent", "asStartElement", "()Lorg/apache/xml/security/stax/ext/stax/XMLSecStartElement;", true);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/xml/security/stax/impl/processor/input/AbstractDecryptInputProcessor$AbstractDecryptedEventReaderInputProcessor", "parentXmlSecStartElement", "Lorg/apache/xml/security/stax/ext/stax/XMLSecStartElement;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xml/security/stax/impl/processor/input/AbstractDecryptInputProcessor$AbstractDecryptedEventReaderInputProcessor", "rootElementProcessed", "Z");
methodVisitor.visitJumpInsn(IFNE, label5);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xml/security/stax/impl/processor/input/AbstractDecryptInputProcessor$AbstractDecryptedEventReaderInputProcessor", "parentXmlSecStartElement", "Lorg/apache/xml/security/stax/ext/stax/XMLSecStartElement;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xml/security/stax/impl/processor/input/AbstractDecryptInputProcessor$AbstractDecryptedEventReaderInputProcessor", "inboundSecurityToken", "Lorg/apache/xml/security/stax/securityToken/InboundSecurityToken;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xml/security/stax/impl/processor/input/AbstractDecryptInputProcessor$AbstractDecryptedEventReaderInputProcessor", "encryptedDataType", "Lorg/apache/xml/security/binding/xmlenc/EncryptedDataType;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xml/security/stax/impl/processor/input/AbstractDecryptInputProcessor$AbstractDecryptedEventReaderInputProcessor", "handleEncryptedElement", "(Lorg/apache/xml/security/stax/ext/InputProcessorChain;Lorg/apache/xml/security/stax/ext/stax/XMLSecStartElement;Lorg/apache/xml/security/stax/securityToken/InboundSecurityToken;Lorg/apache/xml/security/binding/xmlenc/EncryptedDataType;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/xml/security/stax/impl/processor/input/AbstractDecryptInputProcessor$AbstractDecryptedEventReaderInputProcessor", "rootElementProcessed", "Z");
methodVisitor.visitJumpInsn(GOTO, label5);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xml/security/stax/impl/processor/input/AbstractDecryptInputProcessor$AbstractDecryptedEventReaderInputProcessor", "currentXMLStructureDepth", "I");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(ISUB);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/xml/security/stax/impl/processor/input/AbstractDecryptInputProcessor$AbstractDecryptedEventReaderInputProcessor", "currentXMLStructureDepth", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xml/security/stax/impl/processor/input/AbstractDecryptInputProcessor$AbstractDecryptedEventReaderInputProcessor", "parentXmlSecStartElement", "Lorg/apache/xml/security/stax/ext/stax/XMLSecStartElement;");
Label label7 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label7);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xml/security/stax/impl/processor/input/AbstractDecryptInputProcessor$AbstractDecryptedEventReaderInputProcessor", "parentXmlSecStartElement", "Lorg/apache/xml/security/stax/ext/stax/XMLSecStartElement;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/xml/security/stax/ext/stax/XMLSecStartElement", "getParentXMLSecStartElement", "()Lorg/apache/xml/security/stax/ext/stax/XMLSecStartElement;", true);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/xml/security/stax/impl/processor/input/AbstractDecryptInputProcessor$AbstractDecryptedEventReaderInputProcessor", "parentXmlSecStartElement", "Lorg/apache/xml/security/stax/ext/stax/XMLSecStartElement;");
methodVisitor.visitLabel(label7);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/xml/security/stax/ext/stax/XMLSecEvent", "asEndElement", "()Lorg/apache/xml/security/stax/ext/stax/XMLSecEndElement;", true);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/xml/security/stax/ext/stax/XMLSecEndElement", "getName", "()Ljavax/xml/namespace/QName;", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xml/security/stax/impl/processor/input/AbstractDecryptInputProcessor$AbstractDecryptedEventReaderInputProcessor", "this$0", "Lorg/apache/xml/security/stax/impl/processor/input/AbstractDecryptInputProcessor;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/xml/security/stax/impl/processor/input/AbstractDecryptInputProcessor", "access$000", "(Lorg/apache/xml/security/stax/impl/processor/input/AbstractDecryptInputProcessor;)Ljavax/xml/namespace/QName;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/xml/namespace/QName", "equals", "(Ljava/lang/Object;)Z", false);
methodVisitor.visitJumpInsn(IFEQ, label5);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/xml/security/stax/ext/InputProcessorChain", "createSubChain", "(Lorg/apache/xml/security/stax/ext/InputProcessor;)Lorg/apache/xml/security/stax/ext/InputProcessorChain;", true);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xml/security/stax/impl/processor/input/AbstractDecryptInputProcessor$AbstractDecryptedEventReaderInputProcessor", "encryptedHeader", "Z");
Label label8 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label8);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/xml/security/stax/ext/XMLSecurityConstants", "TAG_wsse11_EncryptedHeader", "Ljavax/xml/namespace/QName;");
methodVisitor.visitVarInsn(ASTORE, 5);
Label label9 = new Label();
methodVisitor.visitJumpInsn(GOTO, label9);
methodVisitor.visitLabel(label8);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"org/apache/xml/security/stax/ext/InputProcessorChain"}, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/xml/security/stax/ext/XMLSecurityConstants", "TAG_xenc_EncryptedData", "Ljavax/xml/namespace/QName;");
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitLabel(label9);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"javax/xml/namespace/QName"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/xml/security/stax/ext/InputProcessorChain", "reset", "()V", true);
methodVisitor.visitVarInsn(ILOAD, 2);
Label label10 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label10);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/xml/security/stax/ext/InputProcessorChain", "processHeaderEvent", "()Lorg/apache/xml/security/stax/ext/stax/XMLSecEvent;", true);
methodVisitor.visitVarInsn(ASTORE, 6);
Label label11 = new Label();
methodVisitor.visitJumpInsn(GOTO, label11);
methodVisitor.visitLabel(label10);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/xml/security/stax/ext/InputProcessorChain", "processEvent", "()Lorg/apache/xml/security/stax/ext/stax/XMLSecEvent;", true);
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitLabel(label11);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"org/apache/xml/security/stax/ext/stax/XMLSecEvent"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/xml/security/stax/ext/stax/XMLSecEvent", "getEventType", "()I", true);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitJumpInsn(IF_ICMPNE, label9);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/xml/security/stax/ext/stax/XMLSecEvent", "asEndElement", "()Lorg/apache/xml/security/stax/ext/stax/XMLSecEndElement;", true);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/xml/security/stax/ext/stax/XMLSecEndElement", "getName", "()Ljavax/xml/namespace/QName;", true);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/xml/namespace/QName", "equals", "(Ljava/lang/Object;)Z", false);
methodVisitor.visitJumpInsn(IFEQ, label9);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/xml/security/stax/ext/InputProcessorChain", "getDocumentContext", "()Lorg/apache/xml/security/stax/ext/DocumentContext;", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/xml/security/stax/ext/DocumentContext", "unsetIsInEncryptedContent", "(Ljava/lang/Object;)V", true);
methodVisitor.visitVarInsn(ILOAD, 2);
Label label12 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label12);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/xml/security/stax/ext/InputProcessorChain", "processHeaderEvent", "()Lorg/apache/xml/security/stax/ext/stax/XMLSecEvent;", true);
methodVisitor.visitVarInsn(ASTORE, 3);
Label label13 = new Label();
methodVisitor.visitJumpInsn(GOTO, label13);
methodVisitor.visitLabel(label12);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/xml/security/stax/ext/InputProcessorChain", "processEvent", "()Lorg/apache/xml/security/stax/ext/stax/XMLSecEvent;", true);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitLabel(label13);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xml/security/stax/impl/processor/input/AbstractDecryptInputProcessor$AbstractDecryptedEventReaderInputProcessor", "decryptionThread", "Ljava/lang/Thread;");
Label label14 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label14);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xml/security/stax/impl/processor/input/AbstractDecryptInputProcessor$AbstractDecryptedEventReaderInputProcessor", "decryptionThread", "Ljava/lang/Thread;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Thread", "join", "()V", false);
methodVisitor.visitLabel(label1);
Label label15 = new Label();
methodVisitor.visitJumpInsn(GOTO, label15);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/InterruptedException"});
methodVisitor.visitVarInsn(ASTORE, 7);
methodVisitor.visitTypeInsn(NEW, "javax/xml/stream/XMLStreamException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/stream/XMLStreamException", "<init>", "(Ljava/lang/Throwable;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label15);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/xml/security/stax/impl/processor/input/AbstractDecryptInputProcessor$AbstractDecryptedEventReaderInputProcessor", "testAndThrowUncaughtException", "()V", false);
methodVisitor.visitLabel(label14);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/xml/security/stax/ext/InputProcessorChain", "removeProcessor", "(Lorg/apache/xml/security/stax/ext/InputProcessor;)V", true);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_CHOP,3, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xml/security/stax/impl/processor/input/AbstractDecryptInputProcessor$AbstractDecryptedEventReaderInputProcessor", "xmlStreamReader", "Ljavax/xml/stream/XMLStreamReader;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/xml/stream/XMLStreamReader", "next", "()I", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(7, 8);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED | ACC_ABSTRACT, "handleEncryptedElement", "(Lorg/apache/xml/security/stax/ext/InputProcessorChain;Lorg/apache/xml/security/stax/ext/stax/XMLSecStartElement;Lorg/apache/xml/security/stax/securityToken/InboundSecurityToken;Lorg/apache/xml/security/binding/xmlenc/EncryptedDataType;)V", null, new String[] { "org/apache/xml/security/exceptions/XMLSecurityException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "uncaughtException", "(Ljava/lang/Thread;Ljava/lang/Throwable;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/xml/security/stax/impl/processor/input/AbstractDecryptInputProcessor$AbstractDecryptedEventReaderInputProcessor", "thrownException", "Ljava/lang/Throwable;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "testAndThrowUncaughtException", "()V", null, new String[] { "javax/xml/stream/XMLStreamException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xml/security/stax/impl/processor/input/AbstractDecryptInputProcessor$AbstractDecryptedEventReaderInputProcessor", "thrownException", "Ljava/lang/Throwable;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xml/security/stax/impl/processor/input/AbstractDecryptInputProcessor$AbstractDecryptedEventReaderInputProcessor", "thrownException", "Ljava/lang/Throwable;");
methodVisitor.visitTypeInsn(INSTANCEOF, "org/apache/xml/security/stax/ext/UncheckedXMLSecurityException");
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xml/security/stax/impl/processor/input/AbstractDecryptInputProcessor$AbstractDecryptedEventReaderInputProcessor", "thrownException", "Ljava/lang/Throwable;");
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/xml/security/stax/ext/UncheckedXMLSecurityException");
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitTypeInsn(NEW, "javax/xml/stream/XMLStreamException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xml/security/stax/ext/UncheckedXMLSecurityException", "getCause", "()Ljava/lang/Throwable;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/stream/XMLStreamException", "<init>", "(Ljava/lang/Throwable;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "javax/xml/stream/XMLStreamException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xml/security/stax/impl/processor/input/AbstractDecryptInputProcessor$AbstractDecryptedEventReaderInputProcessor", "thrownException", "Ljava/lang/Throwable;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Throwable", "getCause", "()Ljava/lang/Throwable;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/stream/XMLStreamException", "<init>", "(Ljava/lang/Throwable;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
