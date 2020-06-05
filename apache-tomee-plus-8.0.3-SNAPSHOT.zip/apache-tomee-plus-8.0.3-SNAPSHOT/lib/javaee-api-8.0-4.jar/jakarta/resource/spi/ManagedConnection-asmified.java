package asm.jakarta.resource.spi;
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
public class ManagedConnectionDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_5, ACC_PUBLIC | ACC_ABSTRACT | ACC_INTERFACE, "jakarta/resource/spi/ManagedConnection", null, "java/lang/Object", null);

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getConnection", "(Ljavax/security/auth/Subject;Ljakarta/resource/spi/ConnectionRequestInfo;)Ljava/lang/Object;", null, new String[] { "jakarta/resource/ResourceException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "destroy", "()V", null, new String[] { "jakarta/resource/ResourceException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "cleanup", "()V", null, new String[] { "jakarta/resource/ResourceException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "associateConnection", "(Ljava/lang/Object;)V", null, new String[] { "jakarta/resource/ResourceException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "addConnectionEventListener", "(Ljakarta/resource/spi/ConnectionEventListener;)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "removeConnectionEventListener", "(Ljakarta/resource/spi/ConnectionEventListener;)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getXAResource", "()Ljavax/transaction/xa/XAResource;", null, new String[] { "jakarta/resource/ResourceException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getLocalTransaction", "()Ljakarta/resource/spi/LocalTransaction;", null, new String[] { "jakarta/resource/ResourceException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getMetaData", "()Ljakarta/resource/spi/ManagedConnectionMetaData;", null, new String[] { "jakarta/resource/ResourceException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "setLogWriter", "(Ljava/io/PrintWriter;)V", null, new String[] { "jakarta/resource/ResourceException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getLogWriter", "()Ljava/io/PrintWriter;", null, new String[] { "jakarta/resource/ResourceException" });
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
