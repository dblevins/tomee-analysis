package asm.org.apache.tomcat.jdbc.pool.interceptor;
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
public class StatementFinalizer$StatementEntryDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/tomcat/jdbc/pool/interceptor/StatementFinalizer$StatementEntry", null, "java/lang/Object", null);

classWriter.visitInnerClass("org/apache/tomcat/jdbc/pool/interceptor/StatementFinalizer$StatementEntry", "org/apache/tomcat/jdbc/pool/interceptor/StatementFinalizer", "StatementEntry", ACC_PROTECTED);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "statement", "Ljava/lang/ref/WeakReference;", "Ljava/lang/ref/WeakReference<Ljava/sql/Statement;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "allocationStack", "Ljava/lang/Throwable;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/apache/tomcat/jdbc/pool/interceptor/StatementFinalizer;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/apache/tomcat/jdbc/pool/interceptor/StatementFinalizer;Ljava/sql/Statement;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/tomcat/jdbc/pool/interceptor/StatementFinalizer$StatementEntry", "this$0", "Lorg/apache/tomcat/jdbc/pool/interceptor/StatementFinalizer;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "java/lang/ref/WeakReference");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/ref/WeakReference", "<init>", "(Ljava/lang/Object;)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/tomcat/jdbc/pool/interceptor/StatementFinalizer$StatementEntry", "statement", "Ljava/lang/ref/WeakReference;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/tomcat/jdbc/pool/interceptor/StatementFinalizer", "access$000", "(Lorg/apache/tomcat/jdbc/pool/interceptor/StatementFinalizer;)Z", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "java/lang/Throwable");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Throwable", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/tomcat/jdbc/pool/interceptor/StatementFinalizer$StatementEntry", "allocationStack", "Ljava/lang/Throwable;");
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_FULL, 3, new Object[] {"org/apache/tomcat/jdbc/pool/interceptor/StatementFinalizer$StatementEntry", "org/apache/tomcat/jdbc/pool/interceptor/StatementFinalizer", "java/sql/Statement"}, 0, new Object[] {});
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getStatement", "()Ljava/sql/Statement;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/jdbc/pool/interceptor/StatementFinalizer$StatementEntry", "statement", "Ljava/lang/ref/WeakReference;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/ref/WeakReference", "get", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "java/sql/Statement");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getAllocationStack", "()Ljava/lang/Throwable;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/jdbc/pool/interceptor/StatementFinalizer$StatementEntry", "allocationStack", "Ljava/lang/Throwable;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
