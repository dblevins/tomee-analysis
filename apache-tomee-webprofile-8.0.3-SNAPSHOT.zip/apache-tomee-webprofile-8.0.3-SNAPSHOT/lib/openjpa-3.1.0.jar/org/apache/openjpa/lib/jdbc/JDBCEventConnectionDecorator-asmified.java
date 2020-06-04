package asm.org.apache.openjpa.lib.jdbc;
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
public class JDBCEventConnectionDecoratorDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/openjpa/lib/jdbc/JDBCEventConnectionDecorator", null, "org/apache/openjpa/lib/util/concurrent/AbstractConcurrentEventManager", new String[] { "org/apache/openjpa/lib/jdbc/ConnectionDecorator" });

classWriter.visitInnerClass("org/apache/openjpa/lib/jdbc/JDBCEventConnectionDecorator$EventStatement", "org/apache/openjpa/lib/jdbc/JDBCEventConnectionDecorator", "EventStatement", ACC_PRIVATE);

classWriter.visitInnerClass("org/apache/openjpa/lib/jdbc/JDBCEventConnectionDecorator$EventPreparedStatement", "org/apache/openjpa/lib/jdbc/JDBCEventConnectionDecorator", "EventPreparedStatement", ACC_PRIVATE);

classWriter.visitInnerClass("org/apache/openjpa/lib/jdbc/JDBCEventConnectionDecorator$EventConnection", "org/apache/openjpa/lib/jdbc/JDBCEventConnectionDecorator", "EventConnection", ACC_PRIVATE);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "serialVersionUID", "J", null, new Long(1L));
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/lib/util/concurrent/AbstractConcurrentEventManager", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "decorate", "(Ljava/sql/Connection;)Ljava/sql/Connection;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/jdbc/JDBCEventConnectionDecorator", "hasListeners", "()Z", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/lib/jdbc/JDBCEventConnectionDecorator$EventConnection");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/lib/jdbc/JDBCEventConnectionDecorator$EventConnection", "<init>", "(Lorg/apache/openjpa/lib/jdbc/JDBCEventConnectionDecorator;Ljava/sql/Connection;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "fireEvent", "(Ljava/sql/Connection;SLorg/apache/openjpa/lib/jdbc/JDBCEvent;Ljava/sql/Statement;Ljava/lang/String;)Lorg/apache/openjpa/lib/jdbc/JDBCEvent;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/jdbc/JDBCEventConnectionDecorator", "hasListeners", "()Z", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/lib/jdbc/JDBCEvent");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/lib/jdbc/JDBCEvent", "<init>", "(Ljava/sql/Connection;SLorg/apache/openjpa/lib/jdbc/JDBCEvent;Ljava/sql/Statement;Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/jdbc/JDBCEventConnectionDecorator", "fireEvent", "(Ljava/lang/Object;)[Ljava/lang/Exception;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(7, 7);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "fireEvent", "(Ljava/lang/Object;Ljava/lang/Object;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/openjpa/lib/jdbc/JDBCListener");
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/openjpa/lib/jdbc/JDBCEvent");
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/jdbc/JDBCEvent", "getType", "()S", false);
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
Label label3 = new Label();
Label label4 = new Label();
Label label5 = new Label();
Label label6 = new Label();
Label label7 = new Label();
Label label8 = new Label();
Label label9 = new Label();
Label label10 = new Label();
Label label11 = new Label();
Label label12 = new Label();
methodVisitor.visitTableSwitchInsn(1, 12, label12, new Label[] { label0, label1, label2, label3, label4, label5, label6, label7, label8, label9, label10, label11 });
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {"org/apache/openjpa/lib/jdbc/JDBCListener", "org/apache/openjpa/lib/jdbc/JDBCEvent"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openjpa/lib/jdbc/JDBCListener", "beforePrepareStatement", "(Lorg/apache/openjpa/lib/jdbc/JDBCEvent;)V", true);
methodVisitor.visitJumpInsn(GOTO, label12);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openjpa/lib/jdbc/JDBCListener", "afterPrepareStatement", "(Lorg/apache/openjpa/lib/jdbc/JDBCEvent;)V", true);
methodVisitor.visitJumpInsn(GOTO, label12);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openjpa/lib/jdbc/JDBCListener", "beforeCreateStatement", "(Lorg/apache/openjpa/lib/jdbc/JDBCEvent;)V", true);
methodVisitor.visitJumpInsn(GOTO, label12);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openjpa/lib/jdbc/JDBCListener", "afterCreateStatement", "(Lorg/apache/openjpa/lib/jdbc/JDBCEvent;)V", true);
methodVisitor.visitJumpInsn(GOTO, label12);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openjpa/lib/jdbc/JDBCListener", "beforeExecuteStatement", "(Lorg/apache/openjpa/lib/jdbc/JDBCEvent;)V", true);
methodVisitor.visitJumpInsn(GOTO, label12);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openjpa/lib/jdbc/JDBCListener", "afterExecuteStatement", "(Lorg/apache/openjpa/lib/jdbc/JDBCEvent;)V", true);
methodVisitor.visitJumpInsn(GOTO, label12);
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openjpa/lib/jdbc/JDBCListener", "beforeCommit", "(Lorg/apache/openjpa/lib/jdbc/JDBCEvent;)V", true);
methodVisitor.visitJumpInsn(GOTO, label12);
methodVisitor.visitLabel(label7);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openjpa/lib/jdbc/JDBCListener", "afterCommit", "(Lorg/apache/openjpa/lib/jdbc/JDBCEvent;)V", true);
methodVisitor.visitJumpInsn(GOTO, label12);
methodVisitor.visitLabel(label8);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openjpa/lib/jdbc/JDBCListener", "beforeRollback", "(Lorg/apache/openjpa/lib/jdbc/JDBCEvent;)V", true);
methodVisitor.visitJumpInsn(GOTO, label12);
methodVisitor.visitLabel(label9);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openjpa/lib/jdbc/JDBCListener", "afterRollback", "(Lorg/apache/openjpa/lib/jdbc/JDBCEvent;)V", true);
methodVisitor.visitJumpInsn(GOTO, label12);
methodVisitor.visitLabel(label10);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openjpa/lib/jdbc/JDBCListener", "afterConnect", "(Lorg/apache/openjpa/lib/jdbc/JDBCEvent;)V", true);
methodVisitor.visitJumpInsn(GOTO, label12);
methodVisitor.visitLabel(label11);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openjpa/lib/jdbc/JDBCListener", "beforeClose", "(Lorg/apache/openjpa/lib/jdbc/JDBCEvent;)V", true);
methodVisitor.visitLabel(label12);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$000", "(Lorg/apache/openjpa/lib/jdbc/JDBCEventConnectionDecorator;Ljava/sql/Connection;SLorg/apache/openjpa/lib/jdbc/JDBCEvent;Ljava/sql/Statement;Ljava/lang/String;)Lorg/apache/openjpa/lib/jdbc/JDBCEvent;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/lib/jdbc/JDBCEventConnectionDecorator", "fireEvent", "(Ljava/sql/Connection;SLorg/apache/openjpa/lib/jdbc/JDBCEvent;Ljava/sql/Statement;Ljava/lang/String;)Lorg/apache/openjpa/lib/jdbc/JDBCEvent;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(6, 6);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
