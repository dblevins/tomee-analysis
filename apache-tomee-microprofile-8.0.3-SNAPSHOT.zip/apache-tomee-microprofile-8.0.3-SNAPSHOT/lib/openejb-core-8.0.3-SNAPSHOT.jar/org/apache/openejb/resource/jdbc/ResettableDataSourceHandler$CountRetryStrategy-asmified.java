package asm.org.apache.openejb.resource.jdbc;
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
public class ResettableDataSourceHandler$CountRetryStrategyDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/openejb/resource/jdbc/ResettableDataSourceHandler$CountRetryStrategy", null, "java/lang/Object", new String[] { "org/apache/openejb/resource/jdbc/ResettableDataSourceHandler$RetryStrategy" });

classWriter.visitInnerClass("org/apache/openejb/resource/jdbc/ResettableDataSourceHandler$CountRetryStrategy", "org/apache/openejb/resource/jdbc/ResettableDataSourceHandler", "CountRetryStrategy", ACC_PRIVATE | ACC_STATIC);

classWriter.visitInnerClass("org/apache/openejb/resource/jdbc/ResettableDataSourceHandler$Result", "org/apache/openejb/resource/jdbc/ResettableDataSourceHandler", "Result", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/apache/openejb/resource/jdbc/ResettableDataSourceHandler$CountResult", "org/apache/openejb/resource/jdbc/ResettableDataSourceHandler", "CountResult", ACC_PRIVATE | ACC_STATIC);

classWriter.visitInnerClass("org/apache/openejb/resource/jdbc/ResettableDataSourceHandler$RetryStrategy", "org/apache/openejb/resource/jdbc/ResettableDataSourceHandler", "RetryStrategy", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "task", "Ljava/lang/Runnable;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "max", "I", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljava/lang/Runnable;I)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/resource/jdbc/ResettableDataSourceHandler$CountRetryStrategy", "task", "Ljava/lang/Runnable;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/resource/jdbc/ResettableDataSourceHandler$CountRetryStrategy", "max", "I");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "shouldRetry", "(Ljava/lang/Throwable;Lorg/apache/openejb/resource/jdbc/ResettableDataSourceHandler$Result;)Lorg/apache/openejb/resource/jdbc/ResettableDataSourceHandler$Result;", null, null);
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/resource/jdbc/ResettableDataSourceHandler", "access$100", "()Lorg/apache/openejb/util/Logger;", false);
methodVisitor.visitLdcInsn("SQLException, resetting the connection pool.");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/util/Logger", "error", "(Ljava/lang/String;Ljava/lang/Throwable;)Ljava/lang/String;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 2);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitInsn(ICONST_1);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/openejb/resource/jdbc/ResettableDataSourceHandler$CountResult;"));
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "cast", "(Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/openejb/resource/jdbc/ResettableDataSourceHandler$CountResult");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/resource/jdbc/ResettableDataSourceHandler$CountResult", "access$300", "(Lorg/apache/openejb/resource/jdbc/ResettableDataSourceHandler$CountResult;)I", false);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IADD);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {Opcodes.INTEGER});
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Integer", "valueOf", "(I)Ljava/lang/Integer;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/resource/jdbc/ResettableDataSourceHandler$CountRetryStrategy", "task", "Ljava/lang/Runnable;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/lang/Runnable", "run", "()V", true);
Label label2 = new Label();
methodVisitor.visitLabel(label2);
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/resource/jdbc/ResettableDataSourceHandler$CountResult");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Integer", "intValue", "()I", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/resource/jdbc/ResettableDataSourceHandler$CountRetryStrategy", "max", "I");
Label label3 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPGT, label3);
methodVisitor.visitInsn(ICONST_1);
Label label4 = new Label();
methodVisitor.visitJumpInsn(GOTO, label4);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_FULL, 4, new Object[] {"org/apache/openejb/resource/jdbc/ResettableDataSourceHandler$CountRetryStrategy", "java/lang/Throwable", "org/apache/openejb/resource/jdbc/ResettableDataSourceHandler$Result", "java/lang/Integer"}, 2, new Object[] {label2, label2});
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_FULL, 4, new Object[] {"org/apache/openejb/resource/jdbc/ResettableDataSourceHandler$CountRetryStrategy", "java/lang/Throwable", "org/apache/openejb/resource/jdbc/ResettableDataSourceHandler$Result", "java/lang/Integer"}, 3, new Object[] {label2, label2, Opcodes.INTEGER});
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Integer", "intValue", "()I", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/resource/jdbc/ResettableDataSourceHandler$CountResult", "<init>", "(ZI)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
