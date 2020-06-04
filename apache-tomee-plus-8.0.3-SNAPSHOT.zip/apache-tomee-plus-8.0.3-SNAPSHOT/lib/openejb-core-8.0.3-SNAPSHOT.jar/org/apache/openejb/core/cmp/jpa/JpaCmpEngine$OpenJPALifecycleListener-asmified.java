package asm.org.apache.openejb.core.cmp.jpa;
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
public class JpaCmpEngine$OpenJPALifecycleListenerDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/openejb/core/cmp/jpa/JpaCmpEngine$OpenJPALifecycleListener", null, "org/apache/openjpa/event/AbstractLifecycleListener", null);

classWriter.visitInnerClass("org/apache/openejb/core/cmp/jpa/JpaCmpEngine$OpenJPALifecycleListener", "org/apache/openejb/core/cmp/jpa/JpaCmpEngine", "OpenJPALifecycleListener", ACC_PRIVATE);

classWriter.visitInnerClass("org/apache/openejb/core/cmp/jpa/JpaCmpEngine$1", null, null, 0);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/apache/openejb/core/cmp/jpa/JpaCmpEngine;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "(Lorg/apache/openejb/core/cmp/jpa/JpaCmpEngine;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/core/cmp/jpa/JpaCmpEngine$OpenJPALifecycleListener", "this$0", "Lorg/apache/openejb/core/cmp/jpa/JpaCmpEngine;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/event/AbstractLifecycleListener", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "afterLoad", "(Lorg/apache/openjpa/event/LifecycleEvent;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/core/cmp/jpa/JpaCmpEngine$OpenJPALifecycleListener", "eventOccurred", "(Lorg/apache/openjpa/event/LifecycleEvent;)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/event/LifecycleEvent", "getSource", "()Ljava/lang/Object;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/core/cmp/jpa/JpaCmpEngine$OpenJPALifecycleListener", "this$0", "Lorg/apache/openejb/core/cmp/jpa/JpaCmpEngine;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/core/cmp/jpa/JpaCmpEngine", "access$100", "(Lorg/apache/openejb/core/cmp/jpa/JpaCmpEngine;)Lorg/apache/openejb/core/cmp/CmpCallback;", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitTypeInsn(CHECKCAST, "javax/ejb/EntityBean");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openejb/core/cmp/CmpCallback", "setEntityContext", "(Ljavax/ejb/EntityBean;)V", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/core/cmp/jpa/JpaCmpEngine$OpenJPALifecycleListener", "this$0", "Lorg/apache/openejb/core/cmp/jpa/JpaCmpEngine;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/core/cmp/jpa/JpaCmpEngine", "access$100", "(Lorg/apache/openejb/core/cmp/jpa/JpaCmpEngine;)Lorg/apache/openejb/core/cmp/CmpCallback;", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitTypeInsn(CHECKCAST, "javax/ejb/EntityBean");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openejb/core/cmp/CmpCallback", "ejbActivate", "(Ljavax/ejb/EntityBean;)V", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/core/cmp/jpa/JpaCmpEngine$OpenJPALifecycleListener", "this$0", "Lorg/apache/openejb/core/cmp/jpa/JpaCmpEngine;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/core/cmp/jpa/JpaCmpEngine", "access$100", "(Lorg/apache/openejb/core/cmp/jpa/JpaCmpEngine;)Lorg/apache/openejb/core/cmp/CmpCallback;", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitTypeInsn(CHECKCAST, "javax/ejb/EntityBean");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openejb/core/cmp/CmpCallback", "ejbLoad", "(Ljavax/ejb/EntityBean;)V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "beforeStore", "(Lorg/apache/openjpa/event/LifecycleEvent;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/core/cmp/jpa/JpaCmpEngine$OpenJPALifecycleListener", "eventOccurred", "(Lorg/apache/openjpa/event/LifecycleEvent;)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/event/LifecycleEvent", "getSource", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "javax/ejb/EntityBean");
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/core/cmp/jpa/JpaCmpEngine$OpenJPALifecycleListener", "this$0", "Lorg/apache/openejb/core/cmp/jpa/JpaCmpEngine;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/core/cmp/jpa/JpaCmpEngine", "access$200", "(Lorg/apache/openejb/core/cmp/jpa/JpaCmpEngine;)Ljava/lang/ThreadLocal;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/ThreadLocal", "get", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "java/util/Set");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Set", "contains", "(Ljava/lang/Object;)Z", true);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/core/cmp/jpa/JpaCmpEngine$OpenJPALifecycleListener", "this$0", "Lorg/apache/openejb/core/cmp/jpa/JpaCmpEngine;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/core/cmp/jpa/JpaCmpEngine", "access$100", "(Lorg/apache/openejb/core/cmp/jpa/JpaCmpEngine;)Lorg/apache/openejb/core/cmp/CmpCallback;", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openejb/core/cmp/CmpCallback", "ejbStore", "(Ljavax/ejb/EntityBean;)V", true);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"javax/ejb/EntityBean"}, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "afterAttach", "(Lorg/apache/openjpa/event/LifecycleEvent;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/core/cmp/jpa/JpaCmpEngine$OpenJPALifecycleListener", "eventOccurred", "(Lorg/apache/openjpa/event/LifecycleEvent;)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/event/LifecycleEvent", "getSource", "()Ljava/lang/Object;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/core/cmp/jpa/JpaCmpEngine$OpenJPALifecycleListener", "this$0", "Lorg/apache/openejb/core/cmp/jpa/JpaCmpEngine;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/core/cmp/jpa/JpaCmpEngine", "access$100", "(Lorg/apache/openejb/core/cmp/jpa/JpaCmpEngine;)Lorg/apache/openejb/core/cmp/CmpCallback;", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitTypeInsn(CHECKCAST, "javax/ejb/EntityBean");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openejb/core/cmp/CmpCallback", "setEntityContext", "(Ljavax/ejb/EntityBean;)V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "beforeDelete", "(Lorg/apache/openjpa/event/LifecycleEvent;)V", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "javax/ejb/RemoveException");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/core/cmp/jpa/JpaCmpEngine$OpenJPALifecycleListener", "eventOccurred", "(Lorg/apache/openjpa/event/LifecycleEvent;)V", false);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/event/LifecycleEvent", "getSource", "()Ljava/lang/Object;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/core/cmp/jpa/JpaCmpEngine$OpenJPALifecycleListener", "this$0", "Lorg/apache/openejb/core/cmp/jpa/JpaCmpEngine;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/core/cmp/jpa/JpaCmpEngine", "access$100", "(Lorg/apache/openejb/core/cmp/jpa/JpaCmpEngine;)Lorg/apache/openejb/core/cmp/CmpCallback;", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitTypeInsn(CHECKCAST, "javax/ejb/EntityBean");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openejb/core/cmp/CmpCallback", "ejbRemove", "(Ljavax/ejb/EntityBean;)V", true);
methodVisitor.visitLabel(label1);
Label label3 = new Label();
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"javax/ejb/RemoveException"});
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitTypeInsn(NEW, "javax/persistence/PersistenceException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/persistence/PersistenceException", "<init>", "(Ljava/lang/Throwable;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "afterDetach", "(Lorg/apache/openjpa/event/LifecycleEvent;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/core/cmp/jpa/JpaCmpEngine$OpenJPALifecycleListener", "eventOccurred", "(Lorg/apache/openjpa/event/LifecycleEvent;)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/event/LifecycleEvent", "getSource", "()Ljava/lang/Object;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/core/cmp/jpa/JpaCmpEngine$OpenJPALifecycleListener", "this$0", "Lorg/apache/openejb/core/cmp/jpa/JpaCmpEngine;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/core/cmp/jpa/JpaCmpEngine", "access$100", "(Lorg/apache/openejb/core/cmp/jpa/JpaCmpEngine;)Lorg/apache/openejb/core/cmp/CmpCallback;", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitTypeInsn(CHECKCAST, "javax/ejb/EntityBean");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openejb/core/cmp/CmpCallback", "ejbPassivate", "(Ljavax/ejb/EntityBean;)V", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/core/cmp/jpa/JpaCmpEngine$OpenJPALifecycleListener", "this$0", "Lorg/apache/openejb/core/cmp/jpa/JpaCmpEngine;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/core/cmp/jpa/JpaCmpEngine", "access$100", "(Lorg/apache/openejb/core/cmp/jpa/JpaCmpEngine;)Lorg/apache/openejb/core/cmp/CmpCallback;", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitTypeInsn(CHECKCAST, "javax/ejb/EntityBean");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openejb/core/cmp/CmpCallback", "unsetEntityContext", "(Ljavax/ejb/EntityBean;)V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "beforePersist", "(Lorg/apache/openjpa/event/LifecycleEvent;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/core/cmp/jpa/JpaCmpEngine$OpenJPALifecycleListener", "eventOccurred", "(Lorg/apache/openjpa/event/LifecycleEvent;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "afterRefresh", "(Lorg/apache/openjpa/event/LifecycleEvent;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/core/cmp/jpa/JpaCmpEngine$OpenJPALifecycleListener", "eventOccurred", "(Lorg/apache/openjpa/event/LifecycleEvent;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "beforeDetach", "(Lorg/apache/openjpa/event/LifecycleEvent;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/core/cmp/jpa/JpaCmpEngine$OpenJPALifecycleListener", "eventOccurred", "(Lorg/apache/openjpa/event/LifecycleEvent;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "beforeAttach", "(Lorg/apache/openjpa/event/LifecycleEvent;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/core/cmp/jpa/JpaCmpEngine$OpenJPALifecycleListener", "eventOccurred", "(Lorg/apache/openjpa/event/LifecycleEvent;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_SYNTHETIC, "<init>", "(Lorg/apache/openejb/core/cmp/jpa/JpaCmpEngine;Lorg/apache/openejb/core/cmp/jpa/JpaCmpEngine$1;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/core/cmp/jpa/JpaCmpEngine$OpenJPALifecycleListener", "<init>", "(Lorg/apache/openejb/core/cmp/jpa/JpaCmpEngine;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
