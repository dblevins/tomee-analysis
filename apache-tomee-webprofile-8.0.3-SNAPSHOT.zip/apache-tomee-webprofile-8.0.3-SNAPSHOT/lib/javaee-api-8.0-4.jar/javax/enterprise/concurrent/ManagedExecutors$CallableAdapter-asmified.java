package asm.javax.enterprise.concurrent;
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
public class ManagedExecutors$CallableAdapterDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_6, ACC_FINAL | ACC_SUPER, "javax/enterprise/concurrent/ManagedExecutors$CallableAdapter", "<V:Ljava/lang/Object;>Ljavax/enterprise/concurrent/ManagedExecutors$Adapter;Ljava/util/concurrent/Callable<TV;>;", "javax/enterprise/concurrent/ManagedExecutors$Adapter", new String[] { "java/util/concurrent/Callable" });

classWriter.visitInnerClass("javax/enterprise/concurrent/ManagedExecutors$CallableAdapter", "javax/enterprise/concurrent/ManagedExecutors", "CallableAdapter", ACC_PRIVATE | ACC_FINAL | ACC_STATIC);

classWriter.visitInnerClass("javax/enterprise/concurrent/ManagedExecutors$Adapter", "javax/enterprise/concurrent/ManagedExecutors", "Adapter", ACC_PRIVATE | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "task", "Ljava/util/concurrent/Callable;", "Ljava/util/concurrent/Callable<TV;>;", null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljava/util/concurrent/Callable;Ljava/util/Map;Ljavax/enterprise/concurrent/ManagedTaskListener;)V", "(Ljava/util/concurrent/Callable<TV;>;Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;Ljavax/enterprise/concurrent/ManagedTaskListener;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitLdcInsn(Type.getType("Ljavax/enterprise/concurrent/ManagedTask;"));
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "isInstance", "(Ljava/lang/Object;)Z", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitLdcInsn(Type.getType("Ljavax/enterprise/concurrent/ManagedTask;"));
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "cast", "(Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "javax/enterprise/concurrent/ManagedTask");
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_FULL, 4, new Object[] {Opcodes.UNINITIALIZED_THIS, "java/util/concurrent/Callable", "java/util/Map", "javax/enterprise/concurrent/ManagedTaskListener"}, 3, new Object[] {Opcodes.UNINITIALIZED_THIS, "javax/enterprise/concurrent/ManagedTaskListener", "java/util/Map"});
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_FULL, 4, new Object[] {Opcodes.UNINITIALIZED_THIS, "java/util/concurrent/Callable", "java/util/Map", "javax/enterprise/concurrent/ManagedTaskListener"}, 4, new Object[] {Opcodes.UNINITIALIZED_THIS, "javax/enterprise/concurrent/ManagedTaskListener", "java/util/Map", "javax/enterprise/concurrent/ManagedTask"});
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/enterprise/concurrent/ManagedExecutors$Adapter", "<init>", "(Ljavax/enterprise/concurrent/ManagedTaskListener;Ljava/util/Map;Ljavax/enterprise/concurrent/ManagedTask;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "javax/enterprise/concurrent/ManagedExecutors$CallableAdapter", "task", "Ljava/util/concurrent/Callable;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "call", "()Ljava/lang/Object;", "()TV;", new String[] { "java/lang/Exception" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "javax/enterprise/concurrent/ManagedExecutors$CallableAdapter", "task", "Ljava/util/concurrent/Callable;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/concurrent/Callable", "call", "()Ljava/lang/Object;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
