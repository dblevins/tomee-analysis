package asm.org.eclipse.persistence.sessions.changesets;
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
public class UnitOfWorkChangeSetDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_ABSTRACT | ACC_INTERFACE, "org/eclipse/persistence/sessions/changesets/UnitOfWorkChangeSet", null, "java/lang/Object", null);

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getAllChangeSets", "()Ljava/util/Map;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getDeletedObjects", "()Ljava/util/Map;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getObjectChangeSetForClone", "(Ljava/lang/Object;)Lorg/eclipse/persistence/sessions/changesets/ObjectChangeSet;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getUOWCloneForObjectChangeSet", "(Lorg/eclipse/persistence/sessions/changesets/ObjectChangeSet;)Ljava/lang/Object;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "hasChanges", "()Z", null, null);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
