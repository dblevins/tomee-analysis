package asm.org.apache.commons.lang3;
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
public class ThreadUtilsDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_7, ACC_PUBLIC | ACC_SUPER, "org/apache/commons/lang3/ThreadUtils", null, "java/lang/Object", null);

classWriter.visitInnerClass("org/apache/commons/lang3/ThreadUtils$1", null, null, ACC_STATIC | ACC_SYNTHETIC);

classWriter.visitInnerClass("org/apache/commons/lang3/ThreadUtils$ThreadIdPredicate", "org/apache/commons/lang3/ThreadUtils", "ThreadIdPredicate", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/apache/commons/lang3/ThreadUtils$NamePredicate", "org/apache/commons/lang3/ThreadUtils", "NamePredicate", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/apache/commons/lang3/ThreadUtils$AlwaysTruePredicate", "org/apache/commons/lang3/ThreadUtils", "AlwaysTruePredicate", ACC_PRIVATE | ACC_FINAL | ACC_STATIC);

classWriter.visitInnerClass("org/apache/commons/lang3/ThreadUtils$ThreadGroupPredicate", "org/apache/commons/lang3/ThreadUtils", "ThreadGroupPredicate", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

classWriter.visitInnerClass("org/apache/commons/lang3/ThreadUtils$ThreadPredicate", "org/apache/commons/lang3/ThreadUtils", "ThreadPredicate", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ALWAYS_TRUE_PREDICATE", "Lorg/apache/commons/lang3/ThreadUtils$AlwaysTruePredicate;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "findThreadById", "(JLjava/lang/ThreadGroup;)Ljava/lang/Thread;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 2);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitInsn(ICONST_1);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {Opcodes.INTEGER});
methodVisitor.visitLdcInsn("The thread group must not be null");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/lang3/Validate", "isTrue", "(ZLjava/lang/String;[Ljava/lang/Object;)V", false);
methodVisitor.visitVarInsn(LLOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/lang3/ThreadUtils", "findThreadById", "(J)Ljava/lang/Thread;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Thread", "getThreadGroup", "()Ljava/lang/ThreadGroup;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "equals", "(Ljava/lang/Object;)Z", false);
methodVisitor.visitJumpInsn(IFEQ, label2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/lang/Thread"}, 0, null);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "findThreadById", "(JLjava/lang/String;)Ljava/lang/Thread;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 2);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitInsn(ICONST_1);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {Opcodes.INTEGER});
methodVisitor.visitLdcInsn("The thread group name must not be null");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/lang3/Validate", "isTrue", "(ZLjava/lang/String;[Ljava/lang/Object;)V", false);
methodVisitor.visitVarInsn(LLOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/lang3/ThreadUtils", "findThreadById", "(J)Ljava/lang/Thread;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Thread", "getThreadGroup", "()Ljava/lang/ThreadGroup;", false);
methodVisitor.visitJumpInsn(IFNULL, label2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Thread", "getThreadGroup", "()Ljava/lang/ThreadGroup;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/ThreadGroup", "getName", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equals", "(Ljava/lang/Object;)Z", false);
methodVisitor.visitJumpInsn(IFEQ, label2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/lang/Thread"}, 0, null);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "findThreadsByName", "(Ljava/lang/String;Ljava/lang/ThreadGroup;)Ljava/util/Collection;", "(Ljava/lang/String;Ljava/lang/ThreadGroup;)Ljava/util/Collection<Ljava/lang/Thread;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitTypeInsn(NEW, "org/apache/commons/lang3/ThreadUtils$NamePredicate");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/lang3/ThreadUtils$NamePredicate", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/lang3/ThreadUtils", "findThreads", "(Ljava/lang/ThreadGroup;ZLorg/apache/commons/lang3/ThreadUtils$ThreadPredicate;)Ljava/util/Collection;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "findThreadsByName", "(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Collection;", "(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Collection<Ljava/lang/Thread;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitInsn(ICONST_1);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {Opcodes.INTEGER});
methodVisitor.visitLdcInsn("The thread name must not be null");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/lang3/Validate", "isTrue", "(ZLjava/lang/String;[Ljava/lang/Object;)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label2);
methodVisitor.visitInsn(ICONST_1);
Label label3 = new Label();
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {Opcodes.INTEGER});
methodVisitor.visitLdcInsn("The thread group name must not be null");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/lang3/Validate", "isTrue", "(ZLjava/lang/String;[Ljava/lang/Object;)V", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/commons/lang3/ThreadUtils$NamePredicate");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/lang3/ThreadUtils$NamePredicate", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/lang3/ThreadUtils", "findThreadGroups", "(Lorg/apache/commons/lang3/ThreadUtils$ThreadGroupPredicate;)Ljava/util/Collection;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Collection", "isEmpty", "()Z", true);
Label label4 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label4);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/Collections", "emptyList", "()Ljava/util/List;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/util/Collection"}, 0, null);
methodVisitor.visitTypeInsn(NEW, "java/util/ArrayList");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/ArrayList", "<init>", "()V", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitTypeInsn(NEW, "org/apache/commons/lang3/ThreadUtils$NamePredicate");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/lang3/ThreadUtils$NamePredicate", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Collection", "iterator", "()Ljava/util/Iterator;", true);
methodVisitor.visitVarInsn(ASTORE, 5);
Label label5 = new Label();
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_APPEND,3, new Object[] {"java/util/Collection", "org/apache/commons/lang3/ThreadUtils$NamePredicate", "java/util/Iterator"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "hasNext", "()Z", true);
Label label6 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label6);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "next", "()Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/ThreadGroup");
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/lang3/ThreadUtils", "findThreads", "(Ljava/lang/ThreadGroup;ZLorg/apache/commons/lang3/ThreadUtils$ThreadPredicate;)Ljava/util/Collection;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Collection", "addAll", "(Ljava/util/Collection;)Z", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitJumpInsn(GOTO, label5);
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/Collections", "unmodifiableCollection", "(Ljava/util/Collection;)Ljava/util/Collection;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 7);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "findThreadGroupsByName", "(Ljava/lang/String;)Ljava/util/Collection;", "(Ljava/lang/String;)Ljava/util/Collection<Ljava/lang/ThreadGroup;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/commons/lang3/ThreadUtils$NamePredicate");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/lang3/ThreadUtils$NamePredicate", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/lang3/ThreadUtils", "findThreadGroups", "(Lorg/apache/commons/lang3/ThreadUtils$ThreadGroupPredicate;)Ljava/util/Collection;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "getAllThreadGroups", "()Ljava/util/Collection;", "()Ljava/util/Collection<Ljava/lang/ThreadGroup;>;", null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/lang3/ThreadUtils", "ALWAYS_TRUE_PREDICATE", "Lorg/apache/commons/lang3/ThreadUtils$AlwaysTruePredicate;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/lang3/ThreadUtils", "findThreadGroups", "(Lorg/apache/commons/lang3/ThreadUtils$ThreadGroupPredicate;)Ljava/util/Collection;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "getSystemThreadGroup", "()Ljava/lang/ThreadGroup;", null, null);
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Thread", "currentThread", "()Ljava/lang/Thread;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Thread", "getThreadGroup", "()Ljava/lang/ThreadGroup;", false);
methodVisitor.visitVarInsn(ASTORE, 0);
Label label0 = new Label();
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/lang/ThreadGroup"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/ThreadGroup", "getParent", "()Ljava/lang/ThreadGroup;", false);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/ThreadGroup", "getParent", "()Ljava/lang/ThreadGroup;", false);
methodVisitor.visitVarInsn(ASTORE, 0);
methodVisitor.visitJumpInsn(GOTO, label0);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "getAllThreads", "()Ljava/util/Collection;", "()Ljava/util/Collection<Ljava/lang/Thread;>;", null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/lang3/ThreadUtils", "ALWAYS_TRUE_PREDICATE", "Lorg/apache/commons/lang3/ThreadUtils$AlwaysTruePredicate;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/lang3/ThreadUtils", "findThreads", "(Lorg/apache/commons/lang3/ThreadUtils$ThreadPredicate;)Ljava/util/Collection;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "findThreadsByName", "(Ljava/lang/String;)Ljava/util/Collection;", "(Ljava/lang/String;)Ljava/util/Collection<Ljava/lang/Thread;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/commons/lang3/ThreadUtils$NamePredicate");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/lang3/ThreadUtils$NamePredicate", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/lang3/ThreadUtils", "findThreads", "(Lorg/apache/commons/lang3/ThreadUtils$ThreadPredicate;)Ljava/util/Collection;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "findThreadById", "(J)Ljava/lang/Thread;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/commons/lang3/ThreadUtils$ThreadIdPredicate");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(LLOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/lang3/ThreadUtils$ThreadIdPredicate", "<init>", "(J)V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/lang3/ThreadUtils", "findThreads", "(Lorg/apache/commons/lang3/ThreadUtils$ThreadPredicate;)Ljava/util/Collection;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Collection", "isEmpty", "()Z", true);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitInsn(ACONST_NULL);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/util/Collection"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Collection", "iterator", "()Ljava/util/Iterator;", true);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "next", "()Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/Thread");
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/Thread"});
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "findThreads", "(Lorg/apache/commons/lang3/ThreadUtils$ThreadPredicate;)Ljava/util/Collection;", "(Lorg/apache/commons/lang3/ThreadUtils$ThreadPredicate;)Ljava/util/Collection<Ljava/lang/Thread;>;", null);
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/lang3/ThreadUtils", "getSystemThreadGroup", "()Ljava/lang/ThreadGroup;", false);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/lang3/ThreadUtils", "findThreads", "(Ljava/lang/ThreadGroup;ZLorg/apache/commons/lang3/ThreadUtils$ThreadPredicate;)Ljava/util/Collection;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "findThreadGroups", "(Lorg/apache/commons/lang3/ThreadUtils$ThreadGroupPredicate;)Ljava/util/Collection;", "(Lorg/apache/commons/lang3/ThreadUtils$ThreadGroupPredicate;)Ljava/util/Collection<Ljava/lang/ThreadGroup;>;", null);
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/lang3/ThreadUtils", "getSystemThreadGroup", "()Ljava/lang/ThreadGroup;", false);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/lang3/ThreadUtils", "findThreadGroups", "(Ljava/lang/ThreadGroup;ZLorg/apache/commons/lang3/ThreadUtils$ThreadGroupPredicate;)Ljava/util/Collection;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "findThreads", "(Ljava/lang/ThreadGroup;ZLorg/apache/commons/lang3/ThreadUtils$ThreadPredicate;)Ljava/util/Collection;", "(Ljava/lang/ThreadGroup;ZLorg/apache/commons/lang3/ThreadUtils$ThreadPredicate;)Ljava/util/Collection<Ljava/lang/Thread;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitInsn(ICONST_1);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {Opcodes.INTEGER});
methodVisitor.visitLdcInsn("The group must not be null");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/lang3/Validate", "isTrue", "(ZLjava/lang/String;[Ljava/lang/Object;)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label2);
methodVisitor.visitInsn(ICONST_1);
Label label3 = new Label();
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {Opcodes.INTEGER});
methodVisitor.visitLdcInsn("The predicate must not be null");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/lang3/Validate", "isTrue", "(ZLjava/lang/String;[Ljava/lang/Object;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/ThreadGroup", "activeCount", "()I", false);
methodVisitor.visitVarInsn(ISTORE, 3);
Label label4 = new Label();
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {Opcodes.INTEGER}, 0, null);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitInsn(IDIV);
methodVisitor.visitInsn(IADD);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IADD);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Thread");
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/ThreadGroup", "enumerate", "([Ljava/lang/Thread;Z)I", false);
methodVisitor.visitVarInsn(ISTORE, 3);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitJumpInsn(IF_ICMPGE, label4);
methodVisitor.visitTypeInsn(NEW, "java/util/ArrayList");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/ArrayList", "<init>", "(I)V", false);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 6);
Label label5 = new Label();
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_APPEND,3, new Object[] {"[Ljava/lang/Thread;", "java/util/List", Opcodes.INTEGER}, 0, null);
methodVisitor.visitVarInsn(ILOAD, 6);
methodVisitor.visitVarInsn(ILOAD, 3);
Label label6 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPGE, label6);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ILOAD, 6);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/commons/lang3/ThreadUtils$ThreadPredicate", "test", "(Ljava/lang/Thread;)Z", true);
Label label7 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label7);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ILOAD, 6);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "add", "(Ljava/lang/Object;)Z", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label7);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitIincInsn(6, 1);
methodVisitor.visitJumpInsn(GOTO, label5);
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/Collections", "unmodifiableCollection", "(Ljava/util/Collection;)Ljava/util/Collection;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 7);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "findThreadGroups", "(Ljava/lang/ThreadGroup;ZLorg/apache/commons/lang3/ThreadUtils$ThreadGroupPredicate;)Ljava/util/Collection;", "(Ljava/lang/ThreadGroup;ZLorg/apache/commons/lang3/ThreadUtils$ThreadGroupPredicate;)Ljava/util/Collection<Ljava/lang/ThreadGroup;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitInsn(ICONST_1);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {Opcodes.INTEGER});
methodVisitor.visitLdcInsn("The group must not be null");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/lang3/Validate", "isTrue", "(ZLjava/lang/String;[Ljava/lang/Object;)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label2);
methodVisitor.visitInsn(ICONST_1);
Label label3 = new Label();
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {Opcodes.INTEGER});
methodVisitor.visitLdcInsn("The predicate must not be null");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/lang3/Validate", "isTrue", "(ZLjava/lang/String;[Ljava/lang/Object;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/ThreadGroup", "activeGroupCount", "()I", false);
methodVisitor.visitVarInsn(ISTORE, 3);
Label label4 = new Label();
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {Opcodes.INTEGER}, 0, null);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitInsn(IDIV);
methodVisitor.visitInsn(IADD);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IADD);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/ThreadGroup");
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/ThreadGroup", "enumerate", "([Ljava/lang/ThreadGroup;Z)I", false);
methodVisitor.visitVarInsn(ISTORE, 3);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitJumpInsn(IF_ICMPGE, label4);
methodVisitor.visitTypeInsn(NEW, "java/util/ArrayList");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/ArrayList", "<init>", "(I)V", false);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 6);
Label label5 = new Label();
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_APPEND,3, new Object[] {"[Ljava/lang/ThreadGroup;", "java/util/List", Opcodes.INTEGER}, 0, null);
methodVisitor.visitVarInsn(ILOAD, 6);
methodVisitor.visitVarInsn(ILOAD, 3);
Label label6 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPGE, label6);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ILOAD, 6);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/commons/lang3/ThreadUtils$ThreadGroupPredicate", "test", "(Ljava/lang/ThreadGroup;)Z", true);
Label label7 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label7);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ILOAD, 6);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "add", "(Ljava/lang/Object;)Z", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label7);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitIincInsn(6, 1);
methodVisitor.visitJumpInsn(GOTO, label5);
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/Collections", "unmodifiableCollection", "(Ljava/util/Collection;)Ljava/util/Collection;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 7);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/commons/lang3/ThreadUtils$AlwaysTruePredicate");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/lang3/ThreadUtils$AlwaysTruePredicate", "<init>", "(Lorg/apache/commons/lang3/ThreadUtils$1;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/commons/lang3/ThreadUtils", "ALWAYS_TRUE_PREDICATE", "Lorg/apache/commons/lang3/ThreadUtils$AlwaysTruePredicate;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
