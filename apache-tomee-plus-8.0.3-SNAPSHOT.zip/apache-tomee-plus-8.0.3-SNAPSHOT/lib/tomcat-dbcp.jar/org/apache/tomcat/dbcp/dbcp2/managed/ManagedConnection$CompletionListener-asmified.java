package asm.org.apache.tomcat.dbcp.dbcp2.managed;
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
public class ManagedConnection$CompletionListenerDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/tomcat/dbcp/dbcp2/managed/ManagedConnection$CompletionListener", null, "java/lang/Object", new String[] { "org/apache/tomcat/dbcp/dbcp2/managed/TransactionContextListener" });

classWriter.visitInnerClass("org/apache/tomcat/dbcp/dbcp2/managed/ManagedConnection$CompletionListener", "org/apache/tomcat/dbcp/dbcp2/managed/ManagedConnection", "CompletionListener", ACC_PROTECTED);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/apache/tomcat/dbcp/dbcp2/managed/ManagedConnection;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "<init>", "(Lorg/apache/tomcat/dbcp/dbcp2/managed/ManagedConnection;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/tomcat/dbcp/dbcp2/managed/ManagedConnection$CompletionListener", "this$0", "Lorg/apache/tomcat/dbcp/dbcp2/managed/ManagedConnection;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "afterCompletion", "(Lorg/apache/tomcat/dbcp/dbcp2/managed/TransactionContext;Z)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/dbcp/dbcp2/managed/ManagedConnection$CompletionListener", "this$0", "Lorg/apache/tomcat/dbcp/dbcp2/managed/ManagedConnection;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/tomcat/dbcp/dbcp2/managed/ManagedConnection", "access$000", "(Lorg/apache/tomcat/dbcp/dbcp2/managed/ManagedConnection;)Lorg/apache/tomcat/dbcp/dbcp2/managed/TransactionContext;", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPNE, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/dbcp/dbcp2/managed/ManagedConnection$CompletionListener", "this$0", "Lorg/apache/tomcat/dbcp/dbcp2/managed/ManagedConnection;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/dbcp/dbcp2/managed/ManagedConnection", "transactionComplete", "()V", false);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
