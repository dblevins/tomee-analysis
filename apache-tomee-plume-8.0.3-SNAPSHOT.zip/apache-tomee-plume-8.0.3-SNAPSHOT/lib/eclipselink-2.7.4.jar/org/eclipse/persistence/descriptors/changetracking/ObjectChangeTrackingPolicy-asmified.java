package asm.org.eclipse.persistence.descriptors.changetracking;
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
public class ObjectChangeTrackingPolicyDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/eclipse/persistence/descriptors/changetracking/ObjectChangeTrackingPolicy", null, "org/eclipse/persistence/descriptors/changetracking/DeferredChangeDetectionPolicy", null);

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/descriptors/changetracking/DeferredChangeDetectionPolicy", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "dissableEventProcessing", "(Ljava/lang/Object;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/persistence/descriptors/changetracking/ChangeTracker");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/descriptors/changetracking/ChangeTracker", "_persistence_getPropertyChangeListener", "()Ljava/beans/PropertyChangeListener;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/persistence/internal/descriptors/changetracking/ObjectChangeListener");
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/descriptors/changetracking/ObjectChangeListener", "ignoreEvents", "()V", false);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"org/eclipse/persistence/internal/descriptors/changetracking/ObjectChangeListener"}, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "enableEventProcessing", "(Ljava/lang/Object;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/persistence/descriptors/changetracking/ChangeTracker");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/descriptors/changetracking/ChangeTracker", "_persistence_getPropertyChangeListener", "()Ljava/beans/PropertyChangeListener;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/persistence/internal/descriptors/changetracking/ObjectChangeListener");
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/descriptors/changetracking/ObjectChangeListener", "processEvents", "()V", false);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"org/eclipse/persistence/internal/descriptors/changetracking/ObjectChangeListener"}, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "shouldCompareExistingObjectForChange", "(Ljava/lang/Object;Lorg/eclipse/persistence/internal/sessions/UnitOfWorkImpl;Lorg/eclipse/persistence/descriptors/ClassDescriptor;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/persistence/descriptors/changetracking/ChangeTracker");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/descriptors/changetracking/ChangeTracker", "_persistence_getPropertyChangeListener", "()Ljava/beans/PropertyChangeListener;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/persistence/internal/descriptors/changetracking/ObjectChangeListener");
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/descriptors/changetracking/ObjectChangeListener", "hasChanges", "()Z", false);
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"org/eclipse/persistence/internal/descriptors/changetracking/ObjectChangeListener"}, 0, null);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/sessions/UnitOfWorkImpl", "hasOptimisticReadLockObjects", "()Z", false);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/sessions/UnitOfWorkImpl", "getOptimisticReadLockObjects", "()Ljava/util/Map;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/Boolean");
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitJumpInsn(IFNULL, label1);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/lang/Boolean"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/descriptors/ClassDescriptor", "getCMPPolicy", "()Lorg/eclipse/persistence/descriptors/CMPPolicy;", false);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/descriptors/ClassDescriptor", "getCMPPolicy", "()Lorg/eclipse/persistence/descriptors/CMPPolicy;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/descriptors/CMPPolicy", "getForceUpdate", "()Z", false);
methodVisitor.visitJumpInsn(IFEQ, label2);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 6);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "raiseInternalPropertyChangeEvent", "(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/persistence/descriptors/changetracking/ChangeTracker");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/descriptors/changetracking/ChangeTracker", "_persistence_getPropertyChangeListener", "()Ljava/beans/PropertyChangeListener;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/persistence/internal/descriptors/changetracking/ObjectChangeListener");
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 5);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitTypeInsn(NEW, "java/beans/PropertyChangeEvent");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/beans/PropertyChangeEvent", "<init>", "(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/descriptors/changetracking/ObjectChangeListener", "internalPropertyChange", "(Ljava/beans/PropertyChangeEvent;)V", false);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"org/eclipse/persistence/internal/descriptors/changetracking/ObjectChangeListener"}, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(7, 6);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setAggregateChangeListener", "(Ljava/lang/Object;Ljava/lang/Object;Lorg/eclipse/persistence/internal/sessions/UnitOfWorkImpl;Lorg/eclipse/persistence/descriptors/ClassDescriptor;Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/persistence/descriptors/changetracking/ChangeTracker");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/internal/descriptors/changetracking/AggregateObjectChangeListener");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/persistence/descriptors/changetracking/ChangeTracker");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/descriptors/changetracking/ChangeTracker", "_persistence_getPropertyChangeListener", "()Ljava/beans/PropertyChangeListener;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/persistence/internal/descriptors/changetracking/ObjectChangeListener");
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/descriptors/changetracking/AggregateObjectChangeListener", "<init>", "(Lorg/eclipse/persistence/internal/descriptors/changetracking/ObjectChangeListener;Ljava/lang/String;)V", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/descriptors/changetracking/ChangeTracker", "_persistence_setPropertyChangeListener", "(Ljava/beans/PropertyChangeListener;)V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 6);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setChangeListener", "(Ljava/lang/Object;Lorg/eclipse/persistence/internal/sessions/UnitOfWorkImpl;Lorg/eclipse/persistence/descriptors/ClassDescriptor;)Ljava/beans/PropertyChangeListener;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/internal/descriptors/changetracking/ObjectChangeListener");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/descriptors/changetracking/ObjectChangeListener", "<init>", "()V", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/persistence/descriptors/changetracking/ChangeTracker");
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/descriptors/changetracking/ChangeTracker", "_persistence_setPropertyChangeListener", "(Ljava/beans/PropertyChangeListener;)V", true);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "clearChanges", "(Ljava/lang/Object;Lorg/eclipse/persistence/internal/sessions/UnitOfWorkImpl;Lorg/eclipse/persistence/descriptors/ClassDescriptor;Z)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/persistence/descriptors/changetracking/ChangeTracker");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/eclipse/persistence/descriptors/changetracking/ChangeTracker", "_persistence_getPropertyChangeListener", "()Ljava/beans/PropertyChangeListener;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/persistence/internal/descriptors/changetracking/ObjectChangeListener");
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 5);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/descriptors/changetracking/ObjectChangeListener", "clearChanges", "(Z)V", false);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"org/eclipse/persistence/internal/descriptors/changetracking/ObjectChangeListener"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/descriptors/changetracking/ObjectChangeTrackingPolicy", "setChangeListener", "(Ljava/lang/Object;Lorg/eclipse/persistence/internal/sessions/UnitOfWorkImpl;Lorg/eclipse/persistence/descriptors/ClassDescriptor;)Ljava/beans/PropertyChangeListener;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/persistence/internal/descriptors/changetracking/ObjectChangeListener");
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/descriptors/ClassDescriptor", "getObjectBuilder", "()Lorg/eclipse/persistence/internal/descriptors/ObjectBuilder;", false);
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/descriptors/ObjectBuilder", "isSimple", "()Z", false);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFNE, label2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/descriptors/changetracking/ObjectChangeTrackingPolicy", "dissableEventProcessing", "(Ljava/lang/Object;)V", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/descriptors/ClassDescriptor", "getFetchGroupManager", "()Lorg/eclipse/persistence/descriptors/FetchGroupManager;", false);
methodVisitor.visitVarInsn(ASTORE, 7);
methodVisitor.visitVarInsn(ALOAD, 7);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label3);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/descriptors/FetchGroupManager", "isPartialObject", "(Ljava/lang/Object;)Z", false);
methodVisitor.visitJumpInsn(IFEQ, label3);
methodVisitor.visitInsn(ICONST_1);
Label label4 = new Label();
methodVisitor.visitJumpInsn(GOTO, label4);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {"org/eclipse/persistence/internal/descriptors/ObjectBuilder", "org/eclipse/persistence/descriptors/FetchGroupManager"}, 0, null);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {Opcodes.INTEGER});
methodVisitor.visitVarInsn(ISTORE, 8);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/descriptors/ObjectBuilder", "getRelationshipMappings", "()Ljava/util/List;", false);
methodVisitor.visitVarInsn(ASTORE, 9);
methodVisitor.visitVarInsn(ALOAD, 9);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "size", "()I", true);
methodVisitor.visitVarInsn(ISTORE, 10);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 11);
Label label5 = new Label();
methodVisitor.visitJumpInsn(GOTO, label5);
Label label6 = new Label();
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_FULL, 12, new Object[] {"org/eclipse/persistence/descriptors/changetracking/ObjectChangeTrackingPolicy", "java/lang/Object", "org/eclipse/persistence/internal/sessions/UnitOfWorkImpl", "org/eclipse/persistence/descriptors/ClassDescriptor", Opcodes.INTEGER, "org/eclipse/persistence/internal/descriptors/changetracking/ObjectChangeListener", "org/eclipse/persistence/internal/descriptors/ObjectBuilder", "org/eclipse/persistence/descriptors/FetchGroupManager", Opcodes.INTEGER, "java/util/List", Opcodes.INTEGER, Opcodes.INTEGER}, 0, new Object[] {});
methodVisitor.visitVarInsn(ALOAD, 9);
methodVisitor.visitVarInsn(ILOAD, 11);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "get", "(I)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/persistence/mappings/DatabaseMapping");
methodVisitor.visitVarInsn(ASTORE, 12);
methodVisitor.visitVarInsn(ILOAD, 8);
Label label7 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label7);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 12);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/mappings/DatabaseMapping", "getAttributeName", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/descriptors/FetchGroupManager", "isAttributeFetched", "(Ljava/lang/Object;Ljava/lang/String;)Z", false);
Label label8 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label8);
methodVisitor.visitLabel(label7);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"org/eclipse/persistence/mappings/DatabaseMapping"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 12);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/mappings/DatabaseMapping", "setChangeListener", "(Ljava/lang/Object;Ljava/beans/PropertyChangeListener;Lorg/eclipse/persistence/internal/sessions/UnitOfWorkImpl;)V", false);
methodVisitor.visitLabel(label8);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitIincInsn(11, 1);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ILOAD, 11);
methodVisitor.visitVarInsn(ILOAD, 10);
methodVisitor.visitJumpInsn(IF_ICMPLT, label6);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/descriptors/changetracking/ObjectChangeTrackingPolicy", "enableEventProcessing", "(Ljava/lang/Object;)V", false);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_FULL, 7, new Object[] {"org/eclipse/persistence/descriptors/changetracking/ObjectChangeTrackingPolicy", "java/lang/Object", "org/eclipse/persistence/internal/sessions/UnitOfWorkImpl", "org/eclipse/persistence/descriptors/ClassDescriptor", Opcodes.INTEGER, "org/eclipse/persistence/internal/descriptors/changetracking/ObjectChangeListener", "org/eclipse/persistence/internal/descriptors/ObjectBuilder"}, 0, new Object[] {});
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 13);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "initialize", "(Lorg/eclipse/persistence/internal/sessions/AbstractSession;Lorg/eclipse/persistence/descriptors/ClassDescriptor;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/descriptors/ClassDescriptor", "getJavaClass", "()Ljava/lang/Class;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/persistence/descriptors/changetracking/ChangeTracker;"));
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "isAssignableFrom", "(Ljava/lang/Class;)Z", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/sessions/AbstractSession", "getIntegrityChecker", "()Lorg/eclipse/persistence/exceptions/IntegrityChecker;", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/DescriptorException", "needToImplementChangeTracker", "(Lorg/eclipse/persistence/descriptors/ClassDescriptor;)Lorg/eclipse/persistence/exceptions/DescriptorException;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/exceptions/IntegrityChecker", "handleError", "(Ljava/lang/RuntimeException;)V", false);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/lang/Class"}, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isDeferredChangeDetectionPolicy", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isObjectChangeTrackingPolicy", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}