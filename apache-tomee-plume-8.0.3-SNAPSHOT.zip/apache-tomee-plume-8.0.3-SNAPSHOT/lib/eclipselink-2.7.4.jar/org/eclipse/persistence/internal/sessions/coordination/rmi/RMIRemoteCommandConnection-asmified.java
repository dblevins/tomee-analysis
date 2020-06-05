package asm.org.eclipse.persistence.internal.sessions.coordination.rmi;
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
public class RMIRemoteCommandConnectionDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_ABSTRACT | ACC_INTERFACE, "org/eclipse/persistence/internal/sessions/coordination/rmi/RMIRemoteCommandConnection", null, "java/lang/Object", new String[] { "java/rmi/Remote" });

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "executeCommand", "(Lorg/eclipse/persistence/sessions/coordination/Command;)Ljava/lang/Object;", null, new String[] { "java/rmi/RemoteException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "executeCommand", "([B)Ljava/lang/Object;", null, new String[] { "java/rmi/RemoteException" });
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}