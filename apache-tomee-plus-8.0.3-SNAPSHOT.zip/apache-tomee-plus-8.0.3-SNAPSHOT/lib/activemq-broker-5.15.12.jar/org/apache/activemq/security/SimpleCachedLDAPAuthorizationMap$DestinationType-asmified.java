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
public class SimpleCachedLDAPAuthorizationMap$DestinationTypeDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_FINAL | ACC_SUPER | ACC_ENUM, "org/apache/activemq/security/SimpleCachedLDAPAuthorizationMap$DestinationType", "Ljava/lang/Enum<Lorg/apache/activemq/security/SimpleCachedLDAPAuthorizationMap$DestinationType;>;", "java/lang/Enum", null);

classWriter.visitInnerClass("org/apache/activemq/security/SimpleCachedLDAPAuthorizationMap$DestinationType", "org/apache/activemq/security/SimpleCachedLDAPAuthorizationMap", "DestinationType", ACC_PROTECTED | ACC_FINAL | ACC_STATIC | ACC_ENUM);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "QUEUE", "Lorg/apache/activemq/security/SimpleCachedLDAPAuthorizationMap$DestinationType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "TOPIC", "Lorg/apache/activemq/security/SimpleCachedLDAPAuthorizationMap$DestinationType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "TEMP", "Lorg/apache/activemq/security/SimpleCachedLDAPAuthorizationMap$DestinationType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_SYNTHETIC, "$VALUES", "[Lorg/apache/activemq/security/SimpleCachedLDAPAuthorizationMap$DestinationType;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "values", "()[Lorg/apache/activemq/security/SimpleCachedLDAPAuthorizationMap$DestinationType;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/activemq/security/SimpleCachedLDAPAuthorizationMap$DestinationType", "$VALUES", "[Lorg/apache/activemq/security/SimpleCachedLDAPAuthorizationMap$DestinationType;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "[Lorg/apache/activemq/security/SimpleCachedLDAPAuthorizationMap$DestinationType;", "clone", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Lorg/apache/activemq/security/SimpleCachedLDAPAuthorizationMap$DestinationType;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "valueOf", "(Ljava/lang/String;)Lorg/apache/activemq/security/SimpleCachedLDAPAuthorizationMap$DestinationType;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/activemq/security/SimpleCachedLDAPAuthorizationMap$DestinationType;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Enum", "valueOf", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/activemq/security/SimpleCachedLDAPAuthorizationMap$DestinationType");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "(Ljava/lang/String;I)V", "()V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Enum", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/security/SimpleCachedLDAPAuthorizationMap$DestinationType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("QUEUE");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/security/SimpleCachedLDAPAuthorizationMap$DestinationType", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/activemq/security/SimpleCachedLDAPAuthorizationMap$DestinationType", "QUEUE", "Lorg/apache/activemq/security/SimpleCachedLDAPAuthorizationMap$DestinationType;");
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/security/SimpleCachedLDAPAuthorizationMap$DestinationType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("TOPIC");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/security/SimpleCachedLDAPAuthorizationMap$DestinationType", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/activemq/security/SimpleCachedLDAPAuthorizationMap$DestinationType", "TOPIC", "Lorg/apache/activemq/security/SimpleCachedLDAPAuthorizationMap$DestinationType;");
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/security/SimpleCachedLDAPAuthorizationMap$DestinationType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("TEMP");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/security/SimpleCachedLDAPAuthorizationMap$DestinationType", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/activemq/security/SimpleCachedLDAPAuthorizationMap$DestinationType", "TEMP", "Lorg/apache/activemq/security/SimpleCachedLDAPAuthorizationMap$DestinationType;");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitTypeInsn(ANEWARRAY, "org/apache/activemq/security/SimpleCachedLDAPAuthorizationMap$DestinationType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/activemq/security/SimpleCachedLDAPAuthorizationMap$DestinationType", "QUEUE", "Lorg/apache/activemq/security/SimpleCachedLDAPAuthorizationMap$DestinationType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/activemq/security/SimpleCachedLDAPAuthorizationMap$DestinationType", "TOPIC", "Lorg/apache/activemq/security/SimpleCachedLDAPAuthorizationMap$DestinationType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/activemq/security/SimpleCachedLDAPAuthorizationMap$DestinationType", "TEMP", "Lorg/apache/activemq/security/SimpleCachedLDAPAuthorizationMap$DestinationType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/activemq/security/SimpleCachedLDAPAuthorizationMap$DestinationType", "$VALUES", "[Lorg/apache/activemq/security/SimpleCachedLDAPAuthorizationMap$DestinationType;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
