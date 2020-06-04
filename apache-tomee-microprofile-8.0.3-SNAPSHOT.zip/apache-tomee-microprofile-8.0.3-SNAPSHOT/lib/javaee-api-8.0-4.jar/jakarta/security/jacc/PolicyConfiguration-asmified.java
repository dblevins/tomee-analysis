package asm.jakarta.security.jacc;
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
public class PolicyConfigurationDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_5, ACC_PUBLIC | ACC_ABSTRACT | ACC_INTERFACE, "jakarta/security/jacc/PolicyConfiguration", null, "java/lang/Object", null);

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getContextID", "()Ljava/lang/String;", null, new String[] { "jakarta/security/jacc/PolicyContextException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "addToRole", "(Ljava/lang/String;Ljava/security/PermissionCollection;)V", null, new String[] { "jakarta/security/jacc/PolicyContextException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "addToRole", "(Ljava/lang/String;Ljava/security/Permission;)V", null, new String[] { "jakarta/security/jacc/PolicyContextException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "addToUncheckedPolicy", "(Ljava/security/PermissionCollection;)V", null, new String[] { "jakarta/security/jacc/PolicyContextException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "addToUncheckedPolicy", "(Ljava/security/Permission;)V", null, new String[] { "jakarta/security/jacc/PolicyContextException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "addToExcludedPolicy", "(Ljava/security/PermissionCollection;)V", null, new String[] { "jakarta/security/jacc/PolicyContextException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "addToExcludedPolicy", "(Ljava/security/Permission;)V", null, new String[] { "jakarta/security/jacc/PolicyContextException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "removeRole", "(Ljava/lang/String;)V", null, new String[] { "jakarta/security/jacc/PolicyContextException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "removeUncheckedPolicy", "()V", null, new String[] { "jakarta/security/jacc/PolicyContextException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "removeExcludedPolicy", "()V", null, new String[] { "jakarta/security/jacc/PolicyContextException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "linkConfiguration", "(Ljakarta/security/jacc/PolicyConfiguration;)V", null, new String[] { "jakarta/security/jacc/PolicyContextException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "delete", "()V", null, new String[] { "jakarta/security/jacc/PolicyContextException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "commit", "()V", null, new String[] { "jakarta/security/jacc/PolicyContextException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "inService", "()Z", null, new String[] { "jakarta/security/jacc/PolicyContextException" });
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
