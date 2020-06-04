package asm.org.apache.cxf.staxutils;
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
public class DepthRestrictingStreamReaderDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/cxf/staxutils/DepthRestrictingStreamReader", null, "org/apache/cxf/staxutils/DepthXMLStreamReader", null);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "props", "Lorg/apache/cxf/staxutils/DocumentDepthProperties;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "totalElementCount", "I", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "stack", "Ljava/util/Deque;", "Ljava/util/Deque<Ljava/lang/Integer;>;", null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljavax/xml/stream/XMLStreamReader;III)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/staxutils/DocumentDepthProperties");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/staxutils/DocumentDepthProperties", "<init>", "(III)V", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/staxutils/DepthRestrictingStreamReader", "<init>", "(Ljavax/xml/stream/XMLStreamReader;Lorg/apache/cxf/staxutils/DocumentDepthProperties;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(7, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljavax/xml/stream/XMLStreamReader;Lorg/apache/cxf/staxutils/DocumentDepthProperties;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/staxutils/DepthXMLStreamReader", "<init>", "(Ljavax/xml/stream/XMLStreamReader;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "java/util/ArrayDeque");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/ArrayDeque", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/cxf/staxutils/DepthRestrictingStreamReader", "stack", "Ljava/util/Deque;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/cxf/staxutils/DepthRestrictingStreamReader", "props", "Lorg/apache/cxf/staxutils/DocumentDepthProperties;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "next", "()I", null, new String[] { "javax/xml/stream/XMLStreamException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/staxutils/DepthXMLStreamReader", "next", "()I", false);
methodVisitor.visitVarInsn(ISTORE, 1);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitInsn(ICONST_1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPNE, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/staxutils/DepthRestrictingStreamReader", "props", "Lorg/apache/cxf/staxutils/DocumentDepthProperties;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/staxutils/DocumentDepthProperties", "getInnerElementLevelThreshold", "()I", false);
methodVisitor.visitInsn(ICONST_M1);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPEQ, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/staxutils/DepthRestrictingStreamReader", "getDepth", "()I", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/staxutils/DepthRestrictingStreamReader", "props", "Lorg/apache/cxf/staxutils/DocumentDepthProperties;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/staxutils/DocumentDepthProperties", "getInnerElementLevelThreshold", "()I", false);
methodVisitor.visitJumpInsn(IF_ICMPLT, label1);
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/staxutils/DepthExceededStaxException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/staxutils/DepthExceededStaxException", "<init>", "()V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {Opcodes.INTEGER}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/staxutils/DepthRestrictingStreamReader", "props", "Lorg/apache/cxf/staxutils/DocumentDepthProperties;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/staxutils/DocumentDepthProperties", "getElementCountThreshold", "()I", false);
methodVisitor.visitInsn(ICONST_M1);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPEQ, label2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/staxutils/DepthRestrictingStreamReader", "totalElementCount", "I");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IADD);
methodVisitor.visitInsn(DUP_X1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/cxf/staxutils/DepthRestrictingStreamReader", "totalElementCount", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/staxutils/DepthRestrictingStreamReader", "props", "Lorg/apache/cxf/staxutils/DocumentDepthProperties;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/staxutils/DocumentDepthProperties", "getElementCountThreshold", "()I", false);
methodVisitor.visitJumpInsn(IF_ICMPLT, label2);
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/staxutils/DepthExceededStaxException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/staxutils/DepthExceededStaxException", "<init>", "()V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/staxutils/DepthRestrictingStreamReader", "props", "Lorg/apache/cxf/staxutils/DocumentDepthProperties;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/staxutils/DocumentDepthProperties", "getInnerElementCountThreshold", "()I", false);
methodVisitor.visitInsn(ICONST_M1);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPEQ, label3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/staxutils/DepthRestrictingStreamReader", "stack", "Ljava/util/Deque;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Deque", "isEmpty", "()Z", true);
Label label4 = new Label();
methodVisitor.visitJumpInsn(IFNE, label4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/staxutils/DepthRestrictingStreamReader", "stack", "Ljava/util/Deque;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Deque", "pop", "()Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/Integer");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Integer", "intValue", "()I", false);
methodVisitor.visitVarInsn(ISTORE, 2);
methodVisitor.visitIincInsn(2, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/staxutils/DepthRestrictingStreamReader", "props", "Lorg/apache/cxf/staxutils/DocumentDepthProperties;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/staxutils/DocumentDepthProperties", "getInnerElementCountThreshold", "()I", false);
Label label5 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPLT, label5);
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/staxutils/DepthExceededStaxException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/staxutils/DepthExceededStaxException", "<init>", "()V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {Opcodes.INTEGER}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/staxutils/DepthRestrictingStreamReader", "stack", "Ljava/util/Deque;");
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Integer", "valueOf", "(I)Ljava/lang/Integer;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Deque", "push", "(Ljava/lang/Object;)V", true);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/staxutils/DepthRestrictingStreamReader", "stack", "Ljava/util/Deque;");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Integer", "valueOf", "(I)Ljava/lang/Integer;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Deque", "push", "(Ljava/lang/Object;)V", true);
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitJumpInsn(IF_ICMPNE, label3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/staxutils/DepthRestrictingStreamReader", "props", "Lorg/apache/cxf/staxutils/DocumentDepthProperties;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/staxutils/DocumentDepthProperties", "getInnerElementCountThreshold", "()I", false);
methodVisitor.visitInsn(ICONST_M1);
methodVisitor.visitJumpInsn(IF_ICMPEQ, label3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/staxutils/DepthRestrictingStreamReader", "stack", "Ljava/util/Deque;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Deque", "pop", "()Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
