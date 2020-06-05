package asm.org.jvnet.mimepull;
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
public class MIMEParser$MIMEEventIteratorDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_7, ACC_SUPER, "org/jvnet/mimepull/MIMEParser$MIMEEventIterator", "Ljava/lang/Object;Ljava/util/Iterator<Lorg/jvnet/mimepull/MIMEEvent;>;", "java/lang/Object", new String[] { "java/util/Iterator" });

classWriter.visitInnerClass("org/jvnet/mimepull/MIMEParser$MIMEEventIterator", "org/jvnet/mimepull/MIMEParser", "MIMEEventIterator", 0);

classWriter.visitInnerClass("org/jvnet/mimepull/MIMEEvent$Headers", "org/jvnet/mimepull/MIMEEvent", "Headers", ACC_FINAL | ACC_STATIC);

classWriter.visitInnerClass("org/jvnet/mimepull/MIMEEvent$Content", "org/jvnet/mimepull/MIMEEvent", "Content", ACC_FINAL | ACC_STATIC);

classWriter.visitInnerClass("org/jvnet/mimepull/MIMEParser$1", null, null, ACC_STATIC | ACC_SYNTHETIC);

classWriter.visitInnerClass("org/jvnet/mimepull/MIMEParser$STATE", "org/jvnet/mimepull/MIMEParser", "STATE", ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_ENUM);

classWriter.visitInnerClass("org/jvnet/mimepull/MIMEEvent$StartMessage", "org/jvnet/mimepull/MIMEEvent", "StartMessage", ACC_FINAL | ACC_STATIC);

classWriter.visitInnerClass("org/jvnet/mimepull/MIMEEvent$StartPart", "org/jvnet/mimepull/MIMEEvent", "StartPart", ACC_FINAL | ACC_STATIC);

classWriter.visitInnerClass("org/jvnet/mimepull/MIMEEvent$EndPart", "org/jvnet/mimepull/MIMEEvent", "EndPart", ACC_FINAL | ACC_STATIC);

