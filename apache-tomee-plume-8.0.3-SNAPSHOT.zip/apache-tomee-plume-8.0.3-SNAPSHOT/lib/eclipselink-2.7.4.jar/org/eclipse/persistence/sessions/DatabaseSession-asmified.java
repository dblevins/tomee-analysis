package asm.org.eclipse.persistence.sessions;
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
public class DatabaseSessionDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_ABSTRACT | ACC_INTERFACE, "org/eclipse/persistence/sessions/DatabaseSession", null, "java/lang/Object", new String[] { "org/eclipse/persistence/sessions/Session" });

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "addDescriptor", "(Lorg/eclipse/persistence/descriptors/ClassDescriptor;)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "addDescriptors", "(Ljava/util/Collection;)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "addSequence", "(Lorg/eclipse/persistence/sequencing/Sequence;)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "addDescriptors", "(Lorg/eclipse/persistence/sessions/Project;)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "beginTransaction", "()V", null, new String[] { "org/eclipse/persistence/exceptions/DatabaseException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "commitTransaction", "()V", null, new String[] { "org/eclipse/persistence/exceptions/DatabaseException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "deleteAllObjects", "(Ljava/util/Collection;)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "deleteObject", "(Ljava/lang/Object;)Ljava/lang/Object;", null, new String[] { "org/eclipse/persistence/exceptions/DatabaseException", "org/eclipse/persistence/exceptions/OptimisticLockException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "insertObject", "(Ljava/lang/Object;)Ljava/lang/Object;", null, new String[] { "org/eclipse/persistence/exceptions/DatabaseException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "isInTransaction", "()Z", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setServerPlatform", "(Lorg/eclipse/persistence/platform/server/ServerPlatform;)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getServerPlatform", "()Lorg/eclipse/persistence/platform/server/ServerPlatform;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getSequencingControl", "()Lorg/eclipse/persistence/sequencing/SequencingControl;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "login", "()V", null, new String[] { "org/eclipse/persistence/exceptions/DatabaseException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "login", "(Ljava/lang/String;Ljava/lang/String;)V", null, new String[] { "org/eclipse/persistence/exceptions/DatabaseException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "login", "(Lorg/eclipse/persistence/sessions/Login;)V", null, new String[] { "org/eclipse/persistence/exceptions/DatabaseException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "logout", "()V", null, new String[] { "org/eclipse/persistence/exceptions/DatabaseException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "refreshAndLockObject", "(Ljava/lang/Object;)Ljava/lang/Object;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "refreshAndLockObject", "(Ljava/lang/Object;S)Ljava/lang/Object;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "rollbackTransaction", "()V", null, new String[] { "org/eclipse/persistence/exceptions/DatabaseException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setExternalTransactionController", "(Lorg/eclipse/persistence/sessions/ExternalTransactionController;)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getCommandManager", "()Lorg/eclipse/persistence/sessions/coordination/CommandManager;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setCommandManager", "(Lorg/eclipse/persistence/sessions/coordination/CommandManager;)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setShouldPropagateChanges", "(Z)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "shouldPropagateChanges", "()Z", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setLogin", "(Lorg/eclipse/persistence/sessions/Login;)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setDatasourceLogin", "(Lorg/eclipse/persistence/sessions/Login;)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "updateObject", "(Ljava/lang/Object;)Ljava/lang/Object;", null, new String[] { "org/eclipse/persistence/exceptions/DatabaseException", "org/eclipse/persistence/exceptions/OptimisticLockException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "writeAllObjects", "(Ljava/util/Collection;)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "writeObject", "(Ljava/lang/Object;)Ljava/lang/Object;", null, new String[] { "org/eclipse/persistence/exceptions/DatabaseException", "org/eclipse/persistence/exceptions/OptimisticLockException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getDatabaseEventListener", "()Lorg/eclipse/persistence/platform/database/events/DatabaseEventListener;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setDatabaseEventListener", "(Lorg/eclipse/persistence/platform/database/events/DatabaseEventListener;)V", null, null);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
