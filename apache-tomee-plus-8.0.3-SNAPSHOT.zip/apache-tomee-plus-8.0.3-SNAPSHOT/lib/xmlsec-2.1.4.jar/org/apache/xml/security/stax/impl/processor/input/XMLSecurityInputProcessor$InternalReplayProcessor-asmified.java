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
public class XMLSecurityInputProcessor$InternalReplayProcessorDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/xml/security/stax/impl/processor/input/XMLSecurityInputProcessor$InternalReplayProcessor", null, "org/apache/xml/security/stax/ext/AbstractInputProcessor", null);

classWriter.visitInnerClass("org/apache/xml/security/stax/impl/processor/input/XMLSecurityInputProcessor$InternalReplayProcessor", "org/apache/xml/security/stax/impl/processor/input/XMLSecurityInputProcessor", "InternalReplayProcessor", ACC_PUBLIC | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "xmlSecEventList", "Ljava/util/ArrayDeque;", "Ljava/util/ArrayDeque<Lorg/apache/xml/security/stax/ext/stax/XMLSecEvent;>;", null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/apache/xml/security/stax/ext/XMLSecurityProperties;Ljava/util/ArrayDeque;)V", "(Lorg/apache/xml/security/stax/ext/XMLSecurityProperties;Ljava/util/ArrayDeque<Lorg/apache/xml/security/stax/ext/stax/XMLSecEvent;>;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/xml/security/stax/ext/AbstractInputProcessor", "<init>", "(Lorg/apache/xml/security/stax/ext/XMLSecurityProperties;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/xml/security/stax/impl/processor/input/XMLSecurityInputProcessor$InternalReplayProcessor", "xmlSecEventList", "Ljava/util/ArrayDeque;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "processNextHeaderEvent", "(Lorg/apache/xml/security/stax/ext/InputProcessorChain;)Lorg/apache/xml/security/stax/ext/stax/XMLSecEvent;", null, new String[] { "javax/xml/stream/XMLStreamException", "org/apache/xml/security/exceptions/XMLSecurityException" });
methodVisitor.visitCode();
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "processNextEvent", "(Lorg/apache/xml/security/stax/ext/InputProcessorChain;)Lorg/apache/xml/security/stax/ext/stax/XMLSecEvent;", null, new String[] { "javax/xml/stream/XMLStreamException", "org/apache/xml/security/exceptions/XMLSecurityException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xml/security/stax/impl/processor/input/XMLSecurityInputProcessor$InternalReplayProcessor", "xmlSecEventList", "Ljava/util/ArrayDeque;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/ArrayDeque", "isEmpty", "()Z", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xml/security/stax/impl/processor/input/XMLSecurityInputProcessor$InternalReplayProcessor", "xmlSecEventList", "Ljava/util/ArrayDeque;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/ArrayDeque", "pollLast", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/xml/security/stax/ext/stax/XMLSecEvent");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/xml/security/stax/ext/InputProcessorChain", "removeProcessor", "(Lorg/apache/xml/security/stax/ext/InputProcessor;)V", true);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/xml/security/stax/ext/InputProcessorChain", "processEvent", "()Lorg/apache/xml/security/stax/ext/stax/XMLSecEvent;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
