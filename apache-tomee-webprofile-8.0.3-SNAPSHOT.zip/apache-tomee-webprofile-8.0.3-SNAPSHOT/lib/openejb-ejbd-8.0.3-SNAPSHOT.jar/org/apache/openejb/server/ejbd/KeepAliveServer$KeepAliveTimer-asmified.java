package asm.org.apache.openejb.server.ejbd;
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
public class KeepAliveServer$KeepAliveTimerDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/openejb/server/ejbd/KeepAliveServer$KeepAliveTimer", null, "java/util/TimerTask", null);

classWriter.visitInnerClass("org/apache/openejb/server/ejbd/KeepAliveServer$KeepAliveTimer", "org/apache/openejb/server/ejbd/KeepAliveServer", "KeepAliveTimer", ACC_PUBLIC);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "kas", "Lorg/apache/openejb/server/ejbd/KeepAliveServer;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/apache/openejb/server/ejbd/KeepAliveServer;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/apache/openejb/server/ejbd/KeepAliveServer;Lorg/apache/openejb/server/ejbd/KeepAliveServer;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/server/ejbd/KeepAliveServer$KeepAliveTimer", "this$0", "Lorg/apache/openejb/server/ejbd/KeepAliveServer;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/TimerTask", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/server/ejbd/KeepAliveServer$KeepAliveTimer", "kas", "Lorg/apache/openejb/server/ejbd/KeepAliveServer;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "run", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/server/ejbd/KeepAliveServer$KeepAliveTimer", "kas", "Lorg/apache/openejb/server/ejbd/KeepAliveServer;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/server/ejbd/KeepAliveServer", "access$500", "(Lorg/apache/openejb/server/ejbd/KeepAliveServer;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
