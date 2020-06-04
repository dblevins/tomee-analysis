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
public class ObjectChangePolicyDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_ABSTRACT | ACC_INTERFACE, "org/eclipse/persistence/descriptors/changetracking/ObjectChangePolicy", null, "java/lang/Object", new String[] { "java/io/Serializable" });

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "calculateChangesForNewObject", "(Ljava/lang/Object;Lorg/eclipse/persistence/internal/sessions/UnitOfWorkChangeSet;Lorg/eclipse/persistence/internal/sessions/UnitOfWorkImpl;Lorg/eclipse/persistence/descriptors/ClassDescriptor;Z)Lorg/eclipse/persistence/internal/sessions/ObjectChangeSet;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "calculateChangesForExistingObject", "(Ljava/lang/Object;Lorg/eclipse/persistence/internal/sessions/UnitOfWorkChangeSet;Lorg/eclipse/persistence/internal/sessions/UnitOfWorkImpl;Lorg/eclipse/persistence/descriptors/ClassDescriptor;Z)Lorg/eclipse/persistence/internal/sessions/ObjectChangeSet;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "calculateChanges", "(Ljava/lang/Object;Ljava/lang/Object;ZLorg/eclipse/persistence/internal/sessions/UnitOfWorkChangeSet;Lorg/eclipse/persistence/internal/sessions/UnitOfWorkImpl;Lorg/eclipse/persistence/descriptors/ClassDescriptor;Z)Lorg/eclipse/persistence/internal/sessions/ObjectChangeSet;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "createObjectChangeSetThroughComparison", "(Ljava/lang/Object;Ljava/lang/Object;Lorg/eclipse/persistence/internal/sessions/UnitOfWorkChangeSet;ZLorg/eclipse/persistence/internal/sessions/AbstractSession;Lorg/eclipse/persistence/descriptors/ClassDescriptor;)Lorg/eclipse/persistence/internal/sessions/ObjectChangeSet;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "updateListenerForSelfMerge", "(Lorg/eclipse/persistence/internal/descriptors/changetracking/ObjectChangeListener;Lorg/eclipse/persistence/mappings/ForeignReferenceMapping;Ljava/lang/Object;Ljava/lang/Object;Lorg/eclipse/persistence/internal/sessions/UnitOfWorkImpl;)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "dissableEventProcessing", "(Ljava/lang/Object;)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "enableEventProcessing", "(Ljava/lang/Object;)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "raiseInternalPropertyChangeEvent", "(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "revertChanges", "(Ljava/lang/Object;Lorg/eclipse/persistence/descriptors/ClassDescriptor;Lorg/eclipse/persistence/internal/sessions/UnitOfWorkImpl;Ljava/util/Map;Z)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "clearChanges", "(Ljava/lang/Object;Lorg/eclipse/persistence/internal/sessions/UnitOfWorkImpl;Lorg/eclipse/persistence/descriptors/ClassDescriptor;Z)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "updateWithChanges", "(Ljava/lang/Object;Lorg/eclipse/persistence/internal/sessions/ObjectChangeSet;Lorg/eclipse/persistence/internal/sessions/UnitOfWorkImpl;Lorg/eclipse/persistence/descriptors/ClassDescriptor;)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "shouldCompareExistingObjectForChange", "(Ljava/lang/Object;Lorg/eclipse/persistence/internal/sessions/UnitOfWorkImpl;Lorg/eclipse/persistence/descriptors/ClassDescriptor;)Z", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setAggregateChangeListener", "(Ljava/lang/Object;Ljava/lang/Object;Lorg/eclipse/persistence/internal/sessions/UnitOfWorkImpl;Lorg/eclipse/persistence/descriptors/ClassDescriptor;Ljava/lang/String;)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setChangeListener", "(Ljava/lang/Object;Lorg/eclipse/persistence/internal/sessions/UnitOfWorkImpl;Lorg/eclipse/persistence/descriptors/ClassDescriptor;)Ljava/beans/PropertyChangeListener;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setChangeSetOnListener", "(Lorg/eclipse/persistence/internal/sessions/ObjectChangeSet;Ljava/lang/Object;)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "buildBackupClone", "(Ljava/lang/Object;Lorg/eclipse/persistence/internal/descriptors/ObjectBuilder;Lorg/eclipse/persistence/internal/sessions/UnitOfWorkImpl;)Ljava/lang/Object;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "initialize", "(Lorg/eclipse/persistence/internal/sessions/AbstractSession;Lorg/eclipse/persistence/descriptors/ClassDescriptor;)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "isDeferredChangeDetectionPolicy", "()Z", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "isObjectChangeTrackingPolicy", "()Z", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "isAttributeChangeTrackingPolicy", "()Z", null, null);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