classWriter.visitInnerClass("org/jvnet/mimepull/MIMEEvent$EndMessage", "org/jvnet/mimepull/MIMEEvent", "EndMessage", ACC_FINAL | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/jvnet/mimepull/MIMEParser;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/jvnet/mimepull/MIMEParser;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/jvnet/mimepull/MIMEParser$MIMEEventIterator", "this$0", "Lorg/jvnet/mimepull/MIMEParser;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "hasNext", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/jvnet/mimepull/MIMEParser$MIMEEventIterator", "this$0", "Lorg/jvnet/mimepull/MIMEParser;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/jvnet/mimepull/MIMEParser", "access$000", "(Lorg/jvnet/mimepull/MIMEParser;)Z", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitInsn(ICONST_1);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {Opcodes.INTEGER});
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "next", "()Lorg/jvnet/mimepull/MIMEEvent;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/jvnet/mimepull/MIMEParser$MIMEEventIterator", "this$0", "Lorg/jvnet/mimepull/MIMEParser;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/jvnet/mimepull/MIMEParser", "access$000", "(Lorg/jvnet/mimepull/MIMEParser;)Z", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitTypeInsn(NEW, "java/util/NoSuchElementException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/NoSuchElementException", "<init>", "()V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/jvnet/mimepull/MIMEParser$1", "$SwitchMap$org$jvnet$mimepull$MIMEParser$STATE", "[I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/jvnet/mimepull/MIMEParser$MIMEEventIterator", "this$0", "Lorg/jvnet/mimepull/MIMEParser;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/jvnet/mimepull/MIMEParser", "access$100", "(Lorg/jvnet/mimepull/MIMEParser;)Lorg/jvnet/mimepull/MIMEParser$STATE;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jvnet/mimepull/MIMEParser$STATE", "ordinal", "()I", false);
methodVisitor.visitInsn(IALOAD);
Label label1 = new Label();
Label label2 = new Label();
Label label3 = new Label();
Label label4 = new Label();
Label label5 = new Label();
Label label6 = new Label();
Label label7 = new Label();
Label label8 = new Label();
methodVisitor.visitTableSwitchInsn(1, 7, label8, new Label[] { label1, label2, label3, label4, label5, label6, label7 });
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/jvnet/mimepull/MIMEParser", "access$200", "()Ljava/util/logging/Logger;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "java/util/logging/Level", "FINER", "Ljava/util/logging/Level;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/logging/Logger", "isLoggable", "(Ljava/util/logging/Level;)Z", false);
Label label9 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label9);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/jvnet/mimepull/MIMEParser", "access$200", "()Ljava/util/logging/Logger;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "java/util/logging/Level", "FINER", "Ljava/util/logging/Level;");
methodVisitor.visitLdcInsn("MIMEParser state={0}");
methodVisitor.visitFieldInsn(GETSTATIC, "org/jvnet/mimepull/MIMEParser$STATE", "START_MESSAGE", "Lorg/jvnet/mimepull/MIMEParser$STATE;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/logging/Logger", "log", "(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Object;)V", false);
methodVisitor.visitLabel(label9);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/jvnet/mimepull/MIMEParser$MIMEEventIterator", "this$0", "Lorg/jvnet/mimepull/MIMEParser;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/jvnet/mimepull/MIMEParser$STATE", "SKIP_PREAMBLE", "Lorg/jvnet/mimepull/MIMEParser$STATE;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/jvnet/mimepull/MIMEParser", "access$102", "(Lorg/jvnet/mimepull/MIMEParser;Lorg/jvnet/mimepull/MIMEParser$STATE;)Lorg/jvnet/mimepull/MIMEParser$STATE;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/jvnet/mimepull/MIMEEvent", "START_MESSAGE", "Lorg/jvnet/mimepull/MIMEEvent$StartMessage;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/jvnet/mimepull/MIMEParser", "access$200", "()Ljava/util/logging/Logger;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "java/util/logging/Level", "FINER", "Ljava/util/logging/Level;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/logging/Logger", "isLoggable", "(Ljava/util/logging/Level;)Z", false);
Label label10 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label10);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/jvnet/mimepull/MIMEParser", "access$200", "()Ljava/util/logging/Logger;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "java/util/logging/Level", "FINER", "Ljava/util/logging/Level;");
methodVisitor.visitLdcInsn("MIMEParser state={0}");
methodVisitor.visitFieldInsn(GETSTATIC, "org/jvnet/mimepull/MIMEParser$STATE", "SKIP_PREAMBLE", "Lorg/jvnet/mimepull/MIMEParser$STATE;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/logging/Logger", "log", "(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Object;)V", false);
methodVisitor.visitLabel(label10);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/jvnet/mimepull/MIMEParser$MIMEEventIterator", "this$0", "Lorg/jvnet/mimepull/MIMEParser;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/jvnet/mimepull/MIMEParser", "access$300", "(Lorg/jvnet/mimepull/MIMEParser;)V", false);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/jvnet/mimepull/MIMEParser", "access$200", "()Ljava/util/logging/Logger;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "java/util/logging/Level", "FINER", "Ljava/util/logging/Level;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/logging/Logger", "isLoggable", "(Ljava/util/logging/Level;)Z", false);
Label label11 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label11);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/jvnet/mimepull/MIMEParser", "access$200", "()Ljava/util/logging/Logger;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "java/util/logging/Level", "FINER", "Ljava/util/logging/Level;");
methodVisitor.visitLdcInsn("MIMEParser state={0}");
methodVisitor.visitFieldInsn(GETSTATIC, "org/jvnet/mimepull/MIMEParser$STATE", "START_PART", "Lorg/jvnet/mimepull/MIMEParser$STATE;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/logging/Logger", "log", "(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Object;)V", false);
methodVisitor.visitLabel(label11);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/jvnet/mimepull/MIMEParser$MIMEEventIterator", "this$0", "Lorg/jvnet/mimepull/MIMEParser;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/jvnet/mimepull/MIMEParser$STATE", "HEADERS", "Lorg/jvnet/mimepull/MIMEParser$STATE;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/jvnet/mimepull/MIMEParser", "access$102", "(Lorg/jvnet/mimepull/MIMEParser;Lorg/jvnet/mimepull/MIMEParser$STATE;)Lorg/jvnet/mimepull/MIMEParser$STATE;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/jvnet/mimepull/MIMEEvent", "START_PART", "Lorg/jvnet/mimepull/MIMEEvent$StartPart;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/jvnet/mimepull/MIMEParser", "access$200", "()Ljava/util/logging/Logger;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "java/util/logging/Level", "FINER", "Ljava/util/logging/Level;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/logging/Logger", "isLoggable", "(Ljava/util/logging/Level;)Z", false);
Label label12 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label12);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/jvnet/mimepull/MIMEParser", "access$200", "()Ljava/util/logging/Logger;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "java/util/logging/Level", "FINER", "Ljava/util/logging/Level;");
methodVisitor.visitLdcInsn("MIMEParser state={0}");
methodVisitor.visitFieldInsn(GETSTATIC, "org/jvnet/mimepull/MIMEParser$STATE", "HEADERS", "Lorg/jvnet/mimepull/MIMEParser$STATE;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/logging/Logger", "log", "(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Object;)V", false);
methodVisitor.visitLabel(label12);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/jvnet/mimepull/MIMEParser$MIMEEventIterator", "this$0", "Lorg/jvnet/mimepull/MIMEParser;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/jvnet/mimepull/MIMEParser", "access$400", "(Lorg/jvnet/mimepull/MIMEParser;)Lorg/jvnet/mimepull/InternetHeaders;", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/jvnet/mimepull/MIMEParser$MIMEEventIterator", "this$0", "Lorg/jvnet/mimepull/MIMEParser;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/jvnet/mimepull/MIMEParser$STATE", "BODY", "Lorg/jvnet/mimepull/MIMEParser$STATE;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/jvnet/mimepull/MIMEParser", "access$102", "(Lorg/jvnet/mimepull/MIMEParser;Lorg/jvnet/mimepull/MIMEParser$STATE;)Lorg/jvnet/mimepull/MIMEParser$STATE;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/jvnet/mimepull/MIMEParser$MIMEEventIterator", "this$0", "Lorg/jvnet/mimepull/MIMEParser;");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/jvnet/mimepull/MIMEParser", "access$502", "(Lorg/jvnet/mimepull/MIMEParser;Z)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitTypeInsn(NEW, "org/jvnet/mimepull/MIMEEvent$Headers");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/jvnet/mimepull/MIMEEvent$Headers", "<init>", "(Lorg/jvnet/mimepull/InternetHeaders;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/jvnet/mimepull/MIMEParser", "access$200", "()Ljava/util/logging/Logger;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "java/util/logging/Level", "FINER", "Ljava/util/logging/Level;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/logging/Logger", "isLoggable", "(Ljava/util/logging/Level;)Z", false);
Label label13 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label13);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/jvnet/mimepull/MIMEParser", "access$200", "()Ljava/util/logging/Logger;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "java/util/logging/Level", "FINER", "Ljava/util/logging/Level;");
methodVisitor.visitLdcInsn("MIMEParser state={0}");
methodVisitor.visitFieldInsn(GETSTATIC, "org/jvnet/mimepull/MIMEParser$STATE", "BODY", "Lorg/jvnet/mimepull/MIMEParser$STATE;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/logging/Logger", "log", "(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Object;)V", false);
methodVisitor.visitLabel(label13);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/jvnet/mimepull/MIMEParser$MIMEEventIterator", "this$0", "Lorg/jvnet/mimepull/MIMEParser;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/jvnet/mimepull/MIMEParser", "access$600", "(Lorg/jvnet/mimepull/MIMEParser;)Ljava/nio/ByteBuffer;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/jvnet/mimepull/MIMEParser$MIMEEventIterator", "this$0", "Lorg/jvnet/mimepull/MIMEParser;");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/jvnet/mimepull/MIMEParser", "access$502", "(Lorg/jvnet/mimepull/MIMEParser;Z)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitTypeInsn(NEW, "org/jvnet/mimepull/MIMEEvent$Content");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/jvnet/mimepull/MIMEEvent$Content", "<init>", "(Ljava/nio/ByteBuffer;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/jvnet/mimepull/MIMEParser", "access$200", "()Ljava/util/logging/Logger;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "java/util/logging/Level", "FINER", "Ljava/util/logging/Level;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/logging/Logger", "isLoggable", "(Ljava/util/logging/Level;)Z", false);
Label label14 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label14);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/jvnet/mimepull/MIMEParser", "access$200", "()Ljava/util/logging/Logger;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "java/util/logging/Level", "FINER", "Ljava/util/logging/Level;");
methodVisitor.visitLdcInsn("MIMEParser state={0}");
methodVisitor.visitFieldInsn(GETSTATIC, "org/jvnet/mimepull/MIMEParser$STATE", "END_PART", "Lorg/jvnet/mimepull/MIMEParser$STATE;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/logging/Logger", "log", "(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Object;)V", false);
methodVisitor.visitLabel(label14);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/jvnet/mimepull/MIMEParser$MIMEEventIterator", "this$0", "Lorg/jvnet/mimepull/MIMEParser;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/jvnet/mimepull/MIMEParser", "access$700", "(Lorg/jvnet/mimepull/MIMEParser;)Z", false);
Label label15 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label15);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/jvnet/mimepull/MIMEParser$MIMEEventIterator", "this$0", "Lorg/jvnet/mimepull/MIMEParser;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/jvnet/mimepull/MIMEParser$STATE", "END_MESSAGE", "Lorg/jvnet/mimepull/MIMEParser$STATE;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/jvnet/mimepull/MIMEParser", "access$102", "(Lorg/jvnet/mimepull/MIMEParser;Lorg/jvnet/mimepull/MIMEParser$STATE;)Lorg/jvnet/mimepull/MIMEParser$STATE;", false);
methodVisitor.visitInsn(POP);
Label label16 = new Label();
methodVisitor.visitJumpInsn(GOTO, label16);
methodVisitor.visitLabel(label15);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/jvnet/mimepull/MIMEParser$MIMEEventIterator", "this$0", "Lorg/jvnet/mimepull/MIMEParser;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/jvnet/mimepull/MIMEParser$STATE", "START_PART", "Lorg/jvnet/mimepull/MIMEParser$STATE;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/jvnet/mimepull/MIMEParser", "access$102", "(Lorg/jvnet/mimepull/MIMEParser;Lorg/jvnet/mimepull/MIMEParser$STATE;)Lorg/jvnet/mimepull/MIMEParser$STATE;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label16);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/jvnet/mimepull/MIMEEvent", "END_PART", "Lorg/jvnet/mimepull/MIMEEvent$EndPart;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label7);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/jvnet/mimepull/MIMEParser", "access$200", "()Ljava/util/logging/Logger;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "java/util/logging/Level", "FINER", "Ljava/util/logging/Level;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/logging/Logger", "isLoggable", "(Ljava/util/logging/Level;)Z", false);
Label label17 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label17);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/jvnet/mimepull/MIMEParser", "access$200", "()Ljava/util/logging/Logger;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "java/util/logging/Level", "FINER", "Ljava/util/logging/Level;");
methodVisitor.visitLdcInsn("MIMEParser state={0}");
methodVisitor.visitFieldInsn(GETSTATIC, "org/jvnet/mimepull/MIMEParser$STATE", "END_MESSAGE", "Lorg/jvnet/mimepull/MIMEParser$STATE;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/logging/Logger", "log", "(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Object;)V", false);
methodVisitor.visitLabel(label17);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/jvnet/mimepull/MIMEParser$MIMEEventIterator", "this$0", "Lorg/jvnet/mimepull/MIMEParser;");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/jvnet/mimepull/MIMEParser", "access$002", "(Lorg/jvnet/mimepull/MIMEParser;Z)Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/jvnet/mimepull/MIMEEvent", "END_MESSAGE", "Lorg/jvnet/mimepull/MIMEEvent$EndMessage;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label8);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "org/jvnet/mimepull/MIMEParsingException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitLdcInsn("Unknown Parser state = ");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/jvnet/mimepull/MIMEParser$MIMEEventIterator", "this$0", "Lorg/jvnet/mimepull/MIMEParser;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/jvnet/mimepull/MIMEParser", "access$100", "(Lorg/jvnet/mimepull/MIMEParser;)Lorg/jvnet/mimepull/MIMEParser$STATE;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/Object;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/jvnet/mimepull/MIMEParsingException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "remove", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "java/lang/UnsupportedOperationException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/UnsupportedOperationException", "<init>", "()V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "next", "()Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/jvnet/mimepull/MIMEParser$MIMEEventIterator", "next", "()Lorg/jvnet/mimepull/MIMEEvent;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}