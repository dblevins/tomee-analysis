package asm.org.apache.openejb.resource.jdbc.managed.local;
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
public class ManagedConnection$ClosingSynchronizationDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/openejb/resource/jdbc/managed/local/ManagedConnection$ClosingSynchronization", null, "java/lang/Object", new String[] { "javax/transaction/Synchronization" });

classWriter.visitInnerClass("org/apache/openejb/resource/jdbc/managed/local/ManagedConnection$ClosingSynchronization", "org/apache/openejb/resource/jdbc/managed/local/ManagedConnection", "ClosingSynchronization", ACC_PRIVATE);

classWriter.visitInnerClass("org/apache/openejb/resource/jdbc/managed/local/ManagedConnection$1", null, null, ACC_STATIC | ACC_SYNTHETIC);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/apache/openejb/resource/jdbc/managed/local/ManagedConnection;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "(Lorg/apache/openejb/resource/jdbc/managed/local/ManagedConnection;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/resource/jdbc/managed/local/ManagedConnection$ClosingSynchronization", "this$0", "Lorg/apache/openejb/resource/jdbc/managed/local/ManagedConnection;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "beforeCompletion", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(0, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "afterCompletion", "(I)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/resource/jdbc/managed/local/ManagedConnection$ClosingSynchronization", "this$0", "Lorg/apache/openejb/resource/jdbc/managed/local/ManagedConnection;");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/resource/jdbc/managed/local/ManagedConnection", "access$100", "(Lorg/apache/openejb/resource/jdbc/managed/local/ManagedConnection;Z)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_SYNTHETIC, "<init>", "(Lorg/apache/openejb/resource/jdbc/managed/local/ManagedConnection;Lorg/apache/openejb/resource/jdbc/managed/local/ManagedConnection$1;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/resource/jdbc/managed/local/ManagedConnection$ClosingSynchronization", "<init>", "(Lorg/apache/openejb/resource/jdbc/managed/local/ManagedConnection;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
