package asm.org.apache.openejb.server.httpd;
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
public class HttpRequestImpl$SessionInvalidateListenerDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/openejb/server/httpd/HttpRequestImpl$SessionInvalidateListener", null, "org/apache/openejb/server/httpd/ServletSessionAdapter", null);

classWriter.visitInnerClass("org/apache/openejb/server/httpd/HttpRequestImpl$SessionInvalidateListener", "org/apache/openejb/server/httpd/HttpRequestImpl", "SessionInvalidateListener", ACC_PROTECTED);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "listener", "Lorg/apache/openejb/server/httpd/BeginWebBeansListener;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/apache/openejb/server/httpd/HttpRequestImpl;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/apache/openejb/server/httpd/HttpRequestImpl;Ljakarta/servlet/http/HttpSession;Lorg/apache/openejb/server/httpd/BeginWebBeansListener;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/server/httpd/HttpRequestImpl$SessionInvalidateListener", "this$0", "Lorg/apache/openejb/server/httpd/HttpRequestImpl;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/server/httpd/ServletSessionAdapter", "<init>", "(Ljakarta/servlet/http/HttpSession;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/server/httpd/HttpRequestImpl$SessionInvalidateListener", "listener", "Lorg/apache/openejb/server/httpd/BeginWebBeansListener;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "invalidate", "()V", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, null);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/server/httpd/ServletSessionAdapter", "invalidate", "()V", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/server/httpd/HttpRequestImpl$SessionInvalidateListener", "listener", "Lorg/apache/openejb/server/httpd/BeginWebBeansListener;");
methodVisitor.visitTypeInsn(NEW, "jakarta/servlet/http/HttpSessionEvent");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/server/httpd/HttpRequestImpl$SessionInvalidateListener", "session", "Ljakarta/servlet/http/HttpSession;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/servlet/http/HttpSessionEvent", "<init>", "(Ljakarta/servlet/http/HttpSession;)V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/server/httpd/BeginWebBeansListener", "sessionDestroyed", "(Ljakarta/servlet/http/HttpSessionEvent;)V", false);
Label label3 = new Label();
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/Throwable"});
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/server/httpd/HttpRequestImpl$SessionInvalidateListener", "listener", "Lorg/apache/openejb/server/httpd/BeginWebBeansListener;");
methodVisitor.visitTypeInsn(NEW, "jakarta/servlet/http/HttpSessionEvent");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/server/httpd/HttpRequestImpl$SessionInvalidateListener", "session", "Ljakarta/servlet/http/HttpSession;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/servlet/http/HttpSessionEvent", "<init>", "(Ljakarta/servlet/http/HttpSession;)V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/server/httpd/BeginWebBeansListener", "sessionDestroyed", "(Ljakarta/servlet/http/HttpSessionEvent;)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
