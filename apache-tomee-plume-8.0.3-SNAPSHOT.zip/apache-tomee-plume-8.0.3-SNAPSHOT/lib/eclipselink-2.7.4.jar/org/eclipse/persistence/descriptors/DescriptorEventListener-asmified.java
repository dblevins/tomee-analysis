package asm.org.eclipse.persistence.descriptors;
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
public class DescriptorEventListenerDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_ABSTRACT | ACC_INTERFACE, "org/eclipse/persistence/descriptors/DescriptorEventListener", null, "java/lang/Object", new String[] { "java/util/EventListener" });

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "aboutToDelete", "(Lorg/eclipse/persistence/descriptors/DescriptorEvent;)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "aboutToInsert", "(Lorg/eclipse/persistence/descriptors/DescriptorEvent;)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "aboutToUpdate", "(Lorg/eclipse/persistence/descriptors/DescriptorEvent;)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "isOverriddenEvent", "(Lorg/eclipse/persistence/descriptors/DescriptorEvent;Ljava/util/List;)Z", "(Lorg/eclipse/persistence/descriptors/DescriptorEvent;Ljava/util/List<Lorg/eclipse/persistence/descriptors/DescriptorEventManager;>;)Z", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "postBuild", "(Lorg/eclipse/persistence/descriptors/DescriptorEvent;)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "postClone", "(Lorg/eclipse/persistence/descriptors/DescriptorEvent;)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "postDelete", "(Lorg/eclipse/persistence/descriptors/DescriptorEvent;)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "postInsert", "(Lorg/eclipse/persistence/descriptors/DescriptorEvent;)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "postMerge", "(Lorg/eclipse/persistence/descriptors/DescriptorEvent;)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "postRefresh", "(Lorg/eclipse/persistence/descriptors/DescriptorEvent;)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "postUpdate", "(Lorg/eclipse/persistence/descriptors/DescriptorEvent;)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "postWrite", "(Lorg/eclipse/persistence/descriptors/DescriptorEvent;)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "preDelete", "(Lorg/eclipse/persistence/descriptors/DescriptorEvent;)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "preInsert", "(Lorg/eclipse/persistence/descriptors/DescriptorEvent;)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "prePersist", "(Lorg/eclipse/persistence/descriptors/DescriptorEvent;)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "preRemove", "(Lorg/eclipse/persistence/descriptors/DescriptorEvent;)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "preUpdate", "(Lorg/eclipse/persistence/descriptors/DescriptorEvent;)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "preUpdateWithChanges", "(Lorg/eclipse/persistence/descriptors/DescriptorEvent;)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "preWrite", "(Lorg/eclipse/persistence/descriptors/DescriptorEvent;)V", null, null);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
