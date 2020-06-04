package asm.org.apache.xml.security.stax.impl.processor.output;
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
public class AbstractSignatureOutputProcessor$InternalSignatureOutputProcessorDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/xml/security/stax/impl/processor/output/AbstractSignatureOutputProcessor$InternalSignatureOutputProcessor", null, "org/apache/xml/security/stax/ext/AbstractOutputProcessor", null);

classWriter.visitInnerClass("org/apache/xml/security/stax/impl/processor/output/AbstractSignatureOutputProcessor$InternalSignatureOutputProcessor", "org/apache/xml/security/stax/impl/processor/output/AbstractSignatureOutputProcessor", "InternalSignatureOutputProcessor", ACC_PUBLIC);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "signaturePartDef", "Lorg/apache/xml/security/stax/impl/SignaturePartDef;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "xmlSecStartElement", "Lorg/apache/xml/security/stax/ext/stax/XMLSecStartElement;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "elementCounter", "I", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "bufferedDigestOutputStream", "Ljava/io/OutputStream;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "digestOutputStream", "Lorg/apache/xml/security/stax/impl/util/DigestOutputStream;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "transformer", "Lorg/apache/xml/security/stax/ext/Transformer;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/apache/xml/security/stax/impl/processor/output/AbstractSignatureOutputProcessor;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/apache/xml/security/stax/impl/processor/output/AbstractSignatureOutputProcessor;Lorg/apache/xml/security/stax/impl/SignaturePartDef;Lorg/apache/xml/security/stax/ext/stax/XMLSecStartElement;)V", null, new String[] { "org/apache/xml/security/exceptions/XMLSecurityException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/xml/security/stax/impl/processor/output/AbstractSignatureOutputProcessor$InternalSignatureOutputProcessor", "this$0", "Lorg/apache/xml/security/stax/impl/processor/output/AbstractSignatureOutputProcessor;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/xml/security/stax/ext/AbstractOutputProcessor", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/xml/security/stax/impl/processor/output/AbstractSignatureOutputProcessor$InternalSignatureOutputProcessor;"));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "getName", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xml/security/stax/impl/processor/output/AbstractSignatureOutputProcessor$InternalSignatureOutputProcessor", "addBeforeProcessor", "(Ljava/lang/Object;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/xml/security/stax/impl/processor/output/AbstractSignatureOutputProcessor$InternalSignatureOutputProcessor", "signaturePartDef", "Lorg/apache/xml/security/stax/impl/SignaturePartDef;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/xml/security/stax/impl/processor/output/AbstractSignatureOutputProcessor$InternalSignatureOutputProcessor", "xmlSecStartElement", "Lorg/apache/xml/security/stax/ext/stax/XMLSecStartElement;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "init", "(Lorg/apache/xml/security/stax/ext/OutputProcessorChain;)V", null, new String[] { "org/apache/xml/security/exceptions/XMLSecurityException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xml/security/stax/impl/processor/output/AbstractSignatureOutputProcessor$InternalSignatureOutputProcessor", "this$0", "Lorg/apache/xml/security/stax/impl/processor/output/AbstractSignatureOutputProcessor;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xml/security/stax/impl/processor/output/AbstractSignatureOutputProcessor$InternalSignatureOutputProcessor", "signaturePartDef", "Lorg/apache/xml/security/stax/impl/SignaturePartDef;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xml/security/stax/impl/SignaturePartDef", "getDigestAlgo", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xml/security/stax/impl/processor/output/AbstractSignatureOutputProcessor", "createMessageDigestOutputStream", "(Ljava/lang/String;)Lorg/apache/xml/security/stax/impl/util/DigestOutputStream;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/xml/security/stax/impl/processor/output/AbstractSignatureOutputProcessor$InternalSignatureOutputProcessor", "digestOutputStream", "Lorg/apache/xml/security/stax/impl/util/DigestOutputStream;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/apache/xml/security/utils/UnsyncBufferedOutputStream");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xml/security/stax/impl/processor/output/AbstractSignatureOutputProcessor$InternalSignatureOutputProcessor", "digestOutputStream", "Lorg/apache/xml/security/stax/impl/util/DigestOutputStream;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/xml/security/utils/UnsyncBufferedOutputStream", "<init>", "(Ljava/io/OutputStream;)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/xml/security/stax/impl/processor/output/AbstractSignatureOutputProcessor$InternalSignatureOutputProcessor", "bufferedDigestOutputStream", "Ljava/io/OutputStream;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xml/security/stax/impl/processor/output/AbstractSignatureOutputProcessor$InternalSignatureOutputProcessor", "this$0", "Lorg/apache/xml/security/stax/impl/processor/output/AbstractSignatureOutputProcessor;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xml/security/stax/impl/processor/output/AbstractSignatureOutputProcessor$InternalSignatureOutputProcessor", "bufferedDigestOutputStream", "Ljava/io/OutputStream;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xml/security/stax/impl/processor/output/AbstractSignatureOutputProcessor$InternalSignatureOutputProcessor", "signaturePartDef", "Lorg/apache/xml/security/stax/impl/SignaturePartDef;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xml/security/stax/impl/processor/output/AbstractSignatureOutputProcessor$InternalSignatureOutputProcessor", "xmlSecStartElement", "Lorg/apache/xml/security/stax/ext/stax/XMLSecStartElement;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xml/security/stax/impl/processor/output/AbstractSignatureOutputProcessor", "buildTransformerChain", "(Ljava/io/OutputStream;Lorg/apache/xml/security/stax/impl/SignaturePartDef;Lorg/apache/xml/security/stax/ext/stax/XMLSecStartElement;)Lorg/apache/xml/security/stax/ext/Transformer;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/xml/security/stax/impl/processor/output/AbstractSignatureOutputProcessor$InternalSignatureOutputProcessor", "transformer", "Lorg/apache/xml/security/stax/ext/Transformer;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/xml/security/stax/ext/AbstractOutputProcessor", "init", "(Lorg/apache/xml/security/stax/ext/OutputProcessorChain;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "processEvent", "(Lorg/apache/xml/security/stax/ext/stax/XMLSecEvent;Lorg/apache/xml/security/stax/ext/OutputProcessorChain;)V", null, new String[] { "javax/xml/stream/XMLStreamException", "org/apache/xml/security/exceptions/XMLSecurityException" });
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/io/IOException");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xml/security/stax/impl/processor/output/AbstractSignatureOutputProcessor$InternalSignatureOutputProcessor", "transformer", "Lorg/apache/xml/security/stax/ext/Transformer;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/xml/security/stax/ext/Transformer", "transform", "(Lorg/apache/xml/security/stax/ext/stax/XMLSecEvent;)V", true);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/xml/security/stax/ext/stax/XMLSecEvent", "getEventType", "()I", true);
Label label3 = new Label();
Label label4 = new Label();
Label label5 = new Label();
methodVisitor.visitLookupSwitchInsn(label5, new int[] { 1, 2 }, new Label[] { label3, label4 });
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xml/security/stax/impl/processor/output/AbstractSignatureOutputProcessor$InternalSignatureOutputProcessor", "elementCounter", "I");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IADD);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/xml/security/stax/impl/processor/output/AbstractSignatureOutputProcessor$InternalSignatureOutputProcessor", "elementCounter", "I");
methodVisitor.visitJumpInsn(GOTO, label5);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xml/security/stax/impl/processor/output/AbstractSignatureOutputProcessor$InternalSignatureOutputProcessor", "elementCounter", "I");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(ISUB);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/xml/security/stax/impl/processor/output/AbstractSignatureOutputProcessor$InternalSignatureOutputProcessor", "elementCounter", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xml/security/stax/impl/processor/output/AbstractSignatureOutputProcessor$InternalSignatureOutputProcessor", "elementCounter", "I");
methodVisitor.visitJumpInsn(IFNE, label5);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/xml/security/stax/ext/stax/XMLSecEvent", "asEndElement", "()Lorg/apache/xml/security/stax/ext/stax/XMLSecEndElement;", true);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/xml/security/stax/ext/stax/XMLSecEndElement", "getName", "()Ljavax/xml/namespace/QName;", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xml/security/stax/impl/processor/output/AbstractSignatureOutputProcessor$InternalSignatureOutputProcessor", "xmlSecStartElement", "Lorg/apache/xml/security/stax/ext/stax/XMLSecStartElement;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/xml/security/stax/ext/stax/XMLSecStartElement", "getName", "()Ljavax/xml/namespace/QName;", true);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/xml/namespace/QName", "equals", "(Ljava/lang/Object;)Z", false);
methodVisitor.visitJumpInsn(IFEQ, label5);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xml/security/stax/impl/processor/output/AbstractSignatureOutputProcessor$InternalSignatureOutputProcessor", "transformer", "Lorg/apache/xml/security/stax/ext/Transformer;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/xml/security/stax/ext/Transformer", "doFinal", "()V", true);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xml/security/stax/impl/processor/output/AbstractSignatureOutputProcessor$InternalSignatureOutputProcessor", "bufferedDigestOutputStream", "Ljava/io/OutputStream;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/io/OutputStream", "close", "()V", false);
methodVisitor.visitLabel(label1);
Label label6 = new Label();
methodVisitor.visitJumpInsn(GOTO, label6);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/io/IOException"});
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitTypeInsn(NEW, "org/apache/xml/security/exceptions/XMLSecurityException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/xml/security/exceptions/XMLSecurityException", "<init>", "(Ljava/lang/Exception;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xml/security/stax/impl/processor/output/AbstractSignatureOutputProcessor$InternalSignatureOutputProcessor", "digestOutputStream", "Lorg/apache/xml/security/stax/impl/util/DigestOutputStream;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xml/security/stax/impl/util/DigestOutputStream", "getDigestValue", "()[B", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/xml/security/utils/XMLUtils", "encodeToString", "([B)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/xml/security/stax/impl/processor/output/AbstractSignatureOutputProcessor", "access$000", "()Lorg/slf4j/Logger;", false);
methodVisitor.visitLdcInsn("Calculated Digest: {}");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/slf4j/Logger", "debug", "(Ljava/lang/String;Ljava/lang/Object;)V", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xml/security/stax/impl/processor/output/AbstractSignatureOutputProcessor$InternalSignatureOutputProcessor", "signaturePartDef", "Lorg/apache/xml/security/stax/impl/SignaturePartDef;");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xml/security/stax/impl/SignaturePartDef", "setDigestValue", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/xml/security/stax/ext/OutputProcessorChain", "removeProcessor", "(Lorg/apache/xml/security/stax/ext/OutputProcessor;)V", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xml/security/stax/impl/processor/output/AbstractSignatureOutputProcessor$InternalSignatureOutputProcessor", "this$0", "Lorg/apache/xml/security/stax/impl/processor/output/AbstractSignatureOutputProcessor;");
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xml/security/stax/impl/processor/output/AbstractSignatureOutputProcessor", "setActiveInternalSignatureOutputProcessor", "(Lorg/apache/xml/security/stax/impl/processor/output/AbstractSignatureOutputProcessor$InternalSignatureOutputProcessor;)V", false);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/xml/security/stax/ext/OutputProcessorChain", "processEvent", "(Lorg/apache/xml/security/stax/ext/stax/XMLSecEvent;)V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 4);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
