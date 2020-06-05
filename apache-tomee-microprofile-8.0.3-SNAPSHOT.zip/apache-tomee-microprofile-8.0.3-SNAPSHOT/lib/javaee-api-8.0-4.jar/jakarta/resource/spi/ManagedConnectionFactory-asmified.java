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
public class ManagedConnectionFactoryDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_5, ACC_PUBLIC | ACC_ABSTRACT | ACC_INTERFACE, "jakarta/resource/spi/ManagedConnectionFactory", null, "java/lang/Object", new String[] { "java/io/Serializable" });

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "createConnectionFactory", "(Ljakarta/resource/spi/ConnectionManager;)Ljava/lang/Object;", null, new String[] { "jakarta/resource/ResourceException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "createConnectionFactory", "()Ljava/lang/Object;", null, new String[] { "jakarta/resource/ResourceException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "createManagedConnection", "(Ljavax/security/auth/Subject;Ljakarta/resource/spi/ConnectionRequestInfo;)Ljakarta/resource/spi/ManagedConnection;", null, new String[] { "jakarta/resource/ResourceException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "matchManagedConnections", "(Ljava/util/Set;Ljavax/security/auth/Subject;Ljakarta/resource/spi/ConnectionRequestInfo;)Ljakarta/resource/spi/ManagedConnection;", null, new String[] { "jakarta/resource/ResourceException" });
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
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "hashCode", "()I", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "equals", "(Ljava/lang/Object;)Z", null, null);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
