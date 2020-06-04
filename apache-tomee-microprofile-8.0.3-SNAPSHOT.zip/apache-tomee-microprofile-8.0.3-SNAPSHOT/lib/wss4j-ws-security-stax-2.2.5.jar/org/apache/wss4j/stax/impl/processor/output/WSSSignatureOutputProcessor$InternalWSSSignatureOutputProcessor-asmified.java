package asm.org.apache.wss4j.stax.impl.processor.output;
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
public class WSSSignatureOutputProcessor$InternalWSSSignatureOutputProcessorDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/wss4j/stax/impl/processor/output/WSSSignatureOutputProcessor$InternalWSSSignatureOutputProcessor", null, "org/apache/xml/security/stax/impl/processor/output/AbstractSignatureOutputProcessor$InternalSignatureOutputProcessor", null);

classWriter.visitInnerClass("org/apache/wss4j/stax/impl/processor/output/WSSSignatureOutputProcessor$InternalWSSSignatureOutputProcessor", "org/apache/wss4j/stax/impl/processor/output/WSSSignatureOutputProcessor", "InternalWSSSignatureOutputProcessor", 0);

classWriter.visitInnerClass("org/apache/xml/security/stax/impl/processor/output/AbstractSignatureOutputProcessor$InternalSignatureOutputProcessor", "org/apache/xml/security/stax/impl/processor/output/AbstractSignatureOutputProcessor", "InternalSignatureOutputProcessor", ACC_PUBLIC);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/apache/wss4j/stax/impl/processor/output/WSSSignatureOutputProcessor;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/apache/wss4j/stax/impl/processor/output/WSSSignatureOutputProcessor;Lorg/apache/xml/security/stax/impl/SignaturePartDef;Lorg/apache/xml/security/stax/ext/stax/XMLSecStartElement;)V", null, new String[] { "org/apache/xml/security/exceptions/XMLSecurityException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/wss4j/stax/impl/processor/output/WSSSignatureOutputProcessor$InternalWSSSignatureOutputProcessor", "this$0", "Lorg/apache/wss4j/stax/impl/processor/output/WSSSignatureOutputProcessor;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/xml/security/stax/impl/processor/output/AbstractSignatureOutputProcessor$InternalSignatureOutputProcessor", "<init>", "(Lorg/apache/xml/security/stax/impl/processor/output/AbstractSignatureOutputProcessor;Lorg/apache/xml/security/stax/impl/SignaturePartDef;Lorg/apache/xml/security/stax/ext/stax/XMLSecStartElement;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/wss4j/stax/impl/processor/output/WSSSignatureOutputProcessor$InternalWSSSignatureOutputProcessor;"));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "getName", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/stax/impl/processor/output/WSSSignatureOutputProcessor$InternalWSSSignatureOutputProcessor", "addBeforeProcessor", "(Ljava/lang/Object;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
