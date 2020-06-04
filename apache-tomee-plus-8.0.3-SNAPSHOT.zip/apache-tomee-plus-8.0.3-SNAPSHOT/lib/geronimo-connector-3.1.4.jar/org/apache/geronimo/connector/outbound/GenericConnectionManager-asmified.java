package asm.org.apache.geronimo.connector.outbound;
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
public class GenericConnectionManagerDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_6, ACC_PUBLIC | ACC_SUPER, "org/apache/geronimo/connector/outbound/GenericConnectionManager", null, "org/apache/geronimo/connector/outbound/AbstractConnectionManager", null);

classWriter.visitInnerClass("org/apache/geronimo/connector/outbound/GenericConnectionManager$InterceptorsImpl", "org/apache/geronimo/connector/outbound/GenericConnectionManager", "InterceptorsImpl", ACC_PRIVATE | ACC_STATIC);

classWriter.visitInnerClass("org/apache/geronimo/connector/outbound/AbstractConnectionManager$Interceptors", "org/apache/geronimo/connector/outbound/AbstractConnectionManager", "Interceptors", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

{
fieldVisitor = classWriter.visitField(ACC_PROTECTED | ACC_FINAL | ACC_STATIC, "log", "Lorg/slf4j/Logger;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/geronimo/connector/outbound/AbstractConnectionManager", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/apache/geronimo/connector/outbound/connectionmanagerconfig/TransactionSupport;Lorg/apache/geronimo/connector/outbound/connectionmanagerconfig/PoolingSupport;Lorg/apache/geronimo/connector/outbound/SubjectSource;Lorg/apache/geronimo/connector/outbound/connectiontracking/ConnectionTracker;Lorg/apache/geronimo/transaction/manager/RecoverableTransactionManager;Ljavax/resource/spi/ManagedConnectionFactory;Ljava/lang/String;Ljava/lang/ClassLoader;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/apache/geronimo/connector/outbound/GenericConnectionManager$InterceptorsImpl");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/geronimo/connector/outbound/GenericConnectionManager$InterceptorsImpl", "<init>", "(Lorg/apache/geronimo/connector/outbound/connectionmanagerconfig/TransactionSupport;Lorg/apache/geronimo/connector/outbound/connectionmanagerconfig/PoolingSupport;Lorg/apache/geronimo/connector/outbound/SubjectSource;Ljava/lang/String;Lorg/apache/geronimo/connector/outbound/connectiontracking/ConnectionTracker;Ljavax/transaction/TransactionManager;Ljavax/resource/spi/ManagedConnectionFactory;Ljava/lang/ClassLoader;)V", false);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/geronimo/connector/outbound/AbstractConnectionManager", "<init>", "(Lorg/apache/geronimo/connector/outbound/AbstractConnectionManager$Interceptors;Lorg/apache/geronimo/transaction/manager/RecoverableTransactionManager;Ljavax/resource/spi/ManagedConnectionFactory;Ljava/lang/String;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(11, 9);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/geronimo/connector/outbound/GenericConnectionManager;"));
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/slf4j/LoggerFactory", "getLogger", "(Ljava/lang/Class;)Lorg/slf4j/Logger;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/geronimo/connector/outbound/GenericConnectionManager", "log", "Lorg/slf4j/Logger;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
