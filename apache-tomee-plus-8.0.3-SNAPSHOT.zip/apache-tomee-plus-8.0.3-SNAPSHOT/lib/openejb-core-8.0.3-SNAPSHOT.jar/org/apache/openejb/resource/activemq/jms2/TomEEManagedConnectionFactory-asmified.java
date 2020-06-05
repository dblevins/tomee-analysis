package asm.org.apache.openejb.resource.activemq.jms2;
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
public class TomEEManagedConnectionFactoryDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/openejb/resource/activemq/jms2/TomEEManagedConnectionFactory", null, "org/apache/activemq/ra/ActiveMQManagedConnectionFactory", null);

classWriter.visitInnerClass("org/apache/openejb/resource/activemq/jms2/TomEEManagedConnectionFactory$1", null, null, ACC_STATIC | ACC_SYNTHETIC);

classWriter.visitInnerClass("jakarta/resource/spi/TransactionSupport$TransactionSupportLevel", "jakarta/resource/spi/TransactionSupport", "TransactionSupportLevel", ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "serialVersionUID", "J", null, new Long(1L));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "transactionSupportLevel", "Ljakarta/resource/spi/TransactionSupport$TransactionSupportLevel;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/ra/ActiveMQManagedConnectionFactory", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createConnectionFactory", "(Ljakarta/resource/spi/ConnectionManager;)Ljava/lang/Object;", null, new String[] { "jakarta/resource/ResourceException" });
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/resource/activemq/jms2/TomEERAConnectionFactory");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/resource/activemq/jms2/TomEEManagedConnectionFactory", "getInfo", "()Lorg/apache/activemq/ra/ActiveMQConnectionRequestInfo;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/resource/activemq/jms2/TomEERAConnectionFactory", "<init>", "(Lorg/apache/activemq/ra/ActiveMQManagedConnectionFactory;Ljakarta/resource/spi/ConnectionManager;Lorg/apache/activemq/ra/ActiveMQConnectionRequestInfo;)V", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/resource/activemq/jms2/TomEEManagedConnectionFactory", "transactionSupportLevel", "Ljakarta/resource/spi/TransactionSupport$TransactionSupportLevel;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/resource/activemq/jms2/TomEERAConnectionFactory", "setTransactionSupport", "(Ljakarta/resource/spi/TransactionSupport$TransactionSupportLevel;)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createConnectionFactory", "()Ljava/lang/Object;", null, new String[] { "jakarta/resource/ResourceException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/ra/SimpleConnectionManager");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/ra/SimpleConnectionManager", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/resource/activemq/jms2/TomEEManagedConnectionFactory", "createConnectionFactory", "(Ljakarta/resource/spi/ConnectionManager;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "createConnectionFactory", "(Lorg/apache/activemq/ra/ActiveMQConnectionRequestInfo;Lorg/apache/activemq/ra/MessageActivationSpec;)Lorg/apache/activemq/ActiveMQConnectionFactory;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/resource/activemq/jms2/TomEEConnectionFactory");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/resource/activemq/jms2/TomEEConnectionFactory", "<init>", "()V", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/ra/ActiveMQConnectionRequestInfo", "configure", "(Lorg/apache/activemq/ActiveMQConnectionFactory;Lorg/apache/activemq/ra/MessageActivationSpec;)V", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createManagedConnection", "(Ljavax/security/auth/Subject;Ljakarta/resource/spi/ConnectionRequestInfo;)Ljakarta/resource/spi/ManagedConnection;", null, new String[] { "jakarta/resource/ResourceException" });
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "jakarta/jms/JMSException");
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/activemq/ra/ActiveMQConnectionRequestInfo;"));
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "isInstance", "(Ljava/lang/Object;)Z", false);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label3);
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/activemq/ra/ActiveMQConnectionRequestInfo;"));
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "cast", "(Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/activemq/ra/ActiveMQConnectionRequestInfo");
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitJumpInsn(GOTO, label0);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/resource/activemq/jms2/TomEEManagedConnectionFactory", "getInfo", "()Lorg/apache/activemq/ra/ActiveMQConnectionRequestInfo;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"org/apache/activemq/ra/ActiveMQConnectionRequestInfo"}, 0, null);
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/resource/activemq/jms2/TomEEManagedConnection");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/resource/activemq/jms2/TomEEManagedConnectionFactory", "makeConnection", "(Lorg/apache/activemq/ra/ActiveMQConnectionRequestInfo;)Lorg/apache/activemq/ActiveMQConnection;", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/resource/activemq/jms2/TomEEManagedConnectionFactory", "transactionSupportLevel", "Ljakarta/resource/spi/TransactionSupport$TransactionSupportLevel;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/resource/activemq/jms2/TomEEManagedConnection", "<init>", "(Ljavax/security/auth/Subject;Lorg/apache/activemq/ActiveMQConnection;Lorg/apache/activemq/ra/ActiveMQConnectionRequestInfo;Ljakarta/resource/spi/TransactionSupport$TransactionSupportLevel;)V", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"jakarta/jms/JMSException"});
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitTypeInsn(NEW, "jakarta/resource/ResourceException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Could not create connection.");
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/resource/ResourceException", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(6, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "equals", "(Ljava/lang/Object;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "getClass", "()Ljava/lang/Class;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "isInstance", "(Ljava/lang/Object;)Z", false);
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/activemq/ra/ActiveMQManagedConnectionFactory");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/ra/ActiveMQManagedConnectionFactory", "getInfo", "()Lorg/apache/activemq/ra/ActiveMQConnectionRequestInfo;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/resource/activemq/jms2/TomEEManagedConnectionFactory", "getInfo", "()Lorg/apache/activemq/ra/ActiveMQConnectionRequestInfo;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/ra/ActiveMQConnectionRequestInfo", "equals", "(Ljava/lang/Object;)Z", false);
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitInsn(ICONST_1);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {Opcodes.INTEGER});
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getTransactionSupport", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/resource/activemq/jms2/TomEEManagedConnectionFactory$1", "$SwitchMap$javax$resource$spi$TransactionSupport$TransactionSupportLevel", "[I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/resource/activemq/jms2/TomEEManagedConnectionFactory", "transactionSupportLevel", "Ljakarta/resource/spi/TransactionSupport$TransactionSupportLevel;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/resource/spi/TransactionSupport$TransactionSupportLevel", "ordinal", "()I", false);
methodVisitor.visitInsn(IALOAD);
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
Label label3 = new Label();
methodVisitor.visitTableSwitchInsn(1, 3, label3, new Label[] { label0, label1, label2 });
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitLdcInsn("xa");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitLdcInsn("local");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitLdcInsn("none");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setTransactionSupport", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitTypeInsn(NEW, "java/lang/IllegalArgumentException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("transactionSupport cannot be not null");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/IllegalArgumentException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETSTATIC, "java/util/Locale", "ENGLISH", "Ljava/util/Locale;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toLowerCase", "(Ljava/util/Locale;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitInsn(ICONST_M1);
methodVisitor.visitVarInsn(ISTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "hashCode", "()I", false);
Label label1 = new Label();
Label label2 = new Label();
Label label3 = new Label();
Label label4 = new Label();
methodVisitor.visitLookupSwitchInsn(label4, new int[] { 3817, 3387192, 103145323 }, new Label[] { label1, label2, label3 });
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {"java/lang/String", Opcodes.INTEGER}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitLdcInsn("xa");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equals", "(Ljava/lang/Object;)Z", false);
methodVisitor.visitJumpInsn(IFEQ, label4);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 3);
methodVisitor.visitJumpInsn(GOTO, label4);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitLdcInsn("local");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equals", "(Ljava/lang/Object;)Z", false);
methodVisitor.visitJumpInsn(IFEQ, label4);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitVarInsn(ISTORE, 3);
methodVisitor.visitJumpInsn(GOTO, label4);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitLdcInsn("none");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equals", "(Ljava/lang/Object;)Z", false);
methodVisitor.visitJumpInsn(IFEQ, label4);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitVarInsn(ISTORE, 3);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ILOAD, 3);
Label label5 = new Label();
Label label6 = new Label();
Label label7 = new Label();
Label label8 = new Label();
methodVisitor.visitTableSwitchInsn(0, 2, label8, new Label[] { label5, label6, label7 });
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/resource/spi/TransactionSupport$TransactionSupportLevel", "XATransaction", "Ljakarta/resource/spi/TransactionSupport$TransactionSupportLevel;");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/resource/activemq/jms2/TomEEManagedConnectionFactory", "transactionSupportLevel", "Ljakarta/resource/spi/TransactionSupport$TransactionSupportLevel;");
Label label9 = new Label();
methodVisitor.visitJumpInsn(GOTO, label9);
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/resource/spi/TransactionSupport$TransactionSupportLevel", "LocalTransaction", "Ljakarta/resource/spi/TransactionSupport$TransactionSupportLevel;");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/resource/activemq/jms2/TomEEManagedConnectionFactory", "transactionSupportLevel", "Ljakarta/resource/spi/TransactionSupport$TransactionSupportLevel;");
methodVisitor.visitJumpInsn(GOTO, label9);
methodVisitor.visitLabel(label7);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/resource/spi/TransactionSupport$TransactionSupportLevel", "NoTransaction", "Ljakarta/resource/spi/TransactionSupport$TransactionSupportLevel;");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/resource/activemq/jms2/TomEEManagedConnectionFactory", "transactionSupportLevel", "Ljakarta/resource/spi/TransactionSupport$TransactionSupportLevel;");
methodVisitor.visitJumpInsn(GOTO, label9);
methodVisitor.visitLabel(label8);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "java/lang/IllegalArgumentException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitLdcInsn("transactionSupport must be xa, local, or none:");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/IllegalArgumentException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label9);
methodVisitor.visitFrame(Opcodes.F_CHOP,2, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
