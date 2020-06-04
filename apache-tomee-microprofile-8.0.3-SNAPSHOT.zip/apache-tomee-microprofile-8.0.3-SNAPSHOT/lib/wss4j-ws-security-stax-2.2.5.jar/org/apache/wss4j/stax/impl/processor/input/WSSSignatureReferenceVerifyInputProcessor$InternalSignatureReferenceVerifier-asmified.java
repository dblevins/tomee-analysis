package asm.org.apache.wss4j.stax.impl.processor.input;
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
public class WSSSignatureReferenceVerifyInputProcessor$InternalSignatureReferenceVerifierDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/wss4j/stax/impl/processor/input/WSSSignatureReferenceVerifyInputProcessor$InternalSignatureReferenceVerifier", null, "org/apache/xml/security/stax/impl/processor/input/AbstractSignatureReferenceVerifyInputProcessor$InternalSignatureReferenceVerifier", null);

classWriter.visitInnerClass("org/apache/wss4j/stax/impl/processor/input/WSSSignatureReferenceVerifyInputProcessor$InternalSignatureReferenceVerifier", "org/apache/wss4j/stax/impl/processor/input/WSSSignatureReferenceVerifyInputProcessor", "InternalSignatureReferenceVerifier", 0);

classWriter.visitInnerClass("org/apache/xml/security/stax/impl/processor/input/AbstractSignatureReferenceVerifyInputProcessor$InternalSignatureReferenceVerifier", "org/apache/xml/security/stax/impl/processor/input/AbstractSignatureReferenceVerifyInputProcessor", "InternalSignatureReferenceVerifier", ACC_PUBLIC);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/apache/wss4j/stax/impl/processor/input/WSSSignatureReferenceVerifyInputProcessor;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/apache/wss4j/stax/impl/processor/input/WSSSignatureReferenceVerifyInputProcessor;Lorg/apache/wss4j/stax/ext/WSSSecurityProperties;Lorg/apache/xml/security/stax/ext/InputProcessorChain;Lorg/apache/xml/security/binding/xmldsig/ReferenceType;Lorg/apache/xml/security/stax/ext/stax/XMLSecStartElement;)V", null, new String[] { "org/apache/xml/security/exceptions/XMLSecurityException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/wss4j/stax/impl/processor/input/WSSSignatureReferenceVerifyInputProcessor$InternalSignatureReferenceVerifier", "this$0", "Lorg/apache/wss4j/stax/impl/processor/input/WSSSignatureReferenceVerifyInputProcessor;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/xml/security/stax/impl/processor/input/AbstractSignatureReferenceVerifyInputProcessor$InternalSignatureReferenceVerifier", "<init>", "(Lorg/apache/xml/security/stax/impl/processor/input/AbstractSignatureReferenceVerifyInputProcessor;Lorg/apache/xml/security/stax/ext/XMLSecurityProperties;Lorg/apache/xml/security/stax/ext/InputProcessorChain;Lorg/apache/xml/security/binding/xmldsig/ReferenceType;Lorg/apache/xml/security/stax/ext/stax/XMLSecStartElement;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/wss4j/stax/impl/processor/input/WSSSignatureReferenceVerifyInputProcessor;"));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "getName", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/stax/impl/processor/input/WSSSignatureReferenceVerifyInputProcessor$InternalSignatureReferenceVerifier", "addAfterProcessor", "(Ljava/lang/Object;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(6, 6);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
