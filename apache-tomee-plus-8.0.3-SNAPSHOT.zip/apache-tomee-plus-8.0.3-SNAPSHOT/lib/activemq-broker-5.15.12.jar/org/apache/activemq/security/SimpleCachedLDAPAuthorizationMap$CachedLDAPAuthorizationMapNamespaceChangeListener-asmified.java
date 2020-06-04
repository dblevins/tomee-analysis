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
public class SimpleCachedLDAPAuthorizationMap$CachedLDAPAuthorizationMapNamespaceChangeListenerDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/activemq/security/SimpleCachedLDAPAuthorizationMap$CachedLDAPAuthorizationMapNamespaceChangeListener", null, "java/lang/Object", new String[] { "javax/naming/event/NamespaceChangeListener", "javax/naming/event/ObjectChangeListener" });

classWriter.visitInnerClass("org/apache/activemq/security/SimpleCachedLDAPAuthorizationMap$DestinationType", "org/apache/activemq/security/SimpleCachedLDAPAuthorizationMap", "DestinationType", ACC_PROTECTED | ACC_FINAL | ACC_STATIC | ACC_ENUM);

classWriter.visitInnerClass("org/apache/activemq/security/SimpleCachedLDAPAuthorizationMap$PermissionType", "org/apache/activemq/security/SimpleCachedLDAPAuthorizationMap", "PermissionType", ACC_PROTECTED | ACC_FINAL | ACC_STATIC | ACC_ENUM);

