package asm.org.eclipse.persistence.internal.sessions.coordination.jms;
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
public class JMSTopicRemoteConnection$JMSOnMessageHelperDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/eclipse/persistence/internal/sessions/coordination/jms/JMSTopicRemoteConnection$JMSOnMessageHelper", null, "java/lang/Object", new String[] { "java/lang/Runnable" });

classWriter.visitInnerClass("org/eclipse/persistence/internal/sessions/coordination/jms/JMSTopicRemoteConnection$JMSOnMessageHelper", "org/eclipse/persistence/internal/sessions/coordination/jms/JMSTopicRemoteConnection", "JMSOnMessageHelper", 0);

{
fieldVisitor = classWriter.visitField(0, "message", "Ljavax/jms/Message;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/eclipse/persistence/internal/sessions/coordination/jms/JMSTopicRemoteConnection;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/eclipse/persistence/internal/sessions/coordination/jms/JMSTopicRemoteConnection;Ljavax/jms/Message;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/sessions/coordination/jms/JMSTopicRemoteConnection$JMSOnMessageHelper", "this$0", "Lorg/eclipse/persistence/internal/sessions/coordination/jms/JMSTopicRemoteConnection;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/sessions/coordination/jms/JMSTopicRemoteConnection$JMSOnMessageHelper", "message", "Ljavax/jms/Message;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/sessions/coordination/jms/JMSTopicRemoteConnection$JMSOnMessageHelper", "message", "Ljavax/jms/Message;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "run", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/sessions/coordination/jms/JMSTopicRemoteConnection$JMSOnMessageHelper", "this$0", "Lorg/eclipse/persistence/internal/sessions/coordination/jms/JMSTopicRemoteConnection;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/sessions/coordination/jms/JMSTopicRemoteConnection$JMSOnMessageHelper", "message", "Ljavax/jms/Message;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/sessions/coordination/jms/JMSTopicRemoteConnection", "onMessage", "(Ljavax/jms/Message;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
