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
public class Stax2FilteredStreamReaderDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_5, ACC_PUBLIC | ACC_SUPER, "org/codehaus/stax2/ri/Stax2FilteredStreamReader", null, "org/codehaus/stax2/util/StreamReader2Delegate", new String[] { "javax/xml/stream/XMLStreamConstants" });

{
fieldVisitor = classWriter.visitField(ACC_FINAL, "mFilter", "Ljavax/xml/stream/StreamFilter;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljavax/xml/stream/XMLStreamReader;Ljavax/xml/stream/StreamFilter;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/codehaus/stax2/ri/Stax2ReaderAdapter", "wrapIfNecessary", "(Ljavax/xml/stream/XMLStreamReader;)Lorg/codehaus/stax2/XMLStreamReader2;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/codehaus/stax2/util/StreamReader2Delegate", "<init>", "(Lorg/codehaus/stax2/XMLStreamReader2;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/codehaus/stax2/ri/Stax2FilteredStreamReader", "mFilter", "Ljavax/xml/stream/StreamFilter;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "next", "()I", null, new String[] { "javax/xml/stream/XMLStreamException" });
methodVisitor.visitCode();
Label label0 = new Label();
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/codehaus/stax2/ri/Stax2FilteredStreamReader", "mDelegate2", "Lorg/codehaus/stax2/XMLStreamReader2;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/codehaus/stax2/XMLStreamReader2", "next", "()I", true);
methodVisitor.visitVarInsn(ISTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/codehaus/stax2/ri/Stax2FilteredStreamReader", "mFilter", "Ljavax/xml/stream/StreamFilter;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/xml/stream/StreamFilter", "accept", "(Ljavax/xml/stream/XMLStreamReader;)Z", true);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label1);
Label label2 = new Label();
methodVisitor.visitJumpInsn(GOTO, label2);
methodVisitor.visitLabel(label1);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitJumpInsn(IF_ICMPNE, label0);
methodVisitor.visitLabel(label2);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "nextTag", "()I", null, new String[] { "javax/xml/stream/XMLStreamException" });
methodVisitor.visitCode();
Label label0 = new Label();
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/codehaus/stax2/ri/Stax2FilteredStreamReader", "mDelegate2", "Lorg/codehaus/stax2/XMLStreamReader2;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/codehaus/stax2/XMLStreamReader2", "nextTag", "()I", true);
methodVisitor.visitVarInsn(ISTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/codehaus/stax2/ri/Stax2FilteredStreamReader", "mFilter", "Ljavax/xml/stream/StreamFilter;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/xml/stream/StreamFilter", "accept", "(Ljavax/xml/stream/XMLStreamReader;)Z", true);
methodVisitor.visitJumpInsn(IFEQ, label0);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label1);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
