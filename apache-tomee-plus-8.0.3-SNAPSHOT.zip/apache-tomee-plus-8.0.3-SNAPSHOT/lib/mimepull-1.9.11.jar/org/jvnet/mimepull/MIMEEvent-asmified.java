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
public class MIMEEventDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_7, ACC_SUPER | ACC_ABSTRACT, "org/jvnet/mimepull/MIMEEvent", null, "java/lang/Object", null);

classWriter.visitInnerClass("org/jvnet/mimepull/MIMEEvent$EndMessage", "org/jvnet/mimepull/MIMEEvent", "EndMessage", ACC_FINAL | ACC_STATIC);

classWriter.visitInnerClass("org/jvnet/mimepull/MIMEEvent$Content", "org/jvnet/mimepull/MIMEEvent", "Content", ACC_FINAL | ACC_STATIC);

classWriter.visitInnerClass("org/jvnet/mimepull/MIMEEvent$Headers", "org/jvnet/mimepull/MIMEEvent", "Headers", ACC_FINAL | ACC_STATIC);

classWriter.visitInnerClass("org/jvnet/mimepull/MIMEEvent$EndPart", "org/jvnet/mimepull/MIMEEvent", "EndPart", ACC_FINAL | ACC_STATIC);

classWriter.visitInnerClass("org/jvnet/mimepull/MIMEEvent$StartPart", "org/jvnet/mimepull/MIMEEvent", "StartPart", ACC_FINAL | ACC_STATIC);

classWriter.visitInnerClass("org/jvnet/mimepull/MIMEEvent$StartMessage", "org/jvnet/mimepull/MIMEEvent", "StartMessage", ACC_FINAL | ACC_STATIC);

classWriter.visitInnerClass("org/jvnet/mimepull/MIMEEvent$EVENT_TYPE", "org/jvnet/mimepull/MIMEEvent", "EVENT_TYPE", ACC_FINAL | ACC_STATIC | ACC_ENUM);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "START_MESSAGE", "Lorg/jvnet/mimepull/MIMEEvent$StartMessage;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "START_PART", "Lorg/jvnet/mimepull/MIMEEvent$StartPart;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "END_PART", "Lorg/jvnet/mimepull/MIMEEvent$EndPart;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "END_MESSAGE", "Lorg/jvnet/mimepull/MIMEEvent$EndMessage;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_ABSTRACT, "getEventType", "()Lorg/jvnet/mimepull/MIMEEvent$EVENT_TYPE;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/jvnet/mimepull/MIMEEvent$StartMessage");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/jvnet/mimepull/MIMEEvent$StartMessage", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/jvnet/mimepull/MIMEEvent", "START_MESSAGE", "Lorg/jvnet/mimepull/MIMEEvent$StartMessage;");
methodVisitor.visitTypeInsn(NEW, "org/jvnet/mimepull/MIMEEvent$StartPart");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/jvnet/mimepull/MIMEEvent$StartPart", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/jvnet/mimepull/MIMEEvent", "START_PART", "Lorg/jvnet/mimepull/MIMEEvent$StartPart;");
methodVisitor.visitTypeInsn(NEW, "org/jvnet/mimepull/MIMEEvent$EndPart");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/jvnet/mimepull/MIMEEvent$EndPart", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/jvnet/mimepull/MIMEEvent", "END_PART", "Lorg/jvnet/mimepull/MIMEEvent$EndPart;");
methodVisitor.visitTypeInsn(NEW, "org/jvnet/mimepull/MIMEEvent$EndMessage");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/jvnet/mimepull/MIMEEvent$EndMessage", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/jvnet/mimepull/MIMEEvent", "END_MESSAGE", "Lorg/jvnet/mimepull/MIMEEvent$EndMessage;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