classWriter.visitInnerClass("org/apache/activemq/security/SimpleCachedLDAPAuthorizationMap$CachedLDAPAuthorizationMapNamespaceChangeListener", "org/apache/activemq/security/SimpleCachedLDAPAuthorizationMap", "CachedLDAPAuthorizationMapNamespaceChangeListener", ACC_PROTECTED);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "destinationType", "Lorg/apache/activemq/security/SimpleCachedLDAPAuthorizationMap$DestinationType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "permissionType", "Lorg/apache/activemq/security/SimpleCachedLDAPAuthorizationMap$PermissionType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/apache/activemq/security/SimpleCachedLDAPAuthorizationMap;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/apache/activemq/security/SimpleCachedLDAPAuthorizationMap;Lorg/apache/activemq/security/SimpleCachedLDAPAuthorizationMap$DestinationType;Lorg/apache/activemq/security/SimpleCachedLDAPAuthorizationMap$PermissionType;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/security/SimpleCachedLDAPAuthorizationMap$CachedLDAPAuthorizationMapNamespaceChangeListener", "this$0", "Lorg/apache/activemq/security/SimpleCachedLDAPAuthorizationMap;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/security/SimpleCachedLDAPAuthorizationMap$CachedLDAPAuthorizationMapNamespaceChangeListener", "destinationType", "Lorg/apache/activemq/security/SimpleCachedLDAPAuthorizationMap$DestinationType;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/security/SimpleCachedLDAPAuthorizationMap$CachedLDAPAuthorizationMapNamespaceChangeListener", "permissionType", "Lorg/apache/activemq/security/SimpleCachedLDAPAuthorizationMap$PermissionType;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "namingExceptionThrown", "(Ljavax/naming/event/NamingExceptionEvent;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/security/SimpleCachedLDAPAuthorizationMap$CachedLDAPAuthorizationMapNamespaceChangeListener", "this$0", "Lorg/apache/activemq/security/SimpleCachedLDAPAuthorizationMap;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/security/SimpleCachedLDAPAuthorizationMap", "namingExceptionThrown", "(Ljavax/naming/event/NamingExceptionEvent;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "objectAdded", "(Ljavax/naming/event/NamingEvent;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/security/SimpleCachedLDAPAuthorizationMap$CachedLDAPAuthorizationMapNamespaceChangeListener", "permissionType", "Lorg/apache/activemq/security/SimpleCachedLDAPAuthorizationMap$PermissionType;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/security/SimpleCachedLDAPAuthorizationMap$CachedLDAPAuthorizationMapNamespaceChangeListener", "this$0", "Lorg/apache/activemq/security/SimpleCachedLDAPAuthorizationMap;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/security/SimpleCachedLDAPAuthorizationMap$CachedLDAPAuthorizationMapNamespaceChangeListener", "destinationType", "Lorg/apache/activemq/security/SimpleCachedLDAPAuthorizationMap$DestinationType;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/security/SimpleCachedLDAPAuthorizationMap$CachedLDAPAuthorizationMapNamespaceChangeListener", "permissionType", "Lorg/apache/activemq/security/SimpleCachedLDAPAuthorizationMap$PermissionType;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/security/SimpleCachedLDAPAuthorizationMap", "objectAdded", "(Ljavax/naming/event/NamingEvent;Lorg/apache/activemq/security/SimpleCachedLDAPAuthorizationMap$DestinationType;Lorg/apache/activemq/security/SimpleCachedLDAPAuthorizationMap$PermissionType;)V", false);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "objectRemoved", "(Ljavax/naming/event/NamingEvent;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/security/SimpleCachedLDAPAuthorizationMap$CachedLDAPAuthorizationMapNamespaceChangeListener", "permissionType", "Lorg/apache/activemq/security/SimpleCachedLDAPAuthorizationMap$PermissionType;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/security/SimpleCachedLDAPAuthorizationMap$CachedLDAPAuthorizationMapNamespaceChangeListener", "this$0", "Lorg/apache/activemq/security/SimpleCachedLDAPAuthorizationMap;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/security/SimpleCachedLDAPAuthorizationMap$CachedLDAPAuthorizationMapNamespaceChangeListener", "destinationType", "Lorg/apache/activemq/security/SimpleCachedLDAPAuthorizationMap$DestinationType;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/security/SimpleCachedLDAPAuthorizationMap$CachedLDAPAuthorizationMapNamespaceChangeListener", "permissionType", "Lorg/apache/activemq/security/SimpleCachedLDAPAuthorizationMap$PermissionType;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/security/SimpleCachedLDAPAuthorizationMap", "objectRemoved", "(Ljavax/naming/event/NamingEvent;Lorg/apache/activemq/security/SimpleCachedLDAPAuthorizationMap$DestinationType;Lorg/apache/activemq/security/SimpleCachedLDAPAuthorizationMap$PermissionType;)V", false);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "objectRenamed", "(Ljavax/naming/event/NamingEvent;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/security/SimpleCachedLDAPAuthorizationMap$CachedLDAPAuthorizationMapNamespaceChangeListener", "this$0", "Lorg/apache/activemq/security/SimpleCachedLDAPAuthorizationMap;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/security/SimpleCachedLDAPAuthorizationMap$CachedLDAPAuthorizationMapNamespaceChangeListener", "destinationType", "Lorg/apache/activemq/security/SimpleCachedLDAPAuthorizationMap$DestinationType;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/security/SimpleCachedLDAPAuthorizationMap$CachedLDAPAuthorizationMapNamespaceChangeListener", "permissionType", "Lorg/apache/activemq/security/SimpleCachedLDAPAuthorizationMap$PermissionType;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/security/SimpleCachedLDAPAuthorizationMap", "objectRenamed", "(Ljavax/naming/event/NamingEvent;Lorg/apache/activemq/security/SimpleCachedLDAPAuthorizationMap$DestinationType;Lorg/apache/activemq/security/SimpleCachedLDAPAuthorizationMap$PermissionType;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "objectChanged", "(Ljavax/naming/event/NamingEvent;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/security/SimpleCachedLDAPAuthorizationMap$CachedLDAPAuthorizationMapNamespaceChangeListener", "permissionType", "Lorg/apache/activemq/security/SimpleCachedLDAPAuthorizationMap$PermissionType;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/security/SimpleCachedLDAPAuthorizationMap$CachedLDAPAuthorizationMapNamespaceChangeListener", "this$0", "Lorg/apache/activemq/security/SimpleCachedLDAPAuthorizationMap;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/security/SimpleCachedLDAPAuthorizationMap$CachedLDAPAuthorizationMapNamespaceChangeListener", "destinationType", "Lorg/apache/activemq/security/SimpleCachedLDAPAuthorizationMap$DestinationType;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/security/SimpleCachedLDAPAuthorizationMap$CachedLDAPAuthorizationMapNamespaceChangeListener", "permissionType", "Lorg/apache/activemq/security/SimpleCachedLDAPAuthorizationMap$PermissionType;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/security/SimpleCachedLDAPAuthorizationMap", "objectChanged", "(Ljavax/naming/event/NamingEvent;Lorg/apache/activemq/security/SimpleCachedLDAPAuthorizationMap$DestinationType;Lorg/apache/activemq/security/SimpleCachedLDAPAuthorizationMap$PermissionType;)V", false);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
