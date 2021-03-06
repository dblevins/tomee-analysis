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
public class MIMEEvent$HeadersDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_7, ACC_FINAL | ACC_SUPER, "org/jvnet/mimepull/MIMEEvent$Headers", null, "org/jvnet/mimepull/MIMEEvent", null);

classWriter.visitInnerClass("org/jvnet/mimepull/MIMEEvent$Headers", "org/jvnet/mimepull/MIMEEvent", "Headers", ACC_FINAL | ACC_STATIC);

classWriter.visitInnerClass("org/jvnet/mimepull/MIMEEvent$EVENT_TYPE", "org/jvnet/mimepull/MIMEEvent", "EVENT_TYPE", ACC_FINAL | ACC_STATIC | ACC_ENUM);

{
fieldVisitor = classWriter.visitField(0, "ih", "Lorg/jvnet/mimepull/InternetHeaders;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/jvnet/mimepull/InternetHeaders;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/jvnet/mimepull/MIMEEvent", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/jvnet/mimepull/MIMEEvent$Headers", "ih", "Lorg/jvnet/mimepull/InternetHeaders;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "getEventType", "()Lorg/jvnet/mimepull/MIMEEvent$EVENT_TYPE;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/jvnet/mimepull/MIMEEvent$EVENT_TYPE", "HEADERS", "Lorg/jvnet/mimepull/MIMEEvent$EVENT_TYPE;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "getHeaders", "()Lorg/jvnet/mimepull/InternetHeaders;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/jvnet/mimepull/MIMEEvent$Headers", "ih", "Lorg/jvnet/mimepull/InternetHeaders;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
