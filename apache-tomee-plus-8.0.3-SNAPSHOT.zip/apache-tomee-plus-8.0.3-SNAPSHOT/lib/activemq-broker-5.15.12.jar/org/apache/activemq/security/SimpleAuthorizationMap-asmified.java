package asm.org.apache.activemq.security;
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
public class SimpleAuthorizationMapDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/activemq/security/SimpleAuthorizationMap", null, "java/lang/Object", new String[] { "org/apache/activemq/security/AuthorizationMap" });

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "writeACLs", "Lorg/apache/activemq/filter/DestinationMap;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "readACLs", "Lorg/apache/activemq/filter/DestinationMap;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "adminACLs", "Lorg/apache/activemq/filter/DestinationMap;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "tempDestinationAuthorizationEntry", "Lorg/apache/activemq/security/TempDestinationAuthorizationEntry;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/apache/activemq/filter/DestinationMap;Lorg/apache/activemq/filter/DestinationMap;Lorg/apache/activemq/filter/DestinationMap;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/security/SimpleAuthorizationMap", "writeACLs", "Lorg/apache/activemq/filter/DestinationMap;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/security/SimpleAuthorizationMap", "readACLs", "Lorg/apache/activemq/filter/DestinationMap;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/security/SimpleAuthorizationMap", "adminACLs", "Lorg/apache/activemq/filter/DestinationMap;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setTempDestinationAuthorizationEntry", "(Lorg/apache/activemq/security/TempDestinationAuthorizationEntry;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/security/SimpleAuthorizationMap", "tempDestinationAuthorizationEntry", "Lorg/apache/activemq/security/TempDestinationAuthorizationEntry;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getTempDestinationAuthorizationEntry", "()Lorg/apache/activemq/security/TempDestinationAuthorizationEntry;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/security/SimpleAuthorizationMap", "tempDestinationAuthorizationEntry", "Lorg/apache/activemq/security/TempDestinationAuthorizationEntry;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getTempDestinationAdminACLs", "()Ljava/util/Set;", "()Ljava/util/Set<Ljava/lang/Object;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/security/SimpleAuthorizationMap", "tempDestinationAuthorizationEntry", "Lorg/apache/activemq/security/TempDestinationAuthorizationEntry;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/security/SimpleAuthorizationMap", "tempDestinationAuthorizationEntry", "Lorg/apache/activemq/security/TempDestinationAuthorizationEntry;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/security/TempDestinationAuthorizationEntry", "getAdminACLs", "()Ljava/util/Set;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getTempDestinationReadACLs", "()Ljava/util/Set;", "()Ljava/util/Set<Ljava/lang/Object;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/security/SimpleAuthorizationMap", "tempDestinationAuthorizationEntry", "Lorg/apache/activemq/security/TempDestinationAuthorizationEntry;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/security/SimpleAuthorizationMap", "tempDestinationAuthorizationEntry", "Lorg/apache/activemq/security/TempDestinationAuthorizationEntry;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/security/TempDestinationAuthorizationEntry", "getReadACLs", "()Ljava/util/Set;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getTempDestinationWriteACLs", "()Ljava/util/Set;", "()Ljava/util/Set<Ljava/lang/Object;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/security/SimpleAuthorizationMap", "tempDestinationAuthorizationEntry", "Lorg/apache/activemq/security/TempDestinationAuthorizationEntry;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/security/SimpleAuthorizationMap", "tempDestinationAuthorizationEntry", "Lorg/apache/activemq/security/TempDestinationAuthorizationEntry;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/security/TempDestinationAuthorizationEntry", "getWriteACLs", "()Ljava/util/Set;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getAdminACLs", "(Lorg/apache/activemq/command/ActiveMQDestination;)Ljava/util/Set;", "(Lorg/apache/activemq/command/ActiveMQDestination;)Ljava/util/Set<Ljava/lang/Object;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/security/SimpleAuthorizationMap", "adminACLs", "Lorg/apache/activemq/filter/DestinationMap;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/filter/DestinationMap", "get", "(Lorg/apache/activemq/command/ActiveMQDestination;)Ljava/util/Set;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getReadACLs", "(Lorg/apache/activemq/command/ActiveMQDestination;)Ljava/util/Set;", "(Lorg/apache/activemq/command/ActiveMQDestination;)Ljava/util/Set<Ljava/lang/Object;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/security/SimpleAuthorizationMap", "readACLs", "Lorg/apache/activemq/filter/DestinationMap;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/filter/DestinationMap", "get", "(Lorg/apache/activemq/command/ActiveMQDestination;)Ljava/util/Set;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getWriteACLs", "(Lorg/apache/activemq/command/ActiveMQDestination;)Ljava/util/Set;", "(Lorg/apache/activemq/command/ActiveMQDestination;)Ljava/util/Set<Ljava/lang/Object;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/security/SimpleAuthorizationMap", "writeACLs", "Lorg/apache/activemq/filter/DestinationMap;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/filter/DestinationMap", "get", "(Lorg/apache/activemq/command/ActiveMQDestination;)Ljava/util/Set;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getAdminACLs", "()Lorg/apache/activemq/filter/DestinationMap;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/security/SimpleAuthorizationMap", "adminACLs", "Lorg/apache/activemq/filter/DestinationMap;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setAdminACLs", "(Lorg/apache/activemq/filter/DestinationMap;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/security/SimpleAuthorizationMap", "adminACLs", "Lorg/apache/activemq/filter/DestinationMap;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getReadACLs", "()Lorg/apache/activemq/filter/DestinationMap;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/security/SimpleAuthorizationMap", "readACLs", "Lorg/apache/activemq/filter/DestinationMap;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setReadACLs", "(Lorg/apache/activemq/filter/DestinationMap;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/security/SimpleAuthorizationMap", "readACLs", "Lorg/apache/activemq/filter/DestinationMap;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getWriteACLs", "()Lorg/apache/activemq/filter/DestinationMap;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/security/SimpleAuthorizationMap", "writeACLs", "Lorg/apache/activemq/filter/DestinationMap;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setWriteACLs", "(Lorg/apache/activemq/filter/DestinationMap;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/security/SimpleAuthorizationMap", "writeACLs", "Lorg/apache/activemq/filter/DestinationMap;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
