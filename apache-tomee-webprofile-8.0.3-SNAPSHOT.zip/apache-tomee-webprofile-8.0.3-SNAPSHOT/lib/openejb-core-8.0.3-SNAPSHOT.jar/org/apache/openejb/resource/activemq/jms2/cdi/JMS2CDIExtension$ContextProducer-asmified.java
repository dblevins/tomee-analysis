package asm.org.apache.openejb.resource.activemq.jms2.cdi;
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
public class JMS2CDIExtension$ContextProducerDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/openejb/resource/activemq/jms2/cdi/JMS2CDIExtension$ContextProducer", null, "java/lang/Object", null);

{
annotationVisitor0 = classWriter.visitAnnotation("Ljavax/enterprise/context/ApplicationScoped;", true);
annotationVisitor0.visitEnd();
}
classWriter.visitInnerClass("org/apache/openejb/resource/activemq/jms2/cdi/JMS2CDIExtension$RequestAutoContextDestruction", "org/apache/openejb/resource/activemq/jms2/cdi/JMS2CDIExtension", "RequestAutoContextDestruction", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/apache/openejb/resource/activemq/jms2/cdi/JMS2CDIExtension$TransactionAutoContextDestruction", "org/apache/openejb/resource/activemq/jms2/cdi/JMS2CDIExtension", "TransactionAutoContextDestruction", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/apache/openejb/resource/activemq/jms2/cdi/JMS2CDIExtension$ContextProducer", "org/apache/openejb/resource/activemq/jms2/cdi/JMS2CDIExtension", "ContextProducer", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/apache/openejb/resource/activemq/jms2/cdi/JMS2CDIExtension$Key", "org/apache/openejb/resource/activemq/jms2/cdi/JMS2CDIExtension", "Key", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/apache/openejb/resource/activemq/jms2/cdi/JMS2CDIExtension$InternalJMSContext", "org/apache/openejb/resource/activemq/jms2/cdi/JMS2CDIExtension", "InternalJMSContext", ACC_PUBLIC | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "requestScoped", "Lorg/apache/openejb/resource/activemq/jms2/cdi/JMS2CDIExtension$RequestAutoContextDestruction;", null, null);
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Ljavax/inject/Inject;", true);
annotationVisitor0.visitEnd();
}
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "transactionScoped", "Lorg/apache/openejb/resource/activemq/jms2/cdi/JMS2CDIExtension$TransactionAutoContextDestruction;", null, null);
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Ljavax/inject/Inject;", true);
annotationVisitor0.visitEnd();
}
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
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "context", "(Ljavax/enterprise/inject/spi/InjectionPoint;)Ljavax/jms/JMSContext;", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Ljavax/enterprise/inject/Produces;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/resource/activemq/jms2/cdi/JMS2CDIExtension$InternalJMSContext");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/resource/activemq/jms2/cdi/JMS2CDIExtension$ContextProducer", "newKey", "(Ljavax/enterprise/inject/spi/InjectionPoint;)Lorg/apache/openejb/resource/activemq/jms2/cdi/JMS2CDIExtension$Key;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/resource/activemq/jms2/cdi/JMS2CDIExtension$ContextProducer", "requestScoped", "Lorg/apache/openejb/resource/activemq/jms2/cdi/JMS2CDIExtension$RequestAutoContextDestruction;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/resource/activemq/jms2/cdi/JMS2CDIExtension$ContextProducer", "transactionScoped", "Lorg/apache/openejb/resource/activemq/jms2/cdi/JMS2CDIExtension$TransactionAutoContextDestruction;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/resource/activemq/jms2/cdi/JMS2CDIExtension$InternalJMSContext", "<init>", "(Lorg/apache/openejb/resource/activemq/jms2/cdi/JMS2CDIExtension$Key;Lorg/apache/openejb/resource/activemq/jms2/cdi/JMS2CDIExtension$RequestAutoContextDestruction;Lorg/apache/openejb/resource/activemq/jms2/cdi/JMS2CDIExtension$TransactionAutoContextDestruction;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "newKey", "(Ljavax/enterprise/inject/spi/InjectionPoint;)Lorg/apache/openejb/resource/activemq/jms2/cdi/JMS2CDIExtension$Key;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/enterprise/inject/spi/InjectionPoint", "getAnnotated", "()Ljavax/enterprise/inject/spi/Annotated;", true);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitLdcInsn(Type.getType("Ljavax/jms/JMSConnectionFactory;"));
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/enterprise/inject/spi/Annotated", "getAnnotation", "(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "javax/jms/JMSConnectionFactory");
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitLdcInsn(Type.getType("Ljavax/jms/JMSSessionMode;"));
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/enterprise/inject/spi/Annotated", "getAnnotation", "(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "javax/jms/JMSSessionMode");
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitLdcInsn(Type.getType("Ljavax/jms/JMSPasswordCredential;"));
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/enterprise/inject/spi/Annotated", "getAnnotation", "(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "javax/jms/JMSPasswordCredential");
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitLdcInsn("openejb:Resource/");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 3);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/resource/activemq/jms2/cdi/JMS2CDIExtension$ContextProducer", "findAnyConnectionFactory", "()Ljava/lang/String;", false);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_FULL, 6, new Object[] {"org/apache/openejb/resource/activemq/jms2/cdi/JMS2CDIExtension$ContextProducer", "javax/enterprise/inject/spi/InjectionPoint", "javax/enterprise/inject/spi/Annotated", "javax/jms/JMSConnectionFactory", "javax/jms/JMSSessionMode", "javax/jms/JMSPasswordCredential"}, 1, new Object[] {"java/lang/StringBuilder"});
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/jms/JMSConnectionFactory", "value", "()Ljava/lang/String;", true);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/resource/activemq/jms2/cdi/JMS2CDIExtension$ContextProducer", "findMatchingConnectionFactory", "(Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_FULL, 6, new Object[] {"org/apache/openejb/resource/activemq/jms2/cdi/JMS2CDIExtension$ContextProducer", "javax/enterprise/inject/spi/InjectionPoint", "javax/enterprise/inject/spi/Annotated", "javax/jms/JMSConnectionFactory", "javax/jms/JMSSessionMode", "javax/jms/JMSPasswordCredential"}, 2, new Object[] {"java/lang/StringBuilder", "java/lang/String"});
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 6);
Label label2 = new Label();
methodVisitor.visitLabel(label2);
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/resource/activemq/jms2/cdi/JMS2CDIExtension$Key");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitVarInsn(ALOAD, 5);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label3);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/jms/JMSPasswordCredential", "userName", "()Ljava/lang/String;", true);
Label label4 = new Label();
methodVisitor.visitJumpInsn(GOTO, label4);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_FULL, 7, new Object[] {"org/apache/openejb/resource/activemq/jms2/cdi/JMS2CDIExtension$ContextProducer", "javax/enterprise/inject/spi/InjectionPoint", "javax/enterprise/inject/spi/Annotated", "javax/jms/JMSConnectionFactory", "javax/jms/JMSSessionMode", "javax/jms/JMSPasswordCredential", "java/lang/String"}, 3, new Object[] {label2, label2, "java/lang/String"});
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_FULL, 7, new Object[] {"org/apache/openejb/resource/activemq/jms2/cdi/JMS2CDIExtension$ContextProducer", "javax/enterprise/inject/spi/InjectionPoint", "javax/enterprise/inject/spi/Annotated", "javax/jms/JMSConnectionFactory", "javax/jms/JMSSessionMode", "javax/jms/JMSPasswordCredential", "java/lang/String"}, 4, new Object[] {label2, label2, "java/lang/String", "java/lang/String"});
methodVisitor.visitVarInsn(ALOAD, 5);
Label label5 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label5);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/jms/JMSPasswordCredential", "password", "()Ljava/lang/String;", true);
Label label6 = new Label();
methodVisitor.visitJumpInsn(GOTO, label6);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_FULL, 7, new Object[] {"org/apache/openejb/resource/activemq/jms2/cdi/JMS2CDIExtension$ContextProducer", "javax/enterprise/inject/spi/InjectionPoint", "javax/enterprise/inject/spi/Annotated", "javax/jms/JMSConnectionFactory", "javax/jms/JMSSessionMode", "javax/jms/JMSPasswordCredential", "java/lang/String"}, 4, new Object[] {label2, label2, "java/lang/String", "java/lang/String"});
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_FULL, 7, new Object[] {"org/apache/openejb/resource/activemq/jms2/cdi/JMS2CDIExtension$ContextProducer", "javax/enterprise/inject/spi/InjectionPoint", "javax/enterprise/inject/spi/Annotated", "javax/jms/JMSConnectionFactory", "javax/jms/JMSSessionMode", "javax/jms/JMSPasswordCredential", "java/lang/String"}, 5, new Object[] {label2, label2, "java/lang/String", "java/lang/String", "java/lang/String"});
methodVisitor.visitVarInsn(ALOAD, 4);
Label label7 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label7);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/jms/JMSSessionMode", "value", "()I", true);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Integer", "valueOf", "(I)Ljava/lang/Integer;", false);
Label label8 = new Label();
methodVisitor.visitJumpInsn(GOTO, label8);
methodVisitor.visitLabel(label7);
methodVisitor.visitFrame(Opcodes.F_FULL, 7, new Object[] {"org/apache/openejb/resource/activemq/jms2/cdi/JMS2CDIExtension$ContextProducer", "javax/enterprise/inject/spi/InjectionPoint", "javax/enterprise/inject/spi/Annotated", "javax/jms/JMSConnectionFactory", "javax/jms/JMSSessionMode", "javax/jms/JMSPasswordCredential", "java/lang/String"}, 5, new Object[] {label2, label2, "java/lang/String", "java/lang/String", "java/lang/String"});
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitLabel(label8);
methodVisitor.visitFrame(Opcodes.F_FULL, 7, new Object[] {"org/apache/openejb/resource/activemq/jms2/cdi/JMS2CDIExtension$ContextProducer", "javax/enterprise/inject/spi/InjectionPoint", "javax/enterprise/inject/spi/Annotated", "javax/jms/JMSConnectionFactory", "javax/jms/JMSSessionMode", "javax/jms/JMSPasswordCredential", "java/lang/String"}, 6, new Object[] {label2, label2, "java/lang/String", "java/lang/String", "java/lang/String", "java/lang/Integer"});
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/resource/activemq/jms2/cdi/JMS2CDIExtension$Key", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(6, 7);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "findMatchingConnectionFactory", "(Ljava/lang/String;)Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/loader/SystemInstance", "get", "()Lorg/apache/openejb/loader/SystemInstance;", false);
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/openejb/assembler/classic/OpenEjbConfiguration;"));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/loader/SystemInstance", "getComponent", "(Ljava/lang/Class;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/openejb/assembler/classic/OpenEjbConfiguration");
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/assembler/classic/OpenEjbConfiguration", "facilities", "Lorg/apache/openejb/assembler/classic/FacilitiesInfo;");
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/assembler/classic/OpenEjbConfiguration", "facilities", "Lorg/apache/openejb/assembler/classic/FacilitiesInfo;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/assembler/classic/FacilitiesInfo", "resources", "Ljava/util/List;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "iterator", "()Ljava/util/Iterator;", true);
methodVisitor.visitVarInsn(ASTORE, 3);
Label label1 = new Label();
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {"org/apache/openejb/assembler/classic/OpenEjbConfiguration", "java/util/Iterator"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "hasNext", "()Z", true);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "next", "()Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/openejb/assembler/classic/ResourceInfo");
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/assembler/classic/ResourceInfo", "types", "Ljava/util/List;");
methodVisitor.visitLdcInsn("javax.jms.ConnectionFactory");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "contains", "(Ljava/lang/Object;)Z", true);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFNE, label3);
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"org/apache/openejb/assembler/classic/ResourceInfo"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/assembler/classic/ResourceInfo", "id", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equals", "(Ljava/lang/Object;)Z", false);
Label label4 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label4);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/assembler/classic/ResourceInfo", "id", "Ljava/lang/String;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/assembler/classic/OpenEjbConfiguration", "facilities", "Lorg/apache/openejb/assembler/classic/FacilitiesInfo;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/assembler/classic/FacilitiesInfo", "resources", "Ljava/util/List;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "iterator", "()Ljava/util/Iterator;", true);
methodVisitor.visitVarInsn(ASTORE, 3);
Label label5 = new Label();
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/util/Iterator"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "hasNext", "()Z", true);
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "next", "()Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/openejb/assembler/classic/ResourceInfo");
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/assembler/classic/ResourceInfo", "types", "Ljava/util/List;");
methodVisitor.visitLdcInsn("javax.jms.ConnectionFactory");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "contains", "(Ljava/lang/Object;)Z", true);
Label label6 = new Label();
methodVisitor.visitJumpInsn(IFNE, label6);
methodVisitor.visitJumpInsn(GOTO, label5);
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"org/apache/openejb/assembler/classic/ResourceInfo"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/assembler/classic/ResourceInfo", "id", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "endsWith", "(Ljava/lang/String;)Z", false);
Label label7 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label7);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/assembler/classic/ResourceInfo", "id", "Ljava/lang/String;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label7);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitJumpInsn(GOTO, label5);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "java/lang/IllegalArgumentException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("No connection factory found, either use @JMSConnectionFactory JMSContext or define a connection factory");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/IllegalArgumentException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(3, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "findAnyConnectionFactory", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/loader/SystemInstance", "get", "()Lorg/apache/openejb/loader/SystemInstance;", false);
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/openejb/assembler/classic/OpenEjbConfiguration;"));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/loader/SystemInstance", "getComponent", "(Ljava/lang/Class;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/openejb/assembler/classic/OpenEjbConfiguration");
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/assembler/classic/OpenEjbConfiguration", "facilities", "Lorg/apache/openejb/assembler/classic/FacilitiesInfo;");
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/assembler/classic/OpenEjbConfiguration", "facilities", "Lorg/apache/openejb/assembler/classic/FacilitiesInfo;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/assembler/classic/FacilitiesInfo", "resources", "Ljava/util/List;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "iterator", "()Ljava/util/Iterator;", true);
methodVisitor.visitVarInsn(ASTORE, 2);
Label label1 = new Label();
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {"org/apache/openejb/assembler/classic/OpenEjbConfiguration", "java/util/Iterator"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "hasNext", "()Z", true);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "next", "()Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/openejb/assembler/classic/ResourceInfo");
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/assembler/classic/ResourceInfo", "types", "Ljava/util/List;");
methodVisitor.visitLdcInsn("javax.jms.ConnectionFactory");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "contains", "(Ljava/lang/Object;)Z", true);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/assembler/classic/ResourceInfo", "id", "Ljava/lang/String;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitLdcInsn("DefaultJMSConnectionFactory");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "java/lang/IllegalArgumentException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("No connection factory found, either use @JMSConnectionFactory JMSContext or define a connection factory");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/IllegalArgumentException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(3, 4);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
